package BUCLES_IFS_CLASES_PREDEFINIDAS;

import java.util.Scanner;

//Va a leer una cadena y va devolver la cadena a la inversa. Y dice cuantas a vocales hay
public class Herbon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca la frase"); //Introducimos la palabra
		String palabra = sc.next(); //Almacenamos la palabra
		int contvocales = 0; // Declaramos el contador de vocales
		String palabra2 = ""; //Declaramos la segunda frase para hacerla al reves. Es el elemento nulo de la cadena 

		for (int i = palabra.length()-1; i >= 0; i--) {
		//Hacemos el bucle inverso desde la longitud de la palabra. Ponemos el -1 porque se parte desde 0
		  char abc = palabra.charAt(i); //Extraemos cada char y lo almacenamos. El PC necesita hacerlo para hacer la frase inversa
		  palabra2 += abc; // Hacemos el reverso
		  
		  if (abc =='a' ||abc =='e'||abc =='i' ||abc =='o' ||abc =='u')
			  contvocales++; //Cogemos las vocales y aumentamos el contador
		}
			System.out.println(""+palabra+" al reves es "+palabra2+" y tiene "+contvocales+" vocales");//Imprimimos la frase al reves y el numero de vocales 
	}
}
