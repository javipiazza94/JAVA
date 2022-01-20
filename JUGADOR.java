package CLASES;

import java.util.ArrayList;

public class JUGADOR {
	
	//ATRIBUTOS
	private String id_jugador;
	private ArrayList <CARTA> mano;
	private int valor_mano;
	private boolean plantado;
	
	//CONSTRUCTOR
	public JUGADOR (){
		
	}
	public JUGADOR (String id_jugador){
		this.id_jugador = id_jugador;
		this.mano = new ArrayList<CARTA>();
		this.valor_mano = 0;
		this.plantado = false;
		
	}

	//GETTERS Y SETTERS
	public String getId_jugador() {
		return id_jugador;
	}

	public void setId_jugador(String id_jugador) {
		this.id_jugador = id_jugador;
	}
	public ArrayList<CARTA> getMano() {
		return mano;
	}
	public int getValor_mano() {
		return valor_mano;
	}
	public boolean isPlantado() {
		return plantado;
	}
	
	//METODOS
	
	public int Comprobar_mano () {
		return this.valor_mano;
	}
	public void Pedir_carta (MAZO Baraja){
		CARTA robada = Baraja.Sacar();
		this.mano.add(robada);
		this.valor_mano += robada.getValor();
		Baraja.eliminar_carta();
	}
	public void plantarse (){
			this.plantado = true;
	}
	
	@Override
	public String toString (){
		return this.id_jugador + " tiene la siguiente mano "+this.mano+ " y tiene un valor "+this.valor_mano; 
	}

}
