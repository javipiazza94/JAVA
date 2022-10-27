package ACCESO_A_DATOS;

import java.io.File;
import java.util.Scanner;
public class Listar_directorios {

	public static void main(String[] args) throws NullPointerException {
		// TODO Auto-generated method stub

		Scanner Escaner = new Scanner(System.in);
		System.out.println("Introduce la ruta del directorio");
		String path = Escaner.next();
		File carpeta = new File(path);
		File[] listado = carpeta.listFiles();
		for (int i = 0; i < listado.length; i++) {
			System.out.println(listado[i]);
			/*if (listado[i].isDirectory() || listado[i].isFile()) {
				if (listado[i].isDirectory()) {
					System.out.println("\\" + listado[i].getName());
				}
				if (listado[i].isFile()) {
					System.out.println(listado[i].getName());
				}
			}*/
		}
	}
}
