package ACCESO_A_DATOS;

import java.io.File;

public class ACTIVIDAD_3 {

	public static void main(String[] args) {
		/*
		 * Hacer un programa que liste el contenido del directorio D:\home y de los directorios
			que cuelgan de �l, mostrando nombre y tipo de cada fichero o directorio.
		 */

		File directorioActual = new File ("C:\\Users\\javip\\Documents\\DAM\\ACTIVIDADES\\EJERCICIOS DE PROGRAMACI�N\\eclipse-workspace\\EJERCICIOS DE PROGRAMACION\\src\\Ejercicios 2- DAM\\src\\FICHEROS_1\\home2\\");
		File[] lista = directorioActual.listFiles();
		String fichero = "";
		
		for (File list: lista) {
			System.out.println(fichero = list.getName());
			String extension=fichero.substring(fichero.indexOf(".")+1);
			System.out.println("La extension es "+extension);
			System.out.println();
		}
	}
	}

