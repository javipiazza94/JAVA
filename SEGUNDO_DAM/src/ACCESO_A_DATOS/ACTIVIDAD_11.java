package ACCESO_A_DATOS;

import java.io.File;
import java.util.Scanner;

public class ACTIVIDAD_11 {

	public static void main(String[] args) {
		/*
		 * Crear un programa en Java que borre la estructura anterior, solicitando
		 * confirmaci�n antes de borrar cada fichero o directorio y sin borrar ning�n
		 * directorio que no est� vac�o.
		 */

		Scanner sc = new Scanner(System.in);
		File directorioHome = new File(
				"C:\\Users\\javip\\Documents\\DAM\\ACTIVIDADES\\EJERCICIOS DE PROGRAMACI�N\\eclipse-workspace\\EJERCICIOS DE PROGRAMACION\\src\\Ejercicios 2- DAM\\src\\FICHEROS_1\\home2");
		System.out.println("La ruta es: " + directorioHome.getAbsolutePath());
		File[] nombreArchivos = directorioHome.listFiles();

		for (File list: nombreArchivos) {
			System.out.println(list.getName());
			System.out.println("Quieres borrar los archivos?");
			char respuesta = sc.next().charAt(0);
			if (respuesta == 'S') {
				list.delete();
				System.out.println("El archivo se ha borrado");
			} else {
				System.out.println("No se ha borrado nada");
			}
			
		}
	}
}
