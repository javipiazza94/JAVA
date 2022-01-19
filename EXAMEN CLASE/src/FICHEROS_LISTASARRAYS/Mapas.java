package FICHEROS_LISTASARRAYS;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Mapas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String,String> hashmap= new HashMap<String,String>();
		hashmap.put("Domin", "calvo");
		hashmap.put("Valverde", "Gorfo");
		hashmap.put("Rafita", "macho iberico");
		hashmap.put("Javi", "sireno");
		hashmap.put("Josan", "gustozo");
		
		System.out.println("Dime una persona");
		String persona = sc.next();
		
		System.out.println("Su cualidad es "+ hashmap.get(persona));
		
		//Para recorrerlo necesitamos un iterador
		
		Iterator it= hashmap.entrySet().iterator();
		//para recorrer el iterador
		while (it.hasNext()){
			Map.Entry<String, String> entrada = (Map.Entry)it.next(); //Nos da la capacidad de imprimir la clave y el valor, aunque si sabemos la clave podemos ver el valor
			System.out.println("La entrada es: "+entrada.getKey() + " y el valor es " +entrada.getValue());
		}
	}

}
