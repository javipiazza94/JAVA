package BUCLES_IFS_CLASES_PREDEFINIDAS;

import java.util.Scanner;

public class FOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner (System.in);
			
			System.out.println("Introduzca un numero y comprobaremos su tabla de multiplicar");
			int num= sc.nextInt();//Introducimos numero
			
			for (int i=1; i<=10; i++){ //Metemos el bucle for 
				System.out.println(" "+num+" X "+i+" es "+(num*i)+""); //Introducimos la tabla
			}
	}

}
