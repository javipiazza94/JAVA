package BUCLES_IFS_CLASES_PREDEFINIDAS;
// Meter DNI y letra y comprobar que sea correcto
import java.util.Scanner;

public class DNI2 {
	public static void main(String[] args){
		// Colocamos el  main para iniciar
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca el DNI");
		int DNI= sc.nextInt();
		System.out.println("Introduzca la letra");
		char letra= sc.next().charAt(0);//Pillamos la letra del usuario quiera
		
		final String lista = "TRWAGMYFPDXBNJZSQVHLCKE"; //Introducimos la cadena de letras de donde cogemos el DNI
		int DNIletra = DNI%23; //Hacemos el modulo de la letra para cogerla
		char car = lista.charAt(DNIletra); // Buscamos la letra en la posicion indicada
		
		if (car==letra)
		{ System.out.println("La letra es correcta");
		} 
		else 
		{System.out.println("La letra es incorrecta");
		} 
}}
