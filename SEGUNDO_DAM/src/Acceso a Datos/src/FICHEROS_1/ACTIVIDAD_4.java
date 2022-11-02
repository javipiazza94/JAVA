package FICHEROS_1;

import java.io.File;
import java.io.IOException;

public class ACTIVIDAD_4 {

	public static void main(String[] args) throws IOException {
		// Realiza un programa que cree la estructura de directorios y ficheros siguiente
		
		File home= new File ("C:\\Users\\Usuario\\Desktop\\Acceso a Datos\\src\\home");
		home.mkdir();
		File d1= new File ("C:\\Users\\Usuario\\Desktop\\Acceso a Datos\\src\\home\\d1");
		d1.mkdir();
		File d2= new File ("C:\\Users\\Usuario\\Desktop\\Acceso a Datos\\src\\home\\d2");
		d2.mkdir();
		File f11= new File ("C:\\Users\\Usuario\\Desktop\\Acceso a Datos\\src\\home\\d1\\f11.txt");
		f11.createNewFile();
		File f21= new File ("C:\\Users\\Usuario\\Desktop\\Acceso a Datos\\src\\home\\d2\\f21.txt");
		f21.createNewFile();
		
		if(home.exists()&& d1.exists()&& d2.exists()&& f11.exists()&& f21.exists()) {
			System.out.println("Ficheros creados");
		}else {
			System.out.println("Error en la creacion/ ficheros modificados");
		}
	}
}
