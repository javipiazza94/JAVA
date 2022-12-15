package ARRAYLIST;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class copiar_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		List<String> array1 = new ArrayList<String>();
		List<String> array2 = new ArrayList<String>();
	
		boolean acabado = false;
		do {
			System.out.println("Mete el nombre del alumno");
			String array = scanner.next();
			array1.add(array);
			
			if (array.equals("YA")){
				acabado = true;
				array1.remove("YA");
			}
		
		} while (!acabado);
		
		for (int i = 0 ; i<array1.size(); i++){
			array2.add(array1.get(i));
		}
		
		System.out.println(array2);
	}

}
