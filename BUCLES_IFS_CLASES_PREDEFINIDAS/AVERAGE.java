package BUCLES_IFS_CLASES_PREDEFINIDAS;
import java.util.Scanner;
		// Colcamos la impresora en el inicio
public class AVERAGE {
	public static void main(String[] args){
		// Colocamos el  main para iniciar
		Scanner sc = new Scanner (System.in);
		// Ponemos la impresora
		System.out.println("Introduzca 3 numeros");
		// Ponemos la impresion de los numeros
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		double media = (double) (num1 + num2 + num3)/3;
		// Hacemos la media con el double, ya que es tipo de variable que permite los decimales
				
				System.out.println("La media de los numeros en la suma de "+media+"");
		// Colocamos la linea de codigo con el resultado de la media  
				sc.close();
		
		
		
}}
