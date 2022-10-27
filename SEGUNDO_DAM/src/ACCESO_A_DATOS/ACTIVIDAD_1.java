package ACCESO_A_DATOS;

import java.io.File;
import java.io.IOException;

public class ACTIVIDAD_1 {

	public static void main(String[] args) throws IOException {
		// Programa que muestra todas las entradas del directorio "c:\\windows".

		File carpeta= new File ("C:\\Windows");
		File[] lista = carpeta.listFiles();
		
		for (File list: lista) {
			System.out.println(list);
		}
		
	
	}

}
