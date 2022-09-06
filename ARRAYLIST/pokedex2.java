package ARRAYLIST;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class pokedex2 {

	public static void main(String[] args) {
		/* Cree un programa que simule una �Ruta� del juego de Pokemon. Este programa
		utilizar� una estructura de datos (ArrayList) para almacenar distintos pokemongogos
		que se puedan encontrar en esta ruta. Se deber� almacenar al menos 4
		pokemungus distintos en cada ruta, y se debe dar al usuario la opci�n de a�adir
		m�s. Y s�, por si te lo est�s preguntando, estamos hablando de ArrayList
		multidimensionales.*/
		
		Scanner sc = new Scanner(System.in);
		
		List<List<String>> ruta1 = new ArrayList();
		List<List<String>> ruta2 = new ArrayList();
		List<List<String>> ruta3 = new ArrayList();
	
	//ANADIMOS A LUGIA
	List<String> Lugia = new ArrayList <String>();
		Lugia.add("LUGIA");
		Lugia.add("El numero de su Pokedex: 249");
		Lugia.add("Tipo: Psiquico/Volador");
		Lugia.add("Descripcion: Lugia es parecido a un drag�n. Tiene la forma de un ave color blanco con el vientre azul claro, y las placas en su lomo y cola de color azul oscuro, con una envergadura superior a los 5 metros.");
	
	//ANADIMOS A HO OH
	List<String> Ho_Oh = new ArrayList <String>();
		Ho_Oh.add("HO-OH");
		Ho_Oh.add("El numero de su Pokedex: 250");
		Ho_Oh.add("Tipo: Fuego/Volador");
		Ho_Oh.add("Descripcion: Es un ave tan grande que oscureci� el Sol. Posee unas hermosas alas de siete colores y una cresta en su cabeza similar a la de un gallo.");
		
	//ANADIMOS A MEW
	List<String> Mew = new ArrayList <String>();
		Mew.add("MEW");
		Mew.add("El numero de su Pokedex: 151");
		Mew.add("Tipo: Psiquico");
		Mew.add("Descripcion: La forma de Mew es derivada del gato esfinge, ya que es de aspecto felino y color rosado. Adem�s, se dice que este Pok�mon s� tiene pelo, solo que a tama�o microsc�pico, igual que el verdadero animal. Mew tiene grandes poderes ps�quicos y los usa para esconderse o se oculta transform�ndose en otro Pok�mon.");
	
	//ANADIMOS A MEWTWO
	List<String> Mewtwo = new ArrayList <String>();
		Mewtwo.add("MEWTWO");
		Mewtwo.add("El numero de su Pokedex: 150");
		Mewtwo.add("Tipo: Psiquico");
		Mewtwo.add("Descripcion: Mewtwo es el resultado de las ambiciones de los seres humanos en la creaci�n de una reproducci�n gen�ticamente realzada (o m�s bien mejorada) de Mew.");
	
	//ANADIMOS A RAYQUAZA
	List<String> Rayquaza = new ArrayList <String>();
			Rayquaza.add("RAYQUAZA");
			Rayquaza.add("El numero de su Pokedex: 383");
			Rayquaza.add("Tipo: Dragon/Volador");
			Rayquaza.add("Descripcion: Rayquaza es un drag�n serpentiforme con dos extremidades superiores, nueve pares de alas aparentemente r�gidas (dos en la cabeza: las superiores mayores que las inferiores; cuatro repartidas en dos gruesos anillos que rodean su cuerpo; uno en su abdomen y dos en el extremo final de su cola) que seg�n parece le sirven para dirigir el aire alrededor suyo y cambiar de direcci�n mientras vuela (el mismo sistema utilizado por los aviones, algo l�gico pues ambos operan a grandes alturas). Su cuerpo es verde salvo ciertos retoques rojizos y una serie de l�neas amarillas que adornan su figura verde.");
		
	//ANADIMOS A KYOGRE
	List<String> Kyogre = new ArrayList <String>();
			Kyogre.add("KYOGRE");
			Kyogre.add("El numero de su Pokedex: 381");
			Kyogre.add("Tipo: Agua");
			Kyogre.add("Descripcion: Kyogre tiene forma de cet�ceo de proporciones colosales, ya que mide 4,5 metros y pesa 352 kilos. Biol�gicamente est� basado en una mezcla entre el cuerpo de un Glaucus atlanticus, y las manchas blancas junto a la cabeza de una Orca.");

	//ANADIMOS A GROUDON
	List<String> Groudon = new ArrayList <String>();
			Groudon.add("GROUDON");
			Groudon.add("El numero de su Pokedex: 382");
			Groudon.add("Tipo: Tierra");
			Kyogre.add("Descripcion: Groudon es un Pok�mon de color rojo con unas franjas de color azul oscuro parecidas a las de Kyogre excepto por el color, lo que demuestra su contraste como Pok�mon de la tierra y el mar. Su cola tiene forma de rastrillo. A pesar de ser el tercer Pok�mon m�s pesado no es el mas grande, aunque es igualmente enorme.");

	//ANADIMOS A RATATA
	List<String> Rattata = new ArrayList <String>();
			Rattata.add("RATTATA");
			Rattata.add("El numero de su Pokedex: 19");
			Rattata.add("Tipo: Normal");
			Rattata.add("Descripcion: Es una puta rata.");

	//ANADIMOS A PIDGEY
	List<String> Pidgey = new ArrayList <String>();
			Pidgey.add("PIDGEY");
			Pidgey.add("El numero de su Pokedex: 16");
			Pidgey.add("Tipo: Normal/Volador");
			Pidgey.add("Descripcion: Es una puta paloma de mierda.");
			
	//ANADIMOS A MAGIKARP
	List<String> Magikarp = new ArrayList <String>();
			Magikarp.add("MAGIKARP");
			Magikarp.add("El numero de su Pokedex: 129");
			Magikarp.add("Tipo: Agua");
			Magikarp.add("Descripcion: Es un pez que solo salpica.");
	//ANADIMOS A ARCEUS
	List<String> Arceus = new ArrayList <String>();
			Arceus.add("ARCEUS");
			Arceus.add("El numero de su Pokedex: 493");
			Arceus.add("Tipo: Normal");
			Arceus.add("Descripcion: Seg�n la mitolog�a de Sinnoh, Arceus surgi� de un huevo y despu�s cre� todo el mundo..");

	//ANADIMOS A BIDOOF
	List<String> Bidoof = new ArrayList <String>();
			Bidoof.add("BIDOOF");
			Bidoof.add("El numero de su Pokedex: 399");
			Bidoof.add("Tipo: Normal");
			Bidoof.add("Descripcion: Dios Bidoof.");
					
	//ANADIMOS LOS POKEMON A LAS RUTAS
			ruta1.add(Arceus);
			ruta1.add(Kyogre);
			ruta1.add(Ho_Oh);
			ruta1.add(Mewtwo);
			ruta2.add(Mew);
			ruta2.add(Groudon);
			ruta2.add(Lugia);
			ruta2.add(Rayquaza);
			ruta3.add(Bidoof);
			ruta3.add(Rattata);
			ruta3.add(Pidgey);
			ruta3.add(Magikarp);
			
	//PREGUNTAMOS QUE RUTA COGER
			boolean continuar = false;
			do {
			System.out.println("Indica que ruta quieres coger: izquierda (i) o derecha (d)");
			String respuesta = sc.next();
			
	//SELECCIONAMOS RUTA Y NOS ENCONTRAMOS UN POKEMON
			if (respuesta.equals("i")){
				System.out.println("Estas por la ruta 1. Te has topado con " +ruta1.get((int)(Math.random() * 4)));
			} else if (respuesta.equals("d")) {
				System.out.println("Estas por la ruta 2. Te has topado con " +ruta2.get((int)(Math.random() * 4)));
			}else {
				System.out.println("Te has esquivocado de ruta. Prueba otra vez");
			}
			
	// PREGUNTAMOS QUE QUIERE HACER DESPUES
			System.out.println("�Quieres seguir caminando (s) o a�adir un nuevo Pokemon (a)?");
			String respuesta2 = sc.next();
			
	// ACTUAMOS SEGUN LAS RESPUESTAS, O SEGUIMOS LA NUEVA RUTA O A�ADIMOS UN NUEVO POKEMON
			if (respuesta2.equals("s")){
				System.out.println("Estas por la ruta 3. Te has topado con " +ruta3.get((int)(Math.random() * 4)));
			}
			else if (respuesta2.equals("a")){
				List<String> pokemonnuevo = new ArrayList <String>();
				System.out.println("Introduce el nombre del nuevo pokemon");
				pokemonnuevo.add(sc.next());
				System.out.println("Introduce la descripci�n del nuevo pokemon");
				pokemonnuevo.add(sc.next());
				System.out.println("Introduce el tipo del nuevo pokemon");
				pokemonnuevo.add(sc.next());
				System.out.println("Introduce el n�mero del nuevo pokemon");
				pokemonnuevo.add(sc.next());
				System.out.println("El Pokemon "+ pokemonnuevo.get(0)+" se ha a�adido correctamente");
				
			} else{
				System.out.println("Se ha equivocado");
			}
			
			System.out.println("�Quieres continuar? Responde 'si' o 'no'");
			String respuesta3 = sc.next();
			if (respuesta3.equals("no")) {
				continuar = true;
				System.out.println("Has salido del juego");
			}
			}while (!continuar);
		sc.close();
	}

}
