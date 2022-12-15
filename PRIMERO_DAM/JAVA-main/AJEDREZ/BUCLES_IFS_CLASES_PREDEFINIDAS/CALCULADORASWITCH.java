package BUCLES_IFS_CLASES_PREDEFINIDAS;

import java.util.Scanner;

public class CALCULADORASWITCH {
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
		
		switch (c) 
		{ 
		case '+': System.out.println(" El resultado es "+(num1+num2)+"");break; // Si el primer operador es una suna imprimimos
		case '-': System.out.println(" El resultado es "+(num1-num2)+"");break;// Si el primer operador es una resta imprimimos
		case '*': System.out.println(" El resultado es "+(num1*num2)+"");break; // Si el primer operador es una multiplicacion imprimimos
		case '/': System.out.println(" El resultado es "+(num1/num2)+"");break; // Si el primer operador es una division imprimimos
		default: System.out.println("Mamapolla pon bien las operaciones"); // Lo ponemos si el usuario no sigue el camino correcto
		} 
		sc.close();
}}	

