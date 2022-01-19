package Ejercicios_ficheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class ejercicio_2 {

	public static void main(String[] args) {
		// Implemente un HOWLER, es decir, un programa que lea un mensaje
		// introducido por teclado y lo escriba en un archivo EN MAYÚSCULAS. El
		// programa irá leyendo línea a línea y guardando en el archivo. Debe
		// parar cuando se introduzca una línea vacía.

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre del fichero a crear");
		String documento = sc.nextLine();
		String parar = "";

		try {
			File fichero = new File("C:\\Users\\MEDAC\\Desktop\\BLOSTE\\" + documento);
			if (fichero.createNewFile()) {
				System.out.println("El fichero se ha creado");
			} else {
				System.out.println("Error en la creacion del fichero");
			}
		} catch (IOException error) {
			System.out.println("La ruta especificada es incorrecta");
		}

		try {
			FileWriter escritura = new FileWriter("C:\\Users\\MEDAC\\Desktop\\BLOSTE\\" + documento);
			
			boolean escribir = false;
			do {
			System.out.println("Introduce el mensaje");
			String mensaje = sc.nextLine().toUpperCase();
			escritura.write(mensaje);
				if (mensaje.equals(parar)) {
					escribir = true;
				} 				
			} while (!escribir);
			
			escritura.close();
		} catch (IOException error) {
			System.out.println("Error de escritura " + error);
		}

		try {
			File lectura = new File("C:\\Users\\MEDAC\\Desktop\\BLOSTE\\" + documento);
			Scanner sc2 = new Scanner(lectura);
			boolean leer = false;
			do {
				if (sc2.hasNextLine()) {
					String datos = sc2.nextLine();
					System.out.println(datos + " ");
				} else {
					leer = true;
				}
			} while (!leer == false);

			sc2.close();
		} catch (IOException error) {
			System.out.println("Error de escritura " + error);
		}
	}

}
