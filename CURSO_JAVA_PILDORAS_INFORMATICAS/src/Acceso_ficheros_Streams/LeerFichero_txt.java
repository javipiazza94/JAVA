package Acceso_ficheros_Streams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero_txt {

	public static void main(String[] args) {
		lecturaPorCaracteres archivo = new lecturaPorCaracteres();
		archivo.leer();
	}
}
	class lecturaPorCaracteres {
		public void leer() {
			try {
				FileReader entrada = new FileReader("C:\\Users\\javip\\OneDrive\\Documents\\DAM\\ACTIVIDADES\\EJERCICIOS DE PROGRAMACIÓN\\JAVA\\CURSO_JAVA_PILDORAS_INFORMATICAS\\src\\Acceso_ficheros_Streams\\Fichero a leer.txt");
				int lectura = entrada.read();
				while(lectura!=-1) { //el numero de caracteres llega en la lectura al -1
					lectura = entrada.read();
					char letras = (char)lectura; //casteamos a letras
					System.out.print(letras); //Si le quitamos el println por un print se imprime por linea y no por caracter
				}
				entrada.close(); //Deben ser cerrados siempre
			} catch (FileNotFoundException e) {
				System.out.println("No se encontro el archivo");
			} catch (IOException e) {
				System.out.println("No se ha podido leer el archivo");
			}
		}
	}

