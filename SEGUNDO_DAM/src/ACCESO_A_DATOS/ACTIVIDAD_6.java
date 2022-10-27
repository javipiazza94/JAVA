package ACCESO_A_DATOS;

import java.io.File;

public class ACTIVIDAD_6 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que muestre los atributos de un fichero o directorio cuyo nombre se pase como primer argumento.
		 */

		String Ruta_carpeta = "C:\\Users\\javip\\Documents\\DAM\\ACTIVIDADES\\EJERCICIOS DE PROGRAMACI�N\\eclipse-workspace\\EJERCICIOS DE PROGRAMACION\\src\\Ejercicios 2- DAM\\src\\FICHEROS_1\\home\\d1";
		File carpetaD1 = new File(Ruta_carpeta);
		System.out.println("El nombre del archivo es "+carpetaD1.getName());
		System.out.println("La ruta del archivo es "+carpetaD1.getAbsolutePath());
		System.out.println("El tamano del archivo es "+carpetaD1.length());
		System.out.println("El archivo es directorio? "+carpetaD1.isDirectory());
		System.out.println("La ultima modificacion del archivo es "+carpetaD1.lastModified());
		System.out.println("El archivo tiene permiso de lectura? "+carpetaD1.canRead());
		System.out.println("El archivo tiene permiso de escritura? "+carpetaD1.canWrite());
		System.out.println("El archivo tiene permiso de ejecucion? "+carpetaD1.canExecute());
		
		
	}

}
