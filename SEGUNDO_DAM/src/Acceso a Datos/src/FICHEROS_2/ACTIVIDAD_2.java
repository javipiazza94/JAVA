package FICHEROS_2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ACTIVIDAD_2 {


	public static void main(String[] args) throws IOException {
		/*
		 * Crea un programa que cuente las palabras que hay en un archivo de texto.
		 */

		String Ruta = "C:\\Users\\Usuario\\Desktop\\Proyectos Eclipse\\Acceso a Datos\\src\\Actividad_1.txt";;
		File archivo = new File(Ruta);
		int cont = 0;
		Scanner sc = new Scanner(archivo);
		while (sc.hasNextLine()) {
			String datos =sc.nextLine();
			StringTokenizer conteo = new StringTokenizer(datos, " ");
			cont+= conteo.countTokens();
			}
		System.out.println("Este archivo tiene " + cont + " palabras");
		
		
	}

}
