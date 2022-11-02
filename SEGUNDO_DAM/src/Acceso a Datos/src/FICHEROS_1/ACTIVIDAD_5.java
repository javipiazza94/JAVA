package FICHEROS_1;

import java.io.File;
import java.io.IOException;

public class ACTIVIDAD_5 {

	public static void main(String[] args) throws IOException {
		/*
		 * Cambia despu�s el nombre de f11.txt por f12.txt, mueve el fichero f21.txt al
		 * directorio d1 y eliminando despu�s el directorio d2.
		 */

		// CAMBIAR NOMBRE DE ARCHIVO
				
		File f11= new File ("C:\\Users\\Usuario\\Desktop\\Acceso a Datos\\src\\home\\d2\\f21.txt");
		File f12= new File ("C:\\Users\\Usuario\\Desktop\\Acceso a Datos\\src\\home\\d2\\f12.txt");
		 if (f11.renameTo(f12)) { 
			 System.out.println("archivo renombrado"); } 
		 else{ System.out.println("error");
		 }
		
		// MOVER FICHERO F21 A D1
			String origen = "C:\\Users\\Usuario\\Desktop\\Acceso a Datos\\src\\home\\d2\\f12.txt";
			File archivoAMover = new File(origen);
			String destino = "C:\\Users\\Usuario\\Desktop\\Acceso a Datos\\src\\home\\d1\\";
			if (archivoAMover.renameTo(new File(destino+ archivoAMover.getName()))) {
				System.out.println("El archivo se ha movido a " + destino);
			} else {
				System.out.println("No se pudo mover");
			}
			
		// BORRAR DIRECTORIO
			File carpetaBorrar= new File ("C:\\Users\\Usuario\\Desktop\\Acceso a Datos\\src\\home\\d2");
			carpetaBorrar.delete();
			if (!carpetaBorrar.exists()) {
				System.out.println("Se borro");
			}else {
				System.out.println("No se pudo borrar");
			}

	}

}
