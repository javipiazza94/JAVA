package BUCLES_IFS_CLASES_PREDEFINIDAS;
//Haz un login en el que te siga pidiendo la contraseņa hasta que aciertes
import java.util.Scanner;

public class LOGINBUCLE {
	public static void main(String[] args){
		// Colocamos el  main para iniciar
		Scanner sc = new Scanner (System.in);
		//Declaramos el escaner
		String password = "mimamamemima";
		//Declaramos la contraseņa
		do {
			System.out.println("Introduzca contraseņa");
			password=sc.next(); //Solicitamos la contraseņa y la almacenamos
		}while (!password.equals("mimamamemima")); //Comparamos ambas contraseņas
			System.out.println("Enhorabuena, sigue sin salir de casa que te ira flama"); 
			// Mensaje de felicitacion
		}
}
