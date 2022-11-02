package XML_DOM;

import java.io.Serializable;

public class Pelicula implements Serializable {
	/**
	 * 
	 */
	
	/**
	 *  1) Crear un archivo pelis.dat donde deberás introducir 4 películas con los siguientes campos: TITULO,AÑO DE RODAJE,DURACIÓN,ACTOR PRINCIPAL.
		2) Tomando como base el fichero anterior, crea un documento XML usando DOM.
		3) Lee el documento “pelis.xml” con DOM.
		4) Añade una nueva película al documento “pelis.xml” con DOM.
		5) Muestra la/s películas que duran más de 120 minutos con DOM.
		6) Modifica un actor de cualquiera de las películas introducidas y pon tu nombre, usando DOM.
		
	 */
	private static final long serialVersionUID = -9035074926861856381L;
	private String titulo;
	private int añoRodaje;
	private String duracion;
	private String actor;

	public Pelicula(String titulo, int añoRodaje, String duracion, String actor) {
		this.titulo = titulo;
		this.añoRodaje = añoRodaje;
		this.duracion = duracion;
		this.actor = actor;
	}
	public Pelicula(String titulo, String añoRodaje, String duracion, String actor) {
		this.titulo = titulo;
		this.añoRodaje = Integer.parseInt(añoRodaje);
		this.duracion = duracion;
		this.actor = actor;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getAñoRodaje() {
		return añoRodaje;
	}

	public String getDuracion() {
		return duracion;
	}

	public String getActor() {
		return actor;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAñoRodaje(int añoRodaje) {
		this.añoRodaje = añoRodaje;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	@Override
	public String toString() {
		String cadena;
		cadena = "Titulo: " + titulo + "\nAño de Rodaje: " + añoRodaje + "\nDuracion: " + duracion
				+ "\nActor Principal: " + actor+"\r\n\n";

		return cadena;
	}
}
