package ARRAYLIST;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Arraylista {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("METE UN VALOR");
		String valor = scanner.next();
		List<String> arraycolores = new ArrayList<String>();
		arraycolores.add("Rojo");
		arraycolores.add("Verde Betis");
		arraycolores.add(2, "Me pica el bloste");
		arraycolores.add(valor);
		
		scanner.close();
		System.out.println(arraycolores);
		arraycolores.set(1, "No encuentro mi ruca");
		System.out.println("El valor de la posicion 1 es "+arraycolores.get(1)+"");
		arraycolores.remove(3);
		System.out.println(arraycolores);
	}
}
