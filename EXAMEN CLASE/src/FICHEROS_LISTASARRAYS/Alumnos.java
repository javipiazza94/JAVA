package FICHEROS_LISTASARRAYS;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Alumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * El usuario mete alumnos hasta que escriba "YA"
		 * Imprimir la lista
		 * Dar la vuelta  -reversen't
		 * Imprimir otra vez
		 */
		
		Scanner scanner = new Scanner(System.in);
		List<String> listadealumnos = new ArrayList<String>();
		List<String> revelistadealumnos = new ArrayList<String>();
		int cont =0;
		boolean acabado = false;
	do {
		System.out.println("Mete el nombre del alumno");
		String alumno = scanner.next();
		listadealumnos.add(alumno);
		
		if (alumno.equals("YA")){
			acabado = true;
			listadealumnos.remove("YA");
		}else{ cont++;}
	
	} while (!acabado);

	System.out.println(listadealumnos);
	
	for (int i = cont-1 ; i>=0; i--){
		revelistadealumnos.add(listadealumnos.get(i));
	}
	System.out.println(revelistadealumnos);
	}

	}

