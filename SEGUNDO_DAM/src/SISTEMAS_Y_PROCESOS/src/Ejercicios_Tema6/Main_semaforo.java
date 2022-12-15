package Ejercicios_Tema6;

public class Main_semaforo {

	private static Buffer_semaforo almacen;
    private static Thread productor;
    private static Thread consumidores;
    
	public static void main(String[] args) {

        almacen = new Buffer_semaforo();
        productor = new Thread(new Productor (almacen));
        consumidores = new Thread(new Consumidor(almacen));
        
        productor.start();
        consumidores.start();
	}
}
