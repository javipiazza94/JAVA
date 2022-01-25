package BUCLES_IFS_CLASES_PREDEFINIDAS;
//Haz un login en el que te siga pidiendo la contraseña hasta que aciertes
import java.util.Scanner;

public class LOGINBUCLE {
	public static void main(String[] args){
		// Colocamos el  main para iniciar
		Scanner sc = new Scanner (System.in);
		//Declaramos el escaner
		String password = "mimamamemima";
		//Declaramos la contraseña
		do {
			System.out.println("Introduzca contraseña");
			password=sc.next(); //Solicitamos la contraseña y la almacenamos
		}while (!password.equals("mimamamemima")); //Comparamos ambas contraseñas
			System.out.println("Enhorabuena, sigue sin salir de casa que te ira flama"); 
			// Mensaje de felicitacion
		}
}
