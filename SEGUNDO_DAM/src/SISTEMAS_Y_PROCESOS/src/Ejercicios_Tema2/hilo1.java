package Ejercicios_Tema2;

public class hilo1 extends Thread {
	
	String nombre;
	int dormir;

	public hilo1() {
		// TODO Auto-generated constructor stub
	}

	public hilo1(String name, int dormir) {
		this.dormir = dormir;
		this.nombre = name;
	}


	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Soy el hilo 1 "+this.nombre+ " en la intercaccion "+i );
			try {
				sleep(dormir);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	

}
