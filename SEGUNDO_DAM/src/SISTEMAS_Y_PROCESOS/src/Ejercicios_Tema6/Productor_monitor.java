package Ejercicios_Tema6;

public class Productor_monitor extends Thread {

	private int producto;
	private final Buffer_monitor contenedor;
	private final int TIEMPOESPERA = 1500;

	public Productor_monitor(Buffer_monitor contenedor) {
		this.contenedor = contenedor;
		this.producto = 0;
	}

	public void run() {
		while (true) {
			producto++;
			contenedor.producir(producto);
			System.out.println("El empresario almacena " + producto	+ (producto > 1 ? " productos." : " producto."));
			try {
				Thread.sleep(TIEMPOESPERA);
			} catch (InterruptedException e) {
				System.err.println("Productor: Error en run -> " + e.getMessage());
			}
		}
	}
}