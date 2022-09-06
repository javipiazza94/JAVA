package BUCLES_IFS_CLASES_PREDEFINIDAS;
//Hay que hacer una ecuacion de segundo grado con 3 variables
import java.util.Scanner;
public class ECUACIONSEGUNDOGRADO {
	public static void main(String[] args){
		// Colocamos el  main para iniciar
		Scanner sc = new Scanner (System.in);
		double x;
		
		System.out.println("Introduzca a");
		double a = sc.nextDouble();
		System.out.println("Introduzca b");
		double b = sc.nextDouble();
		System.out.println("Introduzca c");
		double c = sc.nextDouble();
		
		double x1 = (-b-(Math.sqrt(b*b-4*a*c)))/2*a;
		double x2 = (-b+(Math.sqrt(b*b-4*a*c)))/2*a;
		
		System.out.println("El resultado total es "+x1+" y "+x2+"");
		sc.close();
		
		
		
		
}}