package ACCESO_A_DATOS;

import java.io.File;

public class ACTIVIDAD_9 {

	public static void main(String[] args) {
		/*
		 *  Escribir un programa que liste el contenido de un directorio pasado como argumento,
			de cada elemento debe mostrar: tipo (fichero o directorio)., nombre y si es fichero el
			tama�o,
		 */
		
		File directorioActual = new File ("C:\\Users\\javip\\Documents\\DAM\\ACTIVIDADES\\EJERCICIOS DE PROGRAMACI�N\\eclipse-workspace\\EJERCICIOS DE PROGRAMACION\\src\\Ejercicios 2- DAM\\src\\FICHEROS_1\\home2\\usuario2\\d2\\");
		File[] lista = directorioActual.listFiles();
		String fichero = "";
		
		for (File list: lista) {
			if(list.isDirectory()) {
				System.out.println("El nombre del directorio es "+ (fichero = list.getName()));
			}
			if (list.isFile()) {
				fichero = list.getName();
				String extension=fichero.substring(fichero.indexOf(".")+1);
				System.out.println("La extension es "+extension);
				System.out.println("El tamano del archivo cuya extension es "+extension+ " es "+list.length());
			}
			System.out.println();
		}

	}

}
