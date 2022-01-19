package CLASES;

import java.util.ArrayList;

public class PARTIDA {
	
	//ATRIBUTOS
	private ArrayList <JUGADOR> lista_jugadores = new ArrayList <JUGADOR> ();
	private boolean terminado;
	private int id_partida;
	private boolean ganador;
	private ArrayList <MAZO> mano = new ArrayList <MAZO> ();
	

	//CONSTRUCTOR
	public PARTIDA (){
		
	}
	public PARTIDA (ArrayList <JUGADOR> lista_jugadores, boolean terminado, int id_partida, boolean ganador, ArrayList <MAZO> mano){
		this.ganador = false;
		this.terminado = false;
		this.id_partida = id_partida;
		this.lista_jugadores = lista_jugadores;
		this.mano = mano;
	}
	
	//GETTERS Y SETTERS
	public ArrayList<JUGADOR> getLista_jugadores() {
		return lista_jugadores;
	}
	public void setLista_jugadores(ArrayList<JUGADOR> lista_jugadores) {
		this.lista_jugadores = lista_jugadores;
	}
	public boolean isTerminado() {
		return terminado;
	}
	public void setTerminado(boolean terminado) {
		this.terminado = terminado;
	}
	public int getId_partida() {
		return id_partida;
	}
	public void setId_partida(int id_partida) {
		this.id_partida = id_partida;
	}
	public boolean isGanador() {
		return ganador;
	}
	public void setGanador(boolean ganador) {
		this.ganador = ganador;
	}
	public ArrayList<MAZO> getMano() {
		return mano;
	}
	public void setMano(ArrayList<MAZO> mano) {
		this.mano = mano;
	}
	
	//METODOS
	public boolean Comprobar_ganador (){
		
	}
	public boolean terminar (){
		
	}
	public void Iniciar_partida (){
		
	}
	
	
	
}