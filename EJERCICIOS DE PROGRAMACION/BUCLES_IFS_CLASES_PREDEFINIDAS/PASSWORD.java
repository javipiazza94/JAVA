package BUCLES_IFS_CLASES_PREDEFINIDAS;
//Introducimos una contrase�a por teclado, y si es correcta el programa te dice que es correcta o incorrecta
import java.util.Scanner;

public class PASSWORD {
	public static void main(String[] args){
		// Colocamos el  main para iniciar
		Scanner sc = new Scanner (System.in);
		String Pass = "Tu puta madre en patinete";//Declaramos la contrase�a verdadera
		System.out.println("Introduzca la contrase�a A");
		String Password= sc.next();
		
		if (Pass.equals(Password)) //Ponemos la condicion
		{ 
			System.out.println("La contrase�a introducida es correcta");
		} 
		else {System.out.println("Como te has equivocado me follo a tu madre");
		} 
		
}}
