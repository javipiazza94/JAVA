package BUCLES_IFS_CLASES_PREDEFINIDAS;
//Realizamos un programa que acepta por teclado el número de lados de un polígono y la longitud de uno de sus lados y que calcule su área.
import java.util.Scanner;

public class poligono {
	public static void main(String[] args){
		// Colocamos el  main para iniciar
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca el numero de lados del poligono ");
		double lado= sc.nextDouble();
		System.out.println("Introduzca la longitud de uno de sus lados ");
		double longitud= sc.nextDouble();
		//Tienen que ser poligonos REGULARES para que salga la formula
		
		//Introducimos la formula de calculo del apotema del poligono
		double apotema= (double) (lado*(longitud*longitud))/(4*Math.tan(lado)*(Math.PI/lado));
		double area = (double) (lado*longitud*apotema)/2
				;
		//Introducimos la formula de calculo del poligono
		
		System.out.println("El area del poligono es "+area+"cm ");
		sc.close();
}}
