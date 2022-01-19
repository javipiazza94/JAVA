package Ejercicios_ficheros;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class ejercicio_3 {

	public static void main(String[] args) {
		// TODO Escriba un programa que, partiendo de un directorio dado,
		// muestre todos los archivos con una extensión determinada.

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre del fichero a crear");
		String doc = sc.nextLine();

		try {
			File fichero = new File("C:\\Users\\MEDAC\\Desktop\\CORONACUENTO\\" + doc);
			if (fichero.createNewFile()) {
				System.out.println("El fichero se ha creado");
			} else {
				System.out.println("Error en la creacion del fichero");
			}
		} catch (IOException error) {
			System.out.println("La ruta especificada es incorrecta");
		}

		try {
			FileWriter escritura = new FileWriter("C:\\Users\\MEDAC\\Desktop\\CORONACUENTO\\" + doc);
			System.out.println("Introduce el mensaje");
			String mensaje = sc.nextLine();
			escritura.write(mensaje);
			escritura.close();
		} catch (IOException error) {
			System.out.println("Error de escritura " + error);
		}

		File carpeta = new File("C:\\Users\\MEDAC\\Desktop\\CORONACUENTO\\");
		String[] listado = carpeta.list();

		for (int i = 0; i < listado.length; i++) {
			System.out.println(listado[i]);
		}

		System.out.println("Introduzca la extension a buscar");
		String extension = sc.next();

		for (String nombre : listado) {
			if (nombre.contains(extension)) {
				System.out.println(nombre);

			}
		}

	}

}
