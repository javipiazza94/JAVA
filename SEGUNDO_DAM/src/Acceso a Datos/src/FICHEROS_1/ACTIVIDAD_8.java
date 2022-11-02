package FICHEROS_1;

import java.io.File;
import java.io.IOException;

public class ACTIVIDAD_8 {

	public static void main(String[] args) throws IOException {
		/*
		 *  Realiza un programa en Java que cree una estructura de directorios como la siguiente,
			donde fx son ficheros y dx son directorios,
		 */

		File home= new File ("C:\\Users\\Usuario\\Desktop\\Acceso a Datos\\src\\home2");
		home.mkdir();
		File usuario1= new File ("C:\\Users\\Usuario\\Desktop\\Acceso a Datos\\src\\home2\\usuario1");
		usuario1.mkdir();
		File usuario2= new File ("C:\\Users\\Usuario\\Desktop\\Acceso a Datos\\src\\home2\\usuario2");
		usuario2.mkdir();
		File f1= new File ("C:\\Users\\Usuario\\Desktop\\Acceso a Datos\\src\\home2\\usuario1\\f1.txt");
		f1.createNewFile();
		File d1= new File ("C:\\Users\\Usuario\\Desktop\\Acceso a Datos\\src\\home2\\usuario2\\d1");
		d1.mkdir();
		File f2= new File ("C:\\Users\\Usuario\\Desktop\\Acceso a Datos\\src\\home2\\usuario2\\d1\\f2.txt");
		f2.createNewFile();
		File d2= new File ("C:\\Users\\Usuario\\Desktop\\Acceso a Datos\\src\\home2\\usuario2\\d2");
		d2.mkdir();
		File f3= new File ("C:\\Users\\Usuario\\Desktop\\Acceso a Datos\\src\\home2\\usuario2\\d2\\f3.txt");
		f3.createNewFile();
		File f4= new File ("C:\\Users\\Usuario\\Desktop\\Acceso a Datos\\src\\home2\\usuario2\\d2\\f4.txt");
		f4.createNewFile();
		File d3= new File ("C:\\Users\\Usuario\\Desktop\\Acceso a Datos\\src\\home2\\usuario2\\d2\\d3");
		d3.mkdir();
		
		if(home.exists()&&
			usuario1.exists()&&
			usuario2.exists()&&
			d1.exists()&&
			d2.exists()&&
			d3.exists()&&
			f1.exists()&&
			f2.exists()&&
			f3.exists()&&
			f4.exists()) {
			System.out.println("Ficheros creados");
		}else {
			System.out.println("Error en la creacion/ ficheros modificados");
		}
	}

}
