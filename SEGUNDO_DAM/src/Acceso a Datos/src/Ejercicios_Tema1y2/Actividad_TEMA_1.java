package Ejercicios_Tema1y2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Actividad_TEMA_1 {
	
	public static void main(String[] args) {
		/*  1.  Creará un directorio llamado Actividad_TEMA 1 
			2.  En ese directorio se creará un archivo llamado Actividad_File.txt 
			3.  Dentro del archivo se copiará un texto que deberá tener  2 párrafos de 5 a 10 
		líneas. 
			4.  Una vez creado el archivo con los requerimientos anteriores deberá por el 
		monitor devolver los atributos del archivo, así como el número total de líneas 
		del texto. */
		
		//CREACION DEL DIRECTORIO Y ARCHIVO
		try {
			File carpeta= new File ("C:\\Users\\Usuario\\Desktop\\Actividad_TEMA 1");
			carpeta.mkdir();
			File fichero= new File ("C:\\Users\\Usuario\\Desktop\\Actividad_TEMA 1\\"  + "Actividad_File.txt");
			fichero.setWritable(true);
			if (fichero.createNewFile()){
				System.out.println("El fichero se ha creado");
			}else {
				System.out.println("Error en la creacion del fichero");
			}
		}catch (IOException error){
			System.out.println("La ruta especificada es incorrecta");
		}
		
		//ESCRITURA TEXTO
		String camino = "C:\\Users\\Usuario\\Desktop\\Actividad_TEMA 1\\Actividad_File.txt";
		String frase = "A partir de 1519, inició en el actual territorio mexicano un proceso cultural sumamente interesante y complejo: \r\n"
				+ "la implantación y difusión del cristianismo en el seno de las sociedades indígenas mesoamericanas. \r\n"
				+ "En muchos casos esa implantación fue violenta y se realizó mediante la destrucción de códices, esculturas y templos y la conversión forzosa de los naturales. \r\n"
				+ "En otros, por el contrario, fueron los indígenas los que adoptaron la nueva religión como signo de un pacto político de mayor alcance, como ocurrió en el caso de la conversión de los caciques de Tlaxcala. \r\n"
				+ "El resultado final, a la postre, fue un proceso de sincretismo religioso que, sin embargo, no era nuevo en la tradición judeo-cristiana.\r\n"
				+ "\r\n"
				+ "El cristianismo surgió en el rincón más alejado del Imperio romano en la primera mitad del siglo I de nuestra era en un medio social humilde. \r\n"
				+ "Hoy en día, tanto la evidencia arqueológica como la histórica permiten afirmar la existencia de Jesús de Nazareth, a quien la tradición denominó como Cristo, es decir, el ungido.\r\n"
				+ "Originalmente, la prédica de Jesús fue considerada como una herejía dentro de la tradición judaica y fue sólo con el paso de los años que logró conformarse como una nueva corriente doctrinal. \r\n"
				+ "En dicho proceso de conformación, fue particularmente importante el contacto con las distintas tradiciones culturales del medio oriente y del mundo Mediterráneo, por lo que el cristianismo fue en realidad resultado de un largo proceso de sincretismo cultural y definición doctrinal, litúrgica y disciplinaria que duró al menos cinco siglos.\r\n"
				+ "Puede afirmarse que cuando el cristianismo llegó a las costas de Mesoamérica tenía milenio y medio de experiencia en la incorporación de tradiciones culturales distintas y contaba con diversos mecanismos -discursivos, simbólicos, iconográficos, culturales, jurídicos- para conquistar y colonizar los espacios físicos e imaginarios del Nuevo Mundo.";
		
		byte[] ArrayDeBytes = frase.getBytes();
		
		try {
			FileOutputStream escritura = new FileOutputStream (camino);
			escritura.write(ArrayDeBytes);
			escritura.close();
			System.out.println("Escrito");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try{
			String line;
			long paraCount = 0;
			long count = 0;
			int parrafo1 = 0;
			FileReader lectura = new FileReader ("C:\\Users\\Usuario\\Desktop\\Actividad_TEMA 1\\"  + "Actividad_File.txt");
			BufferedReader leer = new BufferedReader(lectura);
			while ((line = leer.readLine()) != null){
				if (line.equals("")) {
					parrafo1 = (int)count;
					paraCount++;
				}else {
					count++;
				}
			}
			System.out.println("lineas parrafo 1: "+parrafo1);
			System.out.println("lineas parrafo 2: "+(count-parrafo1));
			System.out.println("lineas totales: "+(parrafo1+(count-parrafo1)));
			
		}catch(IOException error){
			System.out.println("Error de escritura "+error);
		}
		
	}

}