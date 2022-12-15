package Ejercicios_Tema6;

public class Buffer_monitor {

	private int contenido;
	private boolean estalleno = false;

	public synchronized int consumir() {
		while (!estalleno) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.err.println("Contenedor: Error en get -> " + e.getMessage());
			}
		}
		estalleno = false;
		notify();
		if (this.contenido ==10) {  //Corta el hilo
			System.exit(0);
		}
		return contenido;
	}

	public synchronized void producir(int valor) {
		while (estalleno) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.err.println("Contenedor: Error en put -> " + e.getMessage());
			}
		}
		contenido = valor;
		estalleno = true;
		notify();
	}
}