package FICHEROS_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ACTIVIDAD_6 {
	public static void main(String[] args) throws IOException {
		/*
		 *  Desarrolla un programa que muestre un archivo en líneas de 80 caracteres, además
			mostrará el texto pantalla a pantalla, en cada pantalla presenta 23 líneas. Después de
			completar la pantalla el programa se para hasta que el usuario pulsa un tecla y entonces
			muestra el parrafo siguiente.
		 */
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		int contlinea = 0;
		String Ruta = "C:\\Users\\Usuario\\Desktop\\Proyectos Eclipse\\Acceso a Datos\\src\\Actividad_1.txt";;// se lee caracter a caracter por enteros
		FileReader lectura = new FileReader (Ruta);
		int linea = 0;
		while ((linea = lectura.read())!=-1){
			System.out.print((char)linea); //imprime los enteros casteados a char sin separalos linea a linea
			cont++;
			if (cont==40) {
				System.out.println();
				cont=0; //inicializa el contador para coger la siguiente linea
				contlinea++;
			}
			if (contlinea == 2) {
				System.out.println();
				System.out.println("Introduce un espacio para el siguiente parrafo");
				contlinea=0;
				sc.nextLine();
			}
			
			}
		}

}

