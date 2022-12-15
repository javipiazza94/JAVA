package BUCLES_IFS_CLASES_PREDEFINIDAS;

import java.util.Scanner;

// Introduce la temperatura en Celsius y el programa dice si hace frio o calor
public class TEMPERATURA {
	public static void main(String[] args){
		// Colocamos el  main para iniciar
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca la temperatura");
		double temp= sc.nextDouble();
		
		if (temp<10){ System.out.println("Polo Norte");
		} 
		else if ((temp>= 10) && (temp<20)){System.out.println("Rebequita");
		} 
		else if ((temp>= 20) && (temp<30)){System.out.println("Terraceo");
		} 
		else if ((temp>= 30) && (temp<50)){System.out.println("Cordoba a 15 de julio es Siberia comparado con esto");
		} 
		else {System.out.println("Estas dentro del Sol");
		
		}
}}
