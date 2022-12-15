package BUCLES_IFS_CLASES_PREDEFINIDAS;

//import java.util.Random;
import java.util.Scanner;

public class AHORCADO {
	public static void main(String[] args) {
		// Colocamos el main para iniciar
		/*
		 * String [] palabras = {"bitcoin", "ethereum", "cardano"}; //Hacemos un String
		 * con array de las 3 palabras a elegir Random r1 = new Random(); //Importamos
		 * el Random para que la maquina elija a una de las 3 palabras int numero =
		 * r1.nextInt(palabras.length); // Le decimos a la maquina que elija el numero
		 * de las palabras String PalabraSecreta= palabras[numero]; //Le decimos que
		 * elija la palabra secreta entre el numero de palabras que hay
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la palabra secreta");
		String PalabraSecreta = sc.next();

		int NLetrasPalabraSecreta = PalabraSecreta.length(); // Calculamos el numero de letras de la palabra secreta
		char[] PalabraGuiones = new char[NLetrasPalabraSecreta]; // Hacemos un Char de los guiones a partir del numero
																	// de letras de la Palabra Secreta

		for (int i = 0; i < PalabraGuiones.length; i++) // Hacemos un bucle del numero de letras de la palabra secreta
														// para convertirlo a guiones
		{
			PalabraGuiones[i] = '_';
		}
		System.out.println(PalabraGuiones); // Imprimimos los guiones en funcion del numero de letras de la palabra

		// Hacemos un bucle Do while porque no sabemos cuantas veces se pedira la letra
		// para adivinarla hasta que lo termine (se hace con un booleano)

		boolean JuegoTerminado = false;
		int intentos = 3; //Declaramos los intentos
		int index = PalabraSecreta.length(); //Hacemos un auxiliar del tamano de la palabra secreta

		do {
			if (index != 0) {
				System.out.println("Te quedan " + intentos + " intentos"); //Imprimimos el contador de intentos
				System.out.println(PalabraGuiones);
				System.out.println("Introduce una letra"); //Imprimimos que introduzca letra
				char letra = sc.next().charAt(0); // Almacenamos la letra
				boolean XLetraAcertada = false; // Hacemos un booleano por si el usuario ha acertado alguna letra
				for (int j = 0; j < PalabraSecreta.length(); j++) { // Hacemos un bucle for para contar el numero de
																	// letras
																	// de la palabra
					if (PalabraSecreta.charAt(j) == letra) { // Hacemos un if dentro del bucle para que pare de pedir
																// letra
																// hasta que acierte
						PalabraGuiones[j] = letra; // La letra que el usuario ha introducido sera igual a los guiones si
													// se
													// cumple
						index = index - 1;
						XLetraAcertada = true; // Metemos el booleando si acierta en el for
					}
				}
				if (!XLetraAcertada) { //Hacemos el if de cuando falla
                    System.out.println("No has acertado ninguna letra");
                    --intentos; //Hacemos el decremento de intentos
                    if (intentos > 0){
                        if (intentos <3) { //Dibuja parte de una polla cuando falla
                            System.out.println("     *   ");
                            System.out.println("   *   * ");
                            System.out.println("  *     *");
                        } 
                        if ( intentos <2) {
                            System.out.println("  *******");
                            System.out.println("  *     *");
                            System.out.println("  *     *");
                            System.out.println("  *     *");
                        }
                                           }
                    else{ 
                        System.out.println("HAS PERDIDO POR SUBNORMAL"); //Imprimimos cuando falla todos los intentos y se corta con el booleano de Juego Terminado
                        JuegoTerminado = true;
                        System.out.println("     *   ");
                        System.out.println("   *   * ");
                        System.out.println("  *     *");
                        System.out.println("  *******");
                        System.out.println("  *     *");
                        System.out.println("  *     *");
                        System.out.println("  *     *");
                        System.out.println("  *     *");
                        System.out.println("*         *");
                        System.out.println("*         *");
                    }
                }
			} else {
				System.out.println("Has ganado, la palabra secreta es " + PalabraSecreta + "");
				JuegoTerminado = true; //Hacemos un else del primer if mostrando que ha averiguado la palabra secreta
			}

		} while (!JuegoTerminado);

	}}