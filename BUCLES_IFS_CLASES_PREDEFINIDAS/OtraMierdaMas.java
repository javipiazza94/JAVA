package BUCLES_IFS_CLASES_PREDEFINIDAS;
// Cogemos 3 numeros por teclado y que nos devuelva el mayor de los 5
import java.util.Scanner;

public class OtraMierdaMas {
	public static void main(String[] args){
		// Colocamos el  main para iniciar
		Scanner sc = new Scanner (System.in);
	
		System.out.println("Introduzca el numero A ");
		int num1= sc.nextInt();
		System.out.println("Introduzca el numero B");
		int num2= sc.nextInt();
		System.out.println("Introduzca el numero C");
		int num3= sc.nextInt();
		
	
		int X = Math.max(num1, num2);
		int Y = Math.max(num2, num3);
		int numfinal= Math.max(Y, X);
		
	System.out.println("El mayor de los números es "+numfinal+"");
	sc.close();
}}
