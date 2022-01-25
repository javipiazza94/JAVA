package BUCLES_IFS_CLASES_PREDEFINIDAS;

public class JAVACHEATTEST {

		public static void main(String[] args) {
			/*
			 * Para declarer una variable en Java, se sigue el siguiente formato: type name
			 * = value; Siendo type el tipo de variable, name el nombre de la variable y
			 * value el valor a asignar a la misma. Adem�s, existen las variables de tipo
			 * constante, declaradas de la siguiente manera: final type NAME = value; Donde
			 * final es una palabra reservada para indicar que una variable es una constante
			 * y por tanto, SOLO se podr� leer el valor de la constante, pero nunca
			 * modificar (Java no lo permite). Adem�s, estas variables suelen nombrarse en
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
			 * ordenes con �;�. En general, las variables de tipo num�rico que vais a
			 * utilizar ser�n int para numeros sin decimales y double para numeros con
			 * decimales.
			 */

			// En las variables de tipo num�rico, existen los siguientes operadores
			// principales:
			int numInt2 = 10 + 3; // Operador suma, devolver� 15.
			int numInt3 = 10 - 3; // Operador resta, devolver� 7.
			int numInt4 = 10 * 3; // Operador multiplicaci�n, devolver� 30.
			int numInt5 = 10 / 2; // Operador divisi�n, devolver� 5.
			int numInt6 = 10 % 2;
			/*
			 * Operador modulo, devolver� el resto de la divisi�n, como 10 partido 5 no
			 * tiene decimales, devolver� 0. Estos pueden ser consideradoslos operadores
			 * b�sicos en Java, pero adem�s existen los siguientes operadores aritm�ticos:
			 */
			int x = 1; // Asigno a x el valor 1.
			x++; // Incremento x en uno, es lo mismo que hacer x = x+1; por tanto x ahora valdr�
					// 2.
			x--; /*
					 * Decremento x en uno, es lo mismo que hacer x=x-1; por tanto x ahora valdr� 1
					 * de nuevo, considerando que en la anterior l�nea hemos incrementado x a 2.
					 */
			x += 2; // Esta operaci�n es equivalente a hacer x=x+2;
			x -= 2; // Esta operaci�n es equivalente a hacer x=x-2;
			x *= 2; // Esta operaci�n es equivalente a hacer x=x*2;
			x /= 2; // Esta operaci�n es equivalente a hacer x=x/2;

			/*
			 * El casting consiste en la especificaci�n del formato en el que queremos que
			 * se realice una operaci�n concreta. Esto se utiliza sobre todo cuando queremos
			 * realizar una operaci�n de dos variables del mismo tipo pero almacenar el
			 * resultado en una variable de distinto tipo. Veamos un ejemplo:
			 */
			int dividendo = 3; // Asigno a esta variable el n�mero 3.
			int divisor = 2; // Asigno a esta variable el n�mero 2.
			double resultado = dividendo / divisor; /*
													 * Asigno a esta variable el resultado de dividir 2 entre 3. Al ser
													 * estos n�meros enteros, la operaci�n se realizar� como una operaci�n
													 * entera, y el resultado de la misma ser� 1, no 1.5 ya que al ser
													 * entero el decimal se omite.
													 */
			double resultado1 = (double) dividendo
					/ divisor; /*
								 * Asigno a esta variable el resultado de dividir 2 entre 3. Al ser estos
								 * n�meros enteros, la operaci�n se realizar�a como una operaci�n entera, pero
								 * he indicado que se realice como si fuesen double, por lo que el resultado
								 * ser� 1.5.
								 */

			// Existen dos variables principales que se pueden denominar de tipo car�cter:
			char caracter = 'H'; /*
									 * Variable que almacena la letra H, para guardar un char se debe poner entre
									 * comillas simples.
									 */
			char caracter2 = ' '; /*
									 * Variable que almacena el car�cter de espacio en blanco, para guardar un char
									 * se debe poner entre comillas simples.
									 */
			char caracter3 = '\n'; /*
									 * Variable que almacena el car�cter de salto de linea, para guardar un char se
									 * debe poner entre comillas simples.
									 */
			String string1 = "Soy main yuumi puedo hacerte support UwU"; /*
																			 * Variable que almacena una cadena de texto,
																			 * para guardar un String se debe poner entre
																			 * comillas dobles.
																			 */
			/*
			 * Existen multiples operadores a la hora de trabajar con este tipo de
			 * variables, pero por ahora solo utilizaremos el operador de concatenaci�n.
			 */
			String parte1 = "No, lo siento, si juegas Yuumi lo que necesitas es"; // Declaro string.
			String parte2 = "ayuda de un profesional, al�jate de m�"; // Declaro string.
			String parte3 = "no quiero saber de tus traumas."; // Declaro string.
			String fin = parte1 + " " + parte2 + " " + parte3; // Concateno todos los Strings adem�s de
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
			resultado ser� true.*/
			result = verdad || verdad2; /* Al ser verdad true y al ser verdad2 true, el resultado ser� 
			true.*/
			result = verdad && verdad2 && mentira; /* Se puede concatenar m�s de una operaci�n 
			booleana. Al ser verdad true, verdad2 true pero mentira false, el resultado ser� false */
			
			/*Pon nombres descriptivos y decentes a tus variables.
			1) Utiliza par�ntesis en tus operaciones para asegurarte que se resuelven en el orden que 
			t� quieres. Recuerda que primero se resuelven divisions, luego multiplicaciones y luego 
			sumas y restas.
			2) No pasa nada por perder un poquito de tiempo en pensar lo que vas a programar antes 
			de ponerse a escribir.
			3) Comenta tu c�digo. Recuerda: // para una sola linea, / * * / para comentar p�rrafos, tienes 
			ejemplos de esto a lo largo de toda la cheat sheet.
			4) Levanta la mano si tienes dudas, como dec�a Kim Possible: �Llama grita si me 
			necesitas�.
			5) Disfruta, programar es dif�cil pero precioso, no olvides que no est�s aqu� para aprobar, 
			est�s aqu� para aprender y vivir de esto. Disfruta cada programa que hagas y estate 
			orgulloso de tu esfuerxo y trabajo */
		}
	}

