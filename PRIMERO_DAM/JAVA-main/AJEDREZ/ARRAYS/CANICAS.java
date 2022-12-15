package ARRAYS;
/*.Realiza un programa para realizar una búsqueda en una bolsa de canicas. 
 * El array se inicializará con 28 canicas de distintos colores(usar tipo char preferentemente). 
 * Los colores posibles serán: Rojo Fuego, Verde Hoja, Cristal, Plata, Oro, Diamante y Perla. 
 * El usuario introducirá un color y se le devolverá el número de canicas de ese color que hay en el array.
 */
import java.util.Arrays;
import java.util.Scanner;

public class CANICAS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //Declaramos el escaner
		String color [] = new String []{"RojoFuego", "VerdeHoja", "Cristal", "Plata", "Diamante","Perla"}; // Declaramos los colores el array
		String canica []= new String [28]; //Declaramos el numero de canicas en el array
		
		
		for (int i = 0; i<canica.length; i++){
			canica [i] = color [(int) (Math.random() * color.length)]; //Hacemos el for para leer el array de las canicas totales y le metemos un random casteado a entero para asociarlo a los colores
		}
		System.out.println(Arrays.deepToString(canica)); //Imprimimos con arrayString
		
		System.out.println("Introduce un color (RojoFuego, VerdeHoja, Cristal, Plata, Diamante, Perla)");
		String elige = sc.next(); //Metemos los colores por teclado
		
		int coincidir = 0; //Introducimos contador
		for (int i = 0; i<canica.length; i++){
			if (canica[i].equals(elige)) coincidir++;{ //Comparamos mediante un for y un if lo que introducimos por teclado y el numero de canicas
			} //Contamos las coincidencias
		}
		System.out.println("Tiene "+coincidir+" canicas del mismo color"); //Imprimimos coincidencias
		sc.close();
	}

}
