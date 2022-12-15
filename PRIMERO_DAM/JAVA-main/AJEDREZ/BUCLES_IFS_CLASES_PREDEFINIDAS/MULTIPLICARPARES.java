package BUCLES_IFS_CLASES_PREDEFINIDAS;

//Pedir 2 numeros u pedir que numeros pares hay entre ellos y que solo salgan los pares
import java.util.Scanner;

public class MULTIPLICARPARES {
	public static void main(String[] args){
		// Colocamos el  main para iniciar
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca numero A"); //Introducimos el primer numero
		int num1= sc.nextInt();
		System.out.println("Introduzca numero B"); //Introducimos el segundo numero
		int num2= sc.nextInt();
		
		
		for (int i=num1; i<=num2; i++)
		{
			if (i%2==0)
			{
				System.out.println(i);
				
			} 
			else 
			{
				for (i=num2; i<=num1; i++)
				{
					if (i%2==0)
						{
						System.out.println(i);
						}
				}
			}
		}
	}
}

