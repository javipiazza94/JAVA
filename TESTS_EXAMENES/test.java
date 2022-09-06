package TESTS_EXAMENES;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int correctas = 0;
		int falladas = 0;
		double notafinal = (double)(correctas/42)*10;

		System.out.println("1. Un algoritmo� (Tema 1)\r\n\n"
				+ "A - Es una secuencia de instrucciones mal implementadas y bien ordenadas que resuelve\r\n"
				+ "una tarea en concreto\r\n"
				+ "B - Es una secuencia de instrucciones bien implementadas y desordenadas que resuelve\r\n"
				+ "una tarea en concreto\r\n"
				+ "C - Es una secuencia de instrucciones bien implementadas y bien ordenadas que\r\n"
				+ "resuelve una tarea en concreto\r\n"
				+ "D - Es una secuencia de instrucciones bien implementadas y bien ordenadas que resuelve\r\n"
				+ "un conjunto de tareas");
		String pregunta1 = sc.next();
		if (pregunta1.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta1.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta1.equalsIgnoreCase("C")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		} else if (pregunta1.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		}

		System.out.println("2. Bucle while: (Tema 3)\r\n\n"
				+ "A - Es una estructura de repetici�n que nos permitir� repetir un bloque de c�digo una o m�s\r\n"
				+ "veces\r\n" + "B - Es una estructura de repetici�n que nos permitir� repetir un bloque de c�digo\r\n"
				+ "cero o m�s veces\r\n"
				+ "C - Es una estructura de repetici�n que nos permitir� repetir un bloque de c�digo dos o m�s\r\n"
				+ "veces\r\n"
				+ "D - Es una estructura de repetici�n que nos permitir� repetir una l�nea de c�digo una o m�s\r\n"
				+ "veces");
		String pregunta2 = sc.next();
		if (pregunta2.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta2.equalsIgnoreCase("B")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		} else if (pregunta2.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta2.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		}

		System.out.println("3. Cual de los siguientes tipos de datos tiene un tama�o de 8 bytes de memoria\r\n"
				+ "(Tema 2)\r\n\n" + "A - Long\r\n" + "B - Double\r\n" + "C - Boolean\r\n" + "D - Todas son correctas");
		String pregunta3 = sc.next();
		if (pregunta3.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta3.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta3.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta3.equalsIgnoreCase("D")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		}

		System.out.println("4. Cuando trabajamos con ficheros, un error IOException puede significar que:\r\n"
				+ "(Tema 7)\r\n\n" + "A - El fichero al que queremos acceder no existe\r\n"
				+ "B - No se tienen permisos de escritura sobre el fichero\r\n"
				+ "C - No se tienen permisos de lectura sobre el fichero\r\n" + "D - B y C son correctas");

		String pregunta4 = sc.next();
		if (pregunta4.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta4.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta4.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta4.equalsIgnoreCase("D")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		}

		System.out.println("5. Cu�l o cu�les de las siguientes maneras son correctas para crear un array de\r\n"
				+ "cadenas: (Tema 4)\r\n\n" + "A - tipo[] nombreVariable = new tipo[n]\r\n"
				+ "B - []String nombreVariable == new tipo[n]\r\n" + "C - String[] nombreVariable = new String[n]\r\n"
				+ "D - Char[n] nombreVariable = new Char[n]");
		String pregunta5 = sc.next();
		if (pregunta5.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta5.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta5.equalsIgnoreCase("C")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		} else if (pregunta5.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		}

		System.out.println("6. �Cu�l es la diferencia principal entre un ArrayList y un Array? (Tema 5)\r\n\n"
				+ "A - Los Arrays convencionales son una clase, mientras que los ArrayList no\r\n"
				+ "B - Los Arrays no tienen predefinido su tama�o, mientras que los ArrayList s�\r\n"
				+ "C - No tienen diferencias. Es una cuesti�n de gustos y de comodidad para el usuario\r\n"
				+ "D - Los ArrayList no tienen predefinido su tama�o, mientras que los Arrays s�");

		String pregunta6 = sc.next();
		if (pregunta6.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta6.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta6.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta6.equalsIgnoreCase("D")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		}

		System.out.println("7. Cu�l o cu�les de las siguientes clases no se usan para trabajar con flujos de\r\n"
				+ "ficheros (Tema 6)\r\n\n" + "A - File, que se usa para abrir un fichero\r\n"
				+ "B - BufferedReader, para generar un flujo de lectura de car�cter a car�cter de un\r\n"
				+ "fichero de texto\r\n"
				+ "C - PrintWriter, para generar un flujo de escritura de l�nea a l�nea en un fichero de texto\r\n"
				+ "D - BufferedInputStream, para generar un flujo de lectura l�nea a l�nea de un fichero binario");

		String pregunta7 = sc.next();
		if (pregunta7.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta7.equalsIgnoreCase("B")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		} else if (pregunta7.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta7.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		}

		System.out.println("8. Marca la respuesta que contenga los tipos de paradigma de programaci�n correctos.\r\n\n"
				+ "a. estructurada, ordenada y funcional.\r\n"
				+ "b. funcional, orientada a objetos, ordenada y lineal.\r\n"
				+ "c. orientada a eventos, orientada a objetos, funcional y estructurada");

		String pregunta8 = sc.next();
		if (pregunta8.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta8.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta8.equalsIgnoreCase("C")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		}

		System.out.println("9. �Cu�les de los siguientes son datos alfanum�ricos?\r\n\n" + "a. String y char\r\n"
				+ "b. Int y boolean\r\n" + "c. float y double");

		String pregunta9 = sc.next();
		if (pregunta9.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		} else if (pregunta9.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta9.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		}

		System.out.println("10. �Qu� es un bucle for?\r\n\n"
				+ "a) Es una estructura de repetici�n que nos permitir� repetir un bloque de c�digo 0 o\r\n"
				+ "m�s veces.\r\n"
				+ "b) Es una estructura de repetici�n que nos permitir� repetir un bloque de c�digo 1 o\r\n"
				+ "m�s veces.\r\n"
				+ "c) Es una estructura de repetici�n que nos permitir� repetir un bloque de c�digo una\r\n"
				+ "cantidad de veces ya conocida y fija.\r\n"
				+ "d) Es una estructura de repetici�n que no nos permitir� repetir un bloque de c�digo");

		String pregunta10 = sc.next();
		if (pregunta10.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta10.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta10.equalsIgnoreCase("C")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		} else if (pregunta10.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		}

		System.out.println("11. La b�squeda binaria es�\r\n\n" + "a) la m�s f�cil de entender y trabajar\r\n"
				+ "b) m�s eficiente, pero algo compleja de implementar\r\n" + "c) la asignaci�n de un valor\r\n"
				+ "d) el valor de un elemento de la matriz indicando la fila y columna del mismo");

		String pregunta11 = sc.next();
		if (pregunta11.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta11.equalsIgnoreCase("B")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		} else if (pregunta11.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta11.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		}

		System.out.println("12. Cual de los siguientes elimina el elemento que se encuentra en la posici�n\r\n"
				+ "indicada. Devuelve el elemento eliminado.\r\n" + "A. Object remove(int pos)\r\n" + "B. clear()\r\n"
				+ "C. boolean isEmpty()\r\n" + "D. int size()");

		String pregunta12 = sc.next();
		if (pregunta12.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		} else if (pregunta12.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta12.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta12.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		}

		System.out.println("13. Qu� ruta indica la posici�n del fichero desde la posici�n donde nos encontramos?\r\n"
				+ "A. Rutas absolutas\r\n" + "B. Rutas relativas\r\n" + "C. Ruta final\r\n"
				+ "D. Rutas independientes");
		String pregunta13 = sc.next();
		if (pregunta13.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta13.equalsIgnoreCase("B")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		} else if (pregunta13.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta13.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		}

		System.out.println("14. Para escribir en un fichero de texto, necesitamos las siguientes clases:\r\n\n"
				+ "A. FileWriter y PrintWriter.\r\n" + "B. File y PrintWriter.\r\n" + "C. FileWriter y FileReader.\r\n"
				+ "D. FileOutputStream y File");

		String pregunta14 = sc.next();
		if (pregunta14.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		} else if (pregunta14.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta14.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta14.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		}

		System.out.println("15. El ciclo de vida de software se compone de las siguientes fases:\r\n\n"
				+ "a. Implementaci�n, verificaci�n, mantenimiento, requisitos, dise�o.\r\n"
				+ "b. Dise�o, requisitos, mantenimiento, verificaci�n, implementaci�n.\r\n"
				+ "c. Requisitos, dise�o, implementaci�n, verificaci�n, mantenimiento.\r\n"
				+ "d. implementaci�n, dise�o, verificaci�n, mantenimiento, requisitos.");

		String pregunta15 = sc.next();
		if (pregunta15.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta15.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta15.equalsIgnoreCase("C")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		} else if (pregunta15.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		}

		System.out.println("16. Los 3 tipos de operadores l�gicos son...\r\n\n" + "a. &&,== y ||.\r\n"
				+ "b. &&, ! y ||.\r\n" + "c. &&, || y <=.\r\n" + "d. &&, !! y >=.");
		String pregunta16 = sc.next();
		if (pregunta16.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta16.equalsIgnoreCase("B")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		} else if (pregunta16.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta16.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		}

		System.out.println("17. �Qu� es el bucle for?\r\n\n"
				+ "a. El bucle for es una estructura de repetici�n que nos permitir� repetir un bloque\r\n"
				+ "de c�digo una cantidad de veces ya conocida y fija\r\n"
				+ "b. El bucle for es una estructura de repetici�n que nos permitir� repetir un bloque\r\n"
				+ "de c�digo un n�mero de veces indefinidas\r\n"
				+ "c. El bucle for es una estructura de concatenaci�n que nos permitir� unir\r\n"
				+ "bloques de c�digo entre s�\r\n"
				+ "d. El bucle for es una estructura de repetici�n que nos permitir� repetir un\r\n"
				+ "c�digo teniendo su fin con una condici�n.");
		String pregunta17 = sc.next();
		if (pregunta17.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		} else if (pregunta17.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta17.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta17.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		}

		System.out.println("18.�Qu� tres m�todos de ordenaci�n de Arrays existen?\r\n\n"
				+ "a. Burbuja,inserci�n y clonaci�n.\r\n" + "b. Inserci�n,ordenaci�n y burbuja.\r\n"
				+ "c. Burbuja,selecci�n e inserci�n.\r\n" + "d. Ninguna es correcta.");
		String pregunta18 = sc.next();
		if (pregunta15.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta18.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta18.equalsIgnoreCase("C")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		} else if (pregunta18.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		}

		System.out.println("19. �Qu� tipo de m�todo elimina todos los elementos de un ArrayList?\r\n\n"
				+ "a. int size ()\r\n" + "b. boolean removeAll()\r\n" + "c. void add ()\r\n" + "d. void clear()");

		String pregunta19 = sc.next();
		if (pregunta19.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta19.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta19.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta19.equalsIgnoreCase("D")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		}

		System.out.println("20. �Qu� instrucci�n utilizamos para un tipo de flujo est�ndar de salida?\r\n\n"
				+ "a. System.in\r\n" + "b. System.err\r\n" + "c. System.out\r\n" + "d. System.pi");

		String pregunta20 = sc.next();
		if (pregunta20.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta20.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta20.equalsIgnoreCase("C")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		} else if (pregunta20.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		}

		System.out.println("21. �Qu� bloque de comandos usamos para abordar excepciones en java?\r\n\n"
				+ "a. try-catch\r\n" + "b. if-else if\r\n" + "c. switch-case\r\n" + "d. do-while");

		String pregunta21 = sc.next();
		if (pregunta21.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		} else if (pregunta21.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta21.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta21.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		}

		System.out.println("22. �Qu� es un programa?\r\n\n"
				+ "A. Llamamos programa a la totalidad de las instrucciones y algoritmos escritos\r\n"
				+ "mediante un lenguaje de programaci�n.\r\n"
				+ "B. Llamamos programa a la totalidad de las instrucciones escritas mediante un lenguaje de\r\n"
				+ "programaci�n.\r\n"
				+ "C. Es una secuencia de instrucciones bien implementadas y ordenadas que resuelve una tarea\r\n"
				+ "en concreto.\r\n" + "D. Almacenan datos");

		String pregunta22 = sc.next();
		if (pregunta22.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		} else if (pregunta22.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta22.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta22.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		}

		System.out.println("23. �C�mo se declara una variable de tipo int?\r\n\n" + "A. Integer nombre;\r\n"
				+ "B. Integer nombre=0;\r\n" + "C. Int nombre=�4�;\r\n" + "D. int nombre=0;");

		String pregunta23 = sc.next();
		if (pregunta23.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta23.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta23.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta23.equalsIgnoreCase("D")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		}

		System.out.println("24. �Cu�l es la estructura de un if else?\r\n\n"
				+ "A. Si se cumple la condici�n, se ejecuta el primer bloque de c�digo; en caso\r\n"
				+ "contrario, se ejecuta el bloque asociado al else.\r\n"
				+ "B. Si se cumple la condici�n, no se ejecuta el primer bloque de c�digo; en caso\r\n"
				+ "contrario, se ejecuta el bloque asociado al else.\r\n"
				+ "C. Si se cumple la condici�n, se ejecuta el segundo bloque de c�digo; en caso y\r\n"
				+ "tambi�n se ejecuta el bloque asociado al else.\r\n"
				+ "D. Si se cumple la condici�n, se ejecuta el primer bloque de c�digo; en caso contrario,\r\n"
				+ "se ejecuta el bloque asociado al if.");

		String pregunta24 = sc.next();
		if (pregunta24.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		} else if (pregunta24.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta24.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta24.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		}

		System.out.println("25. �C�mo se declara un array unidimensional?\r\n\n"
				+ "A. Array [] nombrevariable = new tipo[ tama�o ];\r\n"
				+ "B. Int [] nombrevariable = new Int [tama�o];\r\n" + "C. Ninguna de las anteriores.\r\n"
				+ "D. tipo[] nombrevariable = new tipo[ tama�o ];");

		String pregunta25 = sc.next();
		if (pregunta25.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta25.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta25.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta25.equalsIgnoreCase("D")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		}

		System.out.println(
				"26 .�C�mo se crea un ArrayList?\r\n" + "A. List<variable> nombre=new ArrayList<nombre>();\r\n\n"
						+ "B. List<String> nombre= newArrayList<String>();\r\n"
						+ "C. import java.util.ArrayList; y dentro del c�digo a ejecutar List<variable> nombre=new\r\n"
						+ "ArrayList<nombre>();\r\n" + "D. Ninguna de las anteriores");
		String pregunta26 = sc.next();
		if (pregunta26.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta26.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta26.equalsIgnoreCase("C")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		} else if (pregunta26.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		}

		System.out.println("27. �Para qu� sirve la clase InputStream?\r\n\n"
				+ "A. Podremos crear flujos de salida de datos a ficheros basados en bytes, es decir,\r\n"
				+ "podremos escribir informaci�n en ellos.\r\n"
				+ "B. Podremos crear flujos de entrada de datos a ficheros basados en bytes, es decir,\r\n"
				+ "podremos leer informaci�n de ellos.\r\n"
				+ "C. Podremos crear flujos de entrada y salida de datos a ficheros basados en bytes, es\r\n"
				+ "decir, podremos leer informaci�n de ellos.");
		String pregunta27 = sc.next();
		if (pregunta27.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta27.equalsIgnoreCase("B")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		} else if (pregunta27.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		}

		System.out.println("28.�La excepci�n IOException se lanzar� siempre que�. (indica la o las verdaderas)?\r\n\n"
				+ "A. No tenga permisos de escritura en el caso de querer escribir informaci�n en �l\r\n"
				+ "B. El usuario tiene demasiados permisos\r\n" + "C. El fichero est� en una localizaci�n no v�lida\n"
				+ "D. El fichero se ha cerrado de repente");

		String pregunta28 = sc.next();
		if (pregunta28.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		} else if (pregunta28.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta28.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta28.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		}

		System.out.println("29. Los datos de tipo booleano:\r\n\n"
				+ "A) - Pueden almacenar cualquier tipo de valor.\r\n" + "B) - Almacenan dos tipos de valores.\r\n"
				+ "C) - No pueden ser creados dentro de un bucle.\r\n"
				+ "D) - No pueden utilizarse como condici�n en un condicional �if�.");

		String pregunta29 = sc.next();
		if (pregunta29.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta29.equalsIgnoreCase("B")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		} else if (pregunta29.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta29.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		}

		System.out.println("30. Para hacer un casting:\r\n\n"
				+ "A) - Es necesario que los datos guarden el mismo tipo de datos.\r\n"
				+ "B) - Basta con que los tipos de datos sean compatibles.\r\n" + "C) - A y B son correctas.\r\n"
				+ "D) - A , B y C son incorrectas ya que el casting se realiza de manera autom�tica.");
		String pregunta30 = sc.next();
		if (pregunta30.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta30.equalsIgnoreCase("B")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		} else if (pregunta30.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta30.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		}

		System.out.println("31. �Cu�ndo se usa cada bucle?\r\n\n"
				+ "A) - For: cuando tengamos un n�mero de iteraciones conocidas\r\n"
				+ "B) - While: cuando el n�mero de iteraciones sea desconocido porque dependa de\r\n"
				+ "una condici�n\r\n" + "C) - Do-While: cuando se cumpla una condici�n\r\n"
				+ "D) - Todas son correctas, adem�s podemos utilizar el que queramos en cualquier\r\n"
				+ "situaci�n ya que los bucles son equivalentes entre ellos.");

		String pregunta31 = sc.next();
		if (pregunta31.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta31.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta31.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta31.equalsIgnoreCase("D")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		}

		System.out.println("32. �Qu� es una cadena de caracteres?\r\n\n" + "A) - Una String\r\n"
				+ "B) - Varios caracteres individuales\r\n" + "C) - Un array que guarda caracteres\r\n"
				+ "D) - A y C son correctas");

		String pregunta32 = sc.next();
		if (pregunta32.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta32.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta32.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta32.equalsIgnoreCase("D")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		}

		System.out.println("33. �En qu� caso se debe usar un arraylist?\r\n\n"
				+ "A) - Cuando queramos asignar una palabra clave a la definici�n de cada elemento de una\r\n"
				+ "lista.\r\n" + "B) - Cuando queramos crear una lista sin un tama�o definido y necesitemos de\r\n"
				+ "funciones espec�ficas\r\n"
				+ "C) - Cuando queramos crear una lista con un tama�o definido y no necesitemos de\r\n"
				+ "funciones espec�ficas\r\n"
				+ "D) - Cuando se precise de crear una lista sin ning�n orden espec�fico");

		String pregunta33 = sc.next();
		if (pregunta33.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta33.equalsIgnoreCase("B")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		} else if (pregunta33.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta33.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		}

		System.out.println("34. �Qu� instrucci�n se utiliza usualmente para mostrar error por pantalla?\r\n\n"
				+ "A) - System.err\r\n" + "B) - System.out\r\n" + "C) - System.in\r\n" + "D) - System.call");

		String pregunta34 = sc.next();
		if (pregunta34.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		} else if (pregunta34.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta34.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta34.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		}

		System.out.println("35. �Para qu� sirve la clase FileWriter?\r\n\n" + "A) - Sirve para modificar un archivo\r\n"
				+ "B) - Sirve para crear una serie de ficheros\r\n"
				+ "C) - Sirve para abrir un flujo de escritura car�cter a car�cter a un fichero de texto.\r\n"
				+ "D) - Sirve para abrir un flujo de escritura l�nea a l�nea a un fichero de texto.");

		String pregunta35 = sc.next();
		if (pregunta35.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta35.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta35.equalsIgnoreCase("C")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		} else if (pregunta35.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		}

		System.out.println("36. �Cual de estos lenguajes no son de programaci�n?\r\n\n" + "A- C++\r\n" + "B- Python\r\n"
				+ "C- Java\r\n" + "D- Arraylist");

		String pregunta36 = sc.next();
		if (pregunta36.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta36.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta36.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta36.equalsIgnoreCase("D")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		}

		System.out.println("37. �Que es una variable?\r\n\n"
				+ "A- Es una posici�n en memoria al que vamos a dar un nombre. �sta tendr� un valor\r\n"
				+ "que podr� cambiar a lo largo del programa.\r\n"
				+ "B- Una funci�n que var�a del lenguaje de programaci�n.\r\n"
				+ "C- Es una funci�n pero cuyo valor, una vez asignado, no va a poder cambiar durante la\r\n"
				+ "ejecuci�n del programa.\r\n" + "D- Ninguna de las respuestas son correctas.");
		String pregunta37 = sc.next();
		if (pregunta37.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		} else if (pregunta37.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta37.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta37.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		}

		System.out.println("38. �Cual es la condici�n if else que est� mal?\r\n\n" + "A- If else\r\n" + "B- if\r\n"
				+ "C- if else if\r\n" + "D- Do if");

		String pregunta38 = sc.next();
		if (pregunta38.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta38.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta38.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta38.equalsIgnoreCase("D")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		}

		System.out.println(
				"39. �Cual de estas respuestas no es una operaci�n de array?\r\n" + "A- Creaci�n e idealizaci�n.\r\n"
						+ "B- Eliminar elementos\r\n" + "C- Ordenar el array\r\n" + "D- Crear un fichero");
		String pregunta39 = sc.next();
		if (pregunta39.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta39.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta39.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta39.equalsIgnoreCase("D")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		}

		System.out.println("40. Indica cu�l es la definici�n de Mapas es la correcta:\r\n\n"
				+ "A- Son un tipo de colecci�n que admite dos valores por elemento y que no puede\r\n"
				+ "contener elementos repetidores.\r\n"
				+ "B- Son un tipo de colecci�n que admite dos valores por elemento y que puede contener\r\n"
				+ "elementos repetidores.\r\n" + "C- Son un tipo que contiene elementos y que se repiten.\r\n"
				+ "D- Conjunto de datos que est�n almacenados de forma conjunta en una misma estructura\r\n"
				+ "de datos.");

		String pregunta40 = sc.next();
		if (pregunta40.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		} else if (pregunta40.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta40.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta40.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		}

		System.out.println("41. �Cu�l es la instrucci�n del tipo de flujo est�ndar de entrada?\r\n\n"
				+ "A- System.out\r\n" + "B- System.in\r\n" + "C- System.err\r\n" + "D-System.ar");

		String pregunta41 = sc.next();
		if (pregunta41.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta41.equalsIgnoreCase("B")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		} else if (pregunta41.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta41.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		}

		System.out.println("42. �Con qu� clase escribimos en un fichero?\r\n\n" + "A- Filewriter\r\n"
				+ "B-Printwriter\r\n" + "C- Filereader\r\n" + "D- File");
		String pregunta42 = sc.next();
		if (pregunta42.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.");
			correctas +=1;
		} else if (pregunta42.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta42.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		} else if (pregunta42.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.");
			falladas +=1;
		}

		System.out.println("Has acertado " + correctas + " preguntas. \n"
				+ "Has fallado " + falladas + " preguntas. \n");
		
		System.out.println("Has sacado un "+notafinal);
		sc.close();
	}

}
