package Ejercicios_Tema4;

public class ACTIVIDAD_2 implements Runnable{
	
	@Override
	public void run() {
			 String saludo = "¡Hola, te saludo desde un hilo!";
			 System.out.println(saludo);
	}
	public static void main(String[] args) {
		// Hacer lo mismo pero con Runnable.

		Runnable hilo1 = new ACTIVIDAD_2();
		hilo1.run();
	}


}
