package Clases_CBDC;

import java.util.ArrayList;
import java.util.List;

public class Banco_Central_CBDC {

	public class BancoCentralCBDC {
		private double interes;
		private List<Cuenta_bancaria_CBDC> cuentasTotales;

		// Constructor
		public BancoCentralCBDC() {
			this.interes = 0;
			this.cuentasTotales = new ArrayList();
		}

		// Obtenemos el interes
		public double obtenerInteresBancoCentral() {
			return this.interes;
		}

		// Obtenemos las cuentas
		public List<Cuenta_bancaria_CBDC> obtenerCuentasTotales() {
			return cuentasTotales;
		}

		// Modificamos las cuentas
		public void EstablecerCuentasTotales(List<Cuenta_bancaria_CBDC> cuentasTotales) {
			this.cuentasTotales = cuentasTotales;
		}

		// Establecemos el interes
		public void EstablecerInteres(double interes) {
			this.interes = interes;
		}

		// Método para modificar los saldos de las carteras
		public double modificarSaldoAPositivo(double cantidad) {
			for (Cuenta_bancaria_CBDC cuenta_bancaria_CBDC : cuentasTotales) {
				cuenta_bancaria_CBDC.modificarSaldo(cantidad);
			}
			return cantidad;
		}

		// Método para reducir los saldos de las carteras
		public double modificarSaldoANegativo(double cantidad) {
			for (Cuenta_bancaria_CBDC cuenta_bancaria_CBDC : cuentasTotales) {
				cuenta_bancaria_CBDC.modificarSaldo(-cantidad);
			}
			return cantidad;
		}

		//Eliminamos dinero de las cuentas
		public void eliminarDinero(double cantidad) {
			for (Cuenta_bancaria_CBDC cuenta_bancaria_CBDC : cuentasTotales) {
				cuenta_bancaria_CBDC.retirar(cantidad);
			}
		}

		//Creamos dinero y lo mandamos a las cuentas
		public void crearDinero(double cantidad) {
			for (Cuenta_bancaria_CBDC cuenta_bancaria_CBDC : cuentasTotales) {
				cuenta_bancaria_CBDC.depositar(cantidad);
			}
		}

		// Método para crear una nueva cuenta bancaria
		public void crearCuenta(Cuenta_bancaria_CBDC cuenta) {
			cuentasTotales.add(cuenta);
		}

		// Método para eliminar una cuenta bancaria
		public void eliminarCuenta(Cuenta_bancaria_CBDC cuenta) {
			cuentasTotales.remove(cuenta);
		}

		// Método para aumentar el interés en las monedas digitales
		public void subirInteres(double cantidad) {
			this.interes += cantidad;
		}

		// Método para disminuir el interés en las monedas digitales
		public void bajarInteres(double cantidad) {
			this.interes -= cantidad;
		}
		
		 // Método para cambiar la operatividad de una cuenta bancaria
		  public void cambiarOperatividad(Cuenta_bancaria_CBDC cuenta, boolean operativa) {
		    cuenta.modificarOperativa(operativa);
		  }
		}
	}


