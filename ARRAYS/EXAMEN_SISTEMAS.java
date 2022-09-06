package ARRAYS;
import java.util.Scanner;

public class EXAMEN_SISTEMAS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int correctas = 0;
		int incorrectas = 0;
		
		System.out.println("1. Cuando un programa informático va a ser ejecutado… (T1P2)\r\n\n"
				+ "A. El sistema operativo debe realizar la carga de sus datos e instrucciones en memoria\r\n"
				+ "principal (memoria RAM o volátil)\r\n"
				+ "B. El sistema operativo debe realizar la carga de sus datos e instrucciones en el disco duro.\r\n"
				+ "C. Las dos son ciertas.\r\n"
				+ "D. Las dos son falsas.");
		String pregunta1 = sc.next();		
		if (pregunta1.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta1.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta1.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta1.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("2. ¿Cuál de estos es un l enguaje de alto nivel?: (T1P3)\r\n\n"
				+ "A. Java.\r\n"
				+ "B. C + +.\r\n"
				+ "C. C.\r\n"
				+ "D. a y b son correctas");
		
		String pregunta2 = sc.next();		
		if (pregunta2.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta2.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta2.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta2.equalsIgnoreCase("D")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		}
		
		System.out.println("3. ¿Qué permite un lenguaje de programación? (T1 P3)\r\n\n"
				+ "A. Que la máquina se comunique con el programador de una manera sencilla.\r\n"
				+ "B. Que el programador pueda comunicarse con la máquina de una manera sencilla\r\n"
				+ "C. Que la máquina se comunique con el programador de manera compleja.\r\n"
				+ "D. Todas son incorrectas.");
		
		String pregunta3 = sc.next();		
		if (pregunta3.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta3.equalsIgnoreCase("B")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta3.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta3.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("4. ¿Cuáles son las fases del proceso de compilación? (T1P4)\r\n\n"
				+ "A. Análisis sintáctico, Análisis léxico, Análisis semántico.\r\n"
				+ "B. X Análisis léxico, Análisis sintáctico, Análisis semántico, Generación de código intermedio\r\n"
				+ "C. Análisis léxico, Análisis semántico, Generación de código intermedio.\r\n"
				+ "D. Análisis léxico, Análisis sintáctico, Generación de código intermedio.");
		
		String pregunta4 = sc.next();		
		if (pregunta4.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta4.equalsIgnoreCase("B")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta4.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta4.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("5. ¿Cuál es el rol del analista de sistema en el desarrollo del software? (T2P6)\r\n\n"
				+ "A. Es el individuo que posee mayor dominio de l a programación centrándose más en los\r\n"
				+ "detalles del proyecto.\r\n"
				+ "B. Se trata de un perfil híbrido que permite unir el proceso de desarrollo, pues es el encargado\r\n"
				+ "de conocer e i nvestigar los entornos de desarrollo, frameworks y tecnologías diferentes.\r\n"
				+ "C. Es el encargado de realizar el estudio del sistema para llevar a cabo la resolución del\r\n"
				+ "problema y garantizar que se cumplen las expectativas del cliente. Interviene principalmente\r\n"
				+ "en la fase de análisis\r\n"
				+ "D. Es el encargado de realizar el diseño del sistema que se va a implementar trabajando\r\n"
				+ "principalmente en la fase de diseño.");
		
		
		String pregunta5 = sc.next();
		if (pregunta5.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta5.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta5.equalsIgnoreCase("C")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta5.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("6. ¿En qué se basa la fase de diseño en el desarrollo del software? (T2P3)\r\n\n"
				+ "A. En esta fase nos centraremos en codificar todo lo diseñado previamente para tener una\r\n"
				+ "primera aproximación al software.\r\n"
				+ "B. En esta fase es recomendable definir todas las funcionalidades de manera general que va\r\n"
				+ "a tener la aplicación. El objetivo es poder identificar todos aquellos recursos del sistema,\r\n"
				+ "físicos, lógicos, etc. que serán necesarios para poder desarrollar la aplicación\r\n"
				+ "C. En esta parte del proceso, es necesario dejar preparado t odo el software para poder ser\r\n"
				+ "lanzado a un entorno real para trabajar con usuarios reales y de esta forma entregarlo al\r\n"
				+ "cliente.\r\n"
				+ "D. En esta fase es necesario dejar por escrito t odas las decisiones tomadas durante el\r\n"
				+ "desarrollo para facilitar el posterior mantenimiento de la aplicación.");
		
		String pregunta6 = sc.next();		
		if (pregunta6.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta6.equalsIgnoreCase("B")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta6.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta6.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("7. ¿Cuáles son las metodologías del desarrollo software? (T2P5)\r\n\n"
				+ "A. Metodología de álgebra, Metodología rápida, Metodología redonda.\r\n"
				+ "B. Metodología de desarrollo en cascada, Metodología de desarrollo en espiral, Metodología\r\n"
				+ "ágil\r\n"
				+ "C. Metodología de desarrollo gamificación, Metodología de desarrollo basado en problemas,"
				+ "Metodología de desarrollo Design Thinking.\r\n"
				+ "D. Ninguna es correcta");
		
		String pregunta7 = sc.next();		
		if (pregunta7.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta7.equalsIgnoreCase("B")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta7.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta7.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("8. ¿En qué consiste la fase “Implementación”? (T2P3)\r\n\n"
				+ "A. Identifica posibles errores que hayamos cometido a la hora de desarrollar.\r\n"
				+ "B. Se crea un diagrama sencillo en el que especificamos cada uno de los requisitos que nos\r\n"
				+ "ha i ndicado el cliente.\r\n"
				+ "C. Se deja por escrito todas las decisiones tomadas durante el desarrollo para facilitar el\r\n"
				+ "posterior mantenimiento de la aplicación.\r\n"
				+ "D. Nos centramos en codificar todo lo diseñado previamente para tener una primera\r\n"
				+ "aproximación al software");
		
		String pregunta8 = sc.next();		
		if (pregunta8.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta8.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta8.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta8.equalsIgnoreCase("D")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		}
		
		
		System.out.println("9. ¿Cuál de estas NO es una metodología de desarrollo software?\r\n\n"
				+ "A. Metodologías ágiles.\r\n"
				+ "B. Metodología de desarrollo en cascada.\r\n"
				+ "C. Metodologías de desarrollo circular\r\n"
				+ "D. Metodología de desarrollo en espiral.");
		
		String pregunta9 = sc.next();
		if (pregunta9.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta9.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta9.equalsIgnoreCase("C")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta9.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("10. Un lenguaje de programación está formado por: (T3P3)\r\n\n"
				+ "A. Planteamiento, Nudo y Desenlace.\r\n"
				+ "B. Introducción, Nudo y Conclusión.\r\n"
				+ "C. Léxico, Sintaxis y Reglas Semánticas\r\n"
				+ "D. Ninguna es correcta.");
		
		
		String pregunta10 = sc.next();
		if (pregunta10.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta10.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta10.equalsIgnoreCase("C")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta10.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("11. Un depurador…(T3P4).\r\n\n"
				+ "A. Es una herramienta que permite traducir a un lenguaje que pueda comprender la máquina.\r\n"
				+ "B. Es una herramienta que permite ver el contenido de las variables y el flujo de ejecución\r\n"
				+ "del programa en tiempo real\r\n"
				+ "C. Es una herramienta encargada de realizar el estudio del sistema.\r\n"
				+ "D. Es una herramienta que permite reutilizar código.");
		
		String pregunta11 = sc.next();		
		if (pregunta11.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta11.equalsIgnoreCase("B")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta11.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta11.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("12. ¿Qué permite la reutilización de código?(T3P6).\r\n\n"
				+ "A. Ahorrar tiempo y recursos en el desarrollo de una solución software y llegar antes al\r\n"
				+ "mercado.\r\n"
				+ "B. Puede requerir la creación de componentes reutilizables e independientes.\r\n"
				+ "C. Reutilizar partes de un programa que ya han sido escritas.\r\n"
				+ "D. Todas son correctas");
		
		String pregunta12 = sc.next();		
		if (pregunta12.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta12.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta12.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta12.equalsIgnoreCase("D")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		}
		
		System.out.println("13. ¿Que es un lenguaje compilado? (T3P3)\r\n\n"
				+ "A. Aquellos que requieren un i ntérprete.\r\n"
				+ "B. Aquellos que se ejecutan con el bloc de notas.\r\n"
				+ "C. Aquellos que requieren un compilador\r\n"
				+ "D. Cualquier opción vale para ejecutar un programa en l enguaje compilado.");
		
		String pregunta13 = sc.next();
		if (pregunta13.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta13.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta13.equalsIgnoreCase("C")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta13.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("14. ¿Cómo podemos garantizar la reutilización de código? (T3P6)\r\n\n"
				+ "A. Mediante entornos de desarrollo especializados.\r\n"
				+ "B. Mediante la creación de software personalizado.\r\n"
				+ "C. Mediante funciones y/o procedimientos\r\n"
				+ "D. Con la creación de componentes de seguridad i nformáticos.");
		
		String pregunta14 = sc.next();
		if (pregunta14.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta14.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta14.equalsIgnoreCase("C")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta14.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("15. Con el fin de facilitar el desarrollo.. (T4P9)\r\n\n"
				+ "A. Muchos IDES incluyen una interfaz gráfica muy potente\r\n"
				+ "B. Ningún IDE i ncluye interfaz gráfica.\r\n"
				+ "C. Algunos IDES incluyen una interfaz gráfica muy potente.\r\n"
				+ "D. Ninguna es correcta.");
		
		
		
		String pregunta15 = sc.next();		
		if (pregunta15.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta15.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta15.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta15.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("16. ¿Siempre han existido los IDES? (T4P3)\r\n\n"
				+ "A. Sí.\r\n"
				+ "B. No, pues tienen una gran dependencia del sistema operativo sobre el que se van a\r\n"
				+ "ejecutar\r\n"
				+ "C. Desde hace unos años.\r\n"
				+ "D. Ninguna es correcta.");
		
		String pregunta16 = sc.next();		
		if (pregunta16.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta16.equalsIgnoreCase("B")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta16.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta16.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		
		System.out.println("17. ¿Qué dimensiones se utilizan para diferenciar los tipos de IDE?(T4P5)\r\n\n"
				+ "A. Nº de lenguajes soportados,sistemas operativos soportados,automatización, rendimiento.\r\n"
				+ "B. Nº de lenguajes soportados,sistemas operativos soportados, rendimiento.\r\n"
				+ "C. Sistemas operativos soportados,automatización, rendimiento.\r\n"
				+ "D. Nº de lenguajes soportados,sistemas operativos soportados,automatización,\r\n"
				+ "rendimiento,plugins y extensiones, pago por uso");
		
		String pregunta17 = sc.next();		
		if (pregunta17.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta17.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta17.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta17.equalsIgnoreCase("D")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		}
		
		System.out.println("18. ¿Que se usaba para programar en sus inicios?(T4P2.1)\r\n\n"
				+ "A. Tarjetas perforadas\r\n"
				+ "B. Discos magnéticos.\r\n"
				+ "C. Discos mecánicos.\r\n"
				+ "D. Tarjetas SD.");
		String pregunta18 = sc.next();		
		if (pregunta18.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta18.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta18.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta18.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("19. Con el fin de facilitar el desarrollo, muchos IDEs incluyen una interfaz gráfica muy\r\n"
				+ "potente capaz de… (T4P2)\r\n\n"
				+ "A. diseñado y desarrollado en muchas ocasiones principalmente por desarrolladores.\r\n"
				+ "B.  incluir muchas funcionalidades al alcance de l os desarrolladores a través de una interfaz\r\n"
				+ "gráfica o GUI\r\n"
				+ "C. añadir pequeñas funcionalidades al núcleo original a través de plugins.\r\n"
				+ "D. compartir sus propias abreviaturas de código para mejorar el autocompletado.");
		
		String pregunta19 = sc.next();		
		if (pregunta19.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta19.equalsIgnoreCase("B")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta19.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta19.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("20. Selecciona la I NCORRECTA (T4P4)\r\n\n"
				+ "A. Los IDEs ofrecen una i nterfaz para crear y modificar el código existente a través de\r\n"
				+ "su editor inteligente.\r\n"
				+ "B. Una de las características más relevantes de los IDEs es la posibilidad de poder\r\n"
				+ "informar al programador de l os errores cometidos durante el propio desarrollo.\r\n"
				+ "C. Desde el punto de vista de una empresa, interesa que los programadores sean menos\r\n"
				+ "efectivos\r\n"
				+ "D. Los IDEs ofrecen una interfaz para crear y modificar el código existente a través de\r\n"
				+ "su editor i nteligente.");
		String pregunta20 = sc.next();
		if (pregunta20.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta20.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta20.equalsIgnoreCase("C")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta20.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("21. ¿Cuál de estos IDE es exclusivo de Apple para desarrollo de aplicaciones en Mac Os\r\n"
				+ "y I Phone? (T5P4)\r\n\n"
				+ "A. Visual studio code.\r\n"
				+ "B. Android Studio.\r\n"
				+ "C. XCode\r\n"
				+ "D. Eclipse.");
		
		String pregunta21 = sc.next();
		if (pregunta21.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta21.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta21.equalsIgnoreCase("C")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta21.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		System.out.println("22. Para qué sirve una herramienta CASE? (T5P6)\r\n\n"
				+ "A. Estas herramientas pueden ayudar en todo el ciclo de vida del software en tareas\r\n"
				+ "relacionadas con el diseño, implementación automática del código, detección de errores, etc\r\n"
				+ "B. Estas herramientas pueden ayudar con la implementación automática del código.\r\n"
				+ "C. Estas herramientas pueden ayudar con detección de errores.\r\n"
				+ "D. Estas herramientas solo funcionan como repositorios.");
		
		String pregunta22 = sc.next();		
		if (pregunta22.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta22.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta22.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta22.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		System.out.println("23. Un IDE:\r\n\n"
				+ "A. No necesita de módulos adicionales para funcionar.\r\n"
				+ "B. Precisa de módulos adicionales para el correcto funcionamiento\r\n"
				+ "C. Posee una licencia de pago.\r\n"
				+ "D. La Primera y Segunda son correctas.");
		
		String pregunta23 = sc.next();		
		if (pregunta23.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta23.equalsIgnoreCase("B")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta23.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta23.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("24. Es un editor de código fuente desarrollado por Microsoft:\r\n\n"
				+ "A. Visual Studio Code (VSC)\r\n"
				+ "B. Coda.\r\n"
				+ "C. Notepad + +.\r\n"
				+ "D. Java.");
		String pregunta24 = sc.next();		
		if (pregunta24.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta24.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta24.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta24.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("25. ¿Cual NO es un lenguaje de programación?\r\n\n"
				+ "A. Lemerig\r\n"
				+ "B. C++.\r\n"
				+ "C. Python.\r\n"
				+ "D. Java.");
		String pregunta25 = sc.next();		
		if (pregunta25.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta25.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta25.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta25.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("26. ¿Cuáles no son aplicaciones UML?(T6P5)\r\n\n"
				+ "A. Rational Rose.\r\n"
				+ "B. Star UML.\r\n"
				+ "C. Visual Paradigm.\r\n"
				+ "D. Sans UML");
		
		String pregunta26 = sc.next();		
		if (pregunta26.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta26.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta26.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta26.equalsIgnoreCase("D")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		}
		System.out.println("27. ¿Cúal de los diagramas de UML es incorrecta?(T6P6)\r\n\n"
				+ "A. De uso.\r\n"
				+ "B. De clases.\r\n"
				+ "C. De componentes.\r\n"
				+ "D. De inestado");
		String pregunta27 = sc.next();		
		if (pregunta27.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta27.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta27.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta27.equalsIgnoreCase("D")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		}
		
		System.out.println("28. ¿Que es un UML?(T6P4)\r\n\n"
				+ "A. Es un lenguaje estándar que permite el modelado de objetos existentes en el mundo real\r\n"
				+ "para ser utilizado en una metodología orientada a objetos\r\n"
				+ "B. Es un formato específico de Visual Paradigm.\r\n"
				+ "C. Es una plug-in de Visual Studio que permite ver las modificaciones del codigo en tiempo\r\n"
				+ "real.\r\n"
				+ "D. Es un programa dedicado a la creación de estructuras de bases de datos.");
		
		String pregunta28 = sc.next();		
		if (pregunta28.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta28.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta28.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta28.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("29. ¿Cual herramienta de UML se puede incorporar a Eclipse de forma gratuita?(T6P6)\r\n\n"
				+ "A. Rational Rose.\r\n"
				+ "B. StarUML.\r\n"
				+ "C. ResTrucaUML.\r\n"
				+ "D. Papyrys UML");
		
		String pregunta29 = sc.next();		
		if (pregunta29.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta29.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta29.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta29.equalsIgnoreCase("D")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		}

		System.out.println("30. ¿Cuál es el diagrama que permite indicar con detalle el comportamiento que debe\r\n"
				+ "tener el sistema desde el punto de vista del usuario? (T6P6)\r\n\n"
				+ "A. Diagrama de casos de uso\r\n"
				+ "B. Diagramas de secuencia.\r\n"
				+ "C. Diagrama de clases.\r\n"
				+ "D. Diagramas de colaboración.");
		
		String pregunta30 = sc.next();		
		if (pregunta1.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta30.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta30.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta30.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("31. ¿Cuál es el diagrama que muestra la  secuencia de estados por la que pasa un\r\n"
				+ "objeto a lo largo de sus interacciones y su tiempo de vida?(T6P6)\r\n\n"
				+ "A. Diagramas de estado\r\n"
				+ "B. Diagramas de componentes.\r\n"
				+ "C. Diagramas de despliegue.\r\n"
				+ "D. Diagramas de colaboración.");
		String pregunta31 = sc.next();		
		if (pregunta1.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta31.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta31.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta31.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		System.out.println("32. ¿Qué es la ingeniería inversa? (T7P1)\r\n\n"
				+ "A. Es un campo de hardware que permite obtener el código fuente original a partir del código\r\n"
				+ "ejecutable o binario.\r\n"
				+ "B. Es un campo de software que permite obtener el código fuente original a partir del código\r\n"
				+ "ejecutable o binario\r\n"
				+ "C. Es un campo de software que permite obtener el código ejecutable o binario a partir del\r\n"
				+ "código fuente original.\r\n"
				+ "D. Es un campo de hardware que permite obtener el código ejecutable o binario a partir del\r\n"
				+ "código f uente original.");
		String pregunta32 = sc.next();		
		if (pregunta32.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta32.equalsIgnoreCase("B")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta32.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta32.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		System.out.println("33. ¿Cuál de ellas no es una relación entre clases?(T7P5)\r\n\n"
				+ "A. Asociación.\r\n"
				+ "B. Herencia.\r\n"
				+ "C. Protegido\r\n"
				+ "D. Dependencia.");
		
		String pregunta33 = sc.next();
		if (pregunta33.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta33.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta33.equalsIgnoreCase("C")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta33.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("34. Cual de ellas no es una herramienta que puede facilitar la creación de\r\n"
				+ "diagramas.(T7P5)\r\n\n"
				+ "A. Microsoft Vision.\r\n"
				+ "B.  Visual Studio\r\n"
				+ "C. StarUML.\r\n"
				+ "D. Rational Rose");
		String pregunta34 = sc.next();		
		if (pregunta34.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta34.equalsIgnoreCase("B")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta34.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta34.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("35. ¿Qué es UML? (T7P3)\r\n\n"
				+ "A. Lenguaje estándar para modelado de soluciones orientadas a programas.\r\n"
				+ "B. Lenguaje estándar para modelado de problemas orientados a programas.\r\n"
				+ "C. Lenguaje estándar para modelado de soluciones orientadas a objetos\r\n"
				+ "D. Lenguaje poco utilizado para modelado de soluciones orientadas a programas.");
		
		String pregunta35 = sc.next();
		if (pregunta35.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta35.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta35.equalsIgnoreCase("C")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta35.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("36. ¿Qué relación no pertenece a la relación entre clases?(T7,P5)\r\n\n"
				+ "A. Asociación.\r\n"
				+ "B. Composición.\r\n"
				+ "C. Métodos\r\n"
				+ "D. Herencia.");
		String pregunta36 = sc.next();
		if (pregunta36.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta36.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta36.equalsIgnoreCase("C")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta36.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		System.out.println("37. La herencia es:( t7,p5)\r\n\n"
				+ "A. Es la relación más sencilla que podemos encontrar un diagrama de clase. No posee un\r\n"
				+ "tipo definido y se representa mediante una flecha simple\r\n"
				+ "B. Permite definir las clases que pueden intervenir en nuestra clase para componerla. Se\r\n"
				+ "representa mediante una flecha con un rombo que apunta hacia la composición.\r\n"
				+ "C. Permite indicar que una clase usa otra, por lo que es necesario disponer de la\r\n"
				+ "primera para usar la nueva.\r\n"
				+ "D. Permite establecer una jerarquía de clases. Se representa mediante una línea con\r\n"
				+ "una punta triangular vacía.");
		String pregunta37 = sc.next();		
		if (pregunta7.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta37.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta37.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta37.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		double nota = ((correctas - (incorrectas / 3)) * 10) / 37;

		System.out.println("\nHas acertado " + correctas + " preguntas.\n" + "Has fallado " + incorrectas
				+ " preguntas.\n" + "Nota: " + nota);


}
}
