package ACCESO_A_DATOS;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ACTIVIDAD_5 {

	public static void main(String[] args) throws IOException {
		/*
		 * Cambia despu�s el nombre de f11.txt por f12.txt, mueve el fichero f21.txt al
		 * directorio d1 y eliminando despu�s el directorio d2.
		 */

		// CAMBIAR NOMBRE DE ARCHIVO
		
		 File f11 = new File("C:\\Users\\javip\\Documents\\DAM\\ACTIVIDADES\\EJERCICIOS DE PROGRAMACI�N\\eclipse-workspace\\EJERCICIOS DE PROGRAMACION\\src\\Ejercicios 2- DAM\\src\\FICHEROS_1\\home\\d1\\f11.txt");
		 File f12 = new File("C:\\Users\\javip\\Documents\\DAM\\ACTIVIDADES\\EJERCICIOS DE PROGRAMACI�N\\eclipse-workspace\\EJERCICIOS DE PROGRAMACION\\src\\Ejercicios 2- DAM\\src\\FICHEROS_1\\home\\d1\\f12.txt"); 
		 if (f11.renameTo(f12)) { 
			 System.out.println("archivo renombrado"); } 
		 else{ System.out.println("error");
		 
		 }
		 

		// MOVER FICHERO F21 A D1
		String origen = "C:\\Users\\javip\\Documents\\DAM\\ACTIVIDADES\\EJERCICIOS DE PROGRAMACI�N\\eclipse-workspace\\EJERCICIOS DE PROGRAMACION\\src\\Ejercicios 2- DAM\\src\\FICHEROS_1\\home\\d2\\f21.txt";
		File archivoAMover = new File(origen);
		String destino = "C:\\Users\\javip\\Documents\\DAM\\ACTIVIDADES\\EJERCICIOS DE PROGRAMACI�N\\eclipse-workspace\\EJERCICIOS DE PROGRAMACION\\src\\Ejercicios 2- DAM\\src\\FICHEROS_1\\home\\d1\\";
		if (archivoAMover.renameTo(new File(destino+ archivoAMover.getName()))) {
			System.out.println("El archivo se ha movido a " + destino);
		} else {
			System.out.println("No se pudo mover");
		}
		
		// BORRAR DIRECTORIO
		File carpetaBorrar= new File ("C:\\Users\\javip\\Documents\\DAM\\ACTIVIDADES\\EJERCICIOS DE PROGRAMACI�N\\eclipse-workspace\\EJERCICIOS DE PROGRAMACION\\src\\Ejercicios 2- DAM\\src\\FICHEROS_1\\home\\d2");
		carpetaBorrar.delete();
		if (!carpetaBorrar.exists()) {
			System.out.println("Se borro");
		}else {
			System.out.println("No se pudo borrar");
		}
	}
}
