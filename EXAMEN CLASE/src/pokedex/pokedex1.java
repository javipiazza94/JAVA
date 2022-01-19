package pokedex;

import java.util.ArrayList;
import java.util.Scanner;

public class pokedex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

	//HACEMOS UNA CLASE POKEMON PARA AÑADIR SUS CARACTERISTICAS Y QUE NOS DÉ LOS DATOS
		
		class Pokemon {
			public Pokemon (int numero, String nombre, String tipo, String habilidad) {
				this.numero= numero;
				this.nombre= nombre;
				this.tipo=tipo;
				this.habilidad=habilidad;
			}
			public String dameDatos() {
				return "El Pokemon se situa en el numero "+numero+", se llama "+nombre+" y es del "+tipo+" y tiene la habilidad oculta "+habilidad+"";
			}
			private int numero;
			private String nombre;
			private String tipo;
			private String habilidad;
		}
		
	//HACEMOS UN ARRAYLIST CON LOS POKEMON INICIALES
		
		ArrayList<Pokemon> listaPokemon = new ArrayList<Pokemon>();
		
		listaPokemon.add(new Pokemon(1, "Bulbasaur", "Tipo Planta/Veneno", "'Clorofila'"));
		listaPokemon.add(new Pokemon(2, "Ivisaur", "Tipo Planta/Veneno", "'Clorofila'"));
		listaPokemon.add(new Pokemon(3, "Venausaur", "Tipo Planta/Veneno", "'Clorofila'"));
		listaPokemon.add(new Pokemon(4, "Charmander", "Tipo Fuego", "'Poder solar'"));
		listaPokemon.add(new Pokemon(5, "Charmeleon", "Tipo Fuego", "'Poder solar'"));
		listaPokemon.add(new Pokemon(6, "Charizard", "Tipo Fuego/Volador", "'Poder solar'"));
		listaPokemon.add(new Pokemon(7, "Squirtle", "Tipo Agua", "'Cura lluvia'"));
		listaPokemon.add(new Pokemon(8, "Wartlotle", "Tipo Agua", "'Cura lluvia'"));
		listaPokemon.add(new Pokemon(9, "Blastoise", "Tipo Agua", "'Cura lluvia'"));
		
		/*for (Pokemon e: listaPokemon) {
			System.out.println(e.dameDatos());
		}	*/
		
	//BUSCAMOS A LOS POKEMON POR NUMERO EN LA POKEDEX
	
		System.out.println("Escribe el numero de la Pokedex del pokemon a elegir (Son los 9 principales de Kanto)");
		int n = sc.nextInt();
		
		if (n == 1) {
			System.out.println(listaPokemon.get(0).dameDatos());
		}
		else if (n == 2) {
			System.out.println(listaPokemon.get(1).dameDatos());
		}
		else if (n == 3) {
			System.out.println(listaPokemon.get(2).dameDatos());
		}
		else if (n == 4) {
			System.out.println(listaPokemon.get(3).dameDatos());
		}
		else if (n == 5) {
			System.out.println(listaPokemon.get(4).dameDatos());
		}
		else if (n == 6) {
			System.out.println(listaPokemon.get(5).dameDatos());
		}
		else if (n == 7) {
			System.out.println(listaPokemon.get(6).dameDatos());
		}
		else if (n == 8) {
			System.out.println(listaPokemon.get(7).dameDatos());
		}
		else if (n == 9) {
			System.out.println(listaPokemon.get(8).dameDatos());
		}else{
			System.out.println("Ese número no existe o no está en la base de datos de la Pokédex");
		}
		
	//BUSCAMOS A LOS POKEMON POR NOMBRE EN LA POKEDEX
		
		System.out.println("Escribe un pokemon a elegir");
		String elegido = sc.next();
		
		if (elegido.equals("Bulbasaur")) {
			System.out.println(listaPokemon.get(0).dameDatos());
		}
		else if (elegido.equals("Ivisaur")) {
			System.out.println(listaPokemon.get(1).dameDatos());
		}
		else if (elegido.equals("Venasaur")) {
			System.out.println(listaPokemon.get(2).dameDatos());
		}
		else if (elegido.equals("Charmander")) {
			System.out.println(listaPokemon.get(3).dameDatos());
		}
		else if (elegido.equals("Charmeleon")) {
			System.out.println(listaPokemon.get(4).dameDatos());
		}
		else if (elegido.equals("Charizard")) {
			System.out.println(listaPokemon.get(5).dameDatos());
		}
		else if (elegido.equals("Squirtle")) {
			System.out.println(listaPokemon.get(6).dameDatos());
		}
		else if (elegido.equals("Wartlotle")) {
			System.out.println(listaPokemon.get(7).dameDatos());
		}
		else if (elegido.equals("Blastoise")) {
			System.out.println(listaPokemon.get(8).dameDatos());
		}else{
			System.out.println("Ese Pokemon no existe o no está en la base de datos de la Pokédex");
		}
		
	//BUSCAMOS A LOS POKEMON POR TIPO EN LA POKEDEX
		
		System.out.println("Escribe un tipo a elegir");
		String tipopokemon = sc.next();
		
		if (tipopokemon.equals("Fuego")) {
				System.out.println(listaPokemon.get(3).dameDatos());
				System.out.println(listaPokemon.get(4).dameDatos());
				System.out.println(listaPokemon.get(5).dameDatos());
		}
		if (tipopokemon.equals("Agua")) {
				System.out.println(listaPokemon.get(6).dameDatos());
				System.out.println(listaPokemon.get(7).dameDatos());
				System.out.println(listaPokemon.get(8).dameDatos());
		}
		if (tipopokemon.equals("Planta")) {
			System.out.println(listaPokemon.get(0).dameDatos());
			System.out.println(listaPokemon.get(1).dameDatos());
			System.out.println(listaPokemon.get(2).dameDatos());
		}
		if (tipopokemon.equals("Volador")) {
			System.out.println(listaPokemon.get(5).dameDatos());
		}
		if (tipopokemon.equals("Veneno")) {
			System.out.println(listaPokemon.get(0).dameDatos());
			System.out.println(listaPokemon.get(1).dameDatos());
			System.out.println(listaPokemon.get(2).dameDatos());
		}
		
	//BUSCAMOS A LOS POKEMON POR HABILIDAD EN LA POKEDEX
		
		System.out.println("Escribe una habilidad a elegir");
		String skill = sc.nextLine();
		String filtro = sc.nextLine();
		if (skill.equals("Clorofila")) {
			System.out.println(listaPokemon.get(0).dameDatos());
			System.out.println(listaPokemon.get(1).dameDatos());
			System.out.println(listaPokemon.get(2).dameDatos());
		}
		if (skill.equals("Poder solar")) {
			System.out.println(listaPokemon.get(3).dameDatos());
			System.out.println(listaPokemon.get(4).dameDatos());
			System.out.println(listaPokemon.get(5).dameDatos());
		}
		if (skill.equals("Cura lluvia")) {
			System.out.println(listaPokemon.get(6).dameDatos());
			System.out.println(listaPokemon.get(7).dameDatos());
			System.out.println(listaPokemon.get(8).dameDatos());
		}else{
			System.out.println("Esa habilidad no existe o no está en la base de datos de la Pokédex");
		}
		sc.close();
	}
	}
