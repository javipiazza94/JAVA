package Clases_CBDC;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Banco_Central_CBDC {

	private double interes;
	private List<Cuenta_bancaria_CBDC> cuentasTotales;

	// Constructor
	public Banco_Central_CBDC() {
		this.interes = 0;
		this.cuentasTotales = new ArrayList<>();
	}

	// Obtenemos el interes
	public double obtenerInteres() {
		return interes;
	}

	// Obtenemos las cuentas
	public List<Cuenta_bancaria_CBDC> obtenerCuentasTotales() {
		return cuentasTotales;
	}

	// Aplicamos subida de dinero si es mujer
	public void aplicarPerspectivaDeGenero(double pastaExtra) {
		for (Cuenta_bancaria_CBDC cuenta_bancaria_CBDC : cuentasTotales) {
			if (cuenta_bancaria_CBDC.obtenerSexo() == 'm') {
				cuenta_bancaria_CBDC.modificarSaldo(cuenta_bancaria_CBDC.obtenerSaldo() * pastaExtra);
			}
		}
	}

	// Aplicamos subida de dinero si es inmigrante
	public void aplicarMulticulturalidad(double pastaExtra) {
		for (Cuenta_bancaria_CBDC cuenta_bancaria_CBDC : cuentasTotales) {
			if (cuenta_bancaria_CBDC.obtenerComunitario()) {
				cuenta_bancaria_CBDC.modificarSaldo(cuenta_bancaria_CBDC.obtenerSaldo() * pastaExtra);
			}
		}
	}

	// Establecemos la caducidad del dinero en todas las cuentas
	public void establecerCaducidadDinero(Date fecha) {
		Date fechaActual = new Date();
		for (Cuenta_bancaria_CBDC cuenta_bancaria_CBDC : cuentasTotales) {
			if (fecha.before(fechaActual)) {
				double saldo = cuenta_bancaria_CBDC.obtenerSaldo();
				double penalizacion = saldo / 2;
				 saldo -= penalizacion;
				System.out.println("La cuenta ha caducado. Se ha aplicado una penalización de " + penalizacion
						+ " al saldo actual de " + saldo);
			}
		}
	}

	// Establecemos la caducidad del dinero en todas las cuentas
	public void establecerCaducidadDineroenCuenta(Date fecha, Cuenta_bancaria_CBDC cuenta) {
		Date fechaActual = new Date();
		if (fecha.before(fechaActual)) {
			cuenta.modificarSaldo(cuenta.obtenerSaldo() / 2);
		}
	}

	// Modificamos el tipo de interes de una cuenta individual
	public void modificarInteresCuenta(Cuenta_bancaria_CBDC cuenta, double interes) {
		cuenta.modificarTipoInteres(interes);
	}

	// Metodo para cambiar la operatividad de todas las cuentas
	public void modificarOperatividadTotal(boolean operatividad) {
		for (Cuenta_bancaria_CBDC cuenta_bancaria_CBDC : cuentasTotales) {
			cuenta_bancaria_CBDC.modificarOperativa(operatividad);
		}
	}

	// Método para cambiar la operatividad de una cuenta bancaria
	public void cambiarOperatividad(Cuenta_bancaria_CBDC cuenta, boolean operativa) {
		cuenta.modificarOperativa(operativa);
	}

	// Metodo para cambiar la huella de carbono de una cuenta bancaria
	public void cambiarLimiteHuellaCarbono(Cuenta_bancaria_CBDC cuenta, double carbono) {
		cuenta.modificarLimiteHuellaCarbono(carbono);
	}

	// Metodo para cambiar la huella de carbono total de todas las cuentas
	public void modificarLimiteHuellaCuenta(double carbono) {
		for (Cuenta_bancaria_CBDC cuenta_bancaria_CBDC : cuentasTotales) {
			cuenta_bancaria_CBDC.modificarLimiteHuellaCarbono(carbono);
		}
	}

	// Metodo para cambiar la huella de carbono total de todas las cuentas por renta
	public void modificarLimiteHuellaPorRenta() {
		
		
		double carbono = 0;
		for (Cuenta_bancaria_CBDC cuenta_bancaria_CBDC : cuentasTotales) {
			if (cuenta_bancaria_CBDC.obtenerSaldo() < 10000) {
				cuenta_bancaria_CBDC.modificarLimiteHuellaCarbono(carbono = 100000);
			} else if ((cuenta_bancaria_CBDC.obtenerSaldo() > 10000) && (cuenta_bancaria_CBDC.obtenerSaldo() < 20000)) {
				cuenta_bancaria_CBDC.modificarLimiteHuellaCarbono(carbono = 10000);
			} else if ((cuenta_bancaria_CBDC.obtenerSaldo() > 20000) && (cuenta_bancaria_CBDC.obtenerSaldo() < 35000)) {
				cuenta_bancaria_CBDC.modificarLimiteHuellaCarbono(carbono = 7500);
			} else if ((cuenta_bancaria_CBDC.obtenerSaldo() > 35000) && (cuenta_bancaria_CBDC.obtenerSaldo() < 60000)) {
				cuenta_bancaria_CBDC.modificarLimiteHuellaCarbono(carbono = 5000);
			} else if ((cuenta_bancaria_CBDC.obtenerSaldo() > 60000)
					&& (cuenta_bancaria_CBDC.obtenerSaldo() < 1000000)) {
				cuenta_bancaria_CBDC.modificarLimiteHuellaCarbono(carbono = 2500);
			}
		}
	}

	// Metodo para establecer los tramos de IRPF total de todas las cuentas por
	// renta
	public void establecerTramosIrpf() {
		for (Cuenta_bancaria_CBDC cuenta_bancaria_CBDC : cuentasTotales) {
			double irpf = 0;
			double saldo = cuenta_bancaria_CBDC.obtenerSaldo();
			if (saldo > 0) {
				// tasa del 19% para el tramo inferior a 12750€
				irpf += saldo * 0.19;
			} else if (saldo > 12750) {
				// tasa del 24% para el tramo entre 12750€ y 20200€
				irpf += (saldo - 12750) * 0.24;
				saldo = 12750;
			} else if (saldo > 20200) {
				// tasa del 30% para el tramo entre 20200€ y 35200€
				irpf += (saldo - 20200) * 0.30;
				saldo = 20200;
			} else if (saldo > 35200) {
				// tasa del 35% para el tramo entre 35000€ y 60000€
				irpf += (saldo - 35200) * 0.37;
				saldo = 35200;
			} else if (saldo > 60000) {
				// tasa del 45% para el tramo entre 60000€ y 300000€
				irpf += (saldo - 60000) * 0.45;
				saldo = 60000;
			} else if (saldo > 300000) {
				// tasa del 47% para el tramo superior 300000€
				irpf += (saldo - 300000) * 0.47;
				saldo = 300000;
			}

			cuenta_bancaria_CBDC.modificarIRPF(irpf);
		}
	}

	// Metodo para establecer los tramos de IRPF para una sola cuenta
	public void establecerTramosIrpfCuenta(Cuenta_bancaria_CBDC cuenta) {
		double irpf = 0;
		double saldo = cuenta.obtenerSaldo();
		if (saldo > 300000) {
			// tasa del 47% para el tramo superior 300000€
			irpf += (saldo - 300000) * 0.47;
			saldo = 300000;
		}
		if (saldo > 60000) {
			// tasa del 45% para el tramo entre 60000€ y 300000€
			irpf += (saldo - 60000) * 0.45;
			saldo = 60000;
		}
		if (saldo > 35200) {
			// tasa del 35% para el tramo entre 35000€ y 60000€
			irpf += (saldo - 35200) * 0.37;
			saldo = 35200;
		}
		if (saldo > 20200) {
			// tasa del 30% para el tramo entre 20200€ y 35200€
			irpf += (saldo - 20200) * 0.30;
			saldo = 20200;
		}
		if (saldo > 12750) {
			// tasa del 24% para el tramo entre 12750€ y 20200€
			irpf += (saldo - 12750) * 0.24;
			saldo = 12750;
		}
		if (saldo > 0) {
			// tasa del 19% para el tramo inferior a 12750€
			irpf += saldo * 0.19;
		}

		cuenta.modificarIRPF(irpf);
	}

	// Eliminamos dinero de las cuentas
	public void eliminarDineroTotal(double cantidad) {
		for (Cuenta_bancaria_CBDC cuenta_bancaria_CBDC : cuentasTotales) {
			cuenta_bancaria_CBDC.retirar(cantidad);
		}
	}
	
	// Prestamos dinero de una cuenta
		public double prestarDineroCuenta(Cuenta_bancaria_CBDC cuenta, double cantidad, Date plazoEntrega) {
		    Date actualdate = new Date();
			if (cuenta.EsOperativa()==true && cuenta.obtenerSaldo()>0 &&cantidad>0 && plazoEntrega.before(cuenta.obtenerCaducidad())) {
				cuenta.depositar(cantidad);
				cuenta.agregarTransaccion();
			}
			if (plazoEntrega.equals(actualdate) || plazoEntrega.before(actualdate)) {
				cuenta.retirar(cantidad);
				cuenta.retirar(cantidad * (this.interes / 100));
				cuenta.agregarTransaccion();
			}
			return cantidad;
		}

	// Eliminamos dinero de una cuenta
	public void eliminarDineroCuenta(Cuenta_bancaria_CBDC cuenta, double cantidad) {
		cuenta.retirar(cantidad);
	}

	// Creamos dinero y lo mandamos a las cuentas
	public void crearDineroTotal(double cantidad) {
		for (Cuenta_bancaria_CBDC cuenta_bancaria_CBDC : cuentasTotales) {
			cuenta_bancaria_CBDC.depositar(cantidad);
		}
	}

	// Creamos dinero para solo una cuenta
	public void crearDineroCuenta(Cuenta_bancaria_CBDC cuenta, double cantidad) {
		cuenta.depositar(cantidad);
	}

	// Modificamos las cuentas
	public void establecerCuentasTotales(List<Cuenta_bancaria_CBDC> cuentasTotales) {
		this.cuentasTotales = cuentasTotales;
	}

	// Establecemos el interes de todas las cuentas
	public void establecerTipoInteres(double interes) {
		this.interes = interes;
		for (Cuenta_bancaria_CBDC cuenta_bancaria_CBDC : cuentasTotales)
			cuenta_bancaria_CBDC.modificarTipoInteres(interes);
	}

	// Método para crear una nueva cuenta bancaria
	public void crearCuenta(Cuenta_bancaria_CBDC cuenta) {
		cuentasTotales.add(cuenta);
	}

	// Método para eliminar una cuenta bancaria
	public void eliminarCuenta(Cuenta_bancaria_CBDC cuenta) {
		cuentasTotales.remove(cuenta);
	}

	// Metodo para buscar cuenta por DNI
	public String BuscarDNI(String DNI) {
		String resultado = null;
		for (Cuenta_bancaria_CBDC cuenta_bancaria_CBDC : cuentasTotales)
			if (cuenta_bancaria_CBDC.obtenerDNI().equalsIgnoreCase(DNI)) {
				resultado = cuenta_bancaria_CBDC.obtenerDatosCuenta();
			} else {
				resultado = "No se ha podido obtener los datos de la cuenta";
			}
		return resultado;
	}

	// Metodo para buscar cuenta por Cuenta Bancaria
	public String BuscarIBAN(String IBAN) {
		String resultado = null;
		for (Cuenta_bancaria_CBDC cuenta_bancaria_CBDC : cuentasTotales)
			if (cuenta_bancaria_CBDC.obtenerNumeroIBAN().equalsIgnoreCase(IBAN)) {
				resultado = cuenta_bancaria_CBDC.obtenerDatosCuenta();
			} else {
				resultado = "No se ha podido obtener los datos de la cuenta";
			}
		return resultado;
	}

	// Metodo para buscar cuenta por nombre
	public String BuscarNombre(String nombre) {
		String resultado = null;
		for (Cuenta_bancaria_CBDC cuenta_bancaria_CBDC : cuentasTotales)
			if (cuenta_bancaria_CBDC.obtenerNombreTitular().equalsIgnoreCase(nombre)) {
				resultado = cuenta_bancaria_CBDC.obtenerDatosCuenta();
			} else {
				resultado = "No se ha podido obtener los datos de la cuenta";
			}
		return resultado;
	}
}
