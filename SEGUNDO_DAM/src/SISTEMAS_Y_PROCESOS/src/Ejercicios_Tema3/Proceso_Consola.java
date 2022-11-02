package Ejercicios_Tema3;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Proceso_Consola {

	public static void main(String[] args) throws IOException {
		// Lanza un proceso que ejecute en la consola de Windows el comando “time”, y lo muestre por la consola del IDE. Muestra también el PID del proceso y asegúrate de que no se encuentre activo al finalizar la ejecución. 
	
			 //INVOCAMOS LA CONSOLA POR PB
	            ProcessBuilder Consola = new ProcessBuilder("CMD");
	            Process procesos= Consola.start();
	            Process procesos2= Consola.start();
	          //ESCANEAMOS EL PROCESO Y, ABRIMOS UN HILO Y APLICAMOS EL METODO RUN()
	            final Scanner entrada = new Scanner(procesos.getInputStream());
	            new Thread() {
	                public void run() {
	                    while(entrada.hasNextLine()) {
	                        System.out.println(entrada.nextLine());
	                    }
	                }
	            }.start();
	            final Scanner entrada2 = new Scanner(procesos2.getInputStream());
	            new Thread() {
	                public void run() {
	                    while(entrada2.hasNextLine()) {
	                        System.out.println(entrada2.nextLine());
	                    }
	                }
	            }.start();
	            //IMPRIMOS DE SALIDA EL COMANDO TIME, EL PID DEL PROCESO Y CERRAMOS 
	            PrintWriter salida = new PrintWriter(procesos.getOutputStream());
	            salida.println("tasklist");
	            System.out.println("El PID es "+procesos);
	            salida.flush();
	            salida.close();
	            //SEGUNDO PROCESO 
	            PrintWriter salida2 = new PrintWriter(procesos2.getOutputStream());
	            salida2.println("time");
	            System.out.println("El PID es "+procesos2);
	            salida2.flush();
	            salida2.close();
	            //DESTRUIMOS LOS PROCESOS
	           // procesos.destroy();
	            //procesos2.destroy();
	            
	            	      
	}

}
