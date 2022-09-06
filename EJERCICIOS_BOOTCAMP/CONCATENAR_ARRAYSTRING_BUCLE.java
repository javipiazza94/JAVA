package EJERCICIOS_BOOTCAMP;


public class CONCATENAR_ARRAYSTRING_BUCLE {

	public static void main(String[] args) {
		// Haz un array de String y concatenalo
		
		String[]array = {"SAOKO ", "PAPI ", "SAOKO"};
		String frase = " ";
		
		for (int i = 0; i<array.length; i++) {
			System.out.println(frase +=array[i]); 			
		}
	}

}
