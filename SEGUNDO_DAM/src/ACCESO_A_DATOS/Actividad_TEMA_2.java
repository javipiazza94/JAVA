package ACCESO_A_DATOS;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Actividad_TEMA_2 {
	

	public static void main(String[] args) throws IOException {
		/*
		 * Del archivo creado en la tarea anterior se deberá extraer la siguiente
		 * información.  Total de líneas de cada párrafo.  Una palabra aleatoria de
		 * cada línea.  La primera palabra de cada línea.
		 */

		ArrayList<String> lineas = new ArrayList<String>();
		int contadorlineas = 0;
		int contadorparrafos = 1;
		String PrimeraPalabra;
		String ruta = "C:\\Users\\Usuario\\Desktop\\Actividad_TEMA 1\\"  + "Actividad_TEMA2_extracion.txt";
		String info;

		//ANALISIS DE INFORMACION
		try {
			File archivo = new File("C:\\Users\\Usuario\\Desktop\\Actividad_TEMA 1\\" + "Actividad_File.txt");
			Scanner sc = new Scanner(archivo);
			while (sc.hasNextLine()) {
				String datos = sc.nextLine();
				StringTokenizer conteo = new StringTokenizer(datos, " ");
				System.out.println("Esta linea tiene " + conteo.countTokens() + " palabras");
				if (conteo.countTokens() == 0) {
					contadorparrafos++;
					System.out.println("Tenemos " + contadorparrafos + " parrafos");
				}
				StreamTokenizer lectura = new StreamTokenizer(new StringReader(datos));
				while (lectura.nextToken() != StreamTokenizer.TT_EOF) {
					if (lectura.ttype == StreamTokenizer.TT_WORD) {
						lineas.add(lectura.sval);
					}
				}
				if (lectura.ttype == StreamTokenizer.TT_EOF) {
					contadorlineas++;
					System.out.println("Esta es la linea numero " + contadorlineas);
					if (!lineas.isEmpty()) {
						Collections.shuffle(lineas);
						System.out.println("La palabra aleatoria extraida de esta linea " + contadorlineas + " es " + lineas.get(0));// get(0) extrae una palabra
						StringTokenizer tokens = new StringTokenizer(datos);
						PrimeraPalabra = tokens.nextToken();
						System.out.println("La primera palabra " + PrimeraPalabra + " pertenece a la linea " + contadorlineas);
						File fichero_extraccion= new File (ruta);
						fichero_extraccion.setWritable(true);
						fichero_extraccion.createNewFile();
						for(int i = 0; i<lineas.size(); i++){
							info = "La primera palabra " + PrimeraPalabra + " pertenece a la linea " + contadorlineas+ " y la palabra aleatoria es "+ lineas.get(0);
							byte[] ArrayDeBytes = info.getBytes();
								FileOutputStream escritura = new FileOutputStream (ruta);
								escritura.write(ArrayDeBytes);
								escritura.close();
						}
					}
					lineas.clear();
					
					System.out.println("Se acabo la lectura de la linea");
					System.out.println();
				}
			}
			sc.close();
		} catch (IOException error) {
			System.out.println("Error de escritura " + error);
		}
		
		
}
}
