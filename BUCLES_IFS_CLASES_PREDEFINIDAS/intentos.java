package BUCLES_IFS_CLASES_PREDEFINIDAS;
import java.util.Random;
//Se genera un numero aleatorio entre el 1 y el 9 y el usuario tiene 3 intentos para adivinarlo
import java.util.Scanner;

public class intentos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Adivina mi número del 1 al 3");
		Random rand= new Random(); //Declaramos la variable random
		int adivina =  1+ rand.nextInt(9); //Declaramos el numero de la maquina
		int intento; //Declaramos el intento
			
		for (int i=0; i<=2; i++)
		{ intento=sc.nextInt(); //Hacemos el bucle de los 3 intentos (EL i hay que declararlo siempre, sea fuera o dentro)
		i++;
		if (intento ==adivina){
			System.out.println("Enhorabuena, has acertado"); //Si el primer numero es = se acierta
		}else if (i < 2){
			System.out.println("Sigue dandole"); // Cuando no acierta se le pone esto en el segundo intento
		}else{
			System.out.println(" El numero era "+adivina+""); //Si no acierta en el tercero se le pone esto
		}
	}
	}
}
