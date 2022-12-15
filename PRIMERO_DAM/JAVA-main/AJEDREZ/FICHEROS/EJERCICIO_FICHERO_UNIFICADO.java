package FICHEROS;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class EJERCICIO_FICHERO_UNIFICADO {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String parar = "";

		// CREAMOS EL FICHERO DE LA CARPETA PADRE
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
		// CREAMOS EL FICHERO DE LA CARPETA HIJA
		System.out.println("Introduce el nombre del fichero a crear dentro de la subcarpeta");
		String doc2 = sc.nextLine();
		try {
		File ficherocarpeta2 = new File("C:\\Users\\MEDAC\\Desktop\\CORONACUENTO\\POLLO LE DABA\\" + doc2);
		if (ficherocarpeta2.createNewFile()) {
			System.out.println("El fichero se ha creado");
		} else {
			System.out.println("Error en la creacion del fichero");
		}
		} catch (IOException error) {
			System.out.println("La ruta especificada es incorrecta");
		}
		
		// HACEMOS EL HOWLER DE LA ESCRITURA DE LA CARPETA PADRE 
		try {
			FileWriter escritura = new FileWriter("C:\\Users\\MEDAC\\Desktop\\CORONACUENTO\\" + doc);

			boolean escribir = false;
			do {
				System.out.println("Introduce el mensaje dentro del fichero de la carpeta padre");
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
		// HACEMOS SU LECTURA
		try {
			File lectura = new File("C:\\Users\\MEDAC\\Desktop\\CORONACUENTO\\" + doc);
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
		
		//LISTAMOS LAS CARPETAS
		
		File carpeta = new File("C:\\Users\\MEDAC\\Desktop\\CORONACUENTO\\");
		String[] listado = carpeta.list();

		for (int i = 0; i < listado.length; i++) {
			System.out.println(listado[i]);
		}
				
		String[] listado2 = carpeta.list();
		for (String name : listado2) {
				System.out.println(name);
				System.out.println(Arrays.toString(listado2));
				}

			// BUSCA DE LA EXTENSION
			System.out.println("Introduzca la extension a buscar");
			String extension = sc.next();

			for (String nombre : listado) {
				if (nombre.contains(extension)) {
					System.out.println(nombre);
				}	
			}
			System.out.println("Introduzca la extension a buscar en la carpeta hija");
			String extension2 = sc.next();
			for (String name : listado2) {
				if (name.contains(extension2)) {
					System.out.println(name);
				}	
			}
		}
	}

