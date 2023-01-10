package Clases_CBDC;

import java.util.Date;
import java.util.List;

public class Uso_CBDC {

	public static void main(String[] args) {	
		// Crea dos objetos de la clase Cuenta_corriente_CBDC y el Banco Central
		Banco_Central_CBDC BCE = new Banco_Central_CBDC();
		Cuenta_bancaria_CBDC cuenta1 = new Cuenta_bancaria_CBDC("Juan Pérez", 'h', 0, 10000.);
		Cuenta_bancaria_CBDC cuenta2 = new Cuenta_bancaria_CBDC("Ana Martínez",'h', 0, 15000.0);
		Cuenta_bancaria_CBDC cuenta3 = new Cuenta_bancaria_CBDC("Pepe Martínez", 'h', 0, 15000.0);
		Cuenta_bancaria_CBDC cuenta4 = new Cuenta_bancaria_CBDC("Ana Botieso", 'h', 1500000, 15000.0);
		Cuenta_bancaria_CBDC cuenta5 = new Cuenta_bancaria_CBDC("Mina Bogordo", 'm', 1500000, 15000.0);
		Date fechaActual = new Date();
		System.out.println(fechaActual);
		
		BCE.crearCuenta(cuenta1);
		BCE.crearCuenta(cuenta2);
		BCE.crearCuenta(cuenta3);
		BCE.crearCuenta(cuenta4);
		BCE.crearCuenta(cuenta5);
		
		BCE.crearDineroTotal(10000);
		BCE.establecerTipoInteres(10);
		BCE.eliminarDineroCuenta(cuenta3, 250);
		BCE.modificarInteresCuenta(cuenta3, 2);
		BCE.cambiarLimiteHuellaCarbono(cuenta3, 100);
		BCE.cambiarOperatividad(cuenta3, false);
		BCE.establecerTramosIrpfCuenta(cuenta4);
		BCE.establecerCaducidadDineroenCuenta(fechaActual, cuenta5);
		BCE.establecerTramosIrpfCuenta(cuenta5);
		BCE.aplicarPerspectivaDeGenero(10);
		
		// Muestra información de las cuentas
		System.out.println(cuenta1.obtenerDatosCuenta()); 
		System.out.println();
		System.out.println(cuenta2.obtenerDatosCuenta()); 
		System.out.println();
		System.out.println(cuenta3.obtenerDatosCuenta()); 
		System.out.println();
		System.out.println(cuenta4.obtenerDatosCuenta()); 
		System.out.println();
		System.out.println(cuenta5.obtenerDatosCuenta()); 
		System.out.println();

		// Realiza una transferencia entre las dos cuentas
		System.out.println("Operaciones:");
		System.out.println("Tranferencia de la cuenta 1 a la cuenta 2");
		cuenta1.transferir(500, cuenta2);
		List<String> transacciones = cuenta1.obtenerTransacciones();
		for (String id_transaccion : transacciones) {
			System.out.println("El identificador de la transaccion es: " + id_transaccion);
		}
		System.out.println("Compra de un producto de la cuenta 2");
		String producto = cuenta2.agregarProducto("COCHE", 100000);
		cuenta2.realizarCompra(producto, 1000);
		System.out.println();
		
		// Muestra información actualizada de las cuentas
		System.out.println("Información de la cuenta 1 después de la transferencia:");
		System.out.println(cuenta1.obtenerDatosCuenta()); 
		System.out.println();

		System.out.println("Información de la cuenta 2 después de la transferencia y de la compra:");
		System.out.println(cuenta2.obtenerDatosCuenta()); 
		System.out.println();
		
		// Muestra si es operable tras la actuacion del Banco Central
		BCE.cambiarOperatividad(cuenta2, true);
		System.out.println("El Banco Central decide que la operatividad de la cuenta "+cuenta2.obtenerNumeroCuenta()+" sea "+ cuenta2.EsOperativa());
		System.out.println();
		
		// Creamos un buscador
		//System.out.println(BCE.BuscarNombre("Ana Botieso"));
	}

}
