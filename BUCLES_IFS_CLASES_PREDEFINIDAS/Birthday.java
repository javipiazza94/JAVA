package BUCLES_IFS_CLASES_PREDEFINIDAS;
import java.util.Scanner;
// Colcamos la impresora en el inicio
public class Birthday {
	public static void main(String[] args){
		// Colocamos el  main para iniciar
		Scanner sc = new Scanner (System.in);
		// Ponemos la impresora
		System.out.println("Introduzca dia de cumplea�os");
		int dia = sc.nextInt();
		System.out.println("Introduzca el mes ");
		int mes = sc.nextInt();
		System.out.println("Introduzca el a�o");
		int a�o = sc.nextInt();
		// Solicitamos fecha de nacimiento
		
		System.out.println("Su fecha de nacimiento es el "+dia+" del "+mes+" del "+a�o+"");
		
		//A continuacion introduzca dia actual
		System.out.println("Introduzca dia1 ");
		int dia1 = sc.nextInt();
		System.out.println("Introduzca mes1 ");
		int mes1 = sc.nextInt();
		System.out.println("Introduzca el a�o2");
		int a�o1 = sc.nextInt();
		// Solicitamos fecha actual
		
		System.out.println("El d�a de hoy es el "+dia1+" del "+mes1+" del "+a�o1+"");
		
		int dia2 = (dia1 - dia);
		int mes2 = (mes1 - mes)*30;
		int a�o2 = (a�o1 - a�o)*365;
		int total = (dia2 + mes2 + a�o2);
		// Hacemos el calculo basado a dias
		
		System.out.println("Lleva viviendo un total de "+total+" dias");
		// Resultado final
		sc.close();
				
		
		
}}
