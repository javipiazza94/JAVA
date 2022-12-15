package BUCLES_IFS_CLASES_PREDEFINIDAS;

import java.util.Scanner;

// El usuario mete un numero y te dice si es primo o no
public class ELUSUARIOLAMETE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Colocamos el  main para iniciar
				Scanner sc = new Scanner (System.in);
				System.out.println("Introduzca un numero para saber si es primo");
				int num = sc.nextInt(); //Introducimos numero
				boolean primo = true; //Introducimos booleano porque asumimos que todos los numeros son primos
				for (int j=1; j<=num; j++){  
				
				for (int i=2; i<j; i++){ //Introducimos el bucle desde el 2 porque desde el 1 ya sabemos que no va a dar primo
					if (j%i==0)
					{
						primo = false; //Si la division empieza a dar exacta ya es falso
					}
				}
				if (primo) 
				{
					System.out.println("Es primo" +j); //
				}
				else 
				{	
					System.out.println("No es primo" +j); //
				}
}}}
