package BUCLES_IFS_CLASES_PREDEFINIDAS;
//Programa que introduzca dos numeros por teclado y un caracter y haz la operacion
import java.util.Scanner;

public class CALCULADORA {
	public static void main(String[] args){
		// Colocamos el  main para iniciar
		Scanner sc = new Scanner (System.in);
		 
		System.out.println("Introduzca numero A"); //Introducimos el primer numero
		double num1= sc.nextDouble();
		System.out.println("Introduzca numero B"); //Introducimos el segundo numero
		double num2= sc.nextDouble();
		System.out.println("Introduzca la operacion a realizar (+, -, *, /,) ");
		String operador = sc.next(); // Declaramos el operador
		char c = operador.charAt(0); // Leemos el primer caracter de la string e imprimimos
		
		
		if (c == '+') 
		{ 
			System.out.println(" El resultado es "+(num1+num2)+""); // Si el primer operador es una suna imprimimos
		} 
		else if (c == '-') 
		{
			System.out.println(" El resultado es "+(num1-num2)+"");// Si el primer operador es una resta imprimimos
		} 
		else if (c == '*') 
		{
			System.out.println(" El resultado es "+(num1*num2)+""); // Si el primer operador es una multiplicacion imprimimos
		} 
		else if (c == '/') 
		{
			System.out.println(" El resultado es "+(num1/num2)+""); // Si el primer operador es una division imprimimos
		} 
		
		sc.close();
}}
