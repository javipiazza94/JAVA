package CLASES;

import java.util.ArrayList;
import java.util.Collections;

public class MAZO {
	
	//ATRIBUTOS
	private ArrayList <CARTA> carta;
	private int numero_cartas = 52;
	
	//CONSTRUCTOR
	public MAZO (){
		carta=new ArrayList<CARTA>();
		for ( int i = 1; i<=4 ; i++){
			for (int j = 1; j<=13 ; j++){
				this.carta.add(new CARTA (i,j));
			}
		}
		this.numero_cartas = carta.size();
	}

	//GETTERS Y SETTERS
	public ArrayList<CARTA> getCarta() {
		return carta;
	}

	public void setCarta(ArrayList<CARTA> carta) {
		this.carta = carta;
		this.numero_cartas=carta.size();
	}

	public int getNumero_cartas() {
		return numero_cartas;
	}
	
	
	//METODOS
	public void Barajar (){
		Collections.shuffle(carta);
	}
	
	public CARTA Sacar(){
		return this.carta.get(0);
	}
	
	public void eliminar_carta(){
		this.carta.remove(0);
	}
	
	@Override
	public String toString() {
		return "El mazo tiene " +this.carta.toString();
	}
	
}
