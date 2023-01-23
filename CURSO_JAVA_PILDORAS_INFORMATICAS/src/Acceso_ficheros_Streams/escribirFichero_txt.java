package Acceso_ficheros_Streams;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class escribirFichero_txt {

	public static void main(String[] args) {
		escrituraPorCaracteres archivo = new escrituraPorCaracteres();
		archivo.escribir();
	}
}
	class escrituraPorCaracteres {
		public void escribir() {
			String frase = "Con los dedos de las manos, con los dedos de los pies, con la polla y los cojones todos suman veintitres";
			try {
				FileWriter entrada = new FileWriter("C:\\Users\\javip\\OneDrive\\Documents\\DAM\\ACTIVIDADES\\EJERCICIOS DE PROGRAMACIÓN\\JAVA\\CURSO_JAVA_PILDORAS_INFORMATICAS\\src\\Acceso_ficheros_Streams\\Fichero a escribir.txt", true);
				//El true delante anade lo escrito a un archivo ya existente, no crea uno nuevo
				for (int i = 0; i < frase.length(); i++) {
					entrada.write(frase.charAt(i));
					System.out.println(frase);
				}
				
				entrada.close(); //Deben ser cerrados siempre
			} catch (FileNotFoundException e) {
				System.out.println("No se encontro el archivo");
			} catch (IOException e) {
				System.out.println("No se ha podido leer el archivo");
			}
		}
	}
