package ACCESO_A_DATOS;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

public class PELIS {
	static void CrearElemento(String datoPeli, String valor, Element raiz, Document document) {
		Element elem = document.createElement(datoPeli);
		elem.setTextContent(valor);
		raiz.appendChild(elem);
	}

	static File CopiarArchivo(String Origen, String Destino) throws IOException {
		File origenArchivo = new File(Origen);
		File destinoArchivo = new File(Destino);
		if (destinoArchivo.exists()) {
			destinoArchivo.delete();
			destinoArchivo.createNewFile();
		}
		Files.copy(origenArchivo.toPath(), destinoArchivo.toPath());
		if (origenArchivo.exists()) {
			System.out.println("La copia se ha efectuado");
		} else {
			System.out.println("No se ha podido realizar");
		}
		return origenArchivo;
	}

	static String getNodo(String etiqueta, Element elem) {
		NodeList nodo = elem.getElementsByTagName(etiqueta).item(0).getChildNodes();
		Node valorNodo = (Node) nodo.item(0);
		return valorNodo.getNodeValue();
	}

	@SuppressWarnings({ "unused" })
	public static void main(String[] args) throws FileNotFoundException, IOException, ParserConfigurationException,
			NumberFormatException, TransformerException, SAXException, XPathExpressionException {

		// HACER UN DOCUMENTO XML A PARTIR DE UN ARCHIVO .DAT
		// CREAMOS EL ARCHIVO .DAT
		String origen = "C:\\Users\\javip\\OneDrive\\Documents\\DAM\\ACTIVIDADES\\EJERCICIOS DE PROGRAMACIÓN\\JAVA\\SEGUNDO_DAM\\src\\ACCESO_A_DATOS\\Pelis.txt";
		String destino = "C:\\Users\\javip\\OneDrive\\Documents\\DAM\\ACTIVIDADES\\EJERCICIOS DE PROGRAMACIÓN\\JAVA\\SEGUNDO_DAM\\src\\ACCESO_A_DATOS\\XML.dat";
		File destinoArchivo = PELIS.CopiarArchivo(origen, destino);
		String Ruta_XML = "C:\\Users\\javip\\OneDrive\\Documents\\DAM\\ACTIVIDADES\\EJERCICIOS DE PROGRAMACIÓN\\JAVA\\SEGUNDO_DAM\\src\\ACCESO_A_DATOS\\Pelis.xml";
		// CREAMOS EL DOCUMENTO CON EL ELEMENTO PADRE
		DocumentBuilderFactory documento = DocumentBuilderFactory.newInstance();
		DocumentBuilder constructor = documento.newDocumentBuilder();
		Document doc = constructor.newDocument();
		Element padre = doc.createElement("Peliculas");
		doc.appendChild(padre);
		// CONTAMOS LINEAS
		Scanner sc2 = new Scanner(destinoArchivo);
		while (sc2.hasNextLine()) {
			ArrayList<String> XMLElementData = new ArrayList<String>();
			XMLElementData.addAll(Arrays.asList(sc2.nextLine().split(",")));
			// COLOCAMOS LOS DATOS
			String nombre = XMLElementData.get(0);
			int Year = Integer.parseInt(XMLElementData.get(1));
			String Año = String.valueOf(Year);
			String Length = XMLElementData.get(2);
			String ActorPrincipal = XMLElementData.get(3);
			// CREAMOS OBJETO PELICULA COMO BASE
			Pelicula xml = new Pelicula(nombre, Year, Length, ActorPrincipal);
			// CREAMOS LA ESTRUCTURA DE CADA XML
			Element pelicularoot = doc.createElement("pelicula"); // CLASE HIJA DONDE DERIVAN LOS ATRIBUTOS
			PELIS.CrearElemento("NombrePelicula", nombre, pelicularoot, doc);
			PELIS.CrearElemento("Año", Año, pelicularoot, doc);
			PELIS.CrearElemento("Duracion", Length, pelicularoot, doc);
			PELIS.CrearElemento("ActorPrincipal", ActorPrincipal, pelicularoot, doc);
			padre.appendChild(pelicularoot);
		}
		sc2.close();
		// ESCRIBIMOS EL XML
		TransformerFactory tfPelicula = TransformerFactory.newInstance();
		Transformer tPelicula = tfPelicula.newTransformer();
		DOMSource DOM_Pelicula = new DOMSource(doc);
		StreamResult XML_Resultado = new StreamResult(new File(Ruta_XML));
		tPelicula.transform(DOM_Pelicula, XML_Resultado);

		// LEEMOS EL XML CON EL DOM
		DocumentBuilder constructorXML = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document docXML = constructorXML.parse(new File(Ruta_XML));
		docXML.getDocumentElement().normalize();
		System.out.println("Elemento raiz: " + docXML.getDocumentElement().getNodeName());
		// CREAMOS UNA LISTA DE NODOS PARA IMPRIMIR SU CONTENIDO
		NodeList listaNodos = docXML.getElementsByTagName("pelicula");
		for (int i = 0; i < listaNodos.getLength(); i++) {
			Node Nodo = listaNodos.item(i);
			System.out.println("El nodo actual es: " + Nodo.getNodeName());
			if (Nodo.getNodeType() == Node.ELEMENT_NODE) {
				Element elementoNodo = (Element) Nodo;
				if (Nodo.getNodeType() == Node.ELEMENT_NODE) {
					System.out.println("Titulo: " + getNodo("NombrePelicula", elementoNodo));
					System.out.println("Año de Rodaje: " + getNodo("Año", elementoNodo));
					System.out.println("Duracion: " + getNodo("Duracion", elementoNodo));
					System.out.println("Actor Principal: " + getNodo("ActorPrincipal", elementoNodo));
					System.out.println("----------------------------------");
				}
			}
		}

		// INTRODUCIMOS UNA NUEVA PELICULA
		// CREAMOS LOS DATOS
		String titulo = "El Padrino", duracion = "175", actor = "Al Pacino";
		int Año = 1972;
		File fichero = new File(Ruta_XML);
		// CARGAMOS EL ARCHIVO XML EN UN DOM:
		Document documentoNuevoXML = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(fichero);
		// CREAMOS LA ESTRUCTURA DE DATOS
		Element raiz = documentoNuevoXML.createElement("pelicula");
		documentoNuevoXML.getDocumentElement().appendChild(raiz);
		CrearElemento("NombrePelicula", titulo, raiz, documentoNuevoXML);
		CrearElemento("Año", String.valueOf(Año), raiz, documentoNuevoXML);
		CrearElemento("Duracion", String.valueOf(duracion), raiz, documentoNuevoXML);
		CrearElemento("ActorPrincipal", actor, raiz, documentoNuevoXML);
		// LA INTRODUCIMOS EN EL XML
		Source fuente = new DOMSource(documentoNuevoXML);
		Result resultado = new StreamResult(new java.io.File(Ruta_XML));
		Transformer transformador = TransformerFactory.newInstance().newTransformer();
		transformador.transform(fuente, resultado);
		// BUSCAMOS POR DURACION
		String expresion = "/Peliculas/pelicula[Duracion > 120]/NombrePelicula";
		// CARGAMOS EL XML
		DocumentBuilderFactory XML = DocumentBuilderFactory.newInstance();
		DocumentBuilder Constructor = XML.newDocumentBuilder();
		Document DocXML3 = Constructor.parse(new File(Ruta_XML));
		// CREAMOS UN OBJETO XPATH CON XPATHFACTORY:
		XPath cadenaXPath = XPathFactory.newInstance().newXPath();
		// CONCULTAMOS MEDIANTE NODELIST QUE LISTA LOS NODOS, LA RECORREMOS E IMPRIMIMOS
		// RESULTADO
		NodeList peliculasDuracionM120 = (NodeList) cadenaXPath.evaluate(expresion, DocXML3, XPathConstants.NODESET);
		System.out.println("Las Peliculas que duran mas de 120 minutos son: ");
		for (int i = 0; i < peliculasDuracionM120.getLength(); i++) {
			System.out.println(peliculasDuracionM120.item(i).getTextContent());
		}

		// MODIFICAMOS EL ACTOR DE UNA PELICULA
		// ABRIMOS XML
		File Actor = new File(Ruta_XML);
		Document XML4 = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(Actor);
		// CREAMOS LA SENTENCIA XPATH
		XPath cadenaXPath2 = XPathFactory.newInstance().newXPath();
		String expresion2 = "/Peliculas/pelicula[Año = 1972]/ActorPrincipal";
		// METEMOS LA CONDICION EN LA LISTA DE NODOS Y COLOCAMOS EL NOMBRE
		String res = "";
		NodeList cambioActor = (NodeList) cadenaXPath2.compile(expresion2).evaluate(XML4, XPathConstants.NODESET);
		for (int j = 0; j < cambioActor.getLength(); j++) {
			Node actor_principal = cambioActor.item(j);
			actor_principal.setTextContent("Marlon Brando");
			if (actor_principal.getTextContent() == "Marlon Brando") {
				res = "Se ha efectuado el cambio de actor en el nodo hijo";
			} else {
				res = "No se ha podido efectuar el cammbio";
			}
		}
		System.out.println(res);
		// ESCRIBIMOS EN EL XML
		Source escribir = new DOMSource(XML4);
		Result result = new StreamResult(new java.io.File(Ruta_XML));
		Transformer transformar = TransformerFactory.newInstance().newTransformer();
		transformador.transform(escribir, result);
	}
}
