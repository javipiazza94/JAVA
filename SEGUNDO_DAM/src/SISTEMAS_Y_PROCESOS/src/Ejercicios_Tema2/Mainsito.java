package Ejercicios_Tema2;

public class Mainsito {
	
public static void main(String[] args) {
		
		hilo1 hilo1 = new hilo1("Hilo 1 ", 1000);
		hilo2 hilo2 = new hilo2();
		hilo1.start();
		hilo2.run();	
	}


}
