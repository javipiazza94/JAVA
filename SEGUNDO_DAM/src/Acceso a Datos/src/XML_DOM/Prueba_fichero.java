package XML_DOM;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Prueba_fichero {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		// CREAMOS EL ARRALIST DONDE GUARDAMOS LAS PELICULAS
			ArrayList<Pelicula> lista = new ArrayList<Pelicula>();

			// CREAMOS EL DAT Y LA IMPRESION
			String Ruta = "C:\\Users\\Usuario\\Desktop\\Proyectos Eclipse\\Acceso a Datos\\src\\XML_DOM\\";
			File archivo = new File(Ruta, "Prueba.txt");
			FileWriter fw = new FileWriter(archivo);
			PrintWriter escritura = new PrintWriter(fw);

			/*
			 * LEEMOS EL ARCHIVO TXT CREADO, LO SEPARAMOS POR "/", ASOCIAMOS CADA STRING CON
			 * UN ATRIBUTO, LO ASOCIAMOS A UNA PELICULA E IMPRIMIMOS EL TOSTRING EN EL DAT
			 */
			File txt = new File("C:/Users/Usuario/Desktop/Proyectos Eclipse/Acceso a Datos/src/XML_DOM/Pelis.txt");
			BufferedReader br = new BufferedReader(new FileReader(txt));
			String linea;
			Scanner sc = new Scanner(System.in);
			while ((linea = br.readLine()) != null) {
				System.out.println();
				String[] values = linea.split("/");
				Pelicula nueva = new Pelicula(values[0], values[1], values[2], values[3]);
				lista.add(nueva);
				System.out.println(nueva.toString());
				escritura.write(nueva.toString());
				escritura.flush();
			}

	}

}
