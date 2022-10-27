package ACCESO_A_DATOS;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ACTIVIDAD_2_6 {

	public static void main(String[] args) throws IOException {
		/*
		 * Desarrolla un programa que muestre un archivo en líneas de 80 caracteres,
		 * además mostrará el texto pantalla a pantalla, en cada pantalla presenta 23
		 * líneas. Después de completar la pantalla el programa se para hasta que el
		 * usuario pulsa un tecla y entonces muestra la página siguiente.
		 */

		String Ruta = "C:\\Users\\javip\\OneDrive\\Escritorio\\Actividad_1.txt";
		File archivo = new File(Ruta);
		Scanner sc = new Scanner(archivo);
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			for (int i = 0; i < line.length(); i++) {
				if ((i) < 80) {
					System.out.println((i));
				}
			}

		}
	}

}
