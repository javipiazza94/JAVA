package TEST;

import java.util.Scanner;

public class TEST_DI_2T {
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
		
		System.out.println("1. ¿Qué formato se aconseja para enviar por correo electrónico un informe\r\n"
				+ "JasperReport?\r\n"
				+ "a. PDF\r\n"
				+ "b. CSV Metadata\r\n"
				+ "c. JSON Metadata\r\n"
				+ "d. XML with Images\r\n"
				+ "");
		String pregunta1 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta1, "A"));
		
		System.out.println("2. ¿Cuál de estos no es un elemento de estructura de una plantilla de informe?\r\n"
				+ "a. Title\r\n"
				+ "b. Page Header.\r\n"
				+ "c. Column Header.\r\n"
				+ "d. Todas son correctas.");
		String pregunta2 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta2, "D"));
		
		System.out.println("3. ¿Qué tipo de variables son las “Variables de usuario”?\r\n"
				+ "a. Variables que puede crear el usuario.\r\n"
				+ "b. Aparecen por defecto en la herramienta.\r\n"
				+ "c. Numeran las líneas contenidas en un informe.\r\n"
				+ "d. Se utilizan sobre los valores contenidos.");
		String pregunta3 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta3, "A"));
		
		System.out.println("4. ¿Cuál de las siguientes no es una variable predefinida?\r\n"
				+ "a. Page_Number\r\n"
				+ "b. Column_Number\r\n"
				+ "c. Report_Number\r\n"
				+ "d. Page_Count\r\n"
				+ "");
		String pregunta4 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta4, "C"));
		
		System.out.println("5. Herramientas más utilizadas a la hora de elaborar informes integradas en el IDE.\r\n"
				+ "a. iReport+Jasper Report\r\n"
				+ "b. Eclipse Birth\r\n"
				+ "c. Sapphire Report\r\n"
				+ "d. Visual Paradigm");
		String pregunta5 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta5, "A"));
		
		System.out.println("6. ¿De qué parte no consta una sentencia SELECT?\r\n"
				+ "a. SELECT\r\n"
				+ "b. FROM\r\n"
				+ "c. WHERE\r\n"
				+ "d. NOT HAVING");
		String pregunta6 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta6, "D"));
		
		System.out.println("7. Esta herramienta de inteligencia empresarial se utiliza para crear informes de\r\n"
				+ "forma dinámica, sobre todo, en el entorno de desarrollo Microsoft Visual Studio:\r\n"
				+ "a. Crystal report\r\n"
				+ "b. Eclipse\r\n"
				+ "c. Eclipse Birth\r\n"
				+ "d. CSV Metadata");
		String pregunta7 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta7, "A"));
		
		System.out.println("8. ¿Que es un subinforme?\r\n"
				+ "a. Un informe dentro de un informe\r\n"
				+ "b. Un informe dentro de una tabla\r\n"
				+ "c. Un informe dentro de una lista\r\n"
				+ "d. Ninguna son correctas\r\n"
				+ "");
		String pregunta8 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta8, "A"));
		
		System.out.println("9. Para introducir una imagen en el informe se hará mediante:\r\n"
				+ "a. Workspace resource.\r\n"
				+ "b. Absolute Path in the filesystem.\r\n"
				+ "c. URL\r\n"
				+ "d. Todas son correctas\r\n"
				+ "");
		String pregunta9 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta9, "d"));
		
		System.out.println("10. ¿Qué tipo de gráficos podemos incluir en nuestro informe?\r\n"
				+ "a. Gráfico de barras\r\n"
				+ "b. Gráfico lineal\r\n"
				+ "c. Gráficos circulares\r\n"
				+ "d. Todas son correctas\r\n"
				+ "");
		String pregunta10 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta10, "D"));
		
		System.out.println("11.  ¿Qué elementos se utilizan para inclusión de títulos?\r\n"
				+ "a. Static text\r\n"
				+ "b. TextField\r\n"
				+ "c. Text\r\n"
				+ "d. Title\r\n"
				+ "");
		String pregunta11 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta11, "a"));
		
		System.out.println("12. ¿Cuáles son los pasos para crear un sistema de ayuda con JavaHelp?\r\n"
				+ "a. Creación de Sistemas, documentos de ayuda, JavaHelp\r\n"
				+ "b. Dar forma a la ayuda, descarga e instalación de JavaHelp, creación de\r\n"
				+ "los ficheros de JavaHelp, Construir un fichero JAR\r\n"
				+ "c. Descargar ficheros, manual de ayuda, instalación de JavaHelp.\r\n"
				+ "d. Distribución de ficheros, construir un fichero JAR, desarrollar aplicaciones,\r\n"
				+ "crear sistema de ayuda");
		String pregunta12 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta12, "B"));
		
		System.out.println("13.  Cual no es una característica de CHM:\r\n"
				+ "a. Generado a partir de HLP\r\n"
				+ "b. Utiliza HTML para generar la ayuda\r\n"
				+ "c. Puede incluir tabla de contenido en fichero. cnt\r\n"
				+ "d. Permite fusionar varios ficheros de ayuda");
		String pregunta13 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta13, "C"));
		
		System.out.println("14. . ¿Cuál es la definición correcta de un fichero de ayuda?\r\n"
				+ "a. Se trata de los informes resultantes de aplicar las pruebas, definidas\r\n"
				+ "en el punto anterior, sobre el programa.\r\n"
				+ "b. Es una aplicación que permite la creación de sistemas de ayuda para ser\r\n"
				+ "integradas posteriormente en una aplicación.\r\n"
				+ "c. Es un documento que contiene toda la información que puede servir de\r\n"
				+ "ayuda o de manual para los usuarios de la herramienta sobre la que se\r\n"
				+ "ha desarrollado.\r\n"
				+ "d. Constituye una especie de mapa de navegación del sistema de ayuda,\r\n"
				+ "asociando identificadores para cada uno de los temas contenidos a las URL\r\n"
				+ "donde se encuentra el contenido relativo al tema seleccionado.\r\n"
				+ "");
		String pregunta14 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta14, "C"));
		
		System.out.println("15.  ¿Cuál de ellos NO es un tipo de manual o guía?\r\n"
				+ "a. Manual o guía de usuario\r\n"
				+ "b. Guía rápida\r\n"
				+ "c. Manual técnico\r\n"
				+ "d. Guía de referencia");
		String pregunta15 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta15, "C"));
		
		System.out.println("16.  ¿Qué clase permite visualizar el contenido de la ayuda desde la aplicación\r\n"
				+ "JavaHelp?\r\n"
				+ "a. Clase HelpWorkShop\r\n"
				+ "b. Clase HelpBroker\r\n"
				+ "c. Clase HelpSet\r\n"
				+ "d. Clase HelpMaker\r\n"
				+ "");
		String pregunta16 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta16, "B"));
		
		System.out.println("17. Señala la afirmación CORRECTA\r\n"
				+ "a. Un fichero es un elemento que contiene cualquier tipo de información y que\r\n"
				+ "puede estar recogida en un solo tipo de formato, tanto en soporte físico como\r\n"
				+ "en digital.\r\n"
				+ "b. Un fichero de ayuda es un documento que contiene toda la información\r\n"
				+ "que puede servir de ayuda o de manual para los usuarios de la\r\n"
				+ "herramienta sobre la que se ha desarrollado\r\n"
				+ "c. La vista de información constituye una especie de mapa de navegación del\r\n"
				+ "sistema de ayuda\r\n"
				+ "d. El mapa de fichero es la parte que se muestra al usuario, habitualmente\r\n"
				+ "en forma de índice");
		String pregunta17 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta17, "B"));
		
		System.out.println("18.  ¿Cuál es el formato de paquete de linux?\r\n"
				+ "a. RAR\r\n"
				+ "b. EXE\r\n"
				+ "c. JPG\r\n"
				+ "d. RPM");
		String pregunta18 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta18, "D"));
		
		System.out.println("19. Comando para desinstalar un paquete\r\n"
				+ "a. sudo apt-get remove paquete.extensión\r\n"
				+ "b. sudo update paquete.extensión\r\n"
				+ "c. sudo apt-get update paquete.extensión\r\n"
				+ "d. sudo uninstall paquete.extensión");
		String pregunta19 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta19, "A"));
		
		System.out.println("20. ¿Qué tipo de herramientas son los instaladores?\r\n"
				+ "a. Herramientas para la instalación de aplicaciones.\r\n"
				+ "b. Herramientas para la configuración de sistemas operativos.\r\n"
				+ "c. Herramientas para la creación de paquetes de distribución.\r\n"
				+ "d. Herramientas para la compilación de librerías.");
		String pregunta20 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta20, "A"));
		
		System.out.println("21.  ¿Cuál no es un mecanismo o formato de empaquetado de las aplicaciones en\r\n"
				+ "Windows?\r\n"
				+ "a. MSI\r\n"
				+ "b. APPX\r\n"
				+ "c. CET\r\n"
				+ "d. MSIX");
		String pregunta21 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta21, "C"));
		
		System.out.println("22.Algunos de los instaladores conocidos son:\r\n"
				+ "a. InstallBuilder\r\n"
				+ "b. Windows Installer\r\n"
				+ "c. MSI Studio\r\n"
				+ "d. Todas son correctas\r\n"
				+ "");
		String pregunta22 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta22, "D"));
		
		System.out.println("23. ¿Cuál no es el componente principal de una aplicación?\r\n"
				+ "a. Las carpetas de elementos multimedia\r\n"
				+ "b. Los ficheros ejecutables\r\n"
				+ "c. El conector\r\n"
				+ "d. Las bibliotecas y librerías\r\n"
				+ "");
		String pregunta23 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta23, "C"));
		
		System.out.println("24.  ¿Cuál de estos no es un tipo de error en el desarrollo de código?\r\n"
				+ "a. De compilación\r\n"
				+ "b. De ejecución\r\n"
				+ "c. De Lógica\r\n"
				+ "d. De Acceso\r\n"
				+ "");
		String pregunta24 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta24, "D"));
		
		System.out.println("25. ¿Con qué prueba evaluamos la capacidad de recuperación de un software ante una\r\n"
				+ "sobrecarga de datos?\r\n"
				+ "a. Prueba de capacidad\r\n"
				+ "b. Prueba de rendimiento\r\n"
				+ "c. Prueba de Volumen\r\n"
				+ "d. Prueba de Estrés\r\n"
				+ "");
		String pregunta25 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta25, "d"));
		
		System.out.println("26. Este tipo de errores se producen cuando la sintaxis es correcta, pero se ha\r\n"
				+ "implementado algún tipo de operación cuyo resultado es erróneo\r\n"
				+ "a. De compilación\r\n"
				+ "b. De ejecución\r\n"
				+ "c. De Lógica\r\n"
				+ "d. De Acceso");
		String pregunta26 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta26, "B"));
		
		System.out.println("27. En este tipo de pruebas se implica volver a verificar aquello que ya había sido\r\n"
				+ "evaluado previamente y había generado algún tipo de error\r\n"
				+ "a. Prueba de unitarias\r\n"
				+ "b. Prueba de regresión\r\n"
				+ "c. Prueba de volumen\r\n"
				+ "d. Prueba de seguridad\r\n"
				+ "");
		String pregunta27 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta27, "B"));
		
		System.out.println("28. Este tipo de pruebas evalúan funcionalidades concretas, examinando todos los\r\n"
				+ "caminos posibles implementados en el desarrollo de un algoritmo, función o clase\r\n"
				+ "a. Pruebas de volumen\r\n"
				+ "b. Pruebas de seguridad\r\n"
				+ "c. Pruebas de regresión\r\n"
				+ "d. Pruebas unitarias");
		String pregunta28 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta28, "D"));
		
		System.out.println("29. Este tipo de error se produce cuando la sintaxis es correcta, pero se ha\r\n"
				+ "implementado algún tipo de operación cuyo resultado es erróneo.\r\n"
				+ "a. Errores de ejecución\r\n"
				+ "b. Errores de compilación\r\n"
				+ "c. Errores de lógica\r\n"
				+ "d. Errores de sintaxis");
		String pregunta29 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta29, "A"));
		
		System.out.println("30. ¿En qué tres zonas queda dividido el entorno de diseño si se escoge la opción\r\n"
				+ "SPLIT?\r\n"
				+ "a. Explorador de proyectos y ficheros\r\n"
				+ "b. Zona de desarrollo del código de implementación\r\n"
				+ "c. Zona de diseño y lienzo donde se colocarán los elementos\r\n"
				+ "d. Todas son correctas");
		String pregunta30 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta30, "D"));
		
		System.out.println("31.  Reciben este nombre los componentes de la interfaz de usuario que implementan\r\n"
				+ "una función concreta sobre el diseño global de la aplicación:\r\n"
				+ "a. View\r\n"
				+ "b. ViewGroup\r\n"
				+ "c. ViewElement\r\n"
				+ "d. Ninguna es correcta");
		String pregunta31 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta31, "A"));
		
		System.out.println("32. Son tipos de Layout que hemos visto en el tema:\r\n"
				+ "a. LinearLayout\r\n"
				+ "b. GroupLayout\r\n"
				+ "c. AbsoluteLayout\r\n"
				+ "d. A y C son correctas");
		String pregunta32 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta32, "a"));
		
		System.out.println("33. ¿Cuál de las siguientes definiciones es la correcta para ‘Common’, situada en la\r\n"
				+ "pestaña Palette?\r\n"
				+ "a. Aparecen los componentes cuyo uso es más habitual.\r\n"
				+ "b. Elementos de tipo botón o un compartimento similar.\r\n"
				+ "c. Elementos “extra” que permiten personalizar la interfaz.\r\n"
				+ "d. Elementos relativos a Google, como mapas o anuncios");
		String pregunta33 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta33, "A"));
		
		System.out.println("34.  Paleta de componentes - ¿Qué puedes encontrar dentro del bloque “Common”?\r\n"
				+ "a. Elementos relativos a Google.\r\n"
				+ "b. Elementos que permiten añadir a la interfaz cadenas de texto.\r\n"
				+ "c. Elementos “extra” que permiten personalizar la interfaz.\r\n"
				+ "d. En este bloque aparecen los componentes cuyo uso es más habitual.\r\n"
				+ "");
		String pregunta34 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta34, "D"));
		
		System.out.println("35. El componente Spinner se centra en:\r\n"
				+ "a. Modelar los menús desplegables en una aplicación con Android\r\n"
				+ "b. Modelar los menús conceptuales en una aplicación con Android\r\n"
				+ "c. Modelar los menús desplegables en una aplicación con iOS\r\n"
				+ "d. Modelar los menús conceptuales en una aplicación con iOS");
		String pregunta35 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta35, "A"));
		
		System.out.println("36.  Este método se invoca cuando se pulsa sobre un elemento de la interfaz.\r\n"
				+ "a. onClick()\r\n"
				+ "b. onKey()\r\n"
				+ "c. onTouch()\r\n"
				+ "d. onFocusChange()\r\n"
				+ "");
		String pregunta36 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta36, "a"));
		
		System.out.println("37. Este método se invoca cuando se mantiene pulsado un elemento de la interfaz.\r\n"
				+ "a. onKey()\r\n"
				+ "b. onClick()\r\n"
				+ "c. onTouch()\r\n"
				+ "d. onLongClick()\r\n"
				+ "");
		String pregunta37 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta37, "D"));
		
		System.out.println("38. ¿Qué método se invoca cuando el usuario se coloca sobre un elemento?\r\n"
				+ "a. onCenter()\r\n"
				+ "b. onKey()\r\n"
				+ "c. onElementChange()\r\n"
				+ "d. onFocusChange()\r\n"
				+ "");
		String pregunta38 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta38, "D"));
		
		System.out.println("39.¿Dónde se mantiene el código de animación para ser llamados posteriormente?\r\n"
				+ "a. En un archivo .txt del escritorio\r\n"
				+ "b. En la ruta base/anim/\r\n"
				+ "c. En la ruta activity/animations\r\n"
				+ "d. En la ruta res/drawable");
		String pregunta39 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta39, "D"));
		
		System.out.println("40. Que hace el atributo oneshot\r\n"
				+ "a. Guarda una animación\r\n"
				+ "b. Reproduce la animación y la elimina del código\r\n"
				+ "c. Permite indicar si la animación se reproduce una vez o de forma\r\n"
				+ "indefinida\r\n"
				+ "d. Acelera la reproducción de la animación");
		String pregunta40 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta40, "C"));
		
		System.out.println("41. Es el código XML en el cual queda reflejada toda la información de navegación:\r\n"
				+ "a. NavHost\r\n"
				+ "b. NavController\r\n"
				+ "c. Gráfico de navegación\r\n"
				+ "d. NavIndicator");
		String pregunta41 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta41, "C"));
		
		System.out.println("42. ¿Cómo se importa la librería SwiftUI?\r\n"
				+ "a. import SwiftUI\r\n"
				+ "b. Import Swift\r\n"
				+ "c. import UI\r\n"
				+ "d. import lib_UI");
		String pregunta42 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta42, "A"));
		
		System.out.println("43. En la zona central de la aplicación encontramos 3 zonas de acción, indica cual no es\r\n"
				+ "una zona de acción\r\n"
				+ "a. Zona izquierda\r\n"
				+ "b. Zona derecha\r\n"
				+ "c. Zona de desarrollo\r\n"
				+ "d. Zona superior");
		String pregunta43 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta43, "D"));
		
		System.out.println("44.  ¿Qué zona de la herramienta permite detener y ejecutar la aplicación, así como el\r\n"
				+ "nombre del proyecto y el tipo de simulador escogido para probar la aplicación?\r\n"
				+ "a. La zona de simuladores\r\n"
				+ "b. La zona de proyectos\r\n"
				+ "c. La zona de dispositivos físicos\r\n"
				+ "d. La zona de ejecución y detención");
		String pregunta44 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta44, "D"));
		
		System.out.println("45. ¿Qué zona de la herramienta permite detener y ejecutar la aplicación, así como el\r\n"
				+ "nombre del proyecto y el tipo de simulador escogido para probar la aplicación?\r\n"
				+ "a. La zona de simuladores\r\n"
				+ "b. La zona de proyectos\r\n"
				+ "c. La zona de dispositivos físicos\r\n"
				+ "d. La zona de ejecución y detención");
		String pregunta45 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta45, "B"));
		
		System.out.println("46.  ¿Qué zonas tiene Xcode?\r\n"
				+ "a. Zona izquierda\r\n"
				+ "b. Zona de desarrollo\r\n"
				+ "c. Zona derecha\r\n"
				+ "d. Todas son correctas");
		String pregunta46 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta46, "D"));
		
		System.out.println("47.  ¿Cuál fue el primer lenguaje de programación para desarrollo en IOS?\r\n"
				+ "a. Objetive-C\r\n"
				+ "b. Swift\r\n"
				+ "c. C++\r\n"
				+ "d. SwiftUI");
		String pregunta47 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta47, "a"));	
	
		System.out.println("48. ¿Qué tipo de elemento no existe en JasperReports?\r\n"
				+ "a. Lista\r\n"
				+ "b. Tabla\r\n"
				+ "c. Mapa\r\n"
				+ "d. Calendario");
		String pregunta48 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_2T.respuesta_acertada(pregunta48, "D"));
	}
}
