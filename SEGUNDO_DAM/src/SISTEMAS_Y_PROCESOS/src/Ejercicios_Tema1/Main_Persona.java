package Ejercicios_Tema1;
import java.util.*;

public class Main_Persona {
	//METODOS DE GENERAR PERSONA

	static Scanner escaner = new Scanner(System.in);

	static Persona Generar_Persona_1() {
		System.out.println("Introduce el nombre, el sexo, la edad, la altura y el peso de la persona");
		String nombre = escaner.next();
		char sexo = escaner.next().charAt(0);
		int edad = escaner.nextInt();
		double altura = escaner.nextDouble();
		double peso = escaner.nextDouble();
		Persona persona = new Persona(nombre, sexo, edad, altura, peso); // metemos por parametros los datos por escaner
		System.out.println(persona.toString());
		return persona;
	}

	static Persona Generar_Persona_2() {
		System.out.println("Introduce el nombre, el sexo y la edad de la persona");
		String nombre1 = escaner.next();
		char sexo1 = escaner.next().charAt(0);
		int edad1 = escaner.nextInt();
		Persona persona1 = new Persona(nombre1, sexo1, edad1);
		System.out.println(persona1.toString());
		return persona1;
	}

	public static void main(String[] args) {
		// Declaramos las personas

		ArrayList<Persona> lista = new ArrayList<Persona>();
		lista.add(Generar_Persona_1());
		lista.add(Generar_Persona_2());

		Persona JaviPelos = new Persona();
		JaviPelos.setAltura(1.78);
		JaviPelos.setEdad(34);
		JaviPelos.setNombre("Jaime Lannister");
		JaviPelos.setPeso(98.6);
		JaviPelos.setSexo('M');
		JaviPelos.Generar_DNI();

		System.out.println(JaviPelos.toString());
		escaner.close();
	}
}
