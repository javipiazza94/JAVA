package Databases_T4_T5_T6_T7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class t5 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		Properties propiedades = new Properties();
		propiedades.load(new FileReader("C:\\Users\\Usuario\\Documents\\ACCESO A DATOS\\demo\\src\\main\\resources\\application.properties"));
		Enumeration<Object> claves = propiedades.keys();
		  
		while (claves.hasMoreElements()) {
		  Object clave = claves.nextElement();
		  System.out.println(clave.toString() + " - " + propiedades.get(clave).toString());
		}
	}

}
