package TEST;

import java.util.Scanner;

public class TEST_SGE_T1 {

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
		
		System.out.println("1. ¿Qué podía hacer el primer ERP?\r\n"
				+ "a. Mantener existencias al mínimo\r\n"
				+ "b. Automatizar gestión de fabricación\r\n"
				+ "c. Administrar recursos económicos\r\n"
				+ "d. Todo lo anterior");
		String pregunta1 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta1, "a"));
		
		System.out.println("2. ¿Cuál no es una característica de una empresa?\r\n"
				+ "a. Dirección\r\n"
				+ "b. Administración\r\n"
				+ "c. Compras\r\n"
				+ "d. Recursos electrónicos\r\n"
				+ "");
		String pregunta2 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta2, "D"));
		
		System.out.println("3. ¿Qué significa ERP?\r\n"
				+ "a. Enterprise Resource Planning\r\n"
				+ "b. Enterprise Recovery Planning\r\n"
				+ "c. Enterprise Resource Plan\r\n"
				+ "d. Enterprise Recovery Plan\r\n"
				+ "");
		String pregunta3 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta3, "A"));
		
		System.out.println("4. ¿Cuál no es una característica ERP?\r\n"
				+ "a. Integrado\r\n"
				+ "b. Modular\r\n"
				+ "c. Adaptable\r\n"
				+ "d. Todas son características ERP");
		String pregunta4 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta4, "d"));
		
		System.out.println("5. ¿Qué es un MRP?\r\n"
				+ "a. Sistemas de Planificación de Requerimientos de Material\r\n"
				+ "b. Sistemas de Planificación de Recursos Modelados\r\n"
				+ "c. Sistemas de Planificación de Recursos Productivos\r\n"
				+ "d. Todas son correctas");
		String pregunta5 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta5, "a"));
		
		System.out.println("6. Las fases de la implementación de un ERP son\r\n"
				+ "a. Planificación, análisis, diseño, pruebas, integración, migración, soporte,\r\n"
				+ "mantenimiento\r\n"
				+ "b. Planificación, análisis, diseño, pruebas, integración, formación, soporte\r\n"
				+ "y mantenimiento\r\n"
				+ "c. Planificación, análisis, diseño, pruebas, inclusión, información, soporte y\r\n"
				+ "mantenimiento\r\n"
				+ "d. Planificación, análisis, diseño, pruebas, inclusión, formación, soporte y\r\n"
				+ "mantenimiento\r\n"
				+ "");
		String pregunta6 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta6, "B"));
		
		System.out.println("7. ¿Cual de estas opciones NO es un ERP Propietario?\r\n"
				+ "a. SAP\r\n"
				+ "b. Oracle Cloud\r\n"
				+ "c. Microsoft Dynamics\r\n"
				+ "d. GitHub\r\n"
				+ "");
		String pregunta7 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta7, "D"));
		
		System.out.println("8. ¿De qué se trata un software ERP de código abierto?\r\n"
				+ "a. Se trata de un modelo de desarrollo de software basado en una\r\n"
				+ "colaboración abierta.\r\n"
				+ "b. Se trata de un software que exige un pago por licencia.\r\n"
				+ "c. Se trata de un software muy fiable y especializado además de que su\r\n"
				+ "actualización no depende de la comunidad.\r\n"
				+ "d. Ninguna de las anteriores es correcta.\r\n"
				+ "");
		String pregunta8 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta8, "a"));
		
		System.out.println("9. Indica de las siguientes, cuál es una ventaja de ERP-CRM de código propietario.\r\n"
				+ "a. Son desarrollados por grandes fabricantes de software que ofrecen\r\n"
				+ "garantías y cobertura frente a errores, con un soporte y servicio\r\n"
				+ "postventa especializado.\r\n"
				+ "b. El coste suele ser muy elevado. Aunque esto ha cambiado debido a la\r\n"
				+ "especialización y a la elevada competencia.\r\n"
				+ "c. Dependencia: la implantación y personalización del ERP con un proveedor\r\n"
				+ "dificulta un posible futuro cambio de ERP.\r\n"
				+ "d. La evolución del software se hace de forma genérica y depende de la\r\n"
				+ "comunidad.\r\n"
				+ "");
		String pregunta9 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta9, "A"));
		
		System.out.println("10. Indica de las siguientes, cuál es una ventaja de ERP-CRM de código libre:\r\n"
				+ "a. Las tecnologías suelen ser más actuales que en los propietarios.\r\n"
				+ "Además, suelen disponer de una amplia gama de herramientas y\r\n"
				+ "posibilidades.\r\n"
				+ "b. El coste suele ser muy elevado. Aunque esto ha cambiado debido a la\r\n"
				+ "especialización y a la elevada competencia.\r\n"
				+ "c. La evolución del software se hace de forma genérica y depende de la\r\n"
				+ "comunidad.\r\n"
				+ "d. Muy especializado. Puede evolucionar en áreas específicas.\r\n"
				+ "");
		String pregunta10 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta10, "a"));
		
		System.out.println("11. Indica de las siguientes, cuál es la afirmación incorrecta acerca de Odoo.\r\n"
				+ "a. Es un sistema ERP libre.\r\n"
				+ "b. Su código se basa en Python.\r\n"
				+ "c. Usa Postgre como SGBD.\r\n"
				+ "d. Dispone de más de 100 módulos.");
		String pregunta11 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta11, "D"));
		
		System.out.println("12.Que nos permite realizar el módulo de contabilidad de las aplicaciones financieras\r\n"
				+ "a. Gestionar los contratos y crear facturas\r\n"
				+ "b. Registrar todas las facturas y mantener los pagos bajo control\r\n"
				+ "c. Monitoriza los gastos y vuelve a facturar por lote si es necesario\r\n"
				+ "d. Automatiza flujos de compra y disponibilidad del producto\r\n"
				+ "");
		String pregunta12 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta12, "B"));
		
		System.out.println("13. ¿Qué módulos podemos encontrar dentro de las aplicaciones de operaciones?\r\n"
				+ "a. Compra, Inventario y Proyecto\r\n"
				+ "b. CRM, Punto de venta y Venta\r\n"
				+ "c. Contabilidad, Facturación y Gastos\r\n"
				+ "d. MRP, PLM, MRP Mantenimiento, Calidad\r\n"
				+ "");
		String pregunta13 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta13, "a"));
		
		System.out.println("14. ¿Cuál NO es un módulo de un ERP propietario?\r\n"
				+ "a. Módulos financieros\r\n"
				+ "b. Módulo de recursos humanos\r\n"
				+ "c. Módulo de gestión\r\n"
				+ "d. Módulos logísticos");
		String pregunta14 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta14, "C"));
		
		System.out.println("15. ¿Qué módulos hay dentro de las aplicaciones financieras?\r\n"
				+ "a. Punto de venta, suscripciones y alquiler\r\n"
				+ "b. Contratación, recomendación y aprobaciones\r\n"
				+ "c. Servicio, Documentación y Compra\r\n"
				+ "d. Contabilidad, Facturación y Gastos");
		String pregunta15 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta15, "d"));
		
		System.out.println("16.  ¿Qué módulos hay dentro de las aplicaciones de ventas?\r\n"
				+ "a. CRM, punto de venta, ventas, suscripciones y alquiler\r\n"
				+ "b. Servicio, Documentación y Compra\r\n"
				+ "c. Contratación, recomendación y aprobaciones\r\n"
				+ "d. Contabilidad, Facturación y Gastos\r\n"
				+ "");
		String pregunta16 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta16, "A"));
		
		System.out.println("17. ¿De que se encargan los módulos de Finanzas - FI?\r\n"
				+ "a. Se encarga del análisis de la gestión interna de la empresa usando los datos\r\n"
				+ "de costes y beneficio de esta.\r\n"
				+ "b. Es el encargado de gestionar las operaciones financieras de la\r\n"
				+ "empresa.\r\n"
				+ "c. Este módulo se asocia a todo lo relacionado con el capital humano de una\r\n"
				+ "empresa y le permite tener un control exhaustivo de sus empleados.\r\n"
				+ "d. Ninguna es correcta.\r\n"
				+ "");
		String pregunta17 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta17, "b"));
		
		System.out.println("18.  ¿Cuál no es una fase de la implementación?\r\n"
				+ "a. Planificación\r\n"
				+ "b. Análisis\r\n"
				+ "c. Consultoría\r\n"
				+ "d. Soporte y mantenimiento");
		String pregunta18 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta18, "d"));
		
		System.out.println("19.  ¿En qué consiste la consultoría?\r\n"
				+ "a. Alcanzar los detalles específicos de la fase de diseño\r\n"
				+ "b. Alcanzar los detalles específicos de la fase de implementación\r\n"
				+ "c. Alcanzar los detalles específicos de la fase de Análisis\r\n"
				+ "d. Ninguno es correcto");
		String pregunta19 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta19, "b"));
		
		System.out.println("20.  ¿Qué se puede llegar a elaborar en la fase de consultoría?\r\n"
				+ "a. Diagramas de clase\r\n"
				+ "b. Diagramas de flujo\r\n"
				+ "c. Diagramas UML\r\n"
				+ "d. Todas son correctas");
		String pregunta20 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta20, "b"));
		
		System.out.println("21. ¿Qué tipos de pruebas no existen?\r\n"
				+ "a. Unitarias\r\n"
				+ "b. Integrales\r\n"
				+ "c. Iniciales\r\n"
				+ "d. Todas son correctas");
		String pregunta21 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta21, "c"));
		
		System.out.println("22. Indica la forma INCORRECTA de instalar la versión SAP HANA 2.0 Express Edition en local:\r\n"
				+ "a. Descargandola en la página oficial\r\n"
				+ "b. Mediante un instalable (código binario) en Linux.\r\n"
				+ "c. Mediante una máquina virtual preconfigurada.\r\n"
				+ "d. A través de Docker\r\n"
				+ "");
		String pregunta22 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta22, "a"));
		
		System.out.println("23. ¿De qué manera podemos obtener el código fuente de los requisitos de Oddo?\r\n"
				+ "a. Archivo Zip\r\n"
				+ "b. A través de un repositorio Git\r\n"
				+ "c. No se puede obtener\r\n"
				+ "d. A y B son correctas");
		String pregunta23 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta23, "d"));
		
		System.out.println("24.  ¿Cuál de estos no es un requisito de SAP S/4 HANA para instalarlo a través de un\r\n"
				+ "instalable en Linux?\r\n"
				+ "a. Disponer de 16 GB de RAM\r\n"
				+ "b. Disponer de 6 gb de vram\r\n"
				+ "c. Tener 120 gb de espacio libre\r\n"
				+ "d. Disponer de un procesador de 2 núcleos");
		String pregunta24 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta24, "b"));
		
		System.out.println("25. Si la empresa para la cual estamos trabajando tiene 20 trabajadores, ¿Cuantos gb\r\n"
				+ "de RAM y núcleos de CPU necesitamos para instalar Odoo?\r\n"
				+ "a. 2GB de RAM y 4 núcleos CPU\r\n"
				+ "b. 2GB de RAM y 2 núcleos CPU\r\n"
				+ "c. 8GB de RAM y 4 núcleos CPU\r\n"
				+ "d. 8GB de RAM y 2 núcleos CPU");
		String pregunta25 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta25, "c"));
		
		System.out.println("26. Mínimo de memoria RAM en una instalación SAP BUSINESS SUITE 4\r\n"
				+ "a. 8 GB\r\n"
				+ "b. 16 GB\r\n"
				+ "c. 32 GB\r\n"
				+ "d. 64gb\r\n"
				+ "");
		String pregunta26 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta26, "b"));
		
		System.out.println("27. El software de dominio público…\r\n"
				+ "a. No tiene derechos de autor\r\n"
				+ "b. Es aquel que permite usar el código de cualquier forma\r\n"
				+ "c. Se trata de software libre cuyos términos de distribución no permiten añadir\r\n"
				+ "restricciones\r\n"
				+ "d. Es desarrollado por una empresa que pretende ganar dinero");
		String pregunta27 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta27, "a"));
		
		System.out.println("28. ¿Cuál de las siguientes opciones no es un tipo de licencia software?\r\n"
				+ "a. Software de dominio público\r\n"
				+ "b. Software con copyleft\r\n"
				+ "c. Software comercial\r\n"
				+ "d. Software sin licencia GPL\r\n"
				+ "");
		String pregunta28 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta28, "c"));
		
		System.out.println("29.  ¿Cuál es un tipo de instalación de ERP?\r\n"
				+ "a. Instalación mediante SaaS\r\n"
				+ "b. Instalación en un hosting\r\n"
				+ "c. Instalación en un servidor local\r\n"
				+ "d. Todas son correctas");
		String pregunta29 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta29, "c"));
		
		System.out.println("30. ¿Qué versión de SAP HANA, incluye integración Hadoop y Spark, además de\r\n"
				+ "optimización para big data?\r\n"
				+ "a. Enterprise edition\r\n"
				+ "b. Standard edition\r\n"
				+ "c. Express edition\r\n"
				+ "d. Runtime edition");
		String pregunta30 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta30, "a"));
		
		System.out.println("31. ¿Cual no es un tipo de implantación SAP ?\r\n"
				+ "a. Express Edition, Standar Edition, Enterprise Edition, Start Edition\r\n"
				+ "b. Runtime Edition, Express Edition, Standar Edition, Enterprise Edition\r\n"
				+ "c. Runtime Edition, Express Edition, Standar Edition, Price Edition\r\n"
				+ "d. Runtime Edition, Express Edition, Star Edition, Price Edition");
		String pregunta31 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta31, "b"));
		
		System.out.println("32.  ¿Qué es el software comercial?\r\n"
				+ "a. Conjunto de cláusulas de distribución para publicar programas con copyleft.\r\n"
				+ "b. Se trata de un software libre cuyos términos de distribución no permiten a los\r\n"
				+ "distribuidores agregar ninguna restricción adicional.\r\n"
				+ "c. Es aquel que permite usar el código de cualquier forma.\r\n"
				+ "d. El desarrollado por una empresa que pretende ganar dinero por su uso.");
		String pregunta32 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta32, "d"));
		
		System.out.println("33. ¿Cuáles de estos módulos no es necesario para el flujo de compra-venta?.\r\n"
				+ "a. Ventas\r\n"
				+ "b. Contabilidad\r\n"
				+ "c. Inventario\r\n"
				+ "d. Animación\r\n"
				+ "");
		String pregunta33 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta33, "d"));
		
		System.out.println("34. ¿Qué módulo necesitaremos para crear un producto?\r\n"
				+ "a. Módulo Ventas\r\n"
				+ "b. Módulo Compras\r\n"
				+ "c. Módulo Escritorio\r\n"
				+ "d. Módulo Animación");
		String pregunta34 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta34, "b"));
		
		System.out.println("35.  ¿En que modulo se encuentra la opcion de modulos de entrega?\r\n"
				+ "a. Módulo Ventas\r\n"
				+ "b. Módulo Proyecto\r\n"
				+ "c. Módulo Inventario\r\n"
				+ "d. Módulo Contabilidad\r\n"
				+ "");
		String pregunta35 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta35, "c"));
		
		System.out.println("36.¿Dónde necesitamos acceder en el módulo comprar para el abastecimiento\r\n"
				+ "automático de un producto?\r\n"
				+ "a. Trazabilidad\r\n"
				+ "b. Reglas de abastecimiento\r\n"
				+ "c. Productos vendidos\r\n"
				+ "d. Productos previstos");
		String pregunta36 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta36, "b"));
		
		System.out.println("37. ¿Qué módulo necesitaremos para recibir un producto?\r\n"
				+ "a. Módulo Inventario\r\n"
				+ "b. Módulo Escritorio\r\n"
				+ "c. Módulo Compras\r\n"
				+ "d. Módulo Animación");
		String pregunta37 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta37, "a"));
		
		System.out.println("38. ¿Qué módulo necesitaremos para controlar la facturación de los productos?\r\n"
				+ "a. Módulo Inventario\r\n"
				+ "b. Módulo Escritorio\r\n"
				+ "c. Módulo Compras\r\n"
				+ "d. Módulo Contabilidad");
		String pregunta38 = sc.next();
		numpreguntas++;
		System.out.println(TEST_SGE_T1.respuesta_acertada(pregunta38, "d"));
		
		
		TEST_SGE_T1.notas();
		
	}
}
