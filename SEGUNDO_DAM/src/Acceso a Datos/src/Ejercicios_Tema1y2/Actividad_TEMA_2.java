package Ejercicios_Tema1y2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
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
		String info = "";

		//ANALISIS DE INFORMACION
		try {
			String datos;
			long count = 0;
			int parrafo1 = 0;
			FileReader lectura = new FileReader ("C:\\Users\\Usuario\\Desktop\\Actividad_TEMA 1\\"  + "Actividad_File.txt");
			BufferedReader leer = new BufferedReader(lectura);
			while ((datos = leer.readLine()) != null) {
				if (datos.equals("")) {
					parrafo1 = (int)count;
				}else {
					count++;
				}
					System.out.println("lineas parrafo 1: "+parrafo1);
					System.out.println("lineas parrafo 2: "+(count-parrafo1));
					System.out.println("lineas totales: "+(parrafo1+(count-parrafo1)));
					System.out.println();
				
				StringTokenizer conteo = new StringTokenizer(datos, " ");
				System.out.println("Esta linea tiene " + conteo.countTokens() + " palabras");
				if (conteo.countTokens() == 0) {
					contadorparrafos++;
					System.out.println("Tenemos " + contadorparrafos + " parrafos");
				}
				StreamTokenizer lectura1 = new StreamTokenizer(new StringReader(datos));
				while (lectura1.nextToken() != StreamTokenizer.TT_EOF) {
					if (lectura1.ttype == StreamTokenizer.TT_WORD) {
						lineas.add(lectura1.sval);
					}
				}
				if (lectura1.ttype == StreamTokenizer.TT_EOF) {
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
							info += "La primera palabra " + PrimeraPalabra + 
									" pertenece a la linea " + contadorlineas+ 
									", la palabra aleatoria es "+ lineas.get(0)+
									", las lineas del parrafo 1: "+parrafo1+
									", las lineas del parrafo 2: "+(count-parrafo1)+
									" parrafos: "+contadorparrafos+
									" y las lineas escritas totales: "+(parrafo1+(count-parrafo1))+
									"\n";
						}
						byte[] ArrayDeBytes = info.getBytes();
						FileOutputStream escritura = new FileOutputStream (ruta);
						escritura.write(ArrayDeBytes);
						escritura.close();
					}
					lineas.clear();
					
					System.out.println("Se acabo la lectura de la linea");
					System.out.println();
				}
			}
		} catch (IOException error) {
			System.out.println("Error de escritura " + error);
		}
	}
}
