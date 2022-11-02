package FICHEROS_1;

import java.io.File;

public class ACTIVIDAD_2 {

	public static void main(String[] args) {
		//EJERCICIO 2 Programa que diga cuál es el directorio actual.
		
		File directorioActual = new File ("C:\\Users\\Usuario\\eclipse\\java-2022-09\\eclipse\\eclipse.exe");
		System.out.println(directorioActual.getAbsolutePath());
	}

}
