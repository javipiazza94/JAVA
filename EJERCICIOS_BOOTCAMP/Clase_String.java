package EJERCICIOS_BOOTCAMP;

public class Clase_String {

	public static void main(String[] args) {
		
		String cadena = "El 11S lo hicieron los judios";
		String cadenaInvertida = "";
		for (int i = cadena.length()-1; i >=0; i--) {
			System.out.println("La cadena impresa "+ cadena.charAt(i));
			cadenaInvertida += cadena.charAt(i);
		}
		System.out.println(cadena);
		System.out.println(cadenaInvertida);

	}

}
