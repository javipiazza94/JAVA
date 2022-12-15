package TEST;

import java.util.Scanner;

public class TEST_PSP_1T {
		static double correctas = 0;
		static double falladas = 0;
		static double numpreguntas = 0;
		
		public static void notas() {
			double nota = (correctas / numpreguntas) * 10;
			double resta = ((falladas / numpreguntas) / 3) * 10;
			double notafinal = nota - resta;
			int fallaux = (int) falladas;
			int acertaux = (int) correctas;
			System.out.println("Has acertado " + acertaux + " preguntas. \n" 
							   + "Has fallado " + fallaux + " preguntas. \n");
			System.out.println("Has sacado un " + notafinal);
		}
		
		public static String respuesta_acertada(String letra1, String letra2) {
			String res = " ";
			if (letra1.equalsIgnoreCase(letra2)) {
				res = "Respuesta correcta.";
				correctas++;
			} else {
				res = "Respuesta incorrecta.";
				falladas++;
			}
			return res;
		}	
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("1. ¿Qué es un programa? \r\n\n"
					+ "a. Toda la información, tanto código como datos, está almacenada en\r\n"
					+ "disco de una aplicación y que nos resolverá un problema concreto.\r\n"
					+ "b. Toda la información, tanto código como datos, está almacenada en\r\n"
					+ "memoria RAM y que nos resolverá un problema concreto.\r\n"
					+ "c. Toda la información, tanto código como imágenes, está almacenada en\r\n"
					+ "disco de una aplicación y que nos resolverá un problema concreto.\r\n"
					+ "d. Todas son incorrectas\r\n"
					+ "");
			String pregunta1 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta1, "a"));
			
			System.out.println("2. ¿Qué permite un hilo? \r\n\n"
					+ "a. Ejecutar una tarea en paralelo a otras\r\n"
					+ "b. Ejecutar una tarea en otro equipo\r\n"
					+ "c. Ejecutar una tarea cuando se termine otra\r\n"
					+ "d. Ninguna de las otras opciones");
			String pregunta2 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta2, "a"));
			
			System.out.println("3. ¿Qué tareas de la programación concurrente se puede ejecutar en?\r\n"
					+ "a. Multiprogramación\r\n"
					+ "b. Multitarea\r\n"
					+ "c. Programación en tarea\r\n"
					+ "d. Todas las opciones son correctas");
			String pregunta3 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta3, "d"));
			
			System.out.println("4. Arquitectura programación paralela\r\n"
					+ "a. Sistemas mononucleos\r\n"
					+ "b. Multiprocesadores específicos\r\n"
					+ "c. Sistemas multi núcleos\r\n"
					+ "d. B y C son correctas\r\n"
					+ "");
			String pregunta4 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta4, "d"));
			
			System.out.println("5. De las siguientes opciones, ¿cuál se consideran sistemas multinúcleo?\r\n"
					+ "a. Los procesadores actuales\r\n"
					+ "b. Los primeros procesadores\r\n"
					+ "c. Microprocesadores específicos\r\n"
					+ "d. Chips de memoria RAM\r\n"
					+ "");
			String pregunta5 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta5, "a"));
			
			System.out.println("6. ¿Qué es el cloud computing?\r\n"
					+ "a. Son sistemas donde podremos tener varios recursos (uno de los más\r\n"
					+ "conocidos es el espacio en disco). Las máquinas que ofrecen ese\r\n"
					+ "servicio pueden estar en otra parte del mundo.\r\n"
					+ "b. Sistemas computacionales muy potentes y se utilizan para tareas que\r\n"
					+ "necesitan una enorme capacidad de cálculo\r\n"
					+ "c. Computación distribuida, van a poder usarse ordenadores muy potentes\r\n"
					+ "conectados en red entre sí.\r\n"
					+ "d. Se conectan varios microprocesadores a través de una red de conexión de\r\n"
					+ "alta velocidad, lo cual va a formar lo que conocemos como clúster\r\n"
					+ "");
			String pregunta6 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta6, "a"));
			
			System.out.println("7. ¿Qué es el Grid Computing?\r\n"
					+ "a. Se conectan varios microprocesadores a través de una red de conexión de\r\n"
					+ "alta velocidad, lo cual va a formar lo que conocemos como clúster\r\n"
					+ "b. Son sistemas donde podremos tener varios recursos (uno de los más\r\n"
					+ "conocidos es el espacio en disco). Las máquinas que ofrecen ese servicio\r\n"
					+ "pueden estar en otra parte del mundo\r\n"
					+ "c. Computación distribuida, van a poder usarse ordenadores muy\r\n"
					+ "potentes conectados en red entre sí.\r\n"
					+ "d. Se conectan varios microprocesadores a través de una red de conexión de\r\n"
					+ "alta velocidad, lo cual va a formar lo que conocemos como clúster\r\n"
					+ "");
			String pregunta7 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta7, "c"));
			
			System.out.println("8. ¿Qué es un servicio?\r\n"
					+ "a. Es un proceso que no es interactivo, pero que se está ejecutando\r\n"
					+ "continuamente\r\n"
					+ "b. Es un proceso que se está ejecutando continuamente\r\n"
					+ "c. Es un proceso que solo se ejecuta al iniciarse el sistema\r\n"
					+ "d. Es un proceso que no es interactivo");
			String pregunta8 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta8, "a"));
			
			System.out.println("9. ¿Qué es un ejecutable?\r\n"
					+ "a. Es un fichero que nos permite cerrar un proceso\r\n"
					+ "b. Es un fichero que nos permite indicar qué programas han de iniciarse cuando\r\n"
					+ "se encienda el sistema\r\n"
					+ "c. Es un fichero que inicia servicios\r\n"
					+ "d. Es un fichero que nos permite poner un programa en ejecución como\r\n"
					+ "un proceso\r\n"
					+ "");
			String pregunta9 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta9, "d"));
			
			System.out.println("10. ¿Qué tipo de programación permite mejorar el rendimiento de un programa si este se ejecuta de forma paralela en diferentes núcleos?\r\n"
					+ "a. Programación paralela\r\n"
					+ "b. Multitarea\r\n"
					+ "c. Multiprogramación\r\n"
					+ "d. Orientadas a objetos\r\n"
					+ "");
			String pregunta10 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta10, "a"));
			
			System.out.println("11.  ¿A qué tipo de programación nos referimos a la existencia de varios núcleos en\r\n"
					+ "un procesador?\r\n"
					+ "a. Multitarea\r\n"
					+ "b. Multiprogramación\r\n"
					+ "c. Orientadas a objetos\r\n"
					+ "d. Paralela");
			String pregunta11 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta11, "a"));
			
			System.out.println("12. ¿Qué tipo de equipo requiere de potencia para realizar cálculos?\r\n"
					+ "a. Supercomputador\r\n"
					+ "b. Ordenador común\r\n"
					+ "c. Ordenador portátil\r\n"
					+ "d. Cloud computing\r\n"
					+ "");
			String pregunta12 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta12, "a"));
			
			System.out.println("13. ¿Qué es un proceso?\r\n"
					+ "a. Es un programa en ejecución\r\n"
					+ "b. Es el conjunto de hechos para la consecución de la independencia de\r\n"
					+ "Cataluña\r\n"
					+ "c. Es un conjunto de hilos\r\n"
					+ "d. Es un programa en inicialización");
			String pregunta13 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta13, "a"));
			
			System.out.println("14.  ¿Cual es la arquitectura hardware de la programación distribuida?\r\n"
					+ "a. Torre-monitor\r\n"
					+ "b. Cliente-servidor\r\n"
					+ "c. Cliente-nube\r\n"
					+ "d. Torre-nube");
			String pregunta14 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta14, "b"));
			
			System.out.println("15.  La programación paralela:\r\n"
					+ "a. Se diseñó para ejecutarse únicamente en un sistema multiprocesador,\r\n"
					+ "b. Es un tipo de programación concurrente\r\n"
					+ "c. Mejora el rendimiento de los programas\r\n"
					+ "d. Todas son correctas\r\n"
					+ "");
			String pregunta15 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta15, "d"));
			
			System.out.println("16.  Atendiendo al modo de ejecución, podemos distinguir los siguientes tipos de\r\n"
					+ "acuerdo:\r\n"
					+ "a. Procesos por lotes, interactivos y por kernel\r\n"
					+ "b. Procesos por lotes, interactivos y usuario\r\n"
					+ "c. Procesos por lotes, interactivos y en tiempo real\r\n"
					+ "d. Procesos por kernel y usuario");
			String pregunta16 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta16, "c"));
			
			System.out.println("17. Atendiendo al origen de la ejecución, se pueden distinguir los tipos de procesos:\r\n"
					+ "a. Modo kernel y modo lotes\r\n"
					+ "b. Modo kernel y modo interactivo\r\n"
					+ "d. Ninguna de las anteriore");
			String pregunta17 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta17, "b"));
			
			System.out.println("18. El algoritmo Round Robin:\r\n"
					+ "a. Tiene un tiempo de ejecución llamado Quantum.\r\n"
					+ "b. Es una mezcla de todos los algoritmos de planificación.\r\n"
					+ "c. Ordenará los procesos según el tiempo que tardan en ejecutarse (el que\r\n"
					+ "tarde menos tiempo se ejecutará antes).\r\n"
					+ "d. Ordenará los procesos según el tiempo que tardan en ejecutarse (el que\r\n"
					+ "tarde más tiempo se ejecutará antes).");
			String pregunta18 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta18, "a"));
			
			System.out.println("19.  ¿Qué es y qué significa FIFO?\r\n"
					+ "a. Es el algoritmo de planificación más complejo, sus siglas vienen de First Inn\r\n"
					+ "First Out.\r\n"
					+ "b. Es el algoritmo de planificación más simple, sus siglas vienen de First\r\n"
					+ "In First Out.\r\n"
					+ "c. Es una clase de java y sus siglas vienen de First In First Out.\r\n"
					+ "d. Es una sentencia de MySQL y sus siglas vienen de First Inn First Out..\r\n"
					+ "");
			String pregunta19 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta19, "b"));
			
			System.out.println("20. El quantum se emplea en el tipo de planificación de procesos:\r\n"
					+ "a. A largo plazo.\r\n"
					+ "b. FIFO.\r\n"
					+ "c. Round Robin.\r\n"
					+ "d. Tiempo compartido");
			String pregunta20 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta20, "d"));
			
			System.out.println("21.  Al cambiar de proceso, el sistema operativo NO guarda:\r\n"
					+ "a. Estado en el que se encontraba el proceso.\r\n"
					+ "b. Contador de programa.\r\n"
					+ "c. Puntero de pila.\r\n"
					+ "d. Contador de variables.");
			String pregunta21 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta21, "d"));
			
			System.out.println("22.  Cada vez que se produzca un cambio de contexto, el sistema operativo debe guardar:\r\n"
					+ "a. Estado en el que se encuentra el proceso\r\n"
					+ "b. Estado del procesador\r\n"
					+ "c. Información de gestión de memoria\r\n"
					+ "d. Todas son correctas\r\n"
					+ "");
			String pregunta22 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta22, "d"));
			
			System.out.println("23. ¿Qué diferentes algoritmos de planificación puede utilizar el planificador ?\r\n"
					+ "a. Prioridad en llegar\r\n"
					+ "b. Prioridad al más corto\r\n"
					+ "c. Prioridad al más largo\r\n"
					+ "d. Todas son correctas");
			String pregunta23 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta23, "d"));
			
			System.out.println("24. ¿Cuál de los siguientes tipos de procesos el usuario que las ejecuta únicamente está\r\n"
					+ "interesado en su resultado final, y no en su ejecución?\r\n"
					+ "a. Procesos por lotes\r\n"
					+ "b. Procesos interactivos\r\n"
					+ "c. Procesos en tiempo real\r\n"
					+ "d. Procesos en modo Kernel\r\n"
					+ "");
			String pregunta24 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta24, "a"));
			
			System.out.println("25.  Indica cuál de los siguientes es un estado por el que puede pasar un proceso\r\n"
					+ "a. Nuevo\r\n"
					+ "b. Listo\r\n"
					+ "c. En espera\r\n"
					+ "d. Todas las anteriores");
			String pregunta25 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta25, "d"));
			
			System.out.println("26. El orden de los estados de los procesos es:\r\n"
					+ "a. Nuevo, listo, en ejecución, en espera/bloqueado, terminado.\r\n"
					+ "b. Listo, nuevo, en ejecución, en espera//bloqueado, terminado.\r\n"
					+ "c. Listo, nuevo, en espera/bloqueado, en ejecución, terminado.\r\n"
					+ "d. Ninguna es correcta.\r\n"
					+ "");
			String pregunta26 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta26, "a"));
			
			System.out.println("27. Un flujo de datos o “Stream” viene definido por:\r\n"
					+ "a. Secuencia ordenada de información que posee un recurso de entrada y\r\n"
					+ "otro de salida.\r\n"
					+ "b. Secuencia desordenada de información que posee un recurso de entrada y\r\n"
					+ "otro de salida.\r\n"
					+ "c. Secuencia ordenada de información que posee un recurso de entrada y al\r\n"
					+ "que se le puede añadir uno de salida.\r\n"
					+ "d. Secuencia ordenada de información que posee un recurso de entrada y otro\r\n"
					+ "de flujo.");
			String pregunta27 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta27, "a"));
			
			System.out.println("28. ¿Cual no es un problema posible a la hora de crear un proceso?\r\n"
					+ "a. No tener permisos de ejecución\r\n"
					+ "b. No ser un ejecutable válido en el sistema\r\n"
					+ "c. No encontrar el ejecutable debido a la ruta indicada\r\n"
					+ "d. No tener permiso de lectura de la ruta indicada\r\n"
					+ "");
			String pregunta28 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta28, "c"));
			
			System.out.println("29.  ¿Cuál no es uno de los mecanismos más comunes para controlar la sincronización entre procesos?\r\n"
					+ "a. Semáforos\r\n"
					+ "b. Colas de mensajes\r\n"
					+ "c. Conducto\r\n"
					+ "d. Bloques de memoria compartida");
			String pregunta29 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta29, "c"));
			
			System.out.println("30.  Podremos mostrar la información de los errores que ocurran durante la ejecución de nuestros procesos corresponde a…\r\n"
					+ "a. La salida estándar\r\n"
					+ "b. La salida de error\r\n"
					+ "c. La salida exception\r\n"
					+ "d. la salida estándar de error\r\n"
					+ "");
			String pregunta30 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta30, "b"));
			
			System.out.println("31. Con qué procesos contamos para leer y mostrar información:\r\n"
					+ "a. stdin, stdout, stderr\r\n"
					+ "b. str, stp, stin\r\n"
					+ "c. flush, fread, fshow, stinfo\r\n"
					+ "d. stdin, stp, sting, stinfo");
			String pregunta31 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta31, "a"));
			
			System.out.println("32. ¿Qué es el flujo OutputStream?\r\n"
					+ "a. Será el flujo de salida. Está conectado a la salida estándar del proceso\r\n"
					+ "hijo.\r\n"
					+ "b. Será el flujo de entrada. Está conectado a la entrada estándar del proceso\r\n"
					+ "hijo.\r\n"
					+ "c. Será el flujo de salida para los errores. Está conectado a la salida estándar\r\n"
					+ "de errores del proceso hijo.\r\n"
					+ "d. A y C son correctas.\r\n"
					+ "");
			String pregunta32 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta32, "a"));
			
			System.out.println("33. Los mecanismos más comunes para controlar zonas críticas cuando lanzamos más de un proceso al mismo tiempo son:\r\n"
					+ "a. Semáforos\r\n"
					+ "b. Colas de mensajes\r\n"
					+ "c. Pipes o tuberías\r\n"
					+ "d. Todas son correctas");
			String pregunta33 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta33, "d"));
			
			System.out.println("34. ¿Con qué método iniciaremos un nuevo proceso?\r\n"
					+ "a. ProcessBuilder.start()\r\n"
					+ "b. Process.builder\r\n"
					+ "c. BuildProcess.exec\r\n"
					+ "d. Start(ProcessBuilder)");
			String pregunta34 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta34, "a"));
			
			System.out.println("35. ¿Con qué método redireccionamos la salida de los errores de un proceso?\r\n"
					+ "a. exitError\r\n"
					+ "b. Error.output\r\n"
					+ "c. redirectError\r\n"
					+ "d. out.ErrorRedirect");
			String pregunta35 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta35, "c"));
			
			System.out.println("36. Para crear procesos en Java, utilizaremos la clase Process. Esta clase nos ofrece los métodos:\r\n"
					+ "a. ProcessBuilder.start(): este método inicia un un proceso nuevo y\r\n"
					+ "Runtime.exec(String[] cmdarray, String[] envp, File dir): este método\r\n"
					+ "ejecutará el comando que le especifiquemos.\r\n"
					+ "b. ProcessBuilder.start(): este método crea un un proceso nuevo y\r\n"
					+ "Runtime.exec(String[] cmdarray, String[] envp, File dir): este método ejecutará\r\n"
					+ "el comando que le especifiquemos.\r\n"
					+ "c. ProcessBuilder.start(): este método ejecutará el comando que le\r\n"
					+ "especifiquemos y Runtime.exec(String[] cmdarray, String[] envp, File dir):\r\n"
					+ "este método inicia un un proceso nuevo.\r\n"
					+ "d. ProcessBuilder: este método crea un un proceso nuevo y Runtime.exec: este\r\n"
					+ "método ejecutará el comando que le especifiquemos.\r\n"
					+ "alta velocidad, lo cual va a formar lo que conocemos como clúster\r\n"
					+ "");
			String pregunta36 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta36, "a"));
			
			System.out.println("37. En Java en el momento que necesitemos vamos a poder finalizar un proceso hijo que se haya creado, ¿Que comando utilizaremos?.\r\n"
					+ "a. destroy()\r\n"
					+ "b. delete()\r\n"
					+ "c. break()\r\n"
					+ "d. Ninguno es correcto");
			String pregunta37 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta37, "a"));
			
			System.out.println("38.  ¿Qué es el flujo InputStream?\r\n"
					+ "a. Será el flujo de salida. Está conectado a la salida estándar del proceso hijo.\r\n"
					+ "b. Será el flujo de entrada. Está conectado a la entrada estándar del\r\n"
					+ "proceso hijo.\r\n"
					+ "c. Será el flujo de salida para los errores. Está conectado a la salida estándar\r\n"
					+ "de errores del proceso hijo.\r\n"
					+ "d. A y C son correctas.\r\n"
					+ "");
			String pregunta38 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta38, "b"));
			
			System.out.println("39. ¿Cual es la palabra para que un bloque de código esté sincronizado entre varios procesos?\r\n"
					+ "a. public\r\n"
					+ "b. private\r\n"
					+ "c. synchronized\r\n"
					+ "d. Ninguna es correcta");
			String pregunta39 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta39, "c"));
			
			System.out.println("40.  ¿Cuál no es importante en un hilo?\r\n"
					+ "a. No pueden existir sin un proceso\r\n"
					+ "b. No se pueden ejecutar solos\r\n"
					+ "c. En un proceso se pueden ejecutar un hilo\r\n"
					+ "d. Las anteriores son incorrectas");
			String pregunta40 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta40, "c"));
			
			System.out.println("41. ¿Cuál o cuáles pueden considerarse una ventaja de la programación con hilos?\r\n"
					+ "a. Compartir recursos\r\n"
					+ "b. Uso eficiente y ahorro de memoria\r\n"
					+ "c. Paralelismo real\r\n"
					+ "d. Todas son correctas");
			String pregunta41 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta41, "d"));
			
			System.out.println("42. ¿Por qué no está formado un hilo?\r\n"
					+ "a. Identificador único\r\n"
					+ "b. Contador de programa\r\n"
					+ "c. Registros asociados\r\n"
					+ "d. Todas las opciones son correctas\r\n"
					+ "");
			String pregunta42 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta42, "d"));
			
			System.out.println("43. ¿Qué pueden compartir los hilos?\r\n"
					+ "a. Código a ejecutar y variables\r\n"
					+ "b. Sólo código\r\n"
					+ "c. Sólo variables\r\n"
					+ "d. Nada de lo anterior\r\n"
					+ "");
			String pregunta43 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta43, "a"));
			
			System.out.println("44. ¿Cuál no es un inconveniente de los hilos?\r\n"
					+ "a. Casi todos los lenguajes de programación soportan hilos\r\n"
					+ "b. El programador debe controlar todos los problemas de los hilos\r\n"
					+ "c. Consumen menos memoria\r\n"
					+ "d. Todo son desventajas\r\n"
					+ "");
			String pregunta44 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta44, "a"));
			
			System.out.println("45.  ¿Cuál no es un estado de un proceso?\r\n"
					+ "a. Nuevo\r\n"
					+ "b. Bloqueado\r\n"
					+ "c. Ejecución\r\n"
					+ "d. Muerte\r\n"
					+ "");
			String pregunta45 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta45, "d"));
			
			System.out.println("46. ¿Con qué clase podremos crear hilos totalmente funcionales a los que podremos asignar el código que queramos para que lo ejecuten?\r\n"
					+ "a. Thread\r\n"
					+ "b. Runnable\r\n"
					+ "c. ThreadDeath\r\n"
					+ "d. newThread\r\n"
					+ "");
			String pregunta46 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta46, "a"));
			
			System.out.println("47. ¿Con qué interfaz podremos añadir la funcionalidad de hilo a cualquier otra clase por el mero hecho de implementarla?\r\n"
					+ "a. Runnable\r\n"
					+ "b. Thread\r\n"
					+ "c. ThreadDeath\r\n"
					+ "d. ThreadGroup");
			String pregunta47 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta47, "a"));
			
			System.out.println("48.  ¿Con qué clase podremos manejar y notificar errores en el uso de las hebras Hereda de la clase Error.\r\n"
					+ "a. Runnable\r\n"
					+ "b. Thread\r\n"
					+ "c. ThreadDeath\r\n"
					+ "d. ThreadGroup");
			String pregunta48 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta48, "c"));
			
			System.out.println("49. ¿Con qué clase manejaremos un grupo de hilos de forma conjunta, haciendo que se ejecuten de una forma bastante más eficiente.?\r\n"
					+ "a. Runnable\r\n"
					+ "b. Thread\r\n"
					+ "c. ThreadDeath\r\n"
					+ "d. ThreadGroup\r\n"
					+ "");
			String pregunta49 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta49, "d"));
			
			System.out.println("50. En la clase Thread, ¿estos métodos existen?\r\n"
					+ "a. run()\r\n"
					+ "b. start()\r\n"
					+ "c. return()\r\n"
					+ "d. A y B son correctas\r\n"
					+ "");
			String pregunta50 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta50, "d"));
			
			System.out.println("51. ¿Cuál de los siguientes estados de un hilo es incorrecto?\r\n"
					+ "a. Listo\r\n"
					+ "b. Ejecutable\r\n"
					+ "c. Durmiendo\r\n"
					+ "d. Nuevo\r\n"
					+ "");
			String pregunta51 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta51, "c"));
			
			System.out.println("52. ¿Cuál de las siguientes ventajas de los hilos es incorrecta?\r\n"
					+ "a. Compartir recursos\r\n"
					+ "b. Uso eficiente de memoria\r\n"
					+ "c. capacidad de respuesta\r\n"
					+ "d. Uso eficiente de la memoria en disco");
			String pregunta52 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta52, "d"));
			
			System.out.println("53.  Mediante este método, conseguiremos que nuestro hilo «se duerma» una cierta cantidad de milisegundos:\r\n"
					+ "a. sleep()\r\n"
					+ "b. run()\r\n"
					+ "c. toSlee();\r\n"
					+ "d. Sleep();\r\n"
					+ "");
			String pregunta53 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta53, "a"));
			
			System.out.println("54.  Este método permite finalizar un hilo, pero es extremadamente peligroso utilizarlo:\r\n"
					+ "a. stop()\r\n"
					+ "b. close()\r\n"
					+ "c. Stop()\r\n"
					+ "d. wait()\r\n"
					+ "");
			String pregunta54 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta54, "a"));
			
			System.out.println("55. Los hilos que heredan de Runnable, se inician con…\r\n"
					+ "a. start()\r\n"
					+ "b. thread()\r\n"
					+ "c. join()\r\n"
					+ "d. run()\r\n"
					+ "");
			String pregunta55 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta55, "d"));
			
			System.out.println("56. ¿Con qué método conseguiremos que el hilo se quede bloqueado hasta nuevo aviso?\r\n"
					+ "a. wait()\r\n"
					+ "b. sleep()\r\n"
					+ "c. stop()\r\n"
					+ "d. isAlive()\r\n"
					+ "");
			String pregunta56 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta56, "a"));
			
			System.out.println("57.  ¿Cuál no es una constante de la clase Thread?\r\n"
					+ "a. MIN_PRIORITY\r\n"
					+ "b. MAX_PRIORITY\r\n"
					+ "c. NORM_PRORITY\r\n"
					+ "d. FIX_PRIORITY\r\n"
					+ "");
			String pregunta57 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta57, "d"));
			
			System.out.println("58.  ¿Cuál es el método que nos indica si un hilo está vivo o no?\r\n"
					+ "a. Método sleep()\r\n"
					+ "b. Método wait()\r\n"
					+ "c. Método isAlive()\r\n"
					+ "d. Método stop()\r\n"
					+ "");
			String pregunta58 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta58, "c"));
			
			System.out.println("59.  ¿Con qué método indicamos la prioridad de un hilo?\r\n"
					+ "a. getPriority()\r\n"
					+ "b. setOrder()\r\n"
					+ "c. setPriority()\r\n"
					+ "d. getOrder()\r\n"
					+ "");
			String pregunta59 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta59, "c"));
			
			System.out.println("60. . ¿Con qué parámetro damos máxima prioridad a un hilo?\r\n"
					+ "a. hilo.MAX_PRIORITY\r\n"
					+ "b. Thread.TOP_PRIORITY\r\n"
					+ "c. Thread.PRIORITY(10)\r\n"
					+ "d. Thread.MAX_PRIORITY\r\n"
					+ "");
			String pregunta60 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta60, "d"));
			
			System.out.println("61. El método start() va a realizar las siguientes tareas:\r\n"
					+ "a. Crea el método .wait()\r\n"
					+ "b. Llamar al método run() y hacer que se ejecute de forma paralela\r\n"
					+ "c. Hace referencia a la clase sleep();\r\n"
					+ "d. Reescribe el método run()");
			String pregunta61 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta61, "b"));
			
			System.out.println("62.  Mediante este método podemos finalizar un hilo, pero es muy peligroso\r\n"
					+ "a. wait()\r\n"
					+ "b. sleep()\r\n"
					+ "c. stop()\r\n"
					+ "d. read()");
			String pregunta62 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta62, "c"));
			
			System.out.println("63.  ¿Con qué método obtenemos la prioridad de un hilo?\r\n"
					+ "a. wait()\r\n"
					+ "b. getPriority()\r\n"
					+ "c. sleep()\r\n"
					+ "d. isAlive()");
			String pregunta63 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta63, "b"));
			
			System.out.println("64.  ¿Qué nivel de prioridad tiene un valor de 1?\r\n"
					+ "a. MIN_PRIORITY\r\n"
					+ "b. MAX_PRIORITY\r\n"
					+ "c. NORM_PRORITY\r\n"
					+ "d. LOW_PRIORITY\r\n"
					+ "");
			String pregunta64 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta64, "a"));
			
			System.out.println("65. Además de synchronized,para programar monitores vamos a usar los métodos:\r\n"
					+ "a. wait(),notify(),all()\r\n"
					+ "b. wait(),notify(),notifyall()\r\n"
					+ "c. wait,notifyall(),start()\r\n"
					+ "d. notify(),notifyall(),stop()\r\n"
					+ "");
			String pregunta65 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta65, "b"));
			
			System.out.println("66. Para programar con semáforos usaremos los métodos:\r\n"
					+ "a. acquire() y release()\r\n"
					+ "b. notify() y acquire()\r\n"
					+ "c. release() y aquirese()\r\n"
					+ "d. stop() y release()");
			String pregunta66 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta66, "a"));
			
			System.out.println("67. . Este bloqueo se da cuando dos hilos están cambiando continuamente de estado y\r\n"
					+ "se bloquean mutuamente\r\n"
					+ "a. Bloqueo activo\r\n"
					+ "b. Inanición\r\n"
					+ "c. Deadlock\r\n"
					+ "d. Interbloqueo\r\n"
					+ "");
			String pregunta67 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta67, "a"));
			
			System.out.println("68. ¿Cuál es el nombre del problema que se producirá cuando a un hilo se le haya\r\n"
					+ "denegado continuamente el acceso a un recurso compartido, porque otros hilos\r\n"
					+ "toman el control antes que él ?\r\n"
					+ "a. Inconsistencia de memoria:\r\n"
					+ "b. Inanición\r\n"
					+ "c. Bloqueo activo\r\n"
					+ "d. Interbloqueo");
			String pregunta68 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta68, "b"));
			
			System.out.println("69. ¿Cuál es el nombre del problema que se da cuando tenemos diferentes hilos que\r\n"
					+ "tienen una visión diferente de un mismo dato?\r\n"
					+ "a. Interbloqueo\r\n"
					+ "b. Condición de carrera\r\n"
					+ "c. Inconsistencia de memoria\r\n"
					+ "d. Bloqueo activo");
			String pregunta69 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta69, "a"));
			
			System.out.println("70. Seleccione todos los problemas que se pueden dar asociados a la sincronización\r\n"
					+ "a. Condición de salida, Deadlock y Bloqueo\r\n"
					+ "b. Condición de carrera, Inconsistencia de memoria, Inanición, Interbloqueo y Bloqueo activo\r\n"
					+ "c. Condición de carrera, Bloqueo activo y Bloqueo pasivo\r\n"
					+ "d. Condición de salida, Inconsistencia de memoria.\r\n"
					+ "");
			String pregunta70 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta70, "b"));
			
			System.out.println("71.  ¿Qué clase actuará de almacén en un problema de productor/consumidor?\r\n"
					+ "a. Storage.java\r\n"
					+ "b. Buffer.java\r\n"
					+ "c. Monitor.java\r\n"
					+ "d. Productor/Consumidor.java\r\n"
					+ "");
			String pregunta71 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta71, "b"));
			
			System.out.println("72.  ¿Que le tendremos que indicar a un semáforo para que este no sea binario?\r\n"
					+ "a. El número de hilos de la sección crítica\r\n"
					+ "b. La cantidad de procesos totales\r\n"
					+ "c. El número de milisegundos para abrir la sección de procesos\r\n"
					+ "d. El elemento que pueda obtener con el método get del buffer\r\n"
					+ "");
			String pregunta72 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta72, "a"));
			
			System.out.println("73.La inconsistencia de memoria es…\r\n"
					+ "a. Cuando dos hilos trabajan a la vez con una variable, es posible que no\r\n"
					+ "estén al tanto de los cambios que ha podido sufrir debido al trabajo del\r\n"
					+ "otro hilo\r\n"
					+ "b. Cuando dos hilos trabajan a la vez, pero con una variable cada uno, es\r\n"
					+ "posible que no estén al tanto de los cambios que ha podido sufrir debido al\r\n"
					+ "trabajo del otro hilo.\r\n"
					+ "c. Cuando dos hilos trabajan a la vez con una variable, pueden intercambiarse\r\n"
					+ "d. Ninguna es correcta\r\n"
					+ "");
			String pregunta73 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta73, "a"));
			
			System.out.println("74.  Los semáforos tienen dos métodos, el método acquire() permite:\r\n"
					+ "a. Cerrar la sección crítica y que ningún otro hilo pueda acceder a ella.\r\n"
					+ "b. Abrir la sección crítica y que otro hilo pueda acceder a ella.\r\n"
					+ "c. Abrir la sección crítica aunque ningún otro hilo pueda acceder a ella.\r\n"
					+ "d. Ninguna es correcta");
			String pregunta74 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta74, "a"));
			
			System.out.println("75.  ¿De que se encarga el buffer usando monitores en el problema del productor/consumidor?\r\n"
					+ "a. Será la encargada de consumir los elementos que se guardarán en el almacén y que el productor creará.\r\n"
					+ "b. Será la encargada de almacenar los elementos que producirá el\r\n"
					+ "productor, más adelante consumirá el consumidor en el que tendremos\r\n"
					+ "los métodos put y get.\r\n"
					+ "c. Se encargará de producir los elementos que se guardarán en el almacén y que el consumidor obtendrá.\r\n"
					+ "d. A y C son correctas.\r\n"
					+ "");
			String pregunta75 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta75, "b"));
			
			System.out.println("76.  ¿Qué nos permitirá hacer el método acquire?\r\n"
					+ "a. Nos va a permitir abrir la sección crítica y que otro hilo pueda acceder a ella.\r\n"
					+ "b. El productor no podrá introducir ningún valor hasta que el consumidor\r\n"
					+ "obtenga y consuma el valor que hay dentro del buffer.\r\n"
					+ "c. Será el encargado de introducir un elemento dentro del buffer.\r\n"
					+ "d. Nos va a permitir cerrar la sección crítica y que ningún otro hilo pueda acceder a ella.");
			String pregunta76 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta76, "d"));
			
			System.out.println("77. ¿Cuántas capas tiene el modelo OSI?\r\n"
					+ "a. 4 capas\r\n"
					+ "b. 5 capas\r\n"
					+ "c. 7 capas\r\n"
					+ "d. 8 capas");
			String pregunta77 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta77, "c"));
			
			System.out.println("78.  ¿Cuáles de estas capas no pertenecen al modelo OSI?\r\n"
					+ "a. Capa física\r\n"
					+ "b. Capa enlace\r\n"
					+ "c. Capa transporte\r\n"
					+ "d. Capa ejecución\r\n"
					+ "");
			String pregunta78 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta78, "d"));
			
			System.out.println("79. OSI. Capa que enruta las redes. Su objetivo es hacer que los datos lleguen desde su origen a su destino.\r\n"
					+ "a. Capa física\r\n"
					+ "b. Capa de enlace\r\n"
					+ "c. Capa de transporte\r\n"
					+ "d. Capa de red\r\n"
					+ "");
			String pregunta79 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta79, "d"));
			
			System.out.println("80. OSI. Su cometido pasa por mantener la conexión entre dos equipos, reanudándose en caso de interrupción.\r\n"
					+ "a. Capa física\r\n"
					+ "b. Capa de sesión\r\n"
					+ "c. Capa de transporte\r\n"
					+ "d. Capa de red");
			String pregunta80 = sc.next();
			numpreguntas++;
			System.out.println(TEST_PSP_1T.respuesta_acertada(pregunta80, "b"));
			
			TEST_PSP_1T.notas();
			
		}
}
