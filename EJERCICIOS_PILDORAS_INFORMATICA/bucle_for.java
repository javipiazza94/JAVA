package EJERCICIOS_PILDORAS_INFORMATICA;
import javax.swing.*;

public class bucle_for {

	public static void main(String[] args) {
		// Juega con el bucle for. Comrueba un email.
		
		/*int cont = 0;
		for (int i = 0; i<10; i+=2) {
			cont++;
			System.out.println("Se repite " +cont+ " veces");
		} */
		
		String mail = JOptionPane.showInputDialog("Introduce tu correo electronico");
		int arroba = 0;
		boolean punto = false;
		for (int i = 0; i<mail.length(); i++) {
			if (mail.charAt(i)=='.') {
				punto = true;
			}
			if (mail.charAt(i)=='@') {
				arroba++;
			}
		}
		if ((punto == true) && (arroba ==1)) {
			System.out.println("El correo es correcto");
		}else {
			System.out.println("El correo es incorrecto");
		}
	}

}
