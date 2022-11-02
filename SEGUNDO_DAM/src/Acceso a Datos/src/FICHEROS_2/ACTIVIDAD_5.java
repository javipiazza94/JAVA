package FICHEROS_2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static java.nio.file.StandardCopyOption.*;

public class ACTIVIDAD_5 {
	
		public static void main(String[] args) throws IOException {
			/*
			 *  Haz un programa que copie un archivo en otro carácter a carácter. Los nombres de
				los archivos origen y destino se pasarán como argumentos
			 */
			
			    String  origen = "C:\\Users\\Usuario\\Desktop\\Proyectos Eclipse\\Acceso a Datos\\src\\Actividad_1.txt";;   
		        String destino="C:\\Users\\Usuario\\Desktop\\Proyectos Eclipse\\Acceso a Datos\\src\\copiaActividad_1.txt";  
		        File origenArchivo = new File(origen);        
		        File destinoArchivo = new File(destino);   
		        Files.copy(origenArchivo.toPath(), destinoArchivo.toPath(),REPLACE_EXISTING);
		        if (origenArchivo.exists()) {
					System.out.println("La copia se ha efectuado");
				}else {
					System.out.println("No se ha podido realizar");
				}
	}

}
