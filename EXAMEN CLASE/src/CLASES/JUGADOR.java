package CLASES;

import java.util.ArrayList;

public class JUGADOR {
	
	//ATRIBUTOS
	private int id_jugador;
	private ArrayList <CARTA> mano;
	private int valor;
	private boolean plantado = false;
	
	//CONSTRUCTOR
	public JUGADOR (){
		
	}
	public JUGADOR (int id_jugador){
		this.id_jugador = id_jugador;
		
	}

	//GETTERS Y SETTERS
	public int getId_jugador() {
		return id_jugador;
	}

	public void setId_jugador(int id_jugador) {
		this.id_jugador = id_jugador;
	}

	
	//METODOS
	
	
	
	

}
