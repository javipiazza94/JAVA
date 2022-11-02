package FICHEROS_1;

import java.io.File;

public class ACTIVIDAD_3 {

	public static void main(String[] args) {
		// Hacer un programa que liste el contenido del directorio actual y de los directorios que cuelgan de él, mostrando nombre y tipo de cada fichero o directorio.

		File directorioActual = new File ("C:\\Users\\Usuario\\Desktop\\Proyectos Eclipse\\Acceso a Datos\\src\\EJERCICIOS_TEMA3");
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
