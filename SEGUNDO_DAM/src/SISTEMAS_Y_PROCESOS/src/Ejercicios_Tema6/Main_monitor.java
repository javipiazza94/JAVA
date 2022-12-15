package Ejercicios_Tema6;

public class Main_monitor {
	
	    private static Buffer_monitor contenedor;
	    private static Thread productor;
	    private static Thread consumidores;

    public static void main(String[] args) {
    	
        contenedor = new Buffer_monitor();
        productor = new Thread(new Productor_monitor(contenedor));
        consumidores = new Thread(new Consumidor_monitor(contenedor));     
         
        productor.start();
        consumidores.start();
    }
}