package FICHEROS_2;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ACTIVIDAD_4 {

	public static void main(String[] args) throws IOException {
		/*
		 * Realizar un programa en Java que cuente las haches intercaladas de un texto
		 * de varias líneas que se encuentra en un fichero. Repetir el problema de forma
		 * que cuente sólo las palabras con hache intercalada. En este segundo caso una
		 * palabra con varias haches intercaladas debe ser contada una sola vez.
		 */

		int cont = 0;
		String Ruta = "C:\\Users\\Usuario\\Desktop\\Proyectos Eclipse\\Acceso a Datos\\src\\Actividad_1.txt";;
		
		File archivo = new File(Ruta);
		Scanner sc = new Scanner(archivo);
		while (sc.hasNext()) {
			String datos = sc.next();
			String[] palabras = datos.split(" ");
			for (int i = 0; i < palabras.length; i++) {
				if (palabras[i].contains("h")) {
					if (!palabras[i].contains("ch")&&palabras[i].charAt(0)!='h') {
						cont++;
						System.out.println("Hay un total de "+cont+ " de palabras con H intercalada o final que es "+palabras[i]);
					}

				}
				}
			}
		}
	}


