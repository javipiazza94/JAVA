package Ejercicios_Tema6;

public class Consumidor  extends Thread{
	
	    private Buffer_semaforo almacen;

	    public Consumidor(Buffer_semaforo almacen) {
	        this.almacen = almacen;
	    }

	    @Override
	    public void run() {
	        while(true){
	            almacen.consumir();
	        }
	    }
	}


