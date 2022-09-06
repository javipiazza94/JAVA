package BUCLES_IFS_CLASES_PREDEFINIDAS;

import java.util.Scanner;

//numero de 3 cifras y te devuelve las unidades, las centenas y las decenas
public class separarnumeros {
	public static void main(String[] args){
		// Colocamos el  main para iniciar
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca el numero");
		int num= sc.nextInt();
		int numC= num/100;
		int numD= (num%100)/10;
		int numU= num%10;
		System.out.println("Las centenas son "+numC+" las decenas son "+numD+" y las unidades son "+numU+" ");
		
		//Al ser numeros enteros las divisiones salen sin decimales y conseguimos lo que nos proponemos
		sc.close();
	}}
