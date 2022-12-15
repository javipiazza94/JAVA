package BUCLES_IFS_CLASES_PREDEFINIDAS;
// Programa que lee numeros positivos hasta que el usuario introduzca un numero negativo y entonces hace la media
import java.util.Scanner;

public class MEDIAPOSITIVOSNEGATIVOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		//Declaramos el escaner
		int total = 0; //Declaramos la suma total desde 0
		int cont = 0 ; //Declaramos el contador de los numeros desde cero
		int num; //Sacamos la variable num del bucle para que no de error
		do {
			System.out.println("Introduzca numero"); //Introducimos el numero dentro del bucle
			num = sc.nextInt();
			if (num >=0){ //Metemos un if para que coja solo los numeros positivos
			total += num; //Hacemos la suma de los numeros dentro del if
			cont++; // (Añadimos el contador que se va sumando (es como la i del FOR)
			}
			}
		while (num >=0); //Ponemos la condicion del bucle, y es que sea solo numeros positivos
			
		double media = (double)(total/cont); //Hacemos la media de los numeros salidos divididos por su contador. Estan casteados en double (se mezclan con variables int)
		System.out.println("La media total es "+media); 
	}

}
