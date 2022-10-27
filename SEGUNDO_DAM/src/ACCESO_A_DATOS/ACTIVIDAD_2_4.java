package ACCESO_A_DATOS;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ACTIVIDAD_2_4 {

	public static String ObtenerLetraH(String letra) {
		String palabra = "";
		for (int i = 0; i < letra.length(); i++) {
			if (letra.charAt(i) == 'h') {
				letra += palabra;
				;
			}
		}return palabra;

	}

	public static void main(String[] args) throws IOException {
		/*
		 * Realizar un programa en Java que cuente las haches intercaladas de un texto
		 * de varias líneas que se encuentra en un fichero. Repetir el problema de forma
		 * que cuente sólo las palabras con hache intercalada. En este segundo caso una
		 * palabra con varias haches intercaladas debe ser contada una sola vez.
		 */

		String Ruta = "C:\\Users\\javip\\OneDrive\\Escritorio\\Actividad_1.txt";
		File archivo = new File(Ruta);
		Scanner sc = new Scanner(archivo);
		while (sc.hasNext()) {
			String datos = sc.next();
			System.out.println(ACTIVIDAD_2_4.ObtenerLetraH(datos)); 
		
		}
	}
}
