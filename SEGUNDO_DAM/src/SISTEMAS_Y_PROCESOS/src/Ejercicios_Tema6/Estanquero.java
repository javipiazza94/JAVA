package Ejercicios_Tema6;

import java.util.Random;

public class Estanquero extends Thread {

	private Random aleatorio = new Random();
	private String [] ingredientes = {"tabaco", "papel", "fosforo"};
	private Estanco estanco;

	public Estanquero(Estanco estanco) {
		this.estanco = estanco;
	}

	public void run() {
		while (true) {
			int numero = aleatorio.nextInt(ingredientes.length); 
			String cigarro= ingredientes[numero]; 			 
			try {
				Thread.sleep(aleatorio.nextInt(3));
				estanco.producir(cigarro);
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}
		}
	}
}
