package EJERCICIOS_PILDORAS_INFORMATICA;
import java.util.*;
import javax.swing.*;
public class pildorasinfo_dowhile {

	public static void main(String[] args) {
		// Calcula el peso ideal de una persona
		
		Scanner sc = new Scanner(System.in);
		
		String Sexo = "";
		int altura_mujer = 0;
		int altura_hombre = 0;
		
		boolean continuar = false;
		
		do {
			Sexo = JOptionPane.showInputDialog("Introduce tu sexo");
			if (Sexo.equalsIgnoreCase("Mujer")){
				altura_mujer = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura de la mujer en centimetros"));
				
				System.out.println("El peso ideal de la mujer es "+(altura_mujer - 120)+ " kilos");
			}
			if (Sexo.equalsIgnoreCase("Hombre")){
				altura_hombre = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura del hombre en centimetros"));
				
				System.out.println("El peso ideal del hombre es "+(altura_hombre - 110)+ " kilos");
			}
			System.out.println("¿Quieres continuar? Responde 'si' o 'no'");
			String respuesta = sc.nextLine();
			if (respuesta.equalsIgnoreCase("no")) {
				continuar = true;
				System.out.println("Has salido del programa");
			}
		} while (!continuar);
			sc.close();
	}

}
