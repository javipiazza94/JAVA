package Ejercicios_Tema4;

public class HILO2_ACTIVIDAD_5 extends Thread {
	boolean continuar = true;
	public void PararHilo() {
		continuar = false;
	}
	public void run() {
		int num = 10;
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Soy el Hilo PAR. El numero par es: " + i);
				System.out.println();
			}
		}
	}
}
