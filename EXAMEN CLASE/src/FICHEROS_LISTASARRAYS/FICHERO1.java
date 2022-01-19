package FICHEROS_LISTASARRAYS;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class FICHERO1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre del fichero a crear");
		String docu = sc.next();
		try {
			File fichero= new File ("C:\\Users\\MEDAC\\Desktop\\RUCA\\" +docu);
			if (fichero.createNewFile()){
				System.out.println("El fichero se ha creado");
			}else {
				System.out.println("Error en la creacion del fichero");
			}
		}catch (IOException error){
			System.out.println("La ruta especificada es incorrecta");
		}
		
		//ESCRITURA DE UN FICHERO
		
		try{
			FileWriter escritura = new FileWriter ("C:\\Users\\MEDAC\\Desktop\\RUCA\\" +docu);
			escritura.write("Sufro de Dierna");
			escritura.close();
		}catch(IOException error){
			System.out.println("Error de escritura "+error);
		}
		
		//LECTURA DE FICHERO
		
		try{
			File lectura = new File ("C:\\Users\\MEDAC\\Desktop\\RUCA\\" +docu);
			Scanner sc2= new Scanner(lectura);
			while (sc2.hasNextLine()){
				String datos = sc2.nextLine();
				System.out.println(datos + " ");
			}
			sc2.close();
		}catch(IOException error){
			System.out.println("Error de escritura "+error);
		}
			
		//ELIMINAR FICHEROS
			
			File ficheroborrado= new File ("C:\\Users\\MEDAC\\Desktop\\RUCA\\" +docu);
			if (ficheroborrado.delete()){
					System.out.println("Se ha borrado");
			}else {
					System.out.println("No se ha borrado");
			}
			
		//LISTAR CONTENIDO DIRECTORIO
				
			File directorio = new File ("C:\\Users\\MEDAC\\Desktop");
			String [] ArraydeFichero = directorio.list();
			for (String name: ArraydeFichero)
				System.out.println(name);
			System.out.println(Arrays.toString(ArraydeFichero));
	
		}

		}
