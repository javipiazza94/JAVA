package EXAMEN2;

/* Realiza un programa que va a simular la cola de espera de una carnicería. 
 * El funcionamiento del programa mostrará la cola de la carnicería y preguntará al usuario si puede pasar el siguiente cliente. 
 * En caso afirmativo, se repite la ejecución del programa, en caso negativo se termina la ejecución del mismo.
 * Considera que la carnicería tiene un tamaño de cola de 10 personas.
 */
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Posiciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //Importamos escaner
		int[] cola = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; //Introducimos la cola de los numeros 
		boolean acabado = false; //Hacemos un boleano para que el programa nos mantenga en el bucle hasta que acabemos

		System.out.println("Estos son los números de la cola");
		for (int i = 0; i < cola.length; i++) { //Imprimimos la cola
			System.out.println(cola[i]);
		}
		do { //Hacemos un bucle do while porque no sabemos cuando vamos a acabar
			System.out.println("¿Quieres avanzar?"); //Le preguntamos al usuario si quiere avanzar
			char respuesta = sc.next().charAt(0); //Introducimos un char para las respuestas de si o no
			for (int i = 0; i < cola.length; i++) { 
				if (respuesta == 's') { //Si la respuesta es si avanzamos una posicion
					cola [i] = cola [i] + 1;
					System.out.println(cola[i]);
				}
				if (respuesta == 'n') {
					acabado = true;		//Si no quiere avanzar el boleano es verdadero y nos saca del bucle		
					}
			}
		} while (!acabado); //No nos salimos del bucle hasta qye acabemos
		System.out.println("Has acabado"); //Le decimos al usuario que ha acabado
	sc.close();

}}
