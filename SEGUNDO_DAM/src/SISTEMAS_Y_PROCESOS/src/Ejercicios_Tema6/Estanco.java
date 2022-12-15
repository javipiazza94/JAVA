package Ejercicios_Tema6;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Estanco {

	private final int MAX_LIMITE = 1;
	boolean fumando = false;
	boolean hayIngredientes = false;
	private Semaphore productor = new Semaphore(MAX_LIMITE); 
	private Semaphore consumidor = new Semaphore(0);

	public void producir(String ingredientes) {
		while (hayIngredientes || fumando) {
			try {				
				productor.acquire(); 
				Thread.sleep(500);
			} catch (InterruptedException e) {
				Logger.getLogger(Estanco.class.getName()).log(Level.SEVERE, null, e);
			}finally {
				consumidor.release(); 
			}
		}
		hayIngredientes = true;
		System.out.println("El estanquero no pone el ingrediente " + ingredientes);	
		}	

	public  void fumar(int id) {
		while (!hayIngredientes || fumando) {
			try {			
				consumidor.acquire();
				Thread.sleep(500);
			} catch (InterruptedException ex) {
				Logger.getLogger(Estanco.class.getName()).log(Level.SEVERE, null, ex);
			}finally {
				productor.release();
			}
		}		
		hayIngredientes = false;
		fumando = true;
		System.out.println("El fumador " + id + " ha comenzado a fumar");
	}
	public synchronized void sinfumar(int id) {
		fumando = false;
		System.out.println("El fumador " + id + " ha dejado de fumar");
		notifyAll();
	}

}
