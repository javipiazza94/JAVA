package Ejercicios_basicos;
import java.util.*;

public class ARRAYS_pildoras_info_I {

	public static void main(String[] args) {
		// Usar arrays
		
		Scanner sc = new Scanner(System.in);
		
		int [] array = new int [100];
		
		for (int i = 0; i<array.length; i++) {
			array[i] = (int) Math.round(Math.random()*100);
	}
		for (int numeros:array) {
		System.out.println(numeros + " ");
		}
		sc.close();

}}
