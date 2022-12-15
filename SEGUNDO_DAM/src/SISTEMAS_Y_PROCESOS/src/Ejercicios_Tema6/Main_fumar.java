package Ejercicios_Tema6;

public class Main_fumar {
	
	private static Estanco tienda;
	private static Thread vendedor;
	private static Thread [] fumador;
	private static final int CANTIDADCONSUMIDORES = 3;

	public static void main(String[] args) {

		tienda = new Estanco();
		vendedor = new Thread (new Estanquero(tienda));
		fumador = new Thread [CANTIDADCONSUMIDORES];		
		for (int i = 0; i < fumador.length; i++) {
			fumador[i] = new Fumador(tienda, i);
		}
		vendedor.start();
		for (int i = 0; i < fumador.length; i++) {
			fumador[i].start();

		}
	}
}
