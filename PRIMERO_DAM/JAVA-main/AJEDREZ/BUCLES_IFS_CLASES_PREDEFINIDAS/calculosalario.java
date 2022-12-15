package BUCLES_IFS_CLASES_PREDEFINIDAS;
//Recibe el numero de horas trabajadas, tanto las extras como las normales, y calcula el salario por semana
import java.util.Scanner;
public class calculosalario {
	public static void main(String[] args){
		// Colocamos el  main para iniciar
		Scanner sc = new Scanner (System.in);
		final int SALARION = 10;
		final int SALARIOE = 20;
		// Introducimos los salarios por hora como constantes en MAYUSCULAS
		System.out.println("Introduzca el número de horas trabajadas ordinarias semanalmente");
		double HorasN = sc.nextDouble();
		System.out.println("Introduzca el número de horas extra trabajadas semanalmente ");
		double HorasE = sc.nextDouble();
		// Introducimos el numero de horas trabajadas como variables 
		
		double salariofinal= (double) (HorasN*SALARION) + (HorasE*SALARIOE);
		// Hacemos el calculo de ambas con su correspondiente suma
		
		System.out.println("Te has matado a trabajar para ganar "+salariofinal+" euros de mierda");
				// Resultado final
		sc.close();
}}
