package BUCLES_IFS_CLASES_PREDEFINIDAS;

public class JAVACHEATTEST {

		public static void main(String[] args) {
			/*
			 * Para declarer una variable en Java, se sigue el siguiente formato: type name
			 * = value; Siendo type el tipo de variable, name el nombre de la variable y
			 * value el valor a asignar a la misma. Además, existen las variables de tipo
			 * constante, declaradas de la siguiente manera: final type NAME = value; Donde
			 * final es una palabra reservada para indicar que una variable es una constante
			 * y por tanto, SOLO se podrá leer el valor de la constante, pero nunca
			 * modificar (Java no lo permite). Además, estas variables suelen nombrarse en
			 * MAYUSCULA.
			 */
			// Ejemplos de variable
			
			byte numByte = 116;
			short numShort = 2000;
			int numInt = 35000;
			long numLong = 200000;
			float numFloat = 10.99F;
			double numDouble = 36.22;
			/*
			 * Es IMPORTANTE tener en cuenta que en java, temenos que acabar nuestras
			 * ordenes con “;”. En general, las variables de tipo numérico que vais a
			 * utilizar serán int para numeros sin decimales y double para numeros con
			 * decimales.
			 */

			// En las variables de tipo numérico, existen los siguientes operadores
			// principales:
			int numInt2 = 10 + 3; // Operador suma, devolverá 15.
			int numInt3 = 10 - 3; // Operador resta, devolverá 7.
			int numInt4 = 10 * 3; // Operador multiplicación, devolverá 30.
			int numInt5 = 10 / 2; // Operador división, devolverá 5.
			int numInt6 = 10 % 2;
			/*
			 * Operador modulo, devolverá el resto de la división, como 10 partido 5 no
			 * tiene decimales, devolverá 0. Estos pueden ser consideradoslos operadores
			 * básicos en Java, pero además existen los siguientes operadores aritméticos:
			 */
			int x = 1; // Asigno a x el valor 1.
			x++; // Incremento x en uno, es lo mismo que hacer x = x+1; por tanto x ahora valdrá
					// 2.
			x--; /*
					 * Decremento x en uno, es lo mismo que hacer x=x-1; por tanto x ahora valdrá 1
					 * de nuevo, considerando que en la anterior línea hemos incrementado x a 2.
					 */
			x += 2; // Esta operación es equivalente a hacer x=x+2;
			x -= 2; // Esta operación es equivalente a hacer x=x-2;
			x *= 2; // Esta operación es equivalente a hacer x=x*2;
			x /= 2; // Esta operación es equivalente a hacer x=x/2;

			/*
			 * El casting consiste en la especificación del formato en el que queremos que
			 * se realice una operación concreta. Esto se utiliza sobre todo cuando queremos
			 * realizar una operación de dos variables del mismo tipo pero almacenar el
			 * resultado en una variable de distinto tipo. Veamos un ejemplo:
			 */
			int dividendo = 3; // Asigno a esta variable el número 3.
			int divisor = 2; // Asigno a esta variable el número 2.
			double resultado = dividendo / divisor; /*
													 * Asigno a esta variable el resultado de dividir 2 entre 3. Al ser
													 * estos números enteros, la operación se realizará como una operación
													 * entera, y el resultado de la misma será 1, no 1.5 ya que al ser
													 * entero el decimal se omite.
													 */
			double resultado1 = (double) dividendo
					/ divisor; /*
								 * Asigno a esta variable el resultado de dividir 2 entre 3. Al ser estos
								 * números enteros, la operación se realizaría como una operación entera, pero
								 * he indicado que se realice como si fuesen double, por lo que el resultado
								 * será 1.5.
								 */

			// Existen dos variables principales que se pueden denominar de tipo carácter:
			char caracter = 'H'; /*
									 * Variable que almacena la letra H, para guardar un char se debe poner entre
									 * comillas simples.
									 */
			char caracter2 = ' '; /*
									 * Variable que almacena el carácter de espacio en blanco, para guardar un char
									 * se debe poner entre comillas simples.
									 */
			char caracter3 = '\n'; /*
									 * Variable que almacena el carácter de salto de linea, para guardar un char se
									 * debe poner entre comillas simples.
									 */
			String string1 = "Soy main yuumi puedo hacerte support UwU"; /*
																			 * Variable que almacena una cadena de texto,
																			 * para guardar un String se debe poner entre
																			 * comillas dobles.
																			 */
			/*
			 * Existen multiples operadores a la hora de trabajar con este tipo de
			 * variables, pero por ahora solo utilizaremos el operador de concatenación.
			 */
			String parte1 = "No, lo siento, si juegas Yuumi lo que necesitas es"; // Declaro string.
			String parte2 = "ayuda de un profesional, aléjate de mí"; // Declaro string.
			String parte3 = "no quiero saber de tus traumas."; // Declaro string.
			String fin = parte1 + " " + parte2 + " " + parte3; // Concateno todos los Strings además de
			// concatenar caracteres con los espacios en blanco.

			// Este tipo de variables solo pueden tener dos valores; true o false.
			boolean verdad = true; // Almaceno true en un booleano.
			boolean verdad1 = false; // Almaceno false en un booleano
			/*
			 * Podemos distinguir entre dos tipos de operadores, los operadores que no
			 * operan necesariamente con booleanos pero devuelven un booleano como
			 * resultado:
			 */

			int x2 = 2;
			int x3 = 3;
			int y = 0;
			boolean valor = x == y; /*
									 * Comprueba si x e y son iguales, en caso afirmativo devuelve true, en caso
									 * negativo devuelve false. En este caso devuelve false.
									 */
			valor = x != y; /*
							 * Comprueba si x e y son distintos, en caso afirmativo devuelve true, en caso
							 * negativo devuelve false. En este caso devuelve true.
							 */
			valor = x < y; /*
							 * Comprueba si x es menor que y, en caso afirmativo devuelve true, en caso
							 * negativo devuelve false. En este caso devuelve true.
							 */
			valor = x > y; /*
							 * Comprueba si x es mayor que y, en caso afirmativo devuelve true, en caso
							 * negativo devuelve false. En este caso devuelve false.
							 */
			valor = x <= y; /*
							 * Comprueba si x es menor o igual a y, en caso afirmativo devuelve true, en
							 * caso negativo devuelve false. En este caso devuelve true.
							 */
			valor = x >= y; /*
							 * Comprueba si x es mayor o igual a y, en caso afirmativo devuelve true, en
							 * caso negativo devuelve false. En este caso devuelve false.
							 */
			boolean verdad2 = true;
			boolean verdad3 = true;
			boolean mentira = false;
			boolean result = verdad && verdad2; /* Al ser verdad true y al ser verdad2 true, el 
			resultado será true.*/
			result = verdad || verdad2; /* Al ser verdad true y al ser verdad2 true, el resultado será 
			true.*/
			result = verdad && verdad2 && mentira; /* Se puede concatenar más de una operación 
			booleana. Al ser verdad true, verdad2 true pero mentira false, el resultado será false */
			
			/*Pon nombres descriptivos y decentes a tus variables.
			1) Utiliza paréntesis en tus operaciones para asegurarte que se resuelven en el orden que 
			tú quieres. Recuerda que primero se resuelven divisions, luego multiplicaciones y luego 
			sumas y restas.
			2) No pasa nada por perder un poquito de tiempo en pensar lo que vas a programar antes 
			de ponerse a escribir.
			3) Comenta tu código. Recuerda: // para una sola linea, / * * / para comentar párrafos, tienes 
			ejemplos de esto a lo largo de toda la cheat sheet.
			4) Levanta la mano si tienes dudas, como decía Kim Possible: “Llama grita si me 
			necesitas”.
			5) Disfruta, programar es difícil pero precioso, no olvides que no estás aquí para aprobar, 
			estás aquí para aprender y vivir de esto. Disfruta cada programa que hagas y estate 
			orgulloso de tu esfuerxo y trabajo */
		}
	}

