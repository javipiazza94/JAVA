package CLASES;

import java.util.ArrayList;
import java.util.Collections;

public class MAZO {
	
	//ATRIBUTOS
	private ArrayList <CARTA> carta;
	private final int numero_cartas = 52;
	
	//CONSTRUCTOR
	public MAZO (){
		for ( int i = 0; i<4 ; i++){
			for (int j = 0; j<13 ; j++){
				CARTA carta = new CARTA (i,j, 0);
				this.carta.add(carta);
			}
		}
	}

	//GETTERS Y SETTERS
	public ArrayList<CARTA> getCarta() {
		return carta;
	}

	public void setCarta(ArrayList<CARTA> carta) {
		this.carta = carta;
	}

	public int getNumero_cartas() {
		return numero_cartas;
	}
	
	
	//METODOS
	public void Barajar (){
		Collections.shuffle(carta);
	}
	
	public CARTA Sacar(){
		CARTA aux = new CARTA ();
		aux = carta.get(0);
		carta.remove(0);
		return aux;
	}
	
	@Override
	public String toString() {
		return this.carta.toString();
	}
	
}
