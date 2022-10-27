package SISTEMAS_Y_PROCESOS;

import java.io.IOException;
import java.util.Scanner;

public class Chrome_Java {

	public static void main(String[] args) throws IOException, InterruptedException {
		/* Programa un proceso que abra la aplicación de Google Chrome mediante la clase
				ProcessBuilder. Indica, además, el PID del proceso. Una vez ejecutado, consulta los
				procesos abiertos mediante el comando en CMD “tasklist”, comprueba si el proceso
				sigue vivo y comenta como podríamos parar el proceso por consola (hazlo). */

		ProcessBuilder Proceso = new ProcessBuilder();
		Proceso.command("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		try {
			Process pb = Proceso.start();
			System.out.println(pb.pid());
			Scanner Escaner = new Scanner(System.in);
			System.out.println("¿Quieres matar el proceso? Respone S o N");
			char respuesta = Escaner.nextLine().charAt(0);
			if (respuesta == 'S') {
				pb.destroy();
			}
			int salir = pb.waitFor();
			System.out.println("Proceso finalizado con "+ salir);
			
		}catch(IOException e) {
			System.err.println("Error: "+ e.toString());
		}catch(InterruptedException ie){
			System.err.println("Se ha interrumpido");
		}
		}

	}


