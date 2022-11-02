package Ejercicios_Tema4;

public class ACTIVIDAD_3 extends Thread{
	   boolean continuar = true;
	   public void PararHilo()
	   {
	      continuar=false;
	   }
	   public void run()
	   {
		   int num = 20;
		   for(int i = 0; i<=num; i++) {
			   try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
				System.out.println("Conteo "+i);
		   }
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread elHilo = new Thread(new ACTIVIDAD_3());
		elHilo.start();
	}

}
