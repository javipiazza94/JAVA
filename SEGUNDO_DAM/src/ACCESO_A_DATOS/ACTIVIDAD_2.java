package ACCESO_A_DATOS;

import java.io.File;

public class ACTIVIDAD_2 {

	public static void main(String[] args) {
		//EJERCICIO 2 Programa que diga cuál es el directorio actual.
		
		File directorioActual = new File ("C:\\Users\\javip\\eclipse\\java-2021-12\\eclipse\\eclipse.exe");
		System.out.println(directorioActual.getAbsolutePath());
	}

}
