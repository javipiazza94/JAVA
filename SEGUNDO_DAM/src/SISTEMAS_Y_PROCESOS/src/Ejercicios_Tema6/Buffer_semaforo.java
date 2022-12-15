package Ejercicios_Tema6;
	
	import java.util.concurrent.Semaphore;
	import java.util.logging.Level;
	import java.util.logging.Logger;

	public class Buffer_semaforo {

	    private final int MAX_LIMITE = 10;
	    private int producto = 0;
	    private Semaphore productor = new Semaphore(MAX_LIMITE); //Establecemis limite de productores
	    private Semaphore consumidor = new Semaphore(0);
	   
	    public void producir() {
	        try {	            
	                productor.acquire();	    //Cerramos otros hilos
	                producto++;
					System.out.println("El empresario almacena productos. El almacen contiene " + producto + (producto > 1 ? " productos." : " producto."));	               
	                Thread.sleep(500);	      
	        } catch (InterruptedException ex) {
	            Logger.getLogger(Buffer_semaforo.class.getName()).log(Level.SEVERE, null, ex);
	        } finally {
	            consumidor.release();			//Abrimos el hilo consumidor
	        }
	    }

	    public void consumir() {
	        try {
	                consumidor.acquire();              
	                producto--;
	                System.out.println("El consumidor retira productos. El almacen contiene " + producto + (producto > 1 ? " productos." : " producto."));	                
	                Thread.sleep(500);
	        } catch (InterruptedException ex) {
	            Logger.getLogger(Buffer_semaforo.class.getName()).log(Level.SEVERE, null, ex);
	        } finally {
	            productor.release();
	        }
	    }

	}


