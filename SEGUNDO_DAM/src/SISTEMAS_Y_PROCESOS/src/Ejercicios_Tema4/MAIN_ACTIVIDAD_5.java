package Ejercicios_Tema4;

public class MAIN_ACTIVIDAD_5 extends Thread{
	
	public static void main(String[] args) throws InterruptedException {
		/*
		 *  Implementar un programa que use hilos independientes, en clases diferentes. 
		 *  Un hilo va a imprimir los números pares del 1 al 10 y la suma de dichos números, 
		 *  y otro hilo imprimirá los números impares del 1 al 10 y su suma.
			Crea dos hilos y muestra la salida.
		 */

		
		Thread hilo1 = new Thread (new HILO1_ACTIVIDAD_5() );
		Thread hilo2 = new Thread(new HILO2_ACTIVIDAD_5());
		hilo1.start();
		hilo2.start();
	}
}


