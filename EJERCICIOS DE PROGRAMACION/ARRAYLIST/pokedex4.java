package ARRAYLIST;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class pokedex4 {

	public static void main(String[] args) {
		/*
		 * Cree un programa que permita alentrenador pokemon elegir entre las
		 * siguientes opciones:
		 * 
		 * a) Cambiar de ruta: El entrenador deberá elegir en qué ruta quiere
		 * capturar pokes.
		 * 
		 * b) Consultar Pokedex: El entrenador podrá realizar consultas de la
		 * información de los pokemon que se encuentran en la pokedex.
		 * 
		 * c) Capturar Pokemon: El usuario se encontrará con un pokemon
		 * aleatorio de los disponibles en la ruta en la que se encuentra, puede
		 * elegir entre capturarlo o huir. Esto genera dos resultados:
		 * 
		 * i. Si huye, se almacena la información siguiente del pokemon en la
		 * pokedex: numero y tipo. ii. En caso de que se capture, se almacena
		 * también la descripción del Pokemon.
		 */

		Scanner sc = new Scanner(System.in);

		// AÑADIMOS A LOS POKEMON EN LA POKEDEX CON UN HASHMAP DE VARIAS LISTAS
		// ARRAY
		HashMap<String, List<String>> Pokemon = new HashMap<String, List<String>>();

		// AÑADIMOS A CHARMANDER
		List<String> Charmander = new ArrayList<String>();
		Charmander.add("CHARMANDER");
		Charmander.add("El numero de su Pokedex: 4");
		Charmander.add("Tipo: Fuego");
		Charmander.add("Descripcion: Prefiere las cosas calientes. Dicen que cuando llueve le sale vapor de la punta de la cola.");

		// ANADIMOS A BULBASAUR
		List<String> Bulbasaur = new ArrayList<String>();
		Bulbasaur.add("BULBASAUR");
		Bulbasaur.add("El numero de su Pokedex: 1");
		Bulbasaur.add("Tipo: Planta/Veneno");
		Bulbasaur.add("Descripcion: Este Pokémon nace con una semilla en el lomo, que brota con el paso del tiempo.");

		// ANADIMOS A SQUIRTLE
		List<String> Squirtle = new ArrayList<String>();
		Squirtle.add("SQUIRTLE");
		Squirtle.add("El numero de su Pokedex: 7");
		Squirtle.add("Tipo: Agua");
		Squirtle.add("Descripcion: Cuando retrae su largo cuello en el caparazón, dispara agua a una presión increíble.");

		// ANADIMOS A LUGIA
		List<String> Lugia = new ArrayList<String>();
		Lugia.add("LUGIA");
		Lugia.add("El numero de su Pokedex: 249");
		Lugia.add("Tipo: Psiquico/Volador");
		Lugia.add("Descripcion: Lugia es parecido a un dragón. Tiene la forma de un ave color blanco con el vientre azul claro, y las placas en su lomo y cola de color azul oscuro, con una envergadura superior a los 5 metros.");

		// ANADIMOS A HO OH
		List<String> Ho_Oh = new ArrayList<String>();
		Ho_Oh.add("HO-OH");
		Ho_Oh.add("El numero de su Pokedex: 250");
		Ho_Oh.add("Tipo: Fuego/Volador");
		Ho_Oh.add("Descripcion: Es un ave tan grande que oscureció el Sol. Posee unas hermosas alas de siete colores y una cresta en su cabeza similar a la de un gallo.");

		// ANADIMOS A MEW
		List<String> Mew = new ArrayList<String>();
		Mew.add("MEW");
		Mew.add("El numero de su Pokedex: 151");
		Mew.add("Tipo: Psiquico");
		Mew.add("Descripcion: La forma de Mew es derivada del gato esfinge, ya que es de aspecto felino y color rosado. Además, se dice que este Pokémon sí tiene pelo, solo que a tamaño microscópico, igual que el verdadero animal. Mew tiene grandes poderes psíquicos y los usa para esconderse o se oculta transformándose en otro Pokémon.");

		// ANADIMOS A MEWTWO
		List<String> Mewtwo = new ArrayList<String>();
		Mewtwo.add("MEWTWO");
		Mewtwo.add("El numero de su Pokedex: 150");
		Mewtwo.add("Tipo: Psiquico");
		Mewtwo.add("Descripcion: Mewtwo es el resultado de las ambiciones de los seres humanos en la creación de una reproducción genéticamente realzada (o más bien mejorada) de Mew.");

		// ANADIMOS A RAYQUAZA
		List<String> Rayquaza = new ArrayList<String>();
		Rayquaza.add("RAYQUAZA");
		Rayquaza.add("El numero de su Pokedex: 383");
		Rayquaza.add("Tipo: Dragon/Volador");
		Rayquaza.add("Descripcion: Rayquaza es un dragón serpentiforme con dos extremidades superiores, nueve pares de alas aparentemente rígidas (dos en la cabeza: las superiores mayores que las inferiores; cuatro repartidas en dos gruesos anillos que rodean su cuerpo; uno en su abdomen y dos en el extremo final de su cola) que según parece le sirven para dirigir el aire alrededor suyo y cambiar de dirección mientras vuela (el mismo sistema utilizado por los aviones, algo lógico pues ambos operan a grandes alturas). Su cuerpo es verde salvo ciertos retoques rojizos y una serie de líneas amarillas que adornan su figura verde.");

		// ANADIMOS A KYOGRE
		List<String> Kyogre = new ArrayList<String>();
		Kyogre.add("KYOGRE");
		Kyogre.add("El numero de su Pokedex: 381");
		Kyogre.add("Tipo: Agua");
		Kyogre.add("Descripcion: Kyogre tiene forma de cetáceo de proporciones colosales, ya que mide 4,5 metros y pesa 352 kilos. Biológicamente está basado en una mezcla entre el cuerpo de un Glaucus atlanticus, y las manchas blancas junto a la cabeza de una Orca.");

		// ANADIMOS A GROUDON
		List<String> Groudon = new ArrayList<String>();
		Groudon.add("GROUDON");
		Groudon.add("El numero de su Pokedex: 382");
		Groudon.add("Tipo: Tierra");
		Groudon.add("Descripcion: Groudon es un Pokémon de color rojo con unas franjas de color azul oscuro parecidas a las de Kyogre excepto por el color, lo que demuestra su contraste como Pokémon de la tierra y el mar. Su cola tiene forma de rastrillo. A pesar de ser el tercer Pokémon más pesado no es el mas grande, aunque es igualmente enorme.");

		// ANADIMOS A RATATA
		List<String> Rattata = new ArrayList<String>();
		Rattata.add("RATTATA");
		Rattata.add("El numero de su Pokedex: 19");
		Rattata.add("Tipo: Normal");
		Rattata.add("Descripcion: Es una puta rata.");

		// ANADIMOS A PIDGEY
		List<String> Pidgey = new ArrayList<String>();
		Pidgey.add("PIDGEY");
		Pidgey.add("El numero de su Pokedex: 16");
		Pidgey.add("Tipo: Normal/Volador");
		Pidgey.add("Descripcion: Es una puta paloma de mierda.");

		// ANADIMOS A MAGIKARP
		List<String> Magikarp = new ArrayList<String>();
		Magikarp.add("MAGIKARP");
		Magikarp.add("El numero de su Pokedex: 129");
		Magikarp.add("Tipo: Agua");
		Magikarp.add("Descripcion: Es un pez que solo salpica.");
		// ANADIMOS A ARCEUS
		List<String> Arceus = new ArrayList<String>();
		Arceus.add("ARCEUS");
		Arceus.add("El numero de su Pokedex: 493");
		Arceus.add("Tipo: Normal");
		Arceus.add("Descripcion: Según la mitología de Sinnoh, Arceus surgió de un huevo y después creó todo el mundo.");

		// ANADIMOS A BIDOOF
		List<String> Bidoof = new ArrayList<String>();
		Bidoof.add("BIDOOF");
		Bidoof.add("El numero de su Pokedex: 399");
		Bidoof.add("Tipo: Normal");
		Bidoof.add("Descripcion: Dios Bidoof.");

		// HACEMOS EL HASHMAP DE CADA POKEMON
		Pokemon.put("1", Bulbasaur);
		Pokemon.put("4", Charmander);
		Pokemon.put("7", Squirtle);
		Pokemon.put("493", Arceus);
		Pokemon.put("381", Kyogre);
		Pokemon.put("250", Ho_Oh);
		Pokemon.put("150", Mewtwo);
		Pokemon.put("151", Mew);
		Pokemon.put("382", Groudon);
		Pokemon.put("249", Lugia);
		Pokemon.put("383", Rayquaza);
		Pokemon.put("399", Bidoof);
		Pokemon.put("19", Rattata);
		Pokemon.put("16", Pidgey);
		Pokemon.put("129", Magikarp);

		// HACEMOS LAS RUTAS Y LAS ASOCIAMOS A LOS POKEMON
		List<List<String>> rutalegendaria = new ArrayList();
		List<List<String>> rutamatados = new ArrayList();

		rutalegendaria.add(Arceus);
		rutalegendaria.add(Kyogre);
		rutalegendaria.add(Ho_Oh);
		rutalegendaria.add(Mewtwo);
		rutalegendaria.add(Mew);
		rutalegendaria.add(Groudon);
		rutalegendaria.add(Lugia);
		rutalegendaria.add(Rayquaza);
		rutamatados.add(Bidoof);
		rutamatados.add(Rattata);
		rutamatados.add(Pidgey);
		rutamatados.add(Magikarp);
		rutamatados.add(Charmander);
		rutamatados.add(Bulbasaur);
		rutamatados.add(Squirtle);

		// PREGUNTAMOS AL USUARIO SI QUIERE CONSULTAR LA POKEDEX O HACER UNA
		// RUTA
		boolean continuar = false;
		do {
		System.out.println("¿Quieres consultar la pokedex o realizar una ruta? Escribe 'ruta' o 'pokedex'. ");
		String respuesta = sc.nextLine();

		// SI EL USUARIO ELIGE CONSULTAR LA POKEDEX
			if (respuesta.contains("pokedex")) {
					System.out.println("Dime un pokemon");
					String poke = sc.nextLine();
		
					if (poke.contains("Bulbasaur")) {
						System.out.println("Sus caracteristicas son " + Pokemon.get("1"));
					} else if (poke.contains("Charmander")) {
						System.out.println("Sus caracteristicas son " + Pokemon.get("4"));
					} else if (poke.contains("Squirtle")) {
						System.out.println("Sus caracteristicas son " + Pokemon.get("7"));
					} else if (poke.contains("Arceus")) {
						System.out.println("Sus caracteristicas son " + Pokemon.get("493"));
					} else if (poke.contains("Kyogre")) {
						System.out.println("Sus caracteristicas son " + Pokemon.get("381"));
					} else if (poke.contains("Ho-Oh")) {
						System.out.println("Sus caracteristicas son " + Pokemon.get("250"));
					} else if (poke.contains("Mewtwo")) {
						System.out.println("Sus caracteristicas son " + Pokemon.get("150"));
					} else if (poke.contains("Mew")) {
						System.out.println("Sus caracteristicas son " + Pokemon.get("151"));
					} else if (poke.contains("Groudon")) {
						System.out.println("Sus caracteristicas son " + Pokemon.get("382"));
					} else if (poke.contains("Lugia")) {
						System.out.println("Sus caracteristicas son " + Pokemon.get("249"));
					} else if (poke.contains("Rayquaza")) {
						System.out.println("Sus caracteristicas son " + Pokemon.get("383"));
					} else if (poke.contains("Bidoof")) {
						System.out.println("Sus caracteristicas son " + Pokemon.get("399"));
					} else if (poke.contains("Rattata")) {
						System.out.println("Sus caracteristicas son " + Pokemon.get("19"));
					} else if (poke.contains("Pidgey")) {
						System.out.println("Sus caracteristicas son " + Pokemon.get("16"));
					} else if (poke.contains("Magikarp")) {
						System.out.println("Sus caracteristicas son " + Pokemon.get("129"));
					}else{
						System.out.println("Ese Pokemon no está registrado en nuestra Pokedex");
					}
				}

		// SI EL USUARIO ELIGE CRUZAR LA RUTA
			if (respuesta.contains("ruta")) {
				System.out.println("Indica que ruta quieres coger: izquierda (i) o derecha (d)");
				String rutas = sc.nextLine();
				int pokerandm = (int) (Math.random() * 8);
				int pokerandm2 = (int) (Math.random() * 7);
				if (rutas.equals("i")) {
					System.out.println("Estas por la ruta 1. Un " + rutalegendaria.get(pokerandm)+" apareció");
					System.out.println("¿Quieres capturar este Pokemon? Contesta 'si' o 'no'");
					String capturas = sc.nextLine();
					if (capturas.equals("si")) {
						System.out.println("Introduzca tipo de pokeball: 'master ball', 'poke ball', 'super ball'");
						String tipoball = sc.nextLine();
						if (tipoball.equals("poke ball")){
							System.out.println("Introduzca un numero del 1 al 4");
							int pokeball2 = sc.nextInt();
							String filtro1 =sc.nextLine();
							switch (pokeball2) 
							{ 
							case 1:System.out.println("El Pokemon " + rutalegendaria.get(pokerandm)
							+ " ha sido capturado y almacenado en tu Pokédex");break; 
							case 2: System.out.println("El Pokemon " + rutalegendaria.get(pokerandm)
							+ " no ha sido capturado y se ha escapado. Puedes marcharte, el Pokemon no se ha podido almacenar en tu Pokédex");break;
							case 3: System.out.println("El Pokemon " + rutalegendaria.get(pokerandm)
							+ " no ha sido capturado y se ha escapado. Puedes marcharte, el Pokemon no se ha podido almacenar en tu Pokédex");break; 
							case 4: System.out.println("El Pokemon " + rutalegendaria.get(pokerandm)
							+ " no ha sido capturado y se ha escapado. Puedes marcharte, el Pokemon no se ha podido almacenar en tu Pokédex");break;
							default: System.out.println("Mamapolla te quedas sin Pokemon");}
						}
						if (tipoball.equals("master ball")){
								
							System.out.println("El Pokemon " + rutalegendaria.get(pokerandm)
								+ " ha sido capturado y almacenado en tu Pokédex");
								}
						if (tipoball.equals("super ball")){
							System.out.println("Introduzca un numero del 1 al 6");
							int pokeball3 = sc.nextInt();
							String filtro2 =sc.nextLine();
							switch (pokeball3) 
							{ 
							case 1:System.out.println("El Pokemon " + rutalegendaria.get(pokerandm)
							+ " ha sido capturado y almacenado en tu Pokédex");break; 
							case 2: System.out.println("El Pokemon " + rutalegendaria.get(pokerandm)
							+ " no ha sido capturado y se ha escapado. Puedes marcharte, el Pokemon no se ha podido almacenar en tu Pokédex");break;
							case 3: System.out.println("El Pokemon " + rutalegendaria.get(pokerandm)
							+ " ha sido capturado y almacenado en tu Pokédex");break;  
							case 4: System.out.println("El Pokemon " + rutalegendaria.get(pokerandm)
							+ " no ha sido capturado y se ha escapado. Puedes marcharte, el Pokemon no se ha podido almacenar en tu Pokédex");break;
							case 5: System.out.println("El Pokemon " + rutalegendaria.get(pokerandm)
							+ " ha sido capturado y almacenado en tu Pokédex");break;
							case 6: System.out.println("El Pokemon " + rutalegendaria.get(pokerandm)
							+ " no ha sido capturado y se ha escapado. Puedes marcharte, el Pokemon no se ha podido almacenar en tu Pokédex");break;
							default: System.out.println("Mamapolla te quedas sin Pokemon");
							}	
								
					}
					if (capturas.equals("no")) {
						System.out.println("Puedes marcharte, los datos del Pokemon" + rutalegendaria.get(pokerandm)
								+ " se han almacenado en tu Pokédex");
					}
					}
				} else if (rutas.equals("d")) {
					System.out.println("Estas por la ruta 2. Un " + rutamatados.get(pokerandm2)+" apareció");
					System.out.println("¿Quieres capturar este Pokemon? Contesta 'si' o 'no'");
					String capturas2 = sc.nextLine();
					if (capturas2.equals("si")){
						System.out.println("Introduzca tipo de pokeball: 'master ball', 'poke ball', 'super ball'");
						String tipoball = sc.nextLine();
						if (tipoball.equals("poke ball")){
							System.out.println("Introduzca un numero del 1 al 4");
							int pokeball2 = sc.nextInt();
							String filtro3 =sc.nextLine();
							switch (pokeball2) 
							{ 
							case 1:System.out.println("El Pokemon " + rutamatados.get(pokerandm2)
							+ " ha sido capturado y almacenado en tu Pokédex");break; 
							case 2: System.out.println("El Pokemon " + rutamatados.get(pokerandm2)
							+ " no ha sido capturado y se ha escapado. Puedes marcharte, el Pokemon no se ha podido almacenar en tu Pokédex");break;
							case 3: System.out.println("El Pokemon " + rutamatados.get(pokerandm2)
							+ " no ha sido capturado y se ha escapado. Puedes marcharte, el Pokemon no se ha podido almacenar en tu Pokédex");break; 
							case 4: System.out.println("El Pokemon " + rutamatados.get(pokerandm2)
							+ " no ha sido capturado y se ha escapado. Puedes marcharte, el Pokemon no se ha podido almacenar en tu Pokédex");break;
							default: System.out.println("Mamapolla te quedas sin Pokemon");}
							}
						if (tipoball.equals("master ball")){
								
							System.out.println("El Pokemon " + rutamatados.get(pokerandm2)
								+ " ha sido capturado y almacenado en tu Pokédex");
								}
						if (tipoball.equals("super ball")){
							System.out.println("Introduzca un numero del 1 al 6");
							int pokeball2 = sc.nextInt();
							String filtro4 =sc.nextLine();
							switch (pokeball2) 
							{ 
							case 1:System.out.println("El Pokemon " + rutamatados.get(pokerandm2)
							+ " ha sido capturado y almacenado en tu Pokédex");break; 
							case 2: System.out.println("El Pokemon " + rutamatados.get(pokerandm2)
							+ " no ha sido capturado y se ha escapado. Puedes marcharte, el Pokemon no se ha podido almacenar en tu Pokédex");break;
							case 3: System.out.println("El Pokemon " + rutamatados.get(pokerandm2)
							+ " ha sido capturado y almacenado en tu Pokédex");break;  
							case 4: System.out.println("El Pokemon " + rutamatados.get(pokerandm2)
							+ " no ha sido capturado y se ha escapado. Puedes marcharte, el Pokemon no se ha podido almacenar en tu Pokédex");break;
							case 5: System.out.println("El Pokemon " + rutamatados.get(pokerandm2)
							+ " ha sido capturado y almacenado en tu Pokédex");break;
							case 6: System.out.println("El Pokemon " + rutamatados.get(pokerandm2)
							+ " no ha sido capturado y se ha escapado. Puedes marcharte, el Pokemon no se ha podido almacenar en tu Pokédex");break;
							default: System.out.println("Mamapolla te quedas sin Pokemon");}	
						}
					}
					if (capturas2.equals("no")) {
						System.out.println("Puedes marcharte, el Pokemon avistado es " + rutamatados.get(pokerandm2)
								+ " se ha almacenado en tu Pokédex");
						}
					}
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