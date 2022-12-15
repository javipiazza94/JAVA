package TEST;

import java.util.Scanner;

public class TEST_DI_1T {
	
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
		
		System.out.println("1. ¿Cuál no es una herramienta de edición de interfaces?\r\n"
				+ "a. Visual Studio\r\n"
				+ "b. Mono Develop\r\n"
				+ "c. Glade\r\n"
				+ "d. Notepad ++\r\n"
				+ "");
		String pregunta1 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta1, "C"));
		
		System.out.println("2. ¿Cuál de estas herramientas es Propietaria?\r\n"
				+ "a. Glade\r\n"
				+ "b. Mono Develop\r\n"
				+ "c. Eclipse\r\n"
				+ "d. Todas son libres");
		String pregunta2 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta2, "C"));
		
		System.out.println("3. ¿Qué encontramos en Vista de diseño en Eclipse?\r\n"
				+ "a. Paleta de objetos\r\n"
				+ "b. Estructura\r\n"
				+ "c. Propiedades\r\n"
				+ "d. Todas son correctas");
		String pregunta3 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta3, "C"));
		
		System.out.println("4. ¿Cómo se crea un Frame?\r\n"
				+ "a. JFrame variable = new JFrame();\r\n"
				+ "b. variable = new JFrame();\r\n"
				+ "c. new Frame();\r\n"
				+ "d. variable = new Frame();\r\n"
				+ "");
		String pregunta4 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta4, "A"));
		
		System.out.println("5.  ¿Cuál de estas herramientas de desarrollo de software no es libre?\r\n"
				+ "a. Visual Studio\r\n"
				+ "b. Glade\r\n"
				+ "c. Eclipse\r\n"
				+ "d. NetBeans");
		String pregunta5 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta5, "a"));
		
		System.out.println("6. En la vista de diseño de Eclipse, en el apartado de Estructura, ¿qué información encontramos?\r\n"
				+ "a. Los componentes de la interfaz\r\n"
				+ "b. La estructuras que podemos usar para crear la interfaz de la aplicación las\r\n"
				+ "cuales posteriormente pueden ser modificadas\r\n"
				+ "c. Todos los componentes que se han colocado en el diseño de la interfaz\r\n"
				+ "y las propiedades del que tengamos seleccionado\r\n"
				+ "d. La estructura del código usado para crear la interfaz\r\n"
				+ "");
		String pregunta6 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta6, "C"));
		
		System.out.println("7. ¿Cual de estas afirmaciones sobre la Vista de Diseño de Eclipse es falsa?\r\n"
				+ "a. Nos permite cambiar el nombre de la variable de los elementos\r\n"
				+ "b. No nos permite modificar el color del fondo de un elemento\r\n"
				+ "c. Podemos añadir iconos a los elementos de la interfaz que estemos creando\r\n"
				+ "d. Tendremos que crear a traves de codigo ciertas propiedades para que\r\n"
				+ "pueden ser modificadas desde la Vista de Diseño");
		String pregunta7 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta7, "D"));
		
		System.out.println("8. De que está formado Structure\r\n"
				+ "a. componentes y properties\r\n"
				+ "b. components y properties\r\n"
				+ "c. components y propiedades\r\n"
				+ "d. Todas las opciones son incorrectas");
		String pregunta8 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta8, "B"));
		
		System.out.println("9. Cual de los siguientes objetos no forma parte de components\r\n"
				+ "a. Button\r\n"
				+ "b. TextField\r\n"
				+ "c. JComboBox\r\n"
				+ "d. jlabel");
		String pregunta9 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta9, "d"));
		
		System.out.println("10. ¿Cuáles son las principales clases de la librería AWT?\r\n"
				+ "a. Component y container\r\n"
				+ "b. JFrame y Component\r\n"
				+ "c. JFrame y container\r\n"
				+ "d. Component y JTextField\r\n"
				+ "");
		String pregunta10 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta10, "a"));
		
		System.out.println("11.  ¿Qué programación incluye estructuras de control que permiten evaluar los casos\r\n"
				+ "para decidir entre un camino de instrucciones u otro.?\r\n"
				+ "a. Programación estructurada\r\n"
				+ "b. Programación procedimental o basada en funciones\r\n"
				+ "c. Programación modular\r\n"
				+ "d. Programación orientada a objetos\r\n"
				+ "");
		String pregunta11 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta11, "a"));
		
		System.out.println("12.  ¿Qué lenguaje de programación subdivide en subrutinas y funciones de menor\r\n"
				+ "tamaño que simplifican la programación, aligerando su implementación y posterior mantenimiento?\r\n"
				+ "a. Programación estructurada\r\n"
				+ "b. Programación procedimental o basada en funciones\r\n"
				+ "c. Programación modular\r\n"
				+ "d. Programación orientada a objetos\r\n"
				+ "");
		String pregunta12 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta12, "B"));
		
		System.out.println("13. ¿Qué lenguaje de programación permite desarrollar cada programa de forma\r\n"
				+ "completamente independiente al resto del código,?\r\n"
				+ "a. Programación estructurada\r\n"
				+ "b. Programación procedimental o basada en funciones\r\n"
				+ "c. Programación modular\r\n"
				+ "d. Programación orientada a objetos\r\n"
				+ "");
		String pregunta13 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta13, "C"));
		
		System.out.println("14. El componente JButton:\r\n"
				+ "a. Nos permite crear un objeto de tipo botón dentro de una interfaz gráfica en Java.\r\n"
				+ "b. Nos permite crear un objeto tipo caja dentro de una interfaz gráfica en Java.\r\n"
				+ "c. Nos permite crear un objeto tipo botón dentro de una interfaz gráfica en Kotlin.\r\n"
				+ "d. Nos permite crear un objeto tipo botón fuera de una interfaz gráfica en C++");
		String pregunta14 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta14, "A"));
		
		System.out.println("15. El componente JTextField:\r\n"
				+ "a. Necesita importar la clase Thread.\r\n"
				+ "b. Se utiliza como contenedor de una línea de texto y el tamaño queda\r\n"
				+ "definido por el valor del atributo ‘columns’.\r\n"
				+ "c. Se utiliza como contenedor exclusivo de imágenes, el tamaño podrá ser\r\n"
				+ "definido desde el atributo ‘rows’.\r\n"
				+ "d. Se utiliza como contenedor exclusivo de iconos, el tamaño no podrá ser\r\n"
				+ "definido mediante ningún atributo.");
		String pregunta15 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta15, "B"));
		
		System.out.println("16. Las partes principales de la vista de diseño son:\r\n"
				+ "a. Zona de diseño\r\n"
				+ "b. Palette\r\n"
				+ "c. Components\r\n"
				+ "d. Todas son correctas");
		String pregunta16 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta16, "D"));
		
		System.out.println("17.Un atributo o propiedad es…\r\n"
				+ "a. Los que definen las características del objeto.\r\n"
				+ "b. Los que definen el comportamiento del objeto.\r\n"
				+ "c. Los que representan un conjunto de objetos.\r\n"
				+ "d. Ninguna de las anteriores");
		String pregunta17 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta17, "A"));
		
		System.out.println("18. Los parámetros del GridLayout:\r\n"
				+ "a. Son tres cualesquiera.\r\n"
				+ "b. Son Omisibles\r\n"
				+ "c. Representan la cantidad de objetos a introducir y su tipo, respectivamente.\r\n"
				+ "d. Representan la cantidad de filas y columnas, respectivamente");
		String pregunta18 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta18, "D"));
		
		System.out.println("19. Los parámetros del JButton pueden ser::\r\n"
				+ "a. Un icono.\r\n"
				+ "b. Omisibles.\r\n"
				+ "c. Una cadena de texto.\r\n"
				+ "d. Todas las anteriores.");
		String pregunta19 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta19, "D"));
		
		System.out.println("20. Los objetos de tipo JRadioButton…\r\n"
				+ "a. Permiten elección múltiple\r\n"
				+ "b. Permiten elección simple excluyente\r\n"
				+ "c. Tiene las mismas propiedades que un JComboBox\r\n"
				+ "d. Tiene diferentes propiedades a un JCheckBox\r\n"
				+ "");
		String pregunta20 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta20, "d"));
		
		System.out.println("21.  ¿Cuál de las siguientes propiedades es correcta sobre los JComboBox?\r\n"
				+ "a. Permiten un menú único\r\n"
				+ "b. La primera posición es 1\r\n"
				+ "c. La propiedad selectedIndex permite al desarrollador indicar cuál es el\r\n"
				+ "valor por defecto\r\n"
				+ "d. No se le puede asignar un valor máximo de elementos mostrados");
		String pregunta21 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta21, "C"));
		
		System.out.println("22. ¿Cuál de las siguientes propiedades de JButton puede cargar una imagen como\r\n"
				+ "fondo del botón?\r\n"
				+ "a. Background\r\n"
				+ "b. font\r\n"
				+ "c. Icon\r\n"
				+ "d. text");
		String pregunta22 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta22, "C"));
		
		System.out.println("23.  ¿Cuál de las siguientes propiedades de JButton puede cambiar la fuente del tipo de\r\n"
				+ "letra y tamaño?\r\n"
				+ "a. Foreground\r\n"
				+ "b. Enabled\r\n"
				+ "c. Font\r\n"
				+ "d. Icon");
		String pregunta23 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta23, "C"));
		
		System.out.println("24. . Cual no es un lenguaje de descripción de interfaces basado en XML\r\n"
				+ "a. XHTML\r\n"
				+ "b. CSS\r\n"
				+ "c. RSS\r\n"
				+ "d. XSLT\r\n"
				+ "");
		String pregunta24 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta24, "B"));
		
		System.out.println("25. Se podría decir que es las hojas de estilo CSS pero dirigidas a XML\r\n"
				+ "a. XHTML\r\n"
				+ "b. CSS\r\n"
				+ "c. RSS\r\n"
				+ "d. XSLT");
		String pregunta25 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta25, "d"));
		
		System.out.println("26. ¿Qué tres distintos tipos de etiquetas existen?\r\n"
				+ "a. Start-Tag, Info-Tag ,End-Tag\r\n"
				+ "b. Attribute-Tag, Info-Tag, End-Tag\r\n"
				+ "c. Start-Tag, End-Tag, Empty-Tag\r\n"
				+ "d. Start-Tag, Attribute-Tag, End-Tag");
		String pregunta26 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta26, "C"));
		
		System.out.println("27.  ¿Cuál de los siguientes no es uno de los eventos más comunes que se pueden\r\n"
				+ "producir en una aplicación?\r\n"
				+ "a. Delete\r\n"
				+ "b. MouseMove\r\n"
				+ "c. Change\r\n"
				+ "d. Click\r\n"
				+ "");
		String pregunta27 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta27, "a"));
		
		System.out.println("28.  ¿Cuál es el lenguaje que se basa en el intercambio de información de tipo\r\n"
				+ "matemático entre programas ?\r\n"
				+ "a. XHTML (eXtensible HyperText Markup Language)\r\n"
				+ "b. MathML (Mathematical Markup Language)\r\n"
				+ "c. GML (Geography Markup Language).\r\n"
				+ "d. RSS (Really Simple Syndication\r\n"
				+ "");
		String pregunta28 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta28, "B"));
		
		System.out.println("29.  ¿Qué lenguaje tiene como objetivo principal la difusión de información entre\r\n"
				+ "los usuarios suscritos a una fuente de contenidos actualizada frecuentemente ?\r\n"
				+ "a. SVG (Scalable Vector Graphics)\r\n"
				+ "b. XSLT (eXtensible Stylesheet Languaje for Transformation)\r\n"
				+ "c. RSS (Really Simple Syndication)\r\n"
				+ "d. MathML (Mathematical Markup Language)\r\n"
				+ "");
		String pregunta29 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta29, "c"));
		
		System.out.println("30.  ¿Qué significan las siglas del lenguaje GML?\r\n"
				+ "a. Gif Markdown Language\r\n"
				+ "b. Geography Markup Language\r\n"
				+ "c. Genre Mark Language\r\n"
				+ "d. Graphics Module Lenguaje");
		String pregunta30 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta30, "b"));
		
		System.out.println("31. ¿Qué elementos podemos encontrar dentro de un documento XML?\r\n"
				+ "a. Encabezado, cuerpo y pie\r\n"
				+ "b. Name, type, text\r\n"
				+ "c. Etiquetas, atributos y valores\r\n"
				+ "d. Head, body, javascript\r\n"
				+ "");
		String pregunta31 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta31, "C"));
		
		System.out.println("32. El evento MouseDown…\r\n"
				+ "a. Se produce al pulsar cualquier botón del ratón.\r\n"
				+ "b. Se produce cuando pulsamos el botón provincial del ratón (normalmente el\r\n"
				+ "derecho).\r\n"
				+ "c. Se produce cuando pasa por encima del elemento\r\n"
				+ "d. Se produce al hacer clic varias veces en el elemento");
		String pregunta32 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta32, "a"));
		
		System.out.println("33.  Los principales lenguajes basados en XML son:\r\n"
				+ "a. XHTML, GML, MathML, RSS, XSLT y SVG.\r\n"
				+ "b. XHTML, MathML, RSS, XSLT y SVG\r\n"
				+ "c. XHTML, GML, MathMX, RSS, XSLT y SVG\r\n"
				+ "d. HTML, GML, MathML, RSS, XSLT y SVG");
		String pregunta33 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta33, "d"));
		
		System.out.println("34. ¿Cuál es el lenguaje que permite representar elementos geométricos vectoriales,\r\n"
				+ "imágenes de mapa de bits y texto?\r\n"
				+ "a. XLST\r\n"
				+ "b. XSLT\r\n"
				+ "c. SVG\r\n"
				+ "d. RSS\r\n"
				+ "");
		String pregunta34 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta34, "C"));
		
		System.out.println("35. ¿Qué significa la etiqueta Empty-Tag?\r\n"
				+ "a. Etiquetas de apertura. ()\r\n"
				+ "b. Etiquetas de cierre, similar a las de apertura, pero comienzan por “/”.\r\n"
				+ "(</etiqueta>)\r\n"
				+ "c. Indica la versión de XML que se está empleando.\r\n"
				+ "d. Etiquetas vacías, que terminan por “/”. (<etiqueta_vacía />)\r\n"
				+ "");
		String pregunta35 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta35, "D"));
		
		System.out.println("36.  ¿Qué es la reutilización de código?\r\n"
				+ "a. Reutilización de librerías, frameworks o kit de herramientas\r\n"
				+ "b. Reutilización de frameworks y kit de herramientas\r\n"
				+ "c. Reutilización de IDE\r\n"
				+ "d. Todas son incorrectas");
		String pregunta36 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta36, "a"));
		
		System.out.println("37. ¿Cuál no es un beneficio de reutilización?\r\n"
				+ "a. Reducción de coste\r\n"
				+ "b. Pruebas simplificadas\r\n"
				+ "c. Mejora la calidad del software\r\n"
				+ "d. Reducción de personal");
		String pregunta37 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta37, "D"));
		
		System.out.println("38.  ¿Qué es un componente?\r\n"
				+ "a. Código implementado y reutilizable\r\n"
				+ "b. Código simplificado\r\n"
				+ "c. Código reutilizable\r\n"
				+ "d. Todo lo anterior");
		String pregunta38 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta38, "A"));
		
		System.out.println("39. Características un buen componente\r\n"
				+ "a. La implementación puede estar realizada con cualquier lenguaje de\r\n"
				+ "programación, pero ha de estar completa.\r\n"
				+ "b. Constituye un módulo reutilizable, ya compilado.\r\n"
				+ "c. Su distribución se realiza en un solo paquete ejecutable.\r\n"
				+ "d. Todas son correctas");
		String pregunta39 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta39, "D"));
		
		System.out.println("40.  ¿Para cargar una imagen cargada, como deberemos escribir el método drawImage?\r\n"
				+ "a. g.drawImage(imagen, coordenadaX, coordenada Y, ancho, altura, this);\r\n"
				+ "b. g.drawImage(imagen, ancho, altura, this);\r\n"
				+ "c. g.drawImage(imagen, coordenadaX, coordenada Y, this);\r\n"
				+ "d. g.drawImage(imagen, coordenadaX, coordenada Y, ancho, altura);");
		String pregunta40 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta40, "A"));
		
		System.out.println("41. ¿Cómo inicializamos un elemento JComboBox?\r\n"
				+ "a. JComboBox nombre= new JComboBox(this);\r\n"
				+ "b. JComboBox nombre= new element(JComboBox);\r\n"
				+ "c. JComboBox nombre= new JComboBox();\r\n"
				+ "d. JComboBox nombre= JComboBox();\r\n"
				+ "");
		String pregunta41 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta41, "C"));
		
		System.out.println("42. ¿Cual es la alternativa gratuita a Photoshop que hemos visto en el tema?\r\n"
				+ "a. Paint.net\r\n"
				+ "b. GIMP\r\n"
				+ "c. Notepad++\r\n"
				+ "d. Canvas\r\n"
				+ "");
		String pregunta42 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta42, "B"));
		
		System.out.println("43. ¿Qué permite hacer la clase Graphics de Java?\r\n"
				+ "a. Dibujar sobre la interfaz\r\n"
				+ "b. Borrar la interfaz\r\n"
				+ "c. Actualizar graficos\r\n"
				+ "d. Dibujar la interfaz");
		String pregunta43 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta43, "a"));
		
		System.out.println("44.  ¿Para qué sirve la clase Toolkit?\r\n"
				+ "a. Permite asociar un Jlabel a la imagen\r\n"
				+ "b. Permite asociar la imagen a través de su URL\r\n"
				+ "c. Permite asociar la imagen a través de su dirección de memoria\r\n"
				+ "d. Permite asociar botones a la imagen\r\n"
				+ "");
		String pregunta44 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta44, "B"));
		
		System.out.println("45.  ¿Qué es Introspection?\r\n"
				+ "a. Una herramienta de desarrollo para analizar una interfaz\r\n"
				+ "b. Una herramienta de desarrollo para analizar en profundidad el\r\n"
				+ "funcionamiento concreto de un JavaBean\r\n"
				+ "c. Combina JLabels entre sí\r\n"
				+ "d. Una herramienta de desarrollo para analizar una interfaz gráfica\r\n"
				+ "");
		String pregunta45 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta45, "B"));
		
		System.out.println("46. ¿Cómo se definen las propiedades de un componente?\r\n"
				+ "a. Son los datos protegidos que forman la apariencia y comportamiento del\r\n"
				+ "objeto.\r\n"
				+ "b. Son los datos privados que forman la apariencia y comportamiento del\r\n"
				+ "objeto.\r\n"
				+ "c. Son los datos públicos que forman la apariencia y comportamiento del\r\n"
				+ "objeto.\r\n"
				+ "d. Ninguna es correcta\r\n"
				+ "");
		String pregunta46 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta46, "C"));
		
		System.out.println("47.  ¿Cómo se llaman los componentes de software que permiten su reutilización ?\r\n"
				+ "a. JavaBeans\r\n"
				+ "b. Swing\r\n"
				+ "c. Windowbuilder\r\n"
				+ "d. AWT");
		String pregunta47 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta47, "a"));
		
		System.out.println("48. ¿Cuál es la diferencia entre un atributo y una propiedad?\r\n"
				+ "a. Las propiedades son de uso privado y los atributos de uso público\r\n"
				+ "b. Son lo mismo\r\n"
				+ "c. Las propiedades son de uso público y los atributos de uso privado\r\n"
				+ "d. Las propiedades son de uso estático y los atributos de uso privado\r\n"
				+ "");
		String pregunta48 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta48, "c"));
		
		System.out.println("49.  ¿Qué tipo de evento se produce al pulsar y soltar la tecla?\r\n"
				+ "a. keyPressed\r\n"
				+ "b. keyListener\r\n"
				+ "c. keyReleased\r\n"
				+ "d. keyTyped\r\n"
				+ "");
		String pregunta49 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta49, "d"));
		
		System.out.println("50. ¿Qué tipo de evento se produce se produce al salir de un componente utilizando el\r\n"
				+ "puntero del ratón\r\n"
				+ "a. mouseReleased\r\n"
				+ "b. mousePressed\r\n"
				+ "c. mouseExited\r\n"
				+ "d. mouseEntered");
		String pregunta50 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta50, "C"));
		
		System.out.println("51.  ¿Qué nombre tiene el componente de eventos que detecta el movimiento de la barra\r\n"
				+ "de desplazamiento?\r\n"
				+ "a. JTextField\r\n"
				+ "b. JButton\r\n"
				+ "c. JCheckbox\r\n"
				+ "d. JScrollBar");
		String pregunta51 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta51, "D"));
		
		System.out.println("52.  ¿Cuál es la clase del tipo de evento que se produce cuando una ventana ha sufrido\r\n"
				+ "algún tipo de variación?\r\n"
				+ "a. EventObject\r\n"
				+ "b. WindowsEvent\r\n"
				+ "c. MouseEvent\r\n"
				+ "d. ContainerEvent\r\n"
				+ "");
		String pregunta52 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta52, "B"));
		
		System.out.println("53. ¿Qué evento usamos en un JButton?\r\n"
				+ "a. ActionListener\r\n"
				+ "b. KeyListener\r\n"
				+ "c. ActionEvent\r\n"
				+ "d. ItemEvent");
		String pregunta53 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta53, "C"));
		
		System.out.println("54. ¿Qué evento usamos en un JCheckBox?\r\n"
				+ "a. ItemEvent\r\n"
				+ "b. ActionListener\r\n"
				+ "c. ActionEvent ItemEvent\r\n"
				+ "d. ActionPerformed\r\n"
				+ "");
		String pregunta54 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta54, "C"));
		
		System.out.println("55. ¿Cómo se declara el método prueba?\r\n"
				+ "a. public test();\r\n"
				+ "b. prueba();\r\n"
				+ "c. true();\r\n"
				+ "d. public void Test();");
		String pregunta55 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta55, "d"));
		
		System.out.println("56. Señala la correcta: Este tipo de eventos está producido por el propio sistema\r\n"
				+ "a. Eventos externos\r\n"
				+ "b. Eventos internos\r\n"
				+ "c. Eventos de objetos\r\n"
				+ "d. Eventos outputs");
		String pregunta56 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta56, "B"));
		
		System.out.println("57. ¿Cuál de estas no es una característica del principio FIRST?\r\n"
				+ "a. Rápida ejecución\r\n"
				+ "b. Facilidad de uso\r\n"
				+ "c. Independencia respecto a otros test\r\n"
				+ "d. Se pueda repetir en el tiempo");
		String pregunta57 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta57, "B"));
		
		System.out.println("58. ¿Qué componente se encarga del evento TextEvent?\r\n"
				+ "a. JTextField\r\n"
				+ "b. JComboBox\r\n"
				+ "c. JTextComponent\r\n"
				+ "d. JScrollBar\r\n"
				+ "");
		String pregunta58 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta58, "c"));
		
		System.out.println("59. ¿Qué componente usaremos para detectar la pulsación de la tecla Enter tras\r\n"
				+ "completar un campo de texto?\r\n"
				+ "a. JTextField\r\n"
				+ "b. Jtextfield\r\n"
				+ "c. jtextfild\r\n"
				+ "d. JTextFild");
		String pregunta59 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta59, "A"));
		
		System.out.println("60. Sintaxis para un listener:\r\n"
				+ "a. nombreComponente.addtipoEventoListener(new\r\n"
				+ "tipoEventoListener(){...}\r\n"
				+ "b. addtipoEventoListener.nombreComponente(new tipoEventoListener(){...}\r\n"
				+ "c. nombreComponente.addtipoEventoListener(new tipoEvento.Listener(){...}\r\n"
				+ "d. addtipoEventoListener.nombreComponente(new tipoEvento.Listener(){...}\r\n"
				+ "");
		String pregunta60 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta60, "A"));
		
		System.out.println("61. Selecciona la definición de la característica “eficiencia de uso” correcta:\r\n"
				+ "a. Hace referencia al tiempo que se requiere para completar una\r\n"
				+ "acción determinada.\r\n"
				+ "b. Indica el grado de satisfacción del usuario con respecto al sistema.\r\n"
				+ "c. Aquellos errores que puedan estar provocados por una excesiva complejidad\r\n"
				+ "de la herramienta.\r\n"
				+ "d. Ninguna es correcta.\r\n"
				+ "");
		String pregunta61 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta61, "A"));
		
		System.out.println("62.  ¿Cuál de los siguientes no es un criterio de diseño de las pruebas de usuario?\r\n"
				+ "a. Pruebas razonables\r\n"
				+ "b. Evaluación detalle\r\n"
				+ "c. Pruebas factibles\r\n"
				+ "d. Pruebas específicas\r\n"
				+ "");
		String pregunta62 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta62, "B"));
		
		System.out.println("63. Algunos criterios de diseño en las pruebas con usuarios son:\r\n"
				+ "a. Pruebas razonables, específicas, factibles y posibles\r\n"
				+ "b. Pruebas razonables, factibles, específicas y tiempo de realización\r\n"
				+ "razonable\r\n"
				+ "c. Pruebas factibles, específicas y tiempo aceptable\r\n"
				+ "d. Pruebas específicas, factibles,razonables y evaluación de alto nivel");
		String pregunta63 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta63, "B"));
		
		System.out.println("64.  ¿Cuál no es una característica del concepto de usabilidad?\r\n"
				+ "a. Eficiencia de uso\r\n"
				+ "b. Facilidad de aprendizaje\r\n"
				+ "c. Satisfacción\r\n"
				+ "d. Tasa de aciertos");
		String pregunta64 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta64, "D"));
		
		System.out.println("65. ¿Qué tipo de test de usabilidad se realizan sobre la versión final y con una\r\n"
				+ "interacción también similar a la real, sin ningún moderador que paute las acciones?\r\n"
				+ "a. Test de uso pautado\r\n"
				+ "b. Test de uso descontextualizado\r\n"
				+ "c. Uso natural\r\n"
				+ "d. Híbridos\r\n"
				+ "");
		String pregunta65 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta65, "C"));
		
		System.out.println("66.  ¿Cuál es un principio para el diseño de sistemas interactivos?\r\n"
				+ "a. Conocer al usuario\r\n"
				+ "b. Minimizar la memorización\r\n"
				+ "c. Facilitar buenos mensajes de error, crear diseños que eviten los\r\n"
				+ "errores más comunes:\r\n"
				+ "d. Todas son correctas\r\n"
				+ "");
		String pregunta66 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta66, "D"));
		
		System.out.println("67.  ¿Cuál es un principio para el diseño de sistemas interactivos?\r\n"
				+ "a. Conocer al usuario\r\n"
				+ "b. Minimizar la memorización\r\n"
				+ "c. Facilitar buenos mensajes de error, crear diseños que eviten los\r\n"
				+ "errores más comunes:\r\n"
				+ "d. Todas son correctas\r\n"
				+ "");
		String pregunta67 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta67, "C"));
		
		System.out.println("68. ¿Qué se utiliza para medir la usabilidad de una aplicación?\r\n"
				+ "a. Satisfacción, efectividad y eficiencia\r\n"
				+ "b. Métricas, eficiencia y diseño\r\n"
				+ "c. Análisis, perfiles y prototipos\r\n"
				+ "d. Satisfacción, detalles y resultados\r\n"
				+ "");
		String pregunta68 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta68, "A"));
		
		System.out.println("69.  ISO se encarga de…\r\n"
				+ "a. Creación de normas y estándares cuyo objetivo principal es conseguir\r\n"
				+ "asegurar que servicios y procesos presenten ciertos niveles de calidad,\r\n"
				+ "eficacia y seguridad.\r\n"
				+ "b. Creación de normas y estándares cuyo objetivo principal es\r\n"
				+ "conseguir asegurar que servicios y productos presenten ciertos\r\n"
				+ "niveles de calidad, eficiencia y seguridad.\r\n"
				+ "c. Revisión de normas y estándares ya creados con anterioridad cuyo\r\n"
				+ "objetivo principal es conseguir asegurar que servicios y procesos\r\n"
				+ "presentan ciertos niveles de calidad, eficacia y seguridad.\r\n"
				+ "d. Revisión de normas y estándares ya creados con anterioridad cuyo\r\n"
				+ "objetivo principal es conseguir asegurar que servicios y productos\r\n"
				+ "presenten ciertos niveles de calidad, eficiencia y seguridad.");
		String pregunta69 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta69, "B"));
		
		System.out.println("70.¿Cuál de las siguientes no es una métrica de la satisfacción?\r\n"
				+ "a. Calificación de satisfacción del usuario sobre la aplicación\r\n"
				+ "b. Frecuencia de reutilización de la aplicación\r\n"
				+ "c. Calificación relativa a la facilidad de aprendizaje\r\n"
				+ "d. Todas pertenecen a las métricas de satisfacción");
		String pregunta70 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta70, "D"));
		
		System.out.println("71.  ¿De que se encarga el test de usabilidad?\r\n"
				+ "a. Evalúan tanto la facilidad de uso por parte de un usuario (no experto)\r\n"
				+ "como si la funcionalidad desarrollada cumple con la finalidad de la\r\n"
				+ "aplicación.\r\n"
				+ "b. El nivel de satisfacción de un usuario es clave para la evaluación de la\r\n"
				+ "aplicación.\r\n"
				+ "c. Realizan la conocida evaluación heurística o método de inspección.\r\n"
				+ "d. Se analiza el funcionamiento de forma general. ");
		String pregunta71 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta71, "A"));
		
		System.out.println("72.  ¿De que se encarga el test de uso pautado?\r\n"
				+ "a. Implementa un proceso similar al anterior, sobre un prototipo no real.\r\n"
				+ "b. Estas pruebas se realizan sobre la versión final y con una interacción\r\n"
				+ "también similar a la real, sin ningún moderador que paute las acciones.\r\n"
				+ "c. Se encarga de monitorizar todas las pruebas que se hacen en base a un\r\n"
				+ "listado previamente diseñado sobre un prototipo muy cercano a la\r\n"
				+ "versión real.\r\n"
				+ "d. A y B son correctas.\r\n"
				+ "");
		String pregunta72 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta72, "C"));
		
		System.out.println("73.¿Qué se indica sobre el aspecto de Colores en nuestra interfaz?\r\n"
				+ "a. No importa la elección de colores mientras se entienda\r\n"
				+ "b. La elección de una buena paleta de colores es esencial\r\n"
				+ "c. Abusar y usar la mayor cantidad de colores posibles\r\n"
				+ "d. Siempre usar los mismos colores, incluso en fuentes.\r\n"
				+ "");
		String pregunta73 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta73, "B"));
		
		System.out.println("74.  Aspectos a tener en cuenta sobre las Fuentes en nuestra interfaz:\r\n"
				+ "a. Tamaño, color y estilo\r\n"
				+ "b. posición y estilo\r\n"
				+ "c. variedad de fuentes\r\n"
				+ "d. Cantidad, posición y familia");
		String pregunta74 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta74, "a"));
		
		System.out.println("75. Cual de los siguientes no es un aspecto importante de las tablas en la presentación\r\n"
				+ "de datos\r\n"
				+ "a. El diseño debe mostrar la información de la forma más clara posible\r\n"
				+ "b. Debe aparecer siempre en el título de la tabla y su longitud no debe exceder\r\n"
				+ "las dos líneas de texto.\r\n"
				+ "c. Los datos deben quedar recogidos bajo unas etiquetas claras y concisas.\r\n"
				+ "d. No preocuparse por el formato, mostrar todos los datos posibles.");
		String pregunta75 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta75, "b"));
		
		System.out.println("76. Cual de estos atajos de teclado es para buscar caracteres?\r\n"
				+ "a. Ctrl + V\r\n"
				+ "b. Ctrl + C\r\n"
				+ "c. Ctrl + Z\r\n"
				+ "d. Ctrl + F");
		String pregunta76 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta76, "d"));
		
		System.out.println("77. La relación entre elementos en el diseño de la estructura de una interfaz…\r\n"
				+ "a. Debe construirse de forma coherente.\r\n"
				+ "b. Debe construirse de forma incoherente.\r\n"
				+ "c. Debe de ser intuitiva\r\n"
				+ "d. B y C son correctas");
		String pregunta77 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta77, "A"));
		
		System.out.println("78.  ¿Que no es conveniente en el estilo de los elementos?\r\n"
				+ "a. No abusar de la negrita, subrayado, ni estilos demasiados\r\n"
				+ "sobrecargados.\r\n"
				+ "b. Usar estilos muy contrastados\r\n"
				+ "c. Priorizar la visibilidad del texto\r\n"
				+ "d. B y C son correctas\r\n"
				+ "");
		String pregunta78 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta78, "A"));
		
		System.out.println("79.  ¿Qué es mejor para un cuadro diálogo?\r\n"
				+ "a. Error, ¿desea probar otra conexión?\r\n"
				+ "b. Error\r\n"
				+ "c. No se encuentra el error\r\n"
				+ "d. Ventana incorrecta\r\n"
				+ "");
		String pregunta79 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta79, "A"));
		
		System.out.println("80. ¿Qué colores son mejores para una interfaz?\r\n"
				+ "a. Colores oscuros frente a fondo claro\r\n"
				+ "b. Colores claros\r\n"
				+ "c. Colores oscuros\r\n"
				+ "d. Colores claros frente a fondo claro");
		String pregunta80 = sc.next();
		numpreguntas++;
		System.out.println(TEST_DI_1T.respuesta_acertada(pregunta80, "A"));
		
		TEST_DI_1T.notas();
		
	}

}
