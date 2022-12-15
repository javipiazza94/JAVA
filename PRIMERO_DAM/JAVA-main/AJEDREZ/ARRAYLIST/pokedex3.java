package ARRAYLIST;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class pokedex3 {
	public static void main(String[] args) {
		/* Cree un programa que simule una Pokédex. En esta Pokédex se podrá introducir el
		nombre de un pokemon y recibir toda la información del mismo. La pokédex deberá
		tener los 3 pokemon iniciales de la región de Kanto hardcodeados y debe permitir
		añadir nuevos pokes. Utilice HashMap.*/
		
		Scanner sc = new Scanner(System.in);
		
	//AÑADIMOS A LOS POKEMON EN LA POKEDEX CON UN HASHMAP DE VARIAS LISTAS ARRAY
		HashMap<String, List <String>> Pokemon= new HashMap<String, List<String>>();
		
	//AÑADIMOS A CHARMANDER
	List<String> Charmander = new ArrayList <String>();
		Charmander.add("CHARMANDER");
		Charmander.add("El numero de su Pokedex: 4");
		Charmander.add("Tipo: Fuego");
		Charmander.add("Habilidad: Poder solar.");
	
	//ANADIMOS A BULBASAUR
	List<String> Bulbasaur = new ArrayList <String>();
		Bulbasaur.add("BULBASAUR");
		Bulbasaur.add("El numero de su Pokedex: 1");
		Bulbasaur.add("Tipo: Planta/Veneno");
		Bulbasaur.add("Habilidad: Clorofila.");
		
	//ANADIMOS A SQUIRTLE
	List<String> Squirtle = new ArrayList <String>();
		Squirtle.add("SQUIRTLE");
		Squirtle.add("El numero de su Pokedex: 7");
		Squirtle.add("Tipo: Agua");
		Squirtle.add("Habilidad: Cura lluvia.");
	
	//HACEMOS EL HASHMAP DE CADA POKEMON	
		Pokemon.put("1", Bulbasaur);
		Pokemon.put("4", Charmander);
		Pokemon.put("7", Squirtle);
		
	
	//PEDIMOS EL POKEMON Y SUS CARACTERISTICAS	
		boolean continuar = false;
		do {
		System.out.println("Dime un pokemon");
		String poke = sc.nextLine();
		
		if (poke.contains("Bulbasaur")){
		System.out.println("Sus caracteristicas son "+ Pokemon.get("1"));
		}
		else if (poke.contains("Charmander")){
		System.out.println("Sus caracteristicas son "+ Pokemon.get("4"));
		}
		else if (poke.contains("Squirtle")){
		System.out.println("Sus caracteristicas son "+ Pokemon.get("7"));
		}else {
		System.out.println("El Pokemon no existe en nuestra base de datos.");
	}
	
	//PEDIMOS QUE AÑADA UN NUEVO POKEMON
		System.out.println("¿Quieres añadir un nuevo pokemon (si) o (no)");
		String respuesta = sc.nextLine();
		
		if (respuesta.equals("no")){
			System.out.println("De acuerdo. La base de datos de la pokedex ha sido completada");
		}
		else if (respuesta.equals("si")){
			HashMap<String, List <String>> NewPokemon= new HashMap<String, List<String>>();
			List<String> pokemonnuevo = new ArrayList <String>();
			NewPokemon.put("0", pokemonnuevo);
			System.out.println("Introduce el nombre del nuevo pokemon");
			pokemonnuevo.add(sc.nextLine());
			System.out.println("Introduce la descripción del nuevo pokemon");
			pokemonnuevo.add(sc.nextLine());
			System.out.println("Introduce el tipo del nuevo pokemon");
			pokemonnuevo.add(sc.nextLine());
			System.out.println("Introduce el número del nuevo pokemon");
			pokemonnuevo.add(sc.nextLine());
			System.out.println("Sus caracteristicas son "+ NewPokemon.get("0"));
			System.out.println("El Pokemon "+ pokemonnuevo.get(0)+" se ha añadido correctamente");
		}
		System.out.println("¿Quieres continuar? Responde 'si' o 'no'");
		String respuesta2 = sc.nextLine();
		if (respuesta2.equals("no")) {
			continuar = true;
			System.out.println("Has salido del juego");
		}
		
		}while (!continuar);
		sc.close();
}
}