package BUCLES_IFS_CLASES_PREDEFINIDAS;

import java.util.Scanner;
		//Ponemos el escaner
public class Par {
	public static void main(String[] args) {
		//Hacemos el main para iniciar el procedimiento	
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduzca un numero para ver si es multiplo de 3");
	int num1 = sc.nextInt();
	System.out.println(num1%3 == 0);
		//El porcentaje sirve para encontrar el resto de la division. Se coloca delante del divisor
		// Impresion final
	sc.close();
	}}
