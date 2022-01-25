package BUCLES_IFS_CLASES_PREDEFINIDAS;
//leer dos numeros por teclado y decir cual es mayor
import java.util.Scanner;

public class EX1 {
	public static void main(String[] args){
		// Colocamos el  main para iniciar
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca numero A");
		int num1= sc.nextInt();
		System.out.println("Introduzca numero B");
		int num2= sc.nextInt();
		//Introducimos los dos numeros
		
		if (num1>num2) //Ponemos la condicion
		{ 
			System.out.println("El numero A "+num1+" es mayor o igual que el numero");
		} //Imprimimos el numero A si es mayor
		else {System.out.println(""+num2+" es mayor que el primero");
		} //Imprimimos el numero B si es mayor como segunda condicion
	sc.close(); //Cerramos teclado
		}
}