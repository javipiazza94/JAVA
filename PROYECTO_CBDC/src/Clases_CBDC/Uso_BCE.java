package Clases_CBDC;

public class Uso_BCE {

	public static void main(String[] args) {
		// COMPROBAMOS BCE EN TEXTO PLANO
		
		Banco_Central_CBDC BCE = new Banco_Central_CBDC(0.05);
		Cuenta_bancaria_CBDC cuenta = new Cuenta_bancaria_CBDC("Pepe", 'h', 1000);
		BCE.crearCuenta(cuenta);
		
		BCE.crearDineroCuenta(cuenta, 1000);
		BCE.modificarReserva(0.03);
		
		System.out.println(BCE.toString());

	}

}
