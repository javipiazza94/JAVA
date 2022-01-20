package CLASES;

import java.util.ArrayList;

public class PARTIDA {

	// ATRIBUTOS
	private ArrayList<JUGADOR> lista_jugadores;
	private boolean terminado;
	private int id_partida;
	private JUGADOR ganador;
	private MAZO mazo;

	// CONSTRUCTOR
	public PARTIDA() {

	}
	public PARTIDA(ArrayList<JUGADOR> lista_jugadores) {
		this.mazo = new MAZO();
		this.terminado = false;
		this.id_partida = (int) (Math.random() * 7);
		this.lista_jugadores = lista_jugadores;
		this.ganador = new JUGADOR();
	}

	public PARTIDA(ArrayList<JUGADOR> lista_jugadores, boolean terminado, int id_partida, JUGADOR ganador, MAZO mano) {
		this.terminado = false;
		this.id_partida = (int) (Math.random() * 7);
		this.lista_jugadores = lista_jugadores;
		this.mazo = new MAZO();
		this.ganador = new JUGADOR();
	}

	// GETTERS Y SETTERS

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

	public JUGADOR getGanador() {
		return ganador;
	}

	public void setGanador(JUGADOR ganador) {
		this.ganador = ganador;
	}

	public MAZO getMazo() {
		return mazo;
	}

	// METODOS

	@Override
	public String toString() {
		String resultado = "";
		if (this.terminado) {
			resultado = "La partida con ID: " + this.id_partida + " y ha ganado " + this.ganador.getId_jugador();
		} else {
			resultado = "La partida con ID: " + this.id_partida + " y han ganado " + this.getLista_jugadores();
		}
		return resultado;
	}

	public void primera_ronda(int jug) {
		this.mazo.Barajar();
		this.lista_jugadores.get(jug).Pedir_carta(this.mazo);
	}

	public void ronda(int jug, String accion) {
		if (accion.equalsIgnoreCase("plantarse")) {
			this.lista_jugadores.get(jug).plantarse();
		} else {
			this.lista_jugadores.get(jug).Pedir_carta(this.mazo);
		}
	}

	public void final_juego() {
		this.terminado = true;
		for (int i = 0; i < this.lista_jugadores.size(); i++) {
			if (!this.lista_jugadores.get(i).isPlantado()) {
				this.terminado = false;
			}
		}
	}

	public void comprobarGanador() {
		JUGADOR ganador = new JUGADOR();
		for (int i = 0; i < this.lista_jugadores.size(); i++) {
			if (this.lista_jugadores.get(i).getValor_mano() <= 21) {
				if (this.lista_jugadores.get(i).getValor_mano() > ganador.getValor_mano()) {
					ganador = this.lista_jugadores.get(i);
				}
			}
		}
		this.ganador = ganador;
	}

	public JUGADOR Añadir_jugadores() {
		JUGADOR jugador = new JUGADOR();
		return jugador;

	}

}