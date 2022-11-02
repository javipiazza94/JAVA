package Ejercicios_Tema4;

import java.util.Scanner;

public class ACTIVIDAD_4 extends Thread {

	   public void run()
	   {
		   @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
			System.out.println("Introduce el nombre del atleta");
			String nombre = sc.next();
			int km = 30;
			  for(int i = 0; i<=km; i++) {
				   try {
					Thread.sleep(3500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
					System.out.println("El atleta "+nombre+ " va por el kilómetro: "+i);
			   }
		   
	   }

	public static void main(String[] args) {
		/*
		 *  Simular que un atleta corre 30km. Para ello debemos pedir el nombre del atleta por pantalla, 
		 *  ir diciendo por que km va (lo simularemos con un retardo de 3500 milisegundos) y cuando llega a la meta
		 */

		Thread elHilo = new Thread(new ACTIVIDAD_4());
		elHilo.start();
	}

}
