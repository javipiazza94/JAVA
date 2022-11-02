package Ejercicios_Tema4;

public class ACTIVIDAD_1 extends Thread {
	
	   public void run()
	   {
		   String saludo = "¡Hola, te saludo desde un hilo!";
		   System.out.println(saludo);
	   }

	public static void main(String[] args) {
		// Crear una clase que herede de Thread, cree un hilo y nos mande un mensaje que diga “¡Hola, te saludo desde un hilo!
		
		Thread elHilo = new Thread(new ACTIVIDAD_1());
		elHilo.start();
	}

}
