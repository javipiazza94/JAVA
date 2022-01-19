package CLASES;

import java.util.ArrayList;

public class JUGADOR {
	
	//ATRIBUTOS
	private int id_jugador;
	private ArrayList <CARTA> mano = new ArrayList <CARTA> ();
	private int valor_mano;
	private boolean plantado;
	
	//CONSTRUCTOR
	public JUGADOR (){
		
	}
	public JUGADOR (int id_jugador){
		this.id_jugador = id_jugador;
		this.mano = mano;
		plantado = false;
		
	}

	//GETTERS Y SETTERS
	public int getId_jugador() {
		return id_jugador;
	}

	public void setId_jugador(int id_jugador) {
		this.id_jugador = id_jugador;
	}

	
	//METODOS
	
	public int Comprobar_mano () {
		return valor_mano;
	}
	public void Pedir_carta (){
		
	}
	public boolean plantarse (){
		return plantado = true;
	}
	
	

}
