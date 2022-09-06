package TESTS_EXAMENES;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int correctas = 0;
		int falladas = 0;
		double notafinal = (double)(correctas/42)*10;

		System.out.println("1. Un algoritmo… (Tema 1)\r\n\n"
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
				+ "A - Es una estructura de repetición que nos permitirá repetir un bloque de código una o más\r\n"
				+ "veces\r\n" + "B - Es una estructura de repetición que nos permitirá repetir un bloque de código\r\n"
				+ "cero o más veces\r\n"
				+ "C - Es una estructura de repetición que nos permitirá repetir un bloque de código dos o más\r\n"
				+ "veces\r\n"
				+ "D - Es una estructura de repetición que nos permitirá repetir una línea de código una o más\r\n"
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

		System.out.println("3. Cual de los siguientes tipos de datos tiene un tamaño de 8 bytes de memoria\r\n"
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

		System.out.println("5. Cuál o cuáles de las siguientes maneras son correctas para crear un array de\r\n"
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

		System.out.println("6. ¿Cuál es la diferencia principal entre un ArrayList y un Array? (Tema 5)\r\n\n"
				+ "A - Los Arrays convencionales son una clase, mientras que los ArrayList no\r\n"
				+ "B - Los Arrays no tienen predefinido su tamaño, mientras que los ArrayList sí\r\n"
				+ "C - No tienen diferencias. Es una cuestión de gustos y de comodidad para el usuario\r\n"
				+ "D - Los ArrayList no tienen predefinido su tamaño, mientras que los Arrays sí");

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

		System.out.println("7. Cuál o cuáles de las siguientes clases no se usan para trabajar con flujos de\r\n"
				+ "ficheros (Tema 6)\r\n\n" + "A - File, que se usa para abrir un fichero\r\n"
				+ "B - BufferedReader, para generar un flujo de lectura de carácter a carácter de un\r\n"
				+ "fichero de texto\r\n"
				+ "C - PrintWriter, para generar un flujo de escritura de línea a línea en un fichero de texto\r\n"
				+ "D - BufferedInputStream, para generar un flujo de lectura línea a línea de un fichero binario");

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

		System.out.println("8. Marca la respuesta que contenga los tipos de paradigma de programación correctos.\r\n\n"
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

		System.out.println("9. ¿Cuáles de los siguientes son datos alfanuméricos?\r\n\n" + "a. String y char\r\n"
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

		System.out.println("10. ¿Qué es un bucle for?\r\n\n"
				+ "a) Es una estructura de repetición que nos permitirá repetir un bloque de código 0 o\r\n"
				+ "más veces.\r\n"
				+ "b) Es una estructura de repetición que nos permitirá repetir un bloque de código 1 o\r\n"
				+ "más veces.\r\n"
				+ "c) Es una estructura de repetición que nos permitirá repetir un bloque de código una\r\n"
				+ "cantidad de veces ya conocida y fija.\r\n"
				+ "d) Es una estructura de repetición que no nos permitirá repetir un bloque de código");

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

		System.out.println("11. La búsqueda binaria es…\r\n\n" + "a) la más fácil de entender y trabajar\r\n"
				+ "b) más eficiente, pero algo compleja de implementar\r\n" + "c) la asignación de un valor\r\n"
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

		System.out.println("12. Cual de los siguientes elimina el elemento que se encuentra en la posición\r\n"
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

		System.out.println("13. Qué ruta indica la posición del fichero desde la posición donde nos encontramos?\r\n"
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
				+ "a. Implementación, verificación, mantenimiento, requisitos, diseño.\r\n"
				+ "b. Diseño, requisitos, mantenimiento, verificación, implementación.\r\n"
				+ "c. Requisitos, diseño, implementación, verificación, mantenimiento.\r\n"
				+ "d. implementación, diseño, verificación, mantenimiento, requisitos.");

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

		System.out.println("16. Los 3 tipos de operadores lógicos son...\r\n\n" + "a. &&,== y ||.\r\n"
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

		System.out.println("17. ¿Qué es el bucle for?\r\n\n"
				+ "a. El bucle for es una estructura de repetición que nos permitirá repetir un bloque\r\n"
				+ "de código una cantidad de veces ya conocida y fija\r\n"
				+ "b. El bucle for es una estructura de repetición que nos permitirá repetir un bloque\r\n"
				+ "de código un número de veces indefinidas\r\n"
				+ "c. El bucle for es una estructura de concatenación que nos permitirá unir\r\n"
				+ "bloques de código entre sí\r\n"
				+ "d. El bucle for es una estructura de repetición que nos permitirá repetir un\r\n"
				+ "código teniendo su fin con una condición.");
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

		System.out.println("18.¿Qué tres métodos de ordenación de Arrays existen?\r\n\n"
				+ "a. Burbuja,inserción y clonación.\r\n" + "b. Inserción,ordenación y burbuja.\r\n"
				+ "c. Burbuja,selección e inserción.\r\n" + "d. Ninguna es correcta.");
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

		System.out.println("19. ¿Qué tipo de método elimina todos los elementos de un ArrayList?\r\n\n"
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

		System.out.println("20. ¿Qué instrucción utilizamos para un tipo de flujo estándar de salida?\r\n\n"
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

		System.out.println("21. ¿Qué bloque de comandos usamos para abordar excepciones en java?\r\n\n"
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

		System.out.println("22. ¿Qué es un programa?\r\n\n"
				+ "A. Llamamos programa a la totalidad de las instrucciones y algoritmos escritos\r\n"
				+ "mediante un lenguaje de programación.\r\n"
				+ "B. Llamamos programa a la totalidad de las instrucciones escritas mediante un lenguaje de\r\n"
				+ "programación.\r\n"
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

		System.out.println("23. ¿Cómo se declara una variable de tipo int?\r\n\n" + "A. Integer nombre;\r\n"
				+ "B. Integer nombre=0;\r\n" + "C. Int nombre=’4’;\r\n" + "D. int nombre=0;");

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

		System.out.println("24. ¿Cuál es la estructura de un if else?\r\n\n"
				+ "A. Si se cumple la condición, se ejecuta el primer bloque de código; en caso\r\n"
				+ "contrario, se ejecuta el bloque asociado al else.\r\n"
				+ "B. Si se cumple la condición, no se ejecuta el primer bloque de código; en caso\r\n"
				+ "contrario, se ejecuta el bloque asociado al else.\r\n"
				+ "C. Si se cumple la condición, se ejecuta el segundo bloque de código; en caso y\r\n"
				+ "también se ejecuta el bloque asociado al else.\r\n"
				+ "D. Si se cumple la condición, se ejecuta el primer bloque de código; en caso contrario,\r\n"
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

		System.out.println("25. ¿Cómo se declara un array unidimensional?\r\n\n"
				+ "A. Array [] nombrevariable = new tipo[ tamaño ];\r\n"
				+ "B. Int [] nombrevariable = new Int [tamaño];\r\n" + "C. Ninguna de las anteriores.\r\n"
				+ "D. tipo[] nombrevariable = new tipo[ tamaño ];");

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
				"26 .¿Cómo se crea un ArrayList?\r\n" + "A. List<variable> nombre=new ArrayList<nombre>();\r\n\n"
						+ "B. List<String> nombre= newArrayList<String>();\r\n"
						+ "C. import java.util.ArrayList; y dentro del código a ejecutar List<variable> nombre=new\r\n"
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

		System.out.println("27. ¿Para qué sirve la clase InputStream?\r\n\n"
				+ "A. Podremos crear flujos de salida de datos a ficheros basados en bytes, es decir,\r\n"
				+ "podremos escribir información en ellos.\r\n"
				+ "B. Podremos crear flujos de entrada de datos a ficheros basados en bytes, es decir,\r\n"
				+ "podremos leer información de ellos.\r\n"
				+ "C. Podremos crear flujos de entrada y salida de datos a ficheros basados en bytes, es\r\n"
				+ "decir, podremos leer información de ellos.");
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

		System.out.println("28.¿La excepción IOException se lanzará siempre que…. (indica la o las verdaderas)?\r\n\n"
				+ "A. No tenga permisos de escritura en el caso de querer escribir información en él\r\n"
				+ "B. El usuario tiene demasiados permisos\r\n" + "C. El fichero está en una localización no válida\n"
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
				+ "D) - No pueden utilizarse como condición en un condicional “if”.");

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
				+ "D) - A , B y C son incorrectas ya que el casting se realiza de manera automática.");
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

		System.out.println("31. ¿Cuándo se usa cada bucle?\r\n\n"
				+ "A) - For: cuando tengamos un número de iteraciones conocidas\r\n"
				+ "B) - While: cuando el número de iteraciones sea desconocido porque dependa de\r\n"
				+ "una condición\r\n" + "C) - Do-While: cuando se cumpla una condición\r\n"
				+ "D) - Todas son correctas, además podemos utilizar el que queramos en cualquier\r\n"
				+ "situación ya que los bucles son equivalentes entre ellos.");

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

		System.out.println("32. ¿Qué es una cadena de caracteres?\r\n\n" + "A) - Una String\r\n"
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

		System.out.println("33. ¿En qué caso se debe usar un arraylist?\r\n\n"
				+ "A) - Cuando queramos asignar una palabra clave a la definición de cada elemento de una\r\n"
				+ "lista.\r\n" + "B) - Cuando queramos crear una lista sin un tamaño definido y necesitemos de\r\n"
				+ "funciones específicas\r\n"
				+ "C) - Cuando queramos crear una lista con un tamaño definido y no necesitemos de\r\n"
				+ "funciones específicas\r\n"
				+ "D) - Cuando se precise de crear una lista sin ningún orden específico");

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

		System.out.println("34. ¿Qué instrucción se utiliza usualmente para mostrar error por pantalla?\r\n\n"
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

		System.out.println("35. ¿Para qué sirve la clase FileWriter?\r\n\n" + "A) - Sirve para modificar un archivo\r\n"
				+ "B) - Sirve para crear una serie de ficheros\r\n"
				+ "C) - Sirve para abrir un flujo de escritura carácter a carácter a un fichero de texto.\r\n"
				+ "D) - Sirve para abrir un flujo de escritura línea a línea a un fichero de texto.");

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

		System.out.println("36. ¿Cual de estos lenguajes no son de programación?\r\n\n" + "A- C++\r\n" + "B- Python\r\n"
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

		System.out.println("37. ¿Que es una variable?\r\n\n"
				+ "A- Es una posición en memoria al que vamos a dar un nombre. Ésta tendrá un valor\r\n"
				+ "que podrá cambiar a lo largo del programa.\r\n"
				+ "B- Una función que varía del lenguaje de programación.\r\n"
				+ "C- Es una función pero cuyo valor, una vez asignado, no va a poder cambiar durante la\r\n"
				+ "ejecución del programa.\r\n" + "D- Ninguna de las respuestas son correctas.");
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

		System.out.println("38. ¿Cual es la condición if else que está mal?\r\n\n" + "A- If else\r\n" + "B- if\r\n"
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
				"39. ¿Cual de estas respuestas no es una operación de array?\r\n" + "A- Creación e idealización.\r\n"
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

		System.out.println("40. Indica cuál es la definición de Mapas es la correcta:\r\n\n"
				+ "A- Son un tipo de colección que admite dos valores por elemento y que no puede\r\n"
				+ "contener elementos repetidores.\r\n"
				+ "B- Son un tipo de colección que admite dos valores por elemento y que puede contener\r\n"
				+ "elementos repetidores.\r\n" + "C- Son un tipo que contiene elementos y que se repiten.\r\n"
				+ "D- Conjunto de datos que están almacenados de forma conjunta en una misma estructura\r\n"
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

		System.out.println("41. ¿Cuál es la instrucción del tipo de flujo estándar de entrada?\r\n\n"
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

		System.out.println("42. ¿Con qué clase escribimos en un fichero?\r\n\n" + "A- Filewriter\r\n"
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
