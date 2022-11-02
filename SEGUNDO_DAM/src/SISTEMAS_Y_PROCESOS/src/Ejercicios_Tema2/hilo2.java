package Ejercicios_Tema2;

public class hilo2 implements Runnable {

	String nombre;
	int dormir;
	
	public hilo2() {
		// TODO Auto-generated constructor stub
	}
	public hilo2(String name, int dormir) {
		this.dormir = dormir;
		this.nombre = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
		System.out.println("El codigo esta funcionando del hilo 2");
		}
	}
	
}
