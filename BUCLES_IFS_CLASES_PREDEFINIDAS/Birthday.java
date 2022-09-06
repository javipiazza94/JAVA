package BUCLES_IFS_CLASES_PREDEFINIDAS;
import java.util.Scanner;
// Colcamos la impresora en el inicio
public class Birthday {
	public static void main(String[] args){
		// Colocamos el  main para iniciar
		Scanner sc = new Scanner (System.in);
		// Ponemos la impresora
		System.out.println("Introduzca dia de cumpleaños");
		int dia = sc.nextInt();
		System.out.println("Introduzca el mes ");
		int mes = sc.nextInt();
		System.out.println("Introduzca el año");
		int año = sc.nextInt();
		// Solicitamos fecha de nacimiento
		
		System.out.println("Su fecha de nacimiento es el "+dia+" del "+mes+" del "+año+"");
		
		//A continuacion introduzca dia actual
		System.out.println("Introduzca dia1 ");
		int dia1 = sc.nextInt();
		System.out.println("Introduzca mes1 ");
		int mes1 = sc.nextInt();
		System.out.println("Introduzca el año2");
		int año1 = sc.nextInt();
		// Solicitamos fecha actual
		
		System.out.println("El día de hoy es el "+dia1+" del "+mes1+" del "+año1+"");
		
		int dia2 = (dia1 - dia);
		int mes2 = (mes1 - mes)*30;
		int año2 = (año1 - año)*365;
		int total = (dia2 + mes2 + año2);
		// Hacemos el calculo basado a dias
		
		System.out.println("Lleva viviendo un total de "+total+" dias");
		// Resultado final
		sc.close();
				
		
		
}}
