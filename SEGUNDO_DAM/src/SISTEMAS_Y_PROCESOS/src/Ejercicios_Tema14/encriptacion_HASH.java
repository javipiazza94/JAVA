package Ejercicios_Tema14;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.swing.JOptionPane;

public class encriptacion_HASH {

	public static String sha256(String input) {
		/*El método sha256 recibe una cadena de texto y devuelve una cadena encriptada en SHA-256. 
		Utiliza la clase MessageDigest para crear un objeto que puede encriptar una cadena. 
		Luego convierte la cadena de entrada a un arreglo de bytes y llama al método digest para obtener los bytes encriptados. 
		Finalmente, convierte los bytes encriptados en una cadena hexadecimal y devuelve la cadena resultante.*/
		
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] hash = digest.digest(input.getBytes());
			StringBuilder hexString = new StringBuilder();
			for (byte b : hash) {
				String hex = Integer.toHexString(0xff & b);
				if (hex.length() == 1)
					hexString.append('0');
				hexString.append(hex);
			}
			return hexString.toString();
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) {
		/*
		 * La clase encriptacion_HASH tiene un método main que se ejecuta cuando se inicia el programa.
		 *  Este método muestra una ventana para que el usuario ingrese una cadena y luego llama al método sha256 para encriptar la cadena ingresada. 
		 * Finalmente, muestra una ventana de mensaje con la cadena encriptada
		 */
		String frase = JOptionPane.showInputDialog(null, "Ingresa una cadena para encriptar:");
		String encryptado = sha256(frase);
		JOptionPane.showMessageDialog(null, "La cadena encriptada es: " + encryptado);
	}
}
