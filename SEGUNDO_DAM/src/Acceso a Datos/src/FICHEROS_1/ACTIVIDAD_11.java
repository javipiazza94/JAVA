package FICHEROS_1;

import java.io.File;
import java.util.Scanner;



public class ACTIVIDAD_11 {

	static void borrarDirectorio(File archivo) {
		if (archivo.isDirectory()) {
			archivo.delete();
		} else if (archivo.isFile()) {
			archivo.delete();
		}
	}

	public static void main(String[] args) {
		/*
		 * Crear un programa en Java que borre la estructura anterior, solicitando
		 * confirmaci�n antes de borrar cada fichero o directorio y sin borrar ning�n
		 * directorio que no est� vac�o.
		 */
		Scanner sc = new Scanner(System.in);
		String Ruta = "C:\\Users\\Usuario\\Desktop\\Acceso a Datos\\src\\home2";
		File directorio = new File(Ruta);
		String[] nombreArchivos = directorio.list();
		for (int i = 0; i < nombreArchivos.length; i++) {
			System.out.println(nombreArchivos[i]);
			File rutaInterna = new File(directorio.getAbsolutePath(), nombreArchivos[i]);
			if (rutaInterna.isDirectory()) {
				System.out.println("Esta es la carpeta directorio " + rutaInterna.getName());

				String[] subcarpeta = rutaInterna.list();
				for (int j = 0; j < subcarpeta.length; j++) {
					System.out.println(subcarpeta[j]);
					File rutaInterna2 = new File(rutaInterna.getAbsolutePath(), subcarpeta[j]);
					if (rutaInterna2.isDirectory()) {
						System.out.println("Esta es la carpeta directorio " + rutaInterna2.getName());

						String[] subcarpeta2 = rutaInterna2.list();
						for (int k = 0; k < subcarpeta2.length; k++) {
							System.out.println(subcarpeta2[k]);
							File rutaInterna3 = new File(rutaInterna2.getAbsolutePath(), subcarpeta2[k]);
							if (rutaInterna3.isDirectory()) {
								System.out.println("Esta es la carpeta directorio " + rutaInterna3.getName());
								System.out.println("Quieres borrar los archivos?");
								char respuesta = sc.next().charAt(0);
								if (respuesta == 'S') {
									borrarDirectorio(rutaInterna3);
									System.out.println("El archivo se ha borrado");
								} else {
									System.out.println("No se ha borrado nada");
								}
							}
							if (rutaInterna3.isFile()) {
								System.out.println("Quieres borrar los archivos?");
								char respuesta = sc.next().charAt(0);
								if (respuesta == 'S') {
									borrarDirectorio(rutaInterna3);
									System.out.println("El archivo se ha borrado");
								} else {
									System.out.println("No se ha borrado nada");
								}
							}
						}
					}
				}
			}
		}
	}

}
