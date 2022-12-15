package Ejercicios_Tema6;

public class Consumidor_monitor extends Thread {

	private final Buffer_monitor contenedor;

	public Consumidor_monitor(Buffer_monitor contenedor) {
		this.contenedor = contenedor;
	}

	public void run() {
		while (true) {
			contenedor.consumir();
			System.out.println("El consumidor recoge " + contenedor.consumir() + " productos." );
		}
	}

}