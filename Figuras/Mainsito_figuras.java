package Figuras;

import CLASES_PROPIAS.Triangulo;

public class Mainsito_figuras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangulo r1 = new Rectangulo(5, 6);
		Circulo c1 = new Circulo(20);
		triangulo t1 = new triangulo(5, 5, 10, 5);
		
	System.out.println(c1.comparaArea(r1));

	}

}
