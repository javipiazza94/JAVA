package EJERCICIOS_BOOTCAMP;

import java.util.Scanner;

public class BUCLES_e_IFS {

	public static void main(String[] args) {
		/* En este ejercicio practicar�s las estructuras de control, para ello deber�s crear:Usando un if, crear una condici�n que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los n�meros inferiores a 0 son negativos y los superiores, positivos.
Crea un bucle While, este bucle tendr� que tener como condici�n que la variable numeroWhile sea inferior a 3, el bloque de c�digo que tendr� el bucle deber�:
Incrementar el valor de la variable en uno cada vez que se ejecute.
Mostrarlo por pantalla cada vez que se ejecute.
Para el bucle Do While, deber�s crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
Para el bucle For, crea una variable numeroFor, esta variable tendr� como valor 0 y su condici�n ser� que la variable sea igual o menor que 3, se ir� incrementando en 1 su valor cada vez que se ejecute y deber� mostrarse por pantalla.
Por �ltimo, para el Switch, deber�s crear la variable estacion, y distintos case para las cuatro estaciones del a�o. Dependiendo del valor de la variable estacion se deber� mandar un mensaje por consola informando de la estaci�n en la que est�. Tambi�n habr� que poner un default para cuando el valor de la variable no sea una estaci�n.
*/
		
		//If
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		int numero = sc.nextInt();
		
		if (numero>0) {
			System.out.println("El numero es positivo");
		} else { System.out.println("El numero es negativo");

		}
		
		//while
		
		System.out.println("Introduce un numero");
		int numeroWhile = sc.nextInt();
		
		while (numeroWhile<=3) {
			System.out.println(numeroWhile++);
		}
		
		//Do while
		
		System.out.println("Introduce un numero");
		int numeroDoWhile = sc.nextInt();
		do {
			System.out.println(numeroDoWhile++);
		}while (numeroDoWhile<=3);
		
		//For
		int numeroFor=0;
		
		for(int i = 0; numeroFor<=3; i++) {
			System.out.println(numeroFor++);
		}
		
		//Switch
		
		System.out.println("Introduce un numero entre el 1 y el 4");
		int estacion = sc.nextInt();
		
		switch (estacion) {
		case 1: {System.out.println("es primavera"); break;}
		case 2: {System.out.println("es verano"); break;}
		case 3: {System.out.println("es otono"); break;}
		case 4: {System.out.println("es invierno"); break;}			
		default: {System.out.println("te has equivocado de numero"); break;}
			
	}
		sc.close();

}

}
