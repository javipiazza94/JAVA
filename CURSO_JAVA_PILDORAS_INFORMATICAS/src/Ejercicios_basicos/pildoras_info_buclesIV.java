package Ejercicios_basicos;

import javax.swing.*;

public class pildoras_info_buclesIV {

	public static void main(String[] args) {
		// Genera el factorial de un numero

		int resultado = 1;
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero para factorizar"));
		 
		 for (int i = numero; i>0; i--){
			 
			 resultado = resultado*i;			 
			 
		 } System.out.println("El factorial de "+numero+" es "+resultado);
	}

}
