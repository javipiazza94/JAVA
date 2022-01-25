package BUCLES_IFS_CLASES_PREDEFINIDAS;
//Pon un numero por teclado y te da el mes
import java.util.Scanner;

public class CALENDARIO {
	public static void main(String[] args){
		// Colocamos el  main para iniciar
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca un numero del 1 al 12");
		int mes = sc.nextInt();
		switch (mes) 
		{ 
		case 1: System.out.println(" El resultado es "+mes+" es enero");break; 
		case 2: System.out.println(" El resultado es "+mes+" es febrero");break;
		case 3: System.out.println(" El resultado es "+mes+" es marzo");break; 
		case 4: System.out.println(" El resultado es "+mes+" es abril");break; 
		case 5: System.out.println(" El resultado es "+mes+" es mayo");break; 
		case 6: System.out.println(" El resultado es "+mes+" es junio");break;
		case 7: System.out.println(" El resultado es "+mes+" es julio");break; 
		case 8: System.out.println(" El resultado es "+mes+" es agosto");break; 
		case 9: System.out.println(" El resultado es "+mes+" es septiembre");break; 
		case 10: System.out.println(" El resultado es "+mes+" es octubre");break;
		case 11: System.out.println(" El resultado es "+mes+" es noviembre");break; 
		case 12: System.out.println(" El resultado es "+mes+" es diciembre");break; 
		default: System.out.println("Mamapolla pon bien los meses"); 
		} 
		sc.close();
		
}}
