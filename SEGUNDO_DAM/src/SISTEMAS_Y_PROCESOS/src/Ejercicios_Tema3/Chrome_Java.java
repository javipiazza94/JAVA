package Ejercicios_Tema3;
import java.io.IOException;
import java.util.Scanner;

public class Chrome_Java {

	public static void main(String[] args) throws IOException, InterruptedException {
		/* Programa un proceso que abra la aplicación de Google Chrome mediante la clase
				ProcessBuilder. Indica, además, el PID del proceso. Una vez ejecutado, consulta los
				procesos abiertos mediante el comando en CMD “tasklist”, comprueba si el proceso
				sigue vivo y comenta como podríamos parar el proceso por consola (hazlo). */
		
		//CREAMOS RUTA
		String RUTA_PROCESO = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
		//CREAMOS PROCESO
		ProcessBuilder Proceso = new ProcessBuilder(RUTA_PROCESO);
		
		try {
			//INICIAMOS PROCESO
			Process pb = Proceso.start();
			//IMPRIMIMOS ID
			System.out.println(pb.pid());
			//PEDIMOS AL USUARIO PARARLO
			Scanner Escaner = new Scanner(System.in);
			System.out.println("¿Quieres matar el proceso? Respone S o N");
			char respuesta = Escaner.nextLine().charAt(0);
				if (respuesta == 'S') {
					pb.destroy();
				}
			//IMPRIMIMOS EL ESTADO DE LA EJECUCION
			int salir = pb.waitFor();
			System.out.println("Proceso finalizado con "+ salir);
			
		}catch(IOException e) {
			System.err.println("Error: "+ e.toString());
		}catch(InterruptedException ie){
			System.err.println("Se ha interrumpido");
		}
		}

	}


