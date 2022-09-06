package EJERCICIOS_BOOTCAMP;

import java.util.Vector;

public class VECTORES {

	public static void main(String[] args) {
		// Voy a hacer operaciones con vectores
		
		Vector <Integer> vector = new Vector(50, 70); //Capacidad inicial de 50, se incrementa en 70
		vector.add(3457);
		vector.add(136474);
		vector.add(2982432);
		vector.add(45667);
		vector.add(3457);
		vector.add(136474);
		vector.add(2982432);
		vector.add(4567);
		vector.add(3457);
		vector.add(136474);
		vector.add(2982432);
		vector.add(8997);
		
		System.out.println(vector);
		System.out.println("La capacidad del vector es "+vector.capacity());
		System.out.println("El tamano del vector es "+vector.size());
		System.out.println("Vamos a borrar la posicion 3: "+vector.remove(3));
		System.out.println(vector);
		
		 System.out.println("\n");
		
		for (int i: vector) {
			System.out.println("Valor actual del vector: "+i);
		}
		
		for (int i = 0; i<vector.size(); i++) {
			System.out.println("Valor actual del vector con for tradicional: "+vector.get(i)+ " en posicion "+i);
			if (i%2==0) {
				vector.remove(i);
			}
		}
		
		System.out.println("\n");
		
		Vector <String> vector2 = new Vector (20);
		vector2.add("Alcaraz");
		vector2.add("padrea");
		vector2.add("mas");
		vector2.add("si");
		vector2.add("puedes");
		
		System.out.println("La capacidad del vector es "+vector2.capacity()+ " y el tamano es "+vector2.size());
		vector2.trimToSize();
		System.out.println("La capacidad del vector es "+vector2.capacity()+ " y el tamano es "+vector2.size());
		

	}

}
