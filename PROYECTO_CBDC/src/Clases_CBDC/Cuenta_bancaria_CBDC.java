package Clases_CBDC;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class Cuenta_bancaria_CBDC {

	// Atributos de la clase
	private String numeroCuenta, numeroIBAN, nombreTitular, DNI;
	private char sexo;
	private boolean comunitario, esTrans,  operativa ;
	private double saldo, IRPF, tipoInteres, limiteHuellaCarbono;
	private Date caducidad;
	private List<String> transacciones;
	private List<String> productos;
	private Map<String, Double> huellasCarbono;
	private static Set<String> numerosCuentaUtilizados = new HashSet<>();
	
	// Constructor de la clase
	@SuppressWarnings("deprecation")
	public Cuenta_bancaria_CBDC(String nombreTitular, char sexoInicial, double saldoInicial,
			double limiteHuellaCarbono) {
		// Verifica si el número de cuenta ya ha sido utilizado
		if (numerosCuentaUtilizados.contains(numeroCuenta)) {
			throw new IllegalArgumentException("El número de cuenta ya ha sido utilizado");
		}

		// Genera una combinación aleatoria de números para el número de cuenta
		SecureRandom random = new SecureRandom();
		StringBuilder numeroCuentaBuilder = new StringBuilder();
		for (int i = 0; i < 16; i++) {
			int valorAleatorio = random.nextInt(10); // se cambia el rango a [0,9] para obtener solo números
			numeroCuentaBuilder.append(valorAleatorio);
		}
		// Asigna el número de cuenta generado al atributo de la clase
		this.numeroCuenta = numeroCuentaBuilder.toString();
		this.nombreTitular = nombreTitular;
		this.caducidad = new Date();
		this.DNI = generar_DNI();
		this.saldo = saldoInicial;
		this.IRPF = obtenerIRPF();
		this.sexo = generarSexo(sexoInicial);
		this.comunitario = true;
		this.esTrans = false;
		this.productos = new ArrayList<>();
		this.transacciones = new ArrayList<>();
		this.huellasCarbono = new HashMap<>();
		this.limiteHuellaCarbono = limiteHuellaCarbono;
		this.operativa = true;
		this.tipoInteres = 0;
		this.numeroIBAN = generarNumeroIBAN();
	}

	// Setters y Getters
	public String obtenerDatosCuenta() {
		return " Información de la cuenta CBDC:\r\n" + " El número de cuenta es: " + numeroCuenta + "\r\n"
				+ " El Numero IBAN es: " + numeroIBAN + "\r\n" + " El nombre del titular: " + nombreTitular + "\r\n"
				+ " El sexo del titular: " + sexo + "\r\n" + " Es trans: " + esTrans + "\r\n" + " Es comunitario: "
				+ comunitario + "\r\n" + " La caducidad del dinero es : " + caducidad + "\r\n"
				+ " El DNI del titular es: " + DNI + "\r\n" + " El saldo es: " + this.saldo + "\r\n"
				+ " La transacciones son: " + transacciones + "\r\n" + " Los productos adquiridos son: " + productos
				+ "\r\n" + " La huella de carbono consumida es: " + huellasCarbono + "\r\n"
				+ " El limite de huella de carbono es : " + limiteHuellaCarbono + "\r\n" + " La operatividad es "
				+ operativa + "\r\n" + " El tipo de interes es: " + tipoInteres + " por ciento\r\n"
				+ " Lo pagado en impuestos por IPRF es: " + IRPF + " \r\n"
				+ " El valor de la cuenta antes de impuestos y con tipo de interes aplicado es : "
				+ aplicarTipoInteres() + "\r\n" + " El porcentaje pagado en impuestos es: "
				+ calcularPorcentajeAplicadoIRPF() + "\r\n" + " El saldo de la cuenta con el IRPF aplicado es: "
				+ aplicarIRPF() + "\r\n" + " " + verificarLimite();
	}

	public Date obtenerCaducidad() {
		return caducidad;
	}

	public String obtenerNumeroCuenta() {
		return numeroCuenta;
	}

	public String obtenerDNI() {
		return DNI;
	}

	public String obtenerNumeroIBAN() {
		return numeroIBAN;
	}

	public String obtenerNombreTitular() {
		return nombreTitular;
	}

	public double obtenerSaldo() {
		return saldo;
	}

	public double obtenerInteresBancoCentral() {
		return tipoInteres;
	}

	public List<String> obtenerProductos() {
		return this.productos;
	}

	public List<String> obtenerTransacciones() {
		return this.transacciones;
	}

	public double obtenerLimiteHuellaCarbono() {
		return limiteHuellaCarbono;
	}

	public char obtenerSexo() {
		return sexo;
	}

	public boolean obtenerEsTrans() {
		return esTrans;
	}

	public boolean obtenerComunitario() {
		return comunitario;
	}

	public double obtenerIRPF() {
		return IRPF;
	}
	
	public void modificarProductos(List<String> productos) {
		this.productos = productos;
	}

	public void modificarIRPF(double iRPF) {
		IRPF = iRPF;
	}

	public void modificarSexo(char sexo) {
		this.sexo = sexo;
	}

	public void modificarCaducidad(Date caducidad) {
		this.caducidad = caducidad;
	}

	public void modificarComunitario(boolean comunitario) {
		this.comunitario = comunitario;
	}

	public void modificarEsTrans(boolean esTrans) {
		this.esTrans = esTrans;
	}

	public void modificarTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public void modificarNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public void modificarSaldo(double saldo) {
		this.saldo = saldo;
		agregarTransaccion();
	}

	public void modificarNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	public void modificarOperativa(boolean operativa) {
		this.operativa = operativa;
	}

	public void modificarLimiteHuellaCarbono(double limiteHuellaCarbono) {
		this.limiteHuellaCarbono = limiteHuellaCarbono;
	}

	public boolean EsOperativa() {
		return operativa;
	}

	// Metodo para aplicar el tipo de interes a la cuenta
	public double aplicarTipoInteres() {
		if (operativa) {
			return this.saldo += this.saldo * (this.tipoInteres / 100);
		} else {
			return saldo;
		}
	}

	// Metodo para aplicar IRPF a la cuenta
	public double aplicarIRPF() {
		if (operativa) {
			return this.saldo - this.IRPF;
		} else {
			return this.saldo;
		}
	}

	// Metodo para agregar transaccion
	public void agregarTransaccion() {
		String id_transaccion = UUID.randomUUID().toString();
		transacciones.add(id_transaccion);
	}

	// Método para añadir un producto y su huella de carbono a la lista
	public String agregarProducto(String producto, double huellaCarbono) {
		productos.add(producto);
		huellasCarbono.put(producto, huellaCarbono);
		return producto;
	}

	// Método para depositar dinero
	public void depositar(double cantidad) {
		this.saldo += cantidad;
		if (saldo >= 0) {
	        operativa = true;}
		agregarTransaccion();
	}

	public void retirar(double cantidad) {
		this.saldo -= cantidad;
		if (saldo < 0) {
	        operativa = false;}
		agregarTransaccion();
	}

	// Método para comprar
	public void realizarCompra(String nombreProducto, double precio) {
		// Verifica si la cuenta está operativa
		String res = "";
		if (!this.operativa) {
			res = "La cuenta no está operativa";
		}

		// Verifica si la cuenta tiene suficiente saldo para realizar la compra
		if (this.saldo < precio) {
			this.operativa = false;
			res = "No tienes suficiente saldo para realizar esta compra";
		}

		// Verifica si la compra excedería el límite de huella de carbono de la cuenta
		double huellaCarbonoTotal = this.calcularHuellaCarbonoTotal() + this.huellasCarbono.get(nombreProducto);
		if (huellaCarbonoTotal > this.limiteHuellaCarbono) {
			System.out.println("Esta compra excedería el límite de huella de carbono de tu cuenta");
			this.operativa = false;
		}

		// Realiza la compra
		this.saldo -= precio;
		this.productos.add(nombreProducto);
		this.transacciones.add(String.format("Compra de %s por %.2f", nombreProducto, precio));
		verificarLimite();
	}

	// Metodo para enviar dinero a otra cuenta
	public void transferir(double cantidad, Cuenta_bancaria_CBDC cuentaDestino) {
		if ((this.saldo > 0) && (cantidad < this.saldo) && (this.operativa)) {
			this.saldo -= cantidad;
			cuentaDestino.depositar(cantidad);
			transacciones.add("Se ha retirado " + cantidad + "€ de la cuenta ");
			agregarTransaccion();
		} else {
			throw new IllegalArgumentException("Saldo insuficiente");
		}
	}

	// Método para verificar si se ha excedido el límite de huella de carbono
	public String verificarLimite() {
		String res = "";
		double huellaCarbonoTotal = 0;
		for (double huellaCarbono : huellasCarbono.values()) {
			huellaCarbonoTotal += huellaCarbono;
		}
		if (huellaCarbonoTotal > limiteHuellaCarbono) {
			this.operativa = false;
			res = "Se ha excedido el límite de huella de carbono. La cuenta se ha vuelto inoperable.";
		} else {
			res = "La cuenta es operable.";
		}
		return res;
	}

	// Metodo para obtener la huella de carbono total de la suma de los productos
	public double calcularHuellaCarbonoTotal() {
		double huellaCarbonoTotal = 0;
		for (double huellaCarbono : huellasCarbono.values()) {
			huellaCarbonoTotal += huellaCarbono;
		}
		return huellaCarbonoTotal;
	}

	// Metodo para generar el numero IBAN a partir del modulo97
	public String generarNumeroIBAN() {
		int numeroAleatorio = (int) (Math.random() * 1000 + 1);
		String numeroCuentaString = String.valueOf(numeroCuenta);
		int checkDigit = 98 - modulo97(numeroCuentaString + numeroAleatorio);
		return "ES" + String.format("%02d", checkDigit) + numeroCuentaString + numeroAleatorio;
	}

	private int modulo97(String numero) {
		int m = 0;
		for (int i = 0; i < numero.length(); i++) {
			int valor = Integer.parseInt(String.valueOf(numero.charAt(i)));
			m = (m * 10 + valor) % 97;
		}
		return m;
	}

	// Metodo para generar el DNI
	public String generar_DNI() {
		// Genera un número aleatorio para el número del DNI
		SecureRandom random = new SecureRandom();
		int numeroDNI = random.nextInt(100000000);

		// Genera una letra aleatoria para el DNI
		String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
		char letraDNI = letrasDNI.charAt(numeroDNI % 23);

		// Devuelve el DNI como una cadena de 8 dígitos y una letra
		return String.format("%08d%c", numeroDNI, letraDNI);
	}

	public char generarSexo(char sex) { // METODO PARA GENERAR EL SEXO SI ESTA MAL ESCRITO
		char sexoDefecto;
		if (sex != 'h') {
			sexoDefecto = 'm';
		} else {
			sexoDefecto = 'h';
		}
		return sexoDefecto;
	}

	// Calcula el tipo global del IRPF en la cuenta
	public double calcularPorcentajeAplicadoIRPF() {
		return (this.IRPF / this.saldo) * 100;
	}

}