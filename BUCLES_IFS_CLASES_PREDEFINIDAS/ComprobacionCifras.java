package BUCLES_IFS_CLASES_PREDEFINIDAS;
//Realiza un programa en Java que reciba por teclado un n�mero de tres cifras y un n�mero de una cifra. El programa devolver� true en caso de que el n�mero de un d�gito aparezca dentro del n�mero de tres d�gitos. Se adjuntan ejemplos de ejecuci�n.

import java.util.Scanner;

public class ComprobacionCifras {
	public static void main(String[] args){
		// Colocamos el  main para iniciar
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca un numero de 3 digitos ");
		int num1= sc.nextInt();
		System.out.println("Introduzca un numero de 1 digito ");
		int num2= sc.nextInt();
		//Introducimos la descomposicion en centenas, decenas y unidades
		int centenas= num1/100;
		int decenas= (num1%100)/10;
		int unidades= num1%10;
		
		boolean bool1 = (unidades==num2)||(decenas==num2)||(centenas==num2);
		
		System.out.println("El numero "+num1+" y el que quiere comprobar "+num2+", �Se incluyen el "+num2+" y el "+num1+" el "+bool1+"");
		sc.close();
		

	}}
