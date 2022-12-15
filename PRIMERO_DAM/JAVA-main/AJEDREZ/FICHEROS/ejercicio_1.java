package FICHEROS;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class ejercicio_1 {

	public static void main(String[] args) {
		//   Implemente un programa que solicite el nombre de un archivo, a continuación lea su contenido y lo muestre por pantalla.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre del fichero a crear");
		String documento = sc.next();
		
		try {
			File fichero= new File ("C:\\Users\\MEDAC\\Desktop\\BLOSTE\\" +documento);
			if (fichero.createNewFile()){
				System.out.println("El fichero se ha creado");
			}else {
				System.out.println("Error en la creacion del fichero");
			}
		}catch (IOException error){
			System.out.println("La ruta especificada es incorrecta");
		}
		
		try{
			FileWriter escritura = new FileWriter ("C:\\Users\\MEDAC\\Desktop\\BLOSTE\\" +documento);
			escritura.write("Soy un follahermanas");
			escritura.close();
		}catch(IOException error){
			System.out.println("Error de escritura "+error);
		}
			
		try{
			File lectura = new File ("C:\\Users\\MEDAC\\Desktop\\BLOSTE\\" +documento);
			Scanner sc2= new Scanner(lectura);
			while (sc2.hasNextLine()){
				String datos = sc2.nextLine();
				System.out.println(datos + " ");
			}
			sc2.close();
		}catch(IOException error){
			System.out.println("Error de escritura "+error);
		}
	}

}
