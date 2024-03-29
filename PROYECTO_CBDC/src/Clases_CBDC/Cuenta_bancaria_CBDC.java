package Clases_CBDC;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import javax.swing.JOptionPane;

public class Cuenta_bancaria_CBDC {

	// Atributos de la clase
	private String numeroCuenta, numeroIBAN, nombreTitular, DNI;
	private char sexo;
	private boolean comunitario, esPrestado, operativa;
	private double saldo, IRPF, tipoInteres, limiteHuellaCarbono;
	private Date caducidad;
	private List<Transacciones_CBDC> transacciones;
	private List<Producto_CBDC> compras;
	private static Set<String> numerosCuentaUtilizados = new HashSet<>();

	// Constructor de la clase
	public Cuenta_bancaria_CBDC() {
	}

	public Cuenta_bancaria_CBDC(String nombreTitular, char sexoInicial, double saldoInicial) {
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
		this.esPrestado = false;
		this.compras = new ArrayList<>();
		this.transacciones = new ArrayList<>();
		this.limiteHuellaCarbono = 0;
		this.operativa = true;
		this.tipoInteres = 0;
		this.numeroIBAN = generarNumeroIBAN();
	}

	// Setters y Getters
	public String obtenerDatosCuenta() {
		return " Información de la cuenta CBDC:\r\n" + " El número de cuenta es: " + numeroCuenta + "\r\n"
				+ " El Numero IBAN es: " + numeroIBAN + "\r\n" + " El nombre del titular: " + nombreTitular + "\r\n"
				+ " El sexo del titular: " + sexo + "\r\n" + " Le prestan: " + esPrestado + "\r\n" + " Es comunitario: "
				+ comunitario + "\r\n" + " La caducidad del dinero es : " + caducidad + "\r\n"
				+ " El DNI del titular es: " + DNI + "\r\n" + " El saldo es: " + this.saldo + "\r\n"
				+ " La transacciones son: " + transacciones.toString() + "\r\n" + " Los productos adquiridos son: "
				+ compras.toString() + "\r\n" + " La huella de carbono consumida es: " + obtenerLimiteHuellaCarbono() + "\r\n"
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

	public List<Producto_CBDC> obtenerProductos() {
		return this.compras;
	}

	public List<Transacciones_CBDC> obtenerTransacciones() {
		return this.transacciones;
	}
		
	//Para imprimir el nombre del produco en las listas de las compras
	public String[] obtenerNombreProducto() {
	    String[] nombreProducto = new String[compras.size()];
	    for (int i = 0; i < compras.size(); i++) {
	    	nombreProducto[i] = compras.get(i).getNombre();
	    }
	    return nombreProducto;
	  }
	
	//Para imprimir las transacciones en las listas
	public String[] obtenerIdTransacciones() {
	    String[] idTransacciones = new String[transacciones.size()];
	    for (int i = 0; i < transacciones.size(); i++) {
	      idTransacciones[i] = transacciones.get(i).getId();
	    }
	    return idTransacciones;
	  }
	
	//Para imprimir los importes de los productos en las listas
	public String[] obtenerPrecioProducto() {
	    String[] precioProducto = new String[compras.size()];
	    for (int i = 0; i < compras.size(); i++) {
	    	precioProducto[i] = String.valueOf(compras.get(i).getPrecio());
	    }
	    return precioProducto;
	  }

	public double obtenerLimiteHuellaCarbono() {
		return limiteHuellaCarbono;
	}

	public char obtenerSexo() {
		return sexo;
	}

	public boolean obtenerEsPrestado() {
		return esPrestado;
	}

	public boolean obtenerComunitario() {
		return comunitario;
	}

	public double obtenerIRPF() {
		return IRPF;
	}

	public void modificarProductos(List<Producto_CBDC> productos) {
		this.compras = productos;
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

	public void modificarEsPrestado(boolean esPrestado) {
		this.esPrestado = esPrestado;
	}

	public void modificarTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public void modificarNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public void modificarSaldo(double saldo) {
		this.saldo = saldo;
		agregarTransaccion(saldo);
		;
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

	public boolean EsOperativa(){
		return operativa;
	}
	
	public void mensajeOperatividad(){
		   if (EsOperativa() == false) {
		       JOptionPane.showMessageDialog(null, "La operación no es posible", "Advertencia", JOptionPane.WARNING_MESSAGE);
		   }
		}


	// Metodo para aplicar el tipo de interes a la cuenta
	public double aplicarTipoInteres() {
		if (operativa) {
			agregarTransaccion(this.saldo += this.saldo * (this.tipoInteres / 100));
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
	public String agregarTransaccion(double importe) {
		Transacciones_CBDC transaccion = new Transacciones_CBDC();
		String id_transaccion = UUID.randomUUID().toString();
		transaccion.setId(id_transaccion);
		transaccion.setImporte(importe);
		transaccion.setCuenta(this);
		transacciones.add(transaccion);
		return id_transaccion;
	}

	// Metodo para agregar transaccion en el producto
	public String agregarTransaccionCuenta(Cuenta_bancaria_CBDC CUENTADESTINO, double importe) {
		Transacciones_CBDC transaccion = new Transacciones_CBDC();
		String id_transaccion = UUID.randomUUID().toString();
		transaccion.setId(id_transaccion);
		transaccion.setImporte(importe);
		transaccion.setCuenta(CUENTADESTINO);
		transaccion.setCuenta(this);
		transacciones.add(transaccion);
		return id_transaccion;
	}

	// Metodo para agregar transaccion en el producto
	public String agregarTransaccionProducto(Producto_CBDC producto, double importe) {
		Transacciones_CBDC transaccion = new Transacciones_CBDC();
		String id_transaccion = UUID.randomUUID().toString();
		transaccion.setId(id_transaccion);
		transaccion.setImporte(importe);
		transaccion.setProducto(producto);
		transaccion.setCuenta(this);
		transacciones.add(transaccion);
		return id_transaccion;
	}

	// Método para depositar dinero
	public void depositar(double cantidad) {
		this.saldo += cantidad;
		agregarTransaccion(cantidad);
		if (saldo >= 0) {
			operativa = true;
		}
	}

	//Retiramos dinero
	public void retirar(double cantidad) {
		this.saldo -= cantidad;
		agregarTransaccion(cantidad);
		if (saldo < 0) {
			operativa = false;
		}
	}
	
	//Validamos retiros
	public boolean validarRetiros(double cantidad) {
		if (cantidad<this.saldo) {
			return true;
		}else {
			return false;
		}
	}

	// Método para comprar
	public void realizarCompra(Producto_CBDC producto) {
		// Verifica si la cuenta está operativa
		if (!this.operativa) {
			 JOptionPane.showMessageDialog(null, "La operación no es posible", "Advertencia", JOptionPane.WARNING_MESSAGE);
		}
		// Verifica si la cuenta tiene suficiente saldo para realizar la compra
		if (this.saldo < producto.getPrecio()) {
			this.operativa = false;
			 JOptionPane.showMessageDialog(null, "La operación no es posible", "Advertencia", JOptionPane.WARNING_MESSAGE);
		}
		// Verifica si la compra excedería el límite de huella de carbono de la cuenta
		double huellaCarbonoTotal = this.calcularHuellaCarbonoTotal() + producto.getHuellaCarbono();
		if (huellaCarbonoTotal > this.limiteHuellaCarbono) {
			 JOptionPane.showMessageDialog(null, "Esta compra no es posible por exceso de límite de huella de carbono de tu cuenta", "Advertencia", JOptionPane.WARNING_MESSAGE);
			this.operativa = false;
		}
		// Realiza la compra
		this.saldo -= producto.getPrecio();
		this.compras.add(producto);

		// Agrega la transaccion correspondiente a la compra realizada
		agregarTransaccionProducto(producto, producto.getPrecio());
		verificarLimite();
	}

	// Metodo para enviar dinero a otra cuenta
	public void transferir(double cantidad, Cuenta_bancaria_CBDC cuentaDestino) {
		if ((this.saldo > 0) && (cantidad < this.saldo) && (this.operativa)) {
			this.saldo -= cantidad;
			cuentaDestino.depositar(cantidad);
			agregarTransaccion(cantidad);

		} else {
			throw new IllegalArgumentException("Saldo insuficiente");
		}
	}

	// Método para verificar si se ha excedido el límite de huella de carbono
	public String verificarLimite() {
		String res = "";
		double huellaCarbonoTotal = 0;
		for (Producto_CBDC producto : compras) {
			huellaCarbonoTotal += producto.getHuellaCarbono();
		}
		if (huellaCarbonoTotal > limiteHuellaCarbono) {
			this.operativa = false;
			 JOptionPane.showMessageDialog(null, "Esta cuenta es inoperable por exceso de límite de huella de carbono", "Advertencia", JOptionPane.WARNING_MESSAGE);
		} else {
			res = "La cuenta es operable.";
		}
		return res;
	}

	// Metodo para obtener la huella de carbono total de la suma de los productos
	public double calcularHuellaCarbonoTotal() {
		double huellaCarbonoTotal = 0;
		for (Producto_CBDC producto : compras) {
			huellaCarbonoTotal += producto.getHuellaCarbono();
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