package TESTS_EXAMENES;
import java.util.Scanner;

public class TESTLENGUAJEMARCAS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int correctas = 0;
		int incorrectas = 0;
		double nota = (correctas - (incorrectas/3)) *10 /35;
		
		System.out.println("1. ¿Cuál de las siguientes no es una herramienta de edición?\r\n\n"
				+ "A. Bloc de notas\r\n"
				+ "B. Notepad++\r\n"
				+ "C. Visual Paradigm\r\n"
				+ "D. Visual studio code");
		
		String pregunta1 = sc.next();		
		if (pregunta1.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta1.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta1.equalsIgnoreCase("C")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta1.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("2. Elige el verdadero\r\n\n"
				+ "a. Una de las ventajas con de XML respecto a HTML es que no está\r\n"
				+ "limitado a un número concreto de etiquetas\r\n"
				+ "b. XML surge de la simplificación de SGML\r\n"
				+ "c. Ambos son verdaderos\r\n"
				+ "d. Solo el segundo es verdadero");
		String pregunta2 = sc.next();
		if (pregunta2.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta2.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta2.equalsIgnoreCase("C")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta2.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("3. ¿Cómo se define generalmente una marca?\r\n\n"
				+ "a. <nombre> y </nombre>\r\n"
				+ "b. <nombre>\r\n"
				+ "c. </nombre>\r\n"
				+ "d. <nombre> y <nombre>");
		String pregunta3 = sc.next();		
		if (pregunta3.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta3.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta3.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta3.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("4. Partes de un documento XML\r\n\n"
				+ "a. Prólogo y pie\r\n"
				+ "b. Cabecera y cuerpo\r\n"
				+ "c. Prólogo y cuerpo\r\n"
				+ "d. Ninguna es correcta");
		String pregunta4 = sc.next();
		if (pregunta4.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta4.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta4.equalsIgnoreCase("C")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta4.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("5. ¿Cuál es el origen de HTML?\r\n\n"
				+ "a. HTML\r\n"
				+ "b. XML\r\n"
				+ "c. XHTML\r\n"
				+ "d. GML");
		
		String pregunta5 = sc.next();		
		if (pregunta5.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta5.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta5.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta5.equalsIgnoreCase("D")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		}
		
		System.out.println("6. ¿En qué año se publicó HTML5?\r\n\n"
				+ "a. 2010\r\n"
				+ "b. 2012\r\n"
				+ "c. 2014\r\n"
				+ "d. Ninguna es correcta");
		String pregunta6 = sc.next();
		if (pregunta6.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta6.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta6.equalsIgnoreCase("C")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta6.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("7. ¿Cuántas versiones XHTML hay actualmente?\r\n\n"
				+ "a. Hay 1 única versión\r\n"
				+ "b. Hay 3 versiones\r\n"
				+ "c. Hay 2 versiones\r\n"
				+ "d. Más de 4 versiones");
		
		String pregunta7 = sc.next();
		if (pregunta7.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta7.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta7.equalsIgnoreCase("C")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta7.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("8. ¿Cuál es una aplicación de validación XML?\r\n\n"
				+ "a. XML Copy\r\n"
				+ "b. XML Validator\r\n"
				+ "c. XML Editor\r\n"
				+ "d. XML Copy Editor");
		
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
		
		System.out.println("9. ¿Cuál de las siguientes etiquetas no necesita cierre?\n\n"
				+ "a. <p>\r\n"
				+ "b. <h2>\r\n"
				+ "c. <img>\r\n"
				+ "d. <body>");
		
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
		
		System.out.println("10. Los elementos de HTML se pueden clasificar en:\r\n\n"
				+ "a. en línea\r\n"
				+ "b. de bloque\r\n"
				+ "c. de conjunto\r\n"
				+ "d. a y b son correctas");
		String pregunta10 = sc.next();		
		if (pregunta10.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta10.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta10.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta10.equalsIgnoreCase("D")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		}
		
		System.out.println("11. Etiqueta y función del separador:\r\n\n"
				+ "a. <div> Esta etiqueta nos va a permitir agrupar otros elementos HTML\r\n"
				+ "(párrafos, tablas, otras divisiones, etc.) para crear una agrupación mayor. A\r\n"
				+ "las divisiones también se les suele llamar capas.\r\n"
				+ "b. <hr> Esta etiqueta nos va a permitir agrupar otros elementos HTML\r\n"
				+ "(párrafos, tablas, otras divisiones, etc.) para crear una agrupación mayor. A\r\n"
				+ "las divisiones también se les suele llamar capas.\r\n"
				+ "c. <div> Nos permite separar elementos con una línea horizontal. No es\r\n"
				+ "necesario etiqueta de cierre.\r\n"
				+ "d. <hr> Nos permite separar elementos con una línea horizontal. No es\r\n"
				+ "necesario etiqueta de cierre.");
		String pregunta11 = sc.next();		
		if (pregunta11.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta11.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta11.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta11.equalsIgnoreCase("D")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		}
		
		System.out.println("12. ¿Cuál es la estructura HTML?\r\n\n"
				+ "a. <html>,<head></head>,<body></body>,</html>\r\n"
				+ "b. <html>,<header></header>,<body></body>,</html>\r\n"
				+ "c. <doctype html>,<head></head>,<body></body>,</doctype html>\r\n"
				+ "d. <doctype html>,<header></header>,<body></body>,</doctype html>");
		String pregunta12 = sc.next();		
		if (pregunta12.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta12.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta12.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta12.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("13. ¿Qué etiqueta permite incluir una línea horizontal?\n\n"
				+ "a. <hr>\r\n"
				+ "b. <b>\r\n"
				+ "c. <br>\r\n"
				+ "d. Ninguna es correcta");
		String pregunta13 = sc.next();		
		if (pregunta13.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta13.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta13.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta13.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("14. ¿Qué etiqueta nos permite agrupar diferentes elementos HTML?\r\n\n"
				+ "a. <div>\r\n"
				+ "b. <body>\r\n"
				+ "c. <figure>\r\n"
				+ "d. <figcaption>");
		
		String pregunta14 = sc.next();		
		if (pregunta14.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta14.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta14.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta14.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("15. La etiqueta <meta>\r\n\n"
				+ "a. Define metadatos que no se pueden crear con otras etiquetas de HTML\r\n"
				+ "b. Define metadatos que si se pueden crear con otras etiquetas de HTML\r\n"
				+ "c. Define metadatos que no se pueden crear con otras etiquetas de XML\r\n"
				+ "d. Define metadatos que no se pueden crear con otras etiquetas de CSS");
		
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
		
		System.out.println("16. La etiqueta de las listas ordenadas es…\r\n\n"
				+ "a. <ul>\r\n"
				+ "b. <ol>\r\n"
				+ "c. <dl>\r\n"
				+ "d. <rl>");
		
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
		
		System.out.println("17. La etiqueta <src>\r\n\n"
				+ "a. nos permite incluir imágenes en la página web. Dicha imagen puede\r\n"
				+ "ser vectorial o de mapa de bits.\r\n"
				+ "b. introduce texto alternativo cuando no se pueda mostrar la imagen en el\r\n"
				+ "navegador.\r\n"
				+ "c. se indica dónde se encuentra el fichero externo. Puede\r\n"
				+ "tratarse de un fichero local o de una dirección web\r\n"
				+ "d. nos va a permitir incluir un documento HTML dentro de otro\r\n"
				+ "documento HTML.");
		String pregunta17 = sc.next();
		if (pregunta17.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta17.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta17.equalsIgnoreCase("C")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta17.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("18. ¿Cuál es la marca de tachado en HTML?\r\n\n"
				+ "a. <br>\r\n"
				+ "b. <em>,</em>\r\n"
				+ "c. <s>,</s>\r\n"
				+ "d. <i>,</i>");
		String pregunta18 = sc.next();
		if (pregunta18.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta18.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta18.equalsIgnoreCase("C")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta18.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("19. ¿Qué etiqueta permite resaltar un texto normalmente en amarillo?\r\n\n"
				+ "a. <div>\r\n"
				+ "b. <mark>\r\n"
				+ "c. <style>\r\n"
				+ "d. Ninguna de las anteriores");
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
		
		System.out.println("20. ¿Cómo se define una lista ordenada?\r\n\n"
				+ "a. <ol> <il> </il> <il> </il> </ol>\r\n"
				+ "b. <ol> <li> </li> <li> </li> </ol>\r\n"
				+ "c. <il> <ol> </ol> <ol> </ol> </il>\r\n"
				+ "d. <ul> <il> </il> <il> </il> </ul>");
		String pregunta20 = sc.next();		
		if (pregunta20.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta20.equalsIgnoreCase("B")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta20.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta20.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("21. ¿Qué etiqueta identifica al control de manera única?\r\n\n"
				+ "A. name\r\n"
				+ "B. required\r\n"
				+ "C. size\r\n"
				+ "D. maxlength");
		
		String pregunta21 = sc.next();		
		if (pregunta21.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta21.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta21.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta21.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("22. ¿Qué atributo une celdas de manera horizontal en una tabla?\r\n\n"
				+ "a. rowspan\r\n"
				+ "b. colspan\r\n"
				+ "c. tr\r\n"
				+ "d. Ninguna es correcta");
		
		String pregunta22 = sc.next();		
		if (pregunta22.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta22.equalsIgnoreCase("B")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta22.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta22.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("23. ¿En qué se diferencian Colspan y Colgroup?\r\n\n"
				+ "a. Son iguales, son de HTML 4.0 y 5.0, respectivamente.\r\n"
				+ "b. Colgroup agrupa columnas y colspan las une.\r\n"
				+ "c. Colspan está en desuso.\r\n"
				+ "d. Ninguna de las anteriores son correctas.");
		
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
		
		System.out.println("24. ¿Que etiquetas usaremos para mostrar una lista desplegable?\r\n\n"
				+ "a. <desplegableList></desplegableList> + <options></options>\r\n"
				+ "b. <hr></hr> + <br></br>\r\n"
				+ "c. <select></select> + <option></option>\r\n"
				+ "d. <fieldset></fieldset> + <legend></legend>");
		
		String pregunta24 = sc.next();
		if (pregunta24.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta24.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta24.equalsIgnoreCase("C")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta24.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("25. Para unir las filas en una tabla tenemos que usar el atributo…\r\n\n"
				+ "a. spanrow\r\n"
				+ "b. colspan\r\n"
				+ "c. colgroup\r\n"
				+ "d. rowspan");
		String pregunta25 = sc.next();		
		if (pregunta25.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta25.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta25.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta25.equalsIgnoreCase("D")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		}
		
		System.out.println("26. ¿Cual de estos atributos de los input, es el impostor?\r\n\n"
				+ "a. pattern\r\n"
				+ "b. autocomplete\r\n"
				+ "c. color\r\n"
				+ "d. multiple");
		
		String pregunta26 = sc.next();
		if (pregunta26.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta26.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta26.equalsIgnoreCase("C")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta26.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("27. ¿Como atributo usaremos para usar una pista en una entrada de texto?\r\n\n"
				+ "a. step\r\n"
				+ "b. autocomplete\r\n"
				+ "c. placeholder\r\n"
				+ "d. controls");
		String pregunta27 = sc.next();
		if (pregunta27.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta27.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta27.equalsIgnoreCase("C")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta27.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("28. ¿Cómo agregamos un comentario de pie de página?\r\n\n"
				+ "a. <comment>\r\n"
				+ "b. <footer>\r\n"
				+ "c. <insert>\r\n"
				+ "d. <p>");
		String pregunta28 = sc.next();		
		if (pregunta28.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta28.equalsIgnoreCase("B")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta28.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta28.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("29. Qué atributo muestra un calendario para elegir fecha?\r\n"
				+ "a. date\r\n"
				+ "b. time\r\n"
				+ "c. number\r\n"
				+ "d. email");
		String pregunta29 = sc.next();		
		if (pregunta29.equalsIgnoreCase("A")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta29.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta29.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta29.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("30. Cuando queremos usar la etiqueta <audio> en nuestra página web, podemos\r\n\n"
				+ "acompañarla de atributos como:\r\n"
				+ "a. Preload\r\n"
				+ "b. Autoplay\r\n"
				+ "c. a y b son correctas\r\n"
				+ "d. Ninguna de las anteriores son correctas");
		
		String pregunta30 = sc.next();		
		if (pregunta30.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta30.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta30.equalsIgnoreCase("C")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		} else if (pregunta30.equalsIgnoreCase("D")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		}
		
		System.out.println("31. ¿Cómo agregar elementos de CSS a HTML?\r\n"
				+ "a. En el propio elemento HTML\r\n"
				+ "b. En el documento HTML\r\n"
				+ "c. En un fichero externo\r\n"
				+ "d. Todos los anteriores");
		
		String pregunta31 = sc.next();		
		if (pregunta31.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta31.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta31.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta31.equalsIgnoreCase("D")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		}
		
		System.out.println("32. Qué elemento no pertenece a la sintaxis de un elemento CSS:\r\n"
				+ "A. Selector.\r\n"
				+ "B. Propiedad.\r\n"
				+ "C. Valor.\r\n"
				+ "D. href");
		
		String pregunta32 = sc.next();		
		if (pregunta32.equalsIgnoreCase("A")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta32.equalsIgnoreCase("B")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta32.equalsIgnoreCase("C")) {
			System.out.println("Respuesta incorrecta.\n");
			incorrectas +=1;
		} else if (pregunta32.equalsIgnoreCase("D")) {
			System.out.println("Respuesta correcta.\n");
			correctas +=1;
		}
		
		System.out.println("33. ¿Todos los navegadores son compatibles con la sintaxis de CSS?\r\n"
				+ "a. Si, son totalmente compatibles\r\n"
				+ "b. No, hay que poner una sintaxis específica para todos los navegadores\r\n"
				+ "c. Solo hay que poner una sintaxis específica para algunos navegadores\r\n"
				+ "d. Sí, pero en el inicio del CSS hay que poner el navegador a usar.");
		
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
		
		System.out.println("34. Si en una etiqueta del html tenemos id =”color1” y class=”color1”, ¿Como\r\n\n"
				+ "puedo aplicarles estilo en el css?\r\n"
				+ "a. /color1{} y \\color1{} respectivamente\r\n"
				+ "b. #color1 {} y .color1{} respectivamente\r\n"
				+ "c. $color1{} y &color1{} respectivamente\r\n"
				+ "d. ()color1{} !color1 {} respectivamente");
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
		
		System.out.println("35. ¿Cuál es el identificador de mayor preferencia?\r\n\n"
				+ "a. #\r\n"
				+ "b. >\r\n"
				+ "c. .\r\n"
				+ "d. <");
		
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
		
		System.out.println("\nHas acertado " + correctas + " preguntas.\n"
				+ "Has fallado " + incorrectas + " preguntas.\n"
				+ "Nota: " + nota);
		
		sc.close();
	}

}
