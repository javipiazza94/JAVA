package EJERCICIOS_BOOTCAMP;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
public class ARRAYLIST {

	public static void main(String[] args) {
		// Hacemos ejercicios con ArrayList
		// Capacidad del ArrayList = Capacidad del ArrayLista + Capacidad ArrayList*0.5
		//Deriva de la clase AbstractList
		
		ArrayList<String> Lista = new ArrayList <String>();
		Lista.add("Como diria mi abuelo");
		Lista.add("Mas vale polla en mano que cipote en tu ano");
		Lista.add("Quien fuera escoba para que agarraras con el mango");
		Lista.add("En boca cerrada no entran moscas pero entran pollas como roscas");
		
		Lista.remove(0);
		
		System.out.println("El valor del ArrayList es "+Lista);
		
		
		for (String nombre: Lista) {
			System.out.println(nombre);
		}
		
		System.out.println("\n");
		/*
		for (int i = 0; i<Lista.size(); i++) {
			System.out.println(Lista.get(i));
		} */
		
		//Convertimos ArrayList en Array
		
		String Array[] = new String[Lista.size()];
		for (int i = 0; i<Lista.size(); i++) {
			Array[i]= Lista.get(i);
		}
		for (String elementos_array : Array) {
			System.out.println("El Array nuevo contiene estos elementos: "+ elementos_array);
		}
		
		LinkedList <String> listaEnlazada = new LinkedList<String>(Lista);
		//Implementa otras interfaces para hacer colas (lo primero que sale es lo primero que entra (lifo), y lo ultimo que entra es lo primero que sale (fifo))
		//Se usa una estructura de datos doblemente enlazada. Es mas rapida para modificar datos
		
		System.out.println("\n");
		
		//MAPAS
		
		//Clase BigDecimals
		
		BigDecimal valorA = new BigDecimal(0.6f);
		BigDecimal valorB = new BigDecimal(0.6f);
		valorA.multiply(valorB);
		System.out.println(valorA.toString());
		
		System.out.println("\n");
		
		//HASH MAP
		//Funciona como un diccionario. La clave no puede tener multiples valores
		HashMap<String, Integer> Mapa = new HashMap<String, Integer>();
		Mapa.put("Sevilla", 1890);
		Mapa.put("Betis", 1907);
		Mapa.put("Malaga", 1904);
		Mapa.put("Cadiz", 1930);
		
		System.out.println(Mapa.get("Sevilla"));
		Mapa.replace("Cadiz", 1960);
		
		for(Map.Entry elemento: Mapa.entrySet()) {
			System.out.println("El mapa es: "+ elemento.getKey()+ " y "+elemento.getValue());
			
		}
		
	}

}
