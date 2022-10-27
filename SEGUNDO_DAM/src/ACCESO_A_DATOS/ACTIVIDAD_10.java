package ACCESO_A_DATOS;

import java.io.File;

public class ACTIVIDAD_10 {

	public static void main(String[] args) {
		// Hacer un programa que liste el contenido del directorio actual y de los directorios que cuelgan de él, mostrando nombre y tipo de cada fichero o directorio.

		File directorioHome = new File ("C:\\Users\\javip\\Documents\\DAM\\ACTIVIDADES\\EJERCICIOS DE PROGRAMACI�N\\eclipse-workspace\\EJERCICIOS DE PROGRAMACION\\src\\Ejercicios 2- DAM\\src\\FICHEROS_1\\home2");
		System.out.println("La ruta es: "+directorioHome.getAbsolutePath());
		String [] nombreArchivos = directorioHome.list();
			
		for (int i = 0; i < nombreArchivos.length; i++) {
			System.out.println(nombreArchivos[i]);
			File rutaInterna = new File(directorioHome.getAbsolutePath(), nombreArchivos[i]);
			if (rutaInterna.isDirectory()) {
				System.out.println("Esta es la carpeta directorio "+rutaInterna.getName());
				String [] subcarpeta = rutaInterna.list();
				for (int j = 0; j < subcarpeta.length; j++) {
					System.out.println(subcarpeta[j]);
					File rutaInterna2 = new File(rutaInterna.getAbsolutePath(), subcarpeta[j]);
					if (rutaInterna2.isDirectory()) {
						System.out.println("Esta es la carpeta directorio "+rutaInterna2.getName());
						String [] subcarpeta2 = rutaInterna2.list();
						for (int k = 0; k < subcarpeta2.length; k++) {
							System.out.println(subcarpeta2[k]);
							File rutaInterna3 = new File(rutaInterna2.getAbsolutePath(), subcarpeta2[k]);
							if (rutaInterna3.isDirectory()) {
								System.out.println("Esta es la carpeta directorio "+rutaInterna3.getName());
							}
						}
					}
				}
			}
		}
	}

}
