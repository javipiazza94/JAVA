package FICHEROS_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class ACTIVIDAD_1 {
	public static HashMap<String,Integer> contarVocalesMap(String frase){
		
	      HashMap<String, Integer> mapTotal=new HashMap<String,Integer>();

	    int totalVocales = frase.replaceAll("[^AEIOUaeiouÁÉÍÓÚáéíóú]","").length();
	    int totalA = frase.replaceAll("[^AaÁá]","").length();
	    int totalE = frase.replaceAll("[^EeÉé]","").length();
	    int totalI = frase.replaceAll("[^IiÍí]","").length();
	    int totalO = frase.replaceAll("[^OoÓó]","").length();
	    int totalU = frase.replaceAll("[^UuÚú]","").length();
	    
	    mapTotal.put("a",totalA);
	    mapTotal.put("e",totalE);
	    mapTotal.put("i",totalI);
	    mapTotal.put("o",totalO);
	    mapTotal.put("u",totalU);
	    mapTotal.put("all",totalVocales);
	    return mapTotal;
	}

	public static void main(String[] args) throws IOException {
		/*
		 *  Escriba un programa en Java que lea un fichero de texto con varias líneas y cuente cuantas
			vocales hay de cada tipo (a,e,i,o,u). Para almacenar el número de vocales usa un array de 5
			posiciones
		 */

		//FRASE Y RUTA
		String frase = "Yo ahora me llamo Máximo Décimo Meridio, Comandante de los Ejércitos del Norte, \r\n"
				+ "General de las Legiones Fénix, leal servidor del emperador Marco Aurelio, \r\n"
				+ "padre de un hijo asesinado, marido de una mujer asesinada, \r\n"
				+ "y alcanzaré mi venganza, en esta vida o en la otra. \r\n";
		
		String ruta = "C:\\Users\\Usuario\\Desktop\\Proyectos Eclipse\\Acceso a Datos\\src\\Actividad_1.txt";
		
		//CREAR ARCHIVO
		File fichero= new File (ruta);
		fichero.setWritable(true);
		if (fichero.createNewFile()){
			System.out.println("El fichero se ha creado");
		}else {
			System.out.println("Error en la creacion del fichero");
		}
		
		//LEER ARCHIVO		
		if (fichero.exists()) {
			FileReader fr=new FileReader(ruta);
			BufferedReader lectura=new BufferedReader (fr);
			String cadena =lectura.readLine();
			while (cadena!=null ) {
			System.out.println(cadena);
			}
		}else{
			System.out.println ("El fichero no existe") ;
		}
		
		//ESCRIBIR ARCHIVO
		FileWriter fw = new FileWriter (ruta);
		PrintWriter escritura=new PrintWriter (fw);
		escritura.write(frase);
		escritura.flush();
		escritura.close();
		
		//ARRAY DE VOCALES
		 HashMap<String,Integer> mapTotalVocales=contarVocalesMap(frase);
		 System.out.println(mapTotalVocales);
				
	}

	

}
