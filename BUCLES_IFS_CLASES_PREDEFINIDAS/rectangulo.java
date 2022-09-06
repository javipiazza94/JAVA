package BUCLES_IFS_CLASES_PREDEFINIDAS;
//Calcula el area y el perimetro del rectangulo segun la base y la altura

import java.util.Scanner;

public class rectangulo {
	public static void main(String[] args){
		// Colocamos el  main para iniciar
		Scanner sc = new Scanner (System.in);
		//Colocamos la impresion de las variables de la base y la altura
		System.out.println("Introduzca la longitud de la base (en centimetros)");
		double base= sc.nextDouble();
		System.out.println("Introduzca la longitud de la altura (en centimetros)");
		double altura= sc.nextDouble();
		//Colocamos las formulas de calculo del area y del perimetro
		double area = (double) (base*altura);
		double perimetro = 2*(base + altura);
		
		System.out.println("El area del rectangulo es "+area+"cm2 y el perimetro es "+perimetro+"cm");
		sc.close();
}}
