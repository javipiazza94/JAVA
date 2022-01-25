package BUCLES_IFS_CLASES_PREDEFINIDAS;
// Realizamos un programa que acepta por teclado dos números binarios y realice su suma, resta, multiplicación y división.
import java.util.Scanner;

public class CalculoBytes {
	public static void main(String[] args){
		// Colocamos el  main para iniciar
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca un numero entre 127 y -127 ");
		byte num1= sc.nextByte();
		System.out.println("Introduzca un segundo numero entre 127 y -127 ");
		byte num2= sc.nextByte();
		
		//Colocamos las operaciones de suma, resta, multiplicacion y division
		
		byte suma = (byte) (num1+num2);
		byte resta = (byte) (num1-num2);
		byte multiplicacion = (byte) (num1*num2);
		byte division = (byte) (num1/num2);
		
		System.out.println(" El resultado de la suma es "+suma+", el de la "
				+ "resta es "+resta+", el de la multiplicacion es "+multiplicacion+" y el de "
				+ "la division es "+division+" ");
		sc.close();
		
		
}}
