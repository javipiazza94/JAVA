package Ejercicios_repaso;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

	public class Crear_fichero {
		public static void main(String[] args) {
			//   Implemente un programa que solicite el nombre de un archivo, a continuaci�n lea su contenido y lo muestre por pantalla.
			
			//CREAMOS FICHERO Y CARPETAS
			Scanner escaner = new Scanner(System.in);
			System.out.println("Introduce el nombre de la carpeta");
			String doc = escaner.next();
			try {
				File carpeta= new File ("C:\\Users\\Usuario\\Desktop\\Acceso a Datos\\src\\"  +doc);
				carpeta.mkdir();
				File fichero= new File ("C:\\Users\\Usuario\\Desktop\\Acceso a Datos\\src\\"  + "Gladiator.txt");
				fichero.setWritable(true);
				if (fichero.createNewFile()){
					System.out.println("El fichero se ha creado");
				}else {
					System.out.println("Error en la creacion del fichero");
				}
			}catch (IOException error){
				System.out.println("La ruta especificada es incorrecta");
			}
			
			escaner.close();
			
		//ESCRITURA POR BYTES
			String camino = "C:\\Users\\Usuario\\Desktop\\Acceso a Datos\\src\\Gladiator.txt";
			String frase = "Me llamo Maximo Decimo Meridio, Comandante de los Ejercitos del Norte, General de las Legiones Fenix, Fiel servidor"
					+ " del emperador Marco Aurelio. Padre de un hijo asesinado, marido de una esposa asesinada, "
					+"y alcanzare mi venganza, en esta vida o en la otra";
			
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
			
	}}	
			
			/*
			//ACCESO
			try{
				FileWriter escritura = new FileWriter ("C:\\Users\\Usuario\\Desktop\\Acceso a Datos\\src" +documento.txt);
				escritura.write("Soy un follahermanas");
				escritura.close();
			}catch(IOException error){
				System.out.println("Error de escritura "+error);
			}
				
			try{
				File lectura = new File ("C:\\Users\\Usuario\\Desktop\\Acceso a Datos\\src\\" +documento.txt);
				Scanner sc2= new Scanner(lectura);
				while (sc2.hasNextLine()){
					String datos = sc2.nextLine();
					System.out.println(datos + " ");
				}
				sc2.close();
			}catch(IOException error){
				System.out.println("Error de escritura "+error);
			}
			
			*/