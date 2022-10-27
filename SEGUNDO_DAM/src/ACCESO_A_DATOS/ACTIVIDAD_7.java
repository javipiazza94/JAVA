package ACCESO_A_DATOS;

import java.io.File;
import java.io.IOException;

public class ACTIVIDAD_7 {
	
	public static void main(String[] args) throws IOException {
		/*
		 *  Realiza un programa que compruebe si se tiene acceso de ejecuci�n y lectura a un
			fichero (pasado como argumento) y despu�s modifique sus atributos denegando estos
			permisos. (No funcionan en Windows).
		 */
		String Ruta = "C:\\Users\\javip\\AppData\\Local\\Discord\\Update.exe --processStart Discord.exe";
		File archivo = new File(Ruta);
		System.out.println("El archivo tiene permiso de lectura? "+archivo.canRead());
		System.out.println("El archivo tiene permiso de ejecucion? "+archivo.canExecute());
		archivo.setExecutable(false);
		if (archivo.setExecutable(false)) {
			System.out.println("Se ha modificado el permiso de ejecucion del archivo");
		} else {
			System.out.println("No se pudo modificar");
		}
		
	}

}
