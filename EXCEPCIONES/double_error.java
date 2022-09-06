package EXCEPCIONES;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class double_error {
	
	

	public static void main(String[] args) {
		// Lee un numero de teclado de tipo double y ejecuta el error

		
		 Scanner sc = new Scanner(System.in); boolean terminar = false; 
		 do{
		  System.out.println("Introduce la variable de tipo Double");
		  
		 try{ 
			 double variable = sc.nextDouble(); 
			 System.out.println("Dato correcto");
			 terminar = true; 
		 } 
		 catch (InputMismatchException P){
		 System.out.println("Se ha producido un error en la variable colocada" ); 
		 sc.nextLine(); 
		 }
		 
		 }while(terminar == false);
		 

		// Haz un programa que genere un numero aleatorio e indique si es par o
		// impar.

		int aleatorio = (int) (Math.random() * 100);
		System.out.println(aleatorio);

		try {

			if (aleatorio % 2 == 0) {
				throw new Exception("Par");
			} else {
				throw new Exception("Impar");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		//Crea una clase persona con metodo setEdad. Si el parametro es negativo lanza una excepcion.Si es correcto, lo almacena en la propiedad de la clase
		
		persona persona1 = new persona(23, "Pepito Chupapija");
		persona1.setEdad(-12);
		System.out.println(persona1.toString());
		
		
	}

}
