package BUCLES_IFS_CLASES_PREDEFINIDAS;
//Haz un login en el que te siga pidiendo la contrase�a hasta que aciertes
import java.util.Scanner;

public class LOGINBUCLE {
	public static void main(String[] args){
		// Colocamos el  main para iniciar
		Scanner sc = new Scanner (System.in);
		//Declaramos el escaner
		String password = "mimamamemima";
		//Declaramos la contrase�a
		do {
			System.out.println("Introduzca contrase�a");
			password=sc.next(); //Solicitamos la contrase�a y la almacenamos
		}while (!password.equals("mimamamemima")); //Comparamos ambas contrase�as
			System.out.println("Enhorabuena, sigue sin salir de casa que te ira flama"); 
			// Mensaje de felicitacion
		}
}
