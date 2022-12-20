package Random;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class Cuenta_corriente_CBDC {

	// Atributos de la clase
	private String numeroCuenta;
	private String numeroIBAN;
	private String nombreTitular;
	public String DNI;
	private double saldo;
	private List<String> transacciones;
	private List<String> productos;
	private Map<String, Double> huellasCarbono;
	private double limiteHuellaCarbono;
	private boolean operativa;
	private static Set<String> numerosCuentaUtilizados = new HashSet<>();
	private double tipoInteres;

	// Constructor de la clase
	public Cuenta_corriente_CBDC(String numeroCuenta, String nombreTitular, double saldoInicial,
			double limiteHuellaCarbono, double tipo) {
		// Verifica si el número de cuenta ya ha sido utilizado
		if (numerosCuentaUtilizados.contains(numeroCuenta)) {
			throw new IllegalArgumentException("El número de cuenta ya ha sido utilizado");
		}

		// Genera una combinación aleatoria de letras y números para el número de cuenta
		SecureRandom random = new SecureRandom();
		StringBuilder numeroCuentaBuilder = new StringBuilder();
		for (int i = 0; i < 8; i++) {
			int valorAleatorio = random.nextInt(36);
			if (valorAleatorio < 10) {
				numeroCuentaBuilder.append(valorAleatorio);
			} else {
				numeroCuentaBuilder.append((char) ('A' + valorAleatorio - 10));
			}
		}

		// Asigna el número de cuenta generado al atributo de la clase
		this.numeroCuenta = numeroCuentaBuilder.toString();
		this.nombreTitular = nombreTitular;
		this.DNI = generar_DNI();
		this.saldo = saldoInicial;
		this.productos = new ArrayList<>();
		this.transacciones = new ArrayList<>();
		this.huellasCarbono = new HashMap<>();
		this.limiteHuellaCarbono = limiteHuellaCarbono;
		this.operativa = true;
		this.tipoInteres = tipo;
		// Genera el número IBAN y lo asigna al atributo de la clase
		// this.numeroIBAN = generarNumeroIBAN();
	}

	// Setters y Getters

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

	public double obtenerTipoInteres() {
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
	
	public void modificarNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	public void modificarSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void modificarNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	public void modificarTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
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
		return this.saldo += saldo * (this.tipoInteres / 100);
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
		agregarTransaccion();
	}

	// Método para retirar dinero
	public void realizarCompra(String nombreProducto, double precio) {
		// Verifica si la cuenta está operativa
		String res = "";
		if (!this.operativa) {
			res = "La cuenta no está operativa";
		}
		
		// Verifica si la cuenta tiene suficiente saldo para realizar la compra
		if (this.saldo < precio) {
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
	public void transferir(double cantidad, Cuenta_corriente_CBDC cuentaDestino) {
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
	public String  verificarLimite() {
		String res = "";
		double huellaCarbonoTotal = 0;
		for (double huellaCarbono : huellasCarbono.values()) {
			huellaCarbonoTotal += huellaCarbono;
		}
		if (huellaCarbonoTotal > limiteHuellaCarbono) {
			this.operativa = false;
			res = "Se ha excedido el límite de huella de carbono. La cuenta se ha vuelto inoperable.";
		} else{
			res = "La cuenta se ha vuelto es operable.";
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

	// Metodo para generar el numero IBAN
	public String generarNumeroIBAN() {
		// Genera una combinación aleatoria de letras y números para el número IBAN
		StringBuilder numeroIBANBuilder = new StringBuilder();
		SecureRandom random = new SecureRandom();
		for (int i = 0; i < 32; i++) {
			int valorAleatorio = random.nextInt(36);
			if (valorAleatorio < 10) {
				numeroIBANBuilder.append(valorAleatorio);
			} else {
				numeroIBANBuilder.append((char) ('A' + valorAleatorio - 10));
			}
		}

		// Calcula el código de verificación del número IBAN según el algoritmo ISO 7064
		String numeroIBAN = numeroIBANBuilder.toString();
		int modulo = Integer.parseInt(numeroIBAN) % 97;
		int codigoVerificacion = 98 - modulo;

		// Añade el código de verificación al número IBAN y lo devuelve
		numeroIBANBuilder.append(String.format("%02d", codigoVerificacion));
		return numeroIBANBuilder.toString();
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

	public static void main(String[] args) {
		// Crea dos objetos de la clase Cuenta_corriente_CBDC
		Cuenta_corriente_CBDC cuenta1 = new Cuenta_corriente_CBDC("123456", "Juan Pérez", 1000.0, 10000.0, 1);
		Cuenta_corriente_CBDC cuenta2 = new Cuenta_corriente_CBDC("654321", "Ana Martínez", 2000.0, 15000.0, 2);

		// Muestra información de las cuentas
		System.out.println("Información de la cuenta 1:");
		System.out.println("Número de cuenta: " + cuenta1.obtenerNumeroCuenta());
		System.out.println("Nombre del titular: " + cuenta1.obtenerNombreTitular());
		System.out.println("El DNI del titular es: " + cuenta1.obtenerDNI());
		System.out.println("Saldo: " + cuenta1.obtenerSaldo());
		System.out.println("Limite de huella de carbono: " + cuenta1.obtenerLimiteHuellaCarbono());
		System.out.println("El tipo de interes es el " + cuenta1.obtenerTipoInteres() + " por ciento");
		System.out.println();

		System.out.println("Información de la cuenta 2:");
		System.out.println("Número de cuenta: " + cuenta2.obtenerNumeroCuenta());
		System.out.println("Nombre del titular: " + cuenta2.obtenerNombreTitular());
		System.out.println("El DNI del titular es: " + cuenta2.obtenerDNI());
		System.out.println("Saldo: " + cuenta2.obtenerSaldo());
		System.out.println("Limite de huella de carbono: " + cuenta2.obtenerLimiteHuellaCarbono());
		System.out.println("El tipo de interes es el " + cuenta2.obtenerTipoInteres() + " por ciento");
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
		System.out.println("Número de cuenta: " + cuenta1.obtenerNumeroCuenta());
		System.out.println("Nombre del titular: " + cuenta1.obtenerNombreTitular());
		System.out.println("El DNI del titular es: " + cuenta1.obtenerDNI());
		System.out.println("Saldo: " + cuenta1.obtenerSaldo());
		System.out.println("El tipo de interes es el " + cuenta1.obtenerTipoInteres() + " por ciento");
		System.out.println();

		System.out.println("Información de la cuenta 2 después de la transferencia y de la compra:");
		System.out.println("Número de cuenta: " + cuenta2.obtenerNumeroCuenta());
		System.out.println("Nombre del titular: " + cuenta2.obtenerNombreTitular());
		System.out.println("El DNI del titular es: " + cuenta2.obtenerDNI());
		System.out.println("Saldo: " + cuenta2.obtenerSaldo());
		System.out.println("El tipo de interes es del  " + cuenta2.obtenerTipoInteres() + " por ciento");
		System.out.println("La cuenta con el tipo de interes aplicado vale: " + cuenta2.aplicarTipoInteres());
		System.out.println("La cuenta es operativa = "+ cuenta2.EsOperativa());
		System.out.println(cuenta2.verificarLimite());
	}
}
