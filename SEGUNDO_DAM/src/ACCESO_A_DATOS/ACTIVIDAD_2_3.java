package ACCESO_A_DATOS;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ACTIVIDAD_2_3 {
	
	public static String ObtenerPrimeraletra(String letra)
    {
        if(letra == null || letra.length() == 0)
            return null;
        else
            return letra.substring(0, 1);
    }

	public static void main(String[] args) throws IOException {
		/*
		 *  Tenemos un fichero de texto que contiene varias líneas y necesitamos imprimir las iniciales de
			todas las palabras que aparecen en el mismo. Realizar el análisis y obtener un programa en
			lenguaje Java que imprima en pantalla las iniciales separadas por un espacio. Una letra es inicial
			de palabra si va precedida de blanco u otro carácter que no sea letra o es la primera de una línea.
			Téngase en cuenta que las palabras del fichero, están separadas por uno o más espacios en blanco
			o final de línea. Puedes ayudarte de la clase StringTokenizer
		 */

		String Ruta = "C:\\Users\\javip\\OneDrive\\Escritorio\\Actividad_1.txt";
		File archivo = new File(Ruta);
		Scanner sc = new Scanner(archivo);
		while (sc.hasNext()) {
			String datos =sc.next();
			StringTokenizer palabras = new StringTokenizer(datos);
			StringTokenizer tokens = new StringTokenizer(ACTIVIDAD_2_3.ObtenerPrimeraletra(datos));
			while(tokens.hasMoreTokens()&& palabras.hasMoreTokens()){
				System.out.println("La primera letra de "+palabras.nextToken()+" es: "+tokens.nextToken());
				}
		}
	}
}
