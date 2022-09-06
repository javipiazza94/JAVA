package EJERCICIOS_PILDORAS_INFORMATICA;

import javax.swing.*;

public class uso_coche {

	public static void main(String[] args) {
		// Metodos del uso del coche
		
		coche Peugeot = new coche (); // Ejemplo de lo que es INSTANCIAR UNA CLASE. Darle un valor de objeto.
		
		Peugeot.setCilindrada(400);
		System.out.print("La cilindrada es " +Peugeot.getCilindrada()+"cc \n");
		
		Peugeot.estableceColor(JOptionPane.showInputDialog("Introduce color"));
		System.out.println(Peugeot.getColor());
		
		Peugeot.setAsientos_cuero(JOptionPane.showInputDialog("Tiene asientos de cuero?"));
		System.out.println(Peugeot.isAsientos_cuero());
		
		Peugeot.setClimatizador(JOptionPane.showInputDialog("Tiene climatizador?"));
		System.out.println(Peugeot.isClimatizador());
		
		Peugeot.DimeDatosGenerales();
		System.out.println(Peugeot.DimeDatosGenerales());
		
		System.out.println("El precio total del coche es de "+Peugeot.Preciototal()+" euros");
		
		
}

}
