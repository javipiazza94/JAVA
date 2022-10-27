package ACCESO_A_DATOS;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static java.nio.file.StandardCopyOption.*;

public class ACTIVIDAD_2_5 {
	
		public static void main(String[] args) throws IOException {
			/*
			 *  Haz un programa que copie un archivo en otro carácter a carácter. Los nombres de
				los archivos origen y destino se pasarán como argumentos
			 */
			
			    String  sourcePath = "C:\\Users\\javip\\OneDrive\\Escritorio\\Actividad_1.txt";   
		        String destinationPath="C:\\Users\\javip\\OneDrive\\Escritorio\\copia.txt";  
		        File sourceFile = new File(sourcePath);        
		        File destinationFile = new File(destinationPath);   
		        Files.copy(sourceFile.toPath(), destinationFile.toPath(),REPLACE_EXISTING);
	}

}
