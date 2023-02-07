package Clases_CBDC;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.awt.event.ActionEvent;

public class Cliente_CBDC extends JFrame {

	private static final long serialVersionUID = 5787738098682905747L;

	public static void comunicarOperatividadFalse(Cuenta_bancaria_CBDC modelo, JLabel falso, Banco_Central_CBDC bce)
			throws ParseException {
		try {
			// Crea un socket para conectarse al servidor
			Socket socket = new Socket("localhost", 9984);
			// Crea un DataInputStream para recibir datos del servidor
			DataInputStream input = new DataInputStream(socket.getInputStream());
			// Recibe la fecha casteada a String por el servidor
			boolean operatividad = input.readBoolean();
			bce.cambiarOperatividad(modelo, operatividad);
			// Escribimos los resultados
			String resultado = Cliente_CBDC.ImprimirOperatividad(modelo);
			falso.setText(resultado);
			// Cierra el socket y el DataInputStream
			input.close();
			socket.close();
		} catch (ConnectException e) {
			System.out.println("Error al conectarse al servidor: " + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void comunicarOperatividadTrue(Cuenta_bancaria_CBDC modelo, JLabel verdadero, Banco_Central_CBDC bce)
			throws ParseException {
		try {
			// Crea un socket para conectarse al servidor
			Socket socket = new Socket("localhost", 9983);
			// Crea un DataInputStream para recibir datos del servidor
			DataInputStream input = new DataInputStream(socket.getInputStream());
			// Recibe la fecha casteada a String por el servidor
			boolean operatividad = input.readBoolean();
			bce.cambiarOperatividad(modelo, operatividad);
			// Escribimos los resultados
			String resultado = Cliente_CBDC.ImprimirOperatividad(modelo);
			verdadero.setText(resultado);
			// Cierra el socket y el DataInputStream
			input.close();
			socket.close();
		} catch (ConnectException e) {
			System.out.println("Error al conectarse al servidor: " + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void comunicarDevolucionPrestamo(Cuenta_bancaria_CBDC modelo, JLabel entrega, JLabel Saldo,
			Banco_Central_CBDC bce) throws ParseException {
		try {
			// Crea un socket para conectarse al servidor
			Socket socket = new Socket("localhost", 9975);
			// Crea un DataInputStream para recibir datos del servidor
			DataInputStream input = new DataInputStream(socket.getInputStream());
			// Recibe la fecha casteada a String por el servidor
			double cantidadEmitida = input.readDouble();
			String fechaCaducidadString = input.readUTF();
			// Parsea la fecha recibida como una cadena de texto en un objeto Date
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			Date fechaCaducidad = df.parse(fechaCaducidadString);
			// Aplicamos el prestamo por el banco central
			double prestamo = bce.pedirDineroCuenta(modelo, cantidadEmitida, fechaCaducidad);
			// Escribimos los resultados
			Saldo.setText(String.valueOf(modelo.obtenerSaldo()));
			entrega.setText(String.valueOf(bce.prestarDineroCuenta(modelo, cantidadEmitida, fechaCaducidad)
					- bce.pedirDineroCuenta(modelo, cantidadEmitida, fechaCaducidad)));
			// Cierra el socket y el DataInputStream
			input.close();
			socket.close();
		} catch (ConnectException e) {
			System.out.println("Error al conectarse al servidor: " + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void comunicarPrestamo(Cuenta_bancaria_CBDC modelo, JLabel entrega, JLabel Saldo,
			Banco_Central_CBDC bce) throws ParseException {
		try {
			// Crea un socket para conectarse al servidor
			Socket socket = new Socket("localhost", 9976);
			// Crea un DataInputStream para recibir datos del servidor
			DataInputStream input = new DataInputStream(socket.getInputStream());
			// Recibe la fecha casteada a String por el servidor
			double cantidadEmitida = input.readDouble();
			String fechaCaducidadString = input.readUTF();
			// Parsea la fecha recibida como una cadena de texto en un objeto Date
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			Date fechaCaducidad = df.parse(fechaCaducidadString);
			// Aplicamos el prestamo por el banco central
			double prestamo = bce.prestarDineroCuenta(modelo, cantidadEmitida, fechaCaducidad);
			// Escribimos los resultados
			Saldo.setText(String.valueOf(modelo.obtenerSaldo()));
			entrega.setText(String.valueOf(prestamo));
			// Cierra el socket y el DataInputStream
			input.close();
			socket.close();
		} catch (ConnectException e) {
			System.out.println("Error al conectarse al servidor: " + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void comunicarCaducidad(Cuenta_bancaria_CBDC modelo, JLabel caducidad, JLabel Saldo,
			Banco_Central_CBDC bce) throws ParseException {
		try {
			// Crea un socket para conectarse al servidor
			Socket socket = new Socket("localhost", 9982);
			// Crea un DataInputStream para recibir datos del servidor
			DataInputStream input = new DataInputStream(socket.getInputStream());
			// Recibe la fecha casteada a String por el servidor
			String fecha_caducidad = input.readUTF();
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			String fechaCaducidad = formato.format(modelo.obtenerCaducidad());
			// Modificamos fecha
			modelo.modificarCaducidad(modelo.obtenerCaducidad());
			// Aplicamos la caducidad al dinero por el banco central
			bce.establecerCaducidadDineroenCuenta(modelo.obtenerCaducidad(), modelo);
			// Escribimos los resultados
			caducidad.setText(String.valueOf(fecha_caducidad));
			Saldo.setText(String.valueOf(modelo.obtenerSaldo()));
			// Cierra el socket y el DataInputStream
			input.close();
			socket.close();
		} catch (ConnectException e) {
			System.out.println("Error al conectarse al servidor: " + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void comunicarlimiteHuellaCarbono(Cuenta_bancaria_CBDC modelo, JLabel carbono) {
		try {
			// Crea un socket para conectarse al servidor
			Socket socket = new Socket("localhost", 9981);
			// Crea un DataInputStream para recibir datos del servidor
			DataInputStream input = new DataInputStream(socket.getInputStream());
			// Recibe la cantidad de huella permitida por el servidor
			double cantidadpermitida = input.readDouble();
			// Modificamos la huella de carbono
			modelo.modificarLimiteHuellaCarbono(cantidadpermitida);
			;
			carbono.setText(String.valueOf(cantidadpermitida));
			// Cierra el socket y el DataInputStream
			input.close();
			socket.close();
		} catch (ConnectException e) {
			System.out.println("Error al conectarse al servidor: " + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void comunicarSaldos2(Cuenta_bancaria_CBDC modelo, JLabel Saldo) {
		try {
			// Crea un socket para conectarse al servidor
			Socket socket = new Socket("localhost", 9977);
			// Crea un DataInputStream para recibir datos del servidor
			DataInputStream input = new DataInputStream(socket.getInputStream());
			// Recibe la cantidad de dinero emitida por el servidor
			double cantidadEmitida = input.readDouble();
			// Utiliza la cantidad de dinero emitida para actualizar el saldo en la cuenta
			// del cliente
			modelo.retirar(-cantidadEmitida);
			Saldo.setText(String.valueOf(modelo.obtenerSaldo()));
			// Cierra el socket y el DataInputStream
			input.close();
			socket.close();
		} catch (ConnectException e) {
			System.out.println("Error al conectarse al servidor: " + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void comunicarSaldos(Cuenta_bancaria_CBDC modelo, JLabel Saldo) {
		try {
			// Crea un socket para conectarse al servidor
			Socket socket = new Socket("localhost", 9978);
			// Crea un DataInputStream para recibir datos del servidor
			DataInputStream input = new DataInputStream(socket.getInputStream());
			// Recibe la cantidad de dinero emitida por el servidor
			double cantidadEmitida = input.readDouble();
			// Utiliza la cantidad de dinero emitida para actualizar el saldo en la cuenta
			// del cliente
			modelo.depositar(cantidadEmitida);
			Saldo.setText(String.valueOf(modelo.obtenerSaldo()));
			// Cierra el socket y el DataInputStream
			input.close();
			socket.close();
		} catch (ConnectException e) {
			System.out.println("Error al conectarse al servidor: " + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void comunicarInteres(Cuenta_bancaria_CBDC modelo, JLabel interes, JLabel saldo) {
		try {
			// Crea un socket para conectarse al servidor
			Socket socket = new Socket("localhost", 9979);
			// Crea un DataInputStream para recibir datos del servidor
			DataInputStream input = new DataInputStream(socket.getInputStream());
			// Recibe el tipo de interés emitido por el servidor
			double interesEmitida = input.readDouble();
			// Utiliza el tipo de interés emitido para actualizar la cuenta bancaria del
			// cliente
			modelo.modificarTipoInteres(interesEmitida);
			interes.setText(String.valueOf(interesEmitida));
			saldo.setText(String.valueOf(modelo.aplicarTipoInteres()));
			// Cierra el socket y el DataInputStream
			input.close();
			socket.close();
		} catch (ConnectException e) {
			System.out.println("Error al conectarse al servidor: " + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void comunicarIRPF(Cuenta_bancaria_CBDC modelo, JLabel IRPF, JLabel saldo) {
		try {
			// Crea un socket para conectarse al servidor
			Socket socket = new Socket("localhost", 9980);
			// Crea un DataInputStream para recibir datos del servidor
			DataInputStream input = new DataInputStream(socket.getInputStream());
			// Recibe la cantidad de dinero emitida por el servidor
			double porcentajeIRPF = input.readDouble();
			double valorIRPF = modelo.obtenerSaldo() * (porcentajeIRPF / 100);
			modelo.retirar(valorIRPF);
			IRPF.setText(String.valueOf(porcentajeIRPF));
			saldo.setText(String.valueOf(modelo.obtenerSaldo()));
			// Cierra el socket y el DataInputStream
			input.close();
			socket.close();
		} catch (ConnectException e) {
			System.out.println("Error al conectarse al servidor: " + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String ImprimirOperatividad(Cuenta_bancaria_CBDC Cuentas) {
		String res = null;
		if (Cuentas.EsOperativa() == true) {
			res = "SÍ";
		}
		if (Cuentas.EsOperativa() == false) {
			res = "NO";
		}
		if (Cuentas.obtenerLimiteHuellaCarbono() < Cuentas.calcularHuellaCarbonoTotal()) {
			res = "NO";
		}
		return res;
	}

	public String ImprimirSexo(Cuenta_bancaria_CBDC Cuentas) {
		String res = null;
		if (Cuentas.obtenerSexo() == 'h') {
			res = "Hombre";
		} else {
			res = "Mujer";
		}
		return res;
	}

	public String ImprimirComunitario(Cuenta_bancaria_CBDC Cuentas) {
		String res = null;
		if (Cuentas.obtenerComunitario()) {
			res = "SÍ";
		} else {
			res = "NO";
		}
		return res;
	}

	public char ConvertirCadenaALetra(String s) {
		return s.charAt(0);
	}

	private JPanel milamina;
	JLabel Saldo, IBAN, Cliente_label, nombre, DNI_label, dni, labelBanco, saldoLabel, labelNumeroDeCuenta,
			labelhuellaCarbono, carbono, labelTipoDeInteres, interes, labelOperatividad, booleano_operativa,
			lblSexoDelCliente, Sexo, label_comunitario, comunitario, labelIRPF, IRPF, labelCaducidad, caducidad,
			label_prestamo, deuda, labelProducto, labelImporte, IdTransaccion;
	private JTextField ingresar_cantidad, gastar_cantidad;
	private Banco_Central_CBDC BCE;
	private ArrayList<Cuenta_bancaria_CBDC> Cuentas;
	private Cuenta_bancaria_CBDC modelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cliente_CBDC frame = new Cliente_CBDC();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cliente_CBDC() {

		// INSTANCIAMOS LAS CUENTAS CON UN BUCLE HASTA QUE EL CLIENTE PONGA BIEN LOS
		// DATOS
		Banco_Central_CBDC BCE = new Banco_Central_CBDC(0.05);
		boolean datoscorrectos = false;
		while (!datoscorrectos) {
			try {
				String nombre_cuenta = JOptionPane.showInputDialog("Introduce el nombre del beneficiario de la cuenta");
				if (nombre_cuenta == null) {
					System.exit(0);
				}
				String sexito = JOptionPane
						.showInputDialog("Introduce el sexo del beneficiario de la cuenta con las letras h o m");
				if (sexito == null) {
					System.exit(0);
				}
				char sexo = ConvertirCadenaALetra(sexito);
				String saldoInicialString = JOptionPane.showInputDialog("Introduce el saldo inicial de la cuenta");
				double saldo_inicial = Integer.parseInt(saldoInicialString);
				if (saldoInicialString == null) {
					System.exit(0);
				}
				modelo = new Cuenta_bancaria_CBDC(nombre_cuenta, sexo, saldo_inicial);
				datoscorrectos=true;
			} catch (NumberFormatException e1) {
				JOptionPane.showMessageDialog(null, "Introduzca bien los datos. Gracias", "Advertencia",
						JOptionPane.WARNING_MESSAGE);
			}	
		}

		// CREAMOS LAS LISTAS
		String[] idTransacciones = modelo.obtenerIdTransacciones();
		String[] NombreProductoCBDC = modelo.obtenerIdTransacciones();
		String[] ImporteProductoCBDC = modelo.obtenerIdTransacciones();
		JList<String> listaProductos = new JList<>(NombreProductoCBDC);
		JList<String> listaTransacciones = new JList<>(idTransacciones);
		JList<String> listaImporte = new JList<>(ImporteProductoCBDC);

		// CREAMOS LAS DIMENSIONES DEL FRAME
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 150, 800, 450);
		setTitle("Cuenta Bancaria CBDC");
		setResizable(false);

		// CREAMOS EL JPANEL
		milamina = new JPanel();
		milamina.setLayout(null);
		setContentPane(milamina);
		milamina.setBackground(new Color(192, 192, 192));
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		Image imagen = pantalla.getImage(".\\src\\IMAGENES\\euro.png");
		setIconImage(imagen);
		setBackground(SystemColor.window);

		// LOS LABELS
		labelBanco = new JLabel("");
		labelBanco.setIcon(new ImageIcon(".\\src\\IMAGENES\\BANCO EURO.png"));
		labelBanco.setBounds(10, 11, 230, 115);
		milamina.add(labelBanco);

		saldoLabel = new JLabel("Saldo:");
		saldoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		saldoLabel.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		saldoLabel.setBounds(250, 52, 218, 31);
		milamina.add(saldoLabel);

		labelNumeroDeCuenta = new JLabel("Numero de cuenta:");
		labelNumeroDeCuenta.setHorizontalAlignment(SwingConstants.CENTER);
		labelNumeroDeCuenta.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		labelNumeroDeCuenta.setBounds(250, 11, 218, 31);
		milamina.add(labelNumeroDeCuenta);

		Saldo = new JLabel();
		Saldo.setHorizontalAlignment(SwingConstants.CENTER);
		Saldo.setFont(new Font("Verdana Pro Cond Black", Font.BOLD, 22));
		Saldo.setBounds(251, 84, 217, 42);
		milamina.add(Saldo);
		Saldo.setText(String.valueOf(modelo.obtenerSaldo()));

		Cliente_label = new JLabel("Cliente:");
		Cliente_label.setHorizontalAlignment(SwingConstants.LEFT);
		Cliente_label.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		Cliente_label.setBounds(10, 129, 76, 31);
		milamina.add(Cliente_label);

		nombre = new JLabel("");
		nombre.setHorizontalAlignment(SwingConstants.LEFT);
		nombre.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		nombre.setBounds(96, 129, 361, 31);
		milamina.add(nombre);
		nombre.setText(modelo.obtenerNombreTitular());

		IBAN = new JLabel();
		IBAN.setHorizontalAlignment(SwingConstants.CENTER);
		IBAN.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		IBAN.setBounds(460, 11, 264, 31);
		milamina.add(IBAN);
		String iban = modelo.obtenerNumeroIBAN();
		IBAN.setText(iban);

		DNI_label = new JLabel("DNI:");
		DNI_label.setHorizontalAlignment(SwingConstants.LEFT);
		DNI_label.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		DNI_label.setBounds(10, 154, 76, 31);
		milamina.add(DNI_label);

		dni = new JLabel("");
		dni.setHorizontalAlignment(SwingConstants.LEFT);
		dni.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		dni.setBounds(96, 154, 104, 31);
		milamina.add(dni);
		dni.setText(modelo.obtenerDNI());

		labelhuellaCarbono = new JLabel("Huella de carbono:");
		labelhuellaCarbono.setHorizontalAlignment(SwingConstants.LEFT);
		labelhuellaCarbono.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		labelhuellaCarbono.setBounds(10, 179, 173, 31);
		milamina.add(labelhuellaCarbono);

		carbono = new JLabel("");
		carbono.setHorizontalAlignment(SwingConstants.LEFT);
		carbono.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		carbono.setBounds(186, 179, 118, 31);
		milamina.add(carbono);
		carbono.setText(String.valueOf(modelo.obtenerLimiteHuellaCarbono()));

		labelTipoDeInteres = new JLabel("Tipo de interes:");
		labelTipoDeInteres.setHorizontalAlignment(SwingConstants.LEFT);
		labelTipoDeInteres.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		labelTipoDeInteres.setBounds(10, 204, 160, 31);
		milamina.add(labelTipoDeInteres);

		interes = new JLabel("");
		interes.setHorizontalAlignment(SwingConstants.LEFT);
		interes.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		interes.setBounds(186, 204, 39, 31);
		milamina.add(interes);
		interes.setText(String.valueOf(modelo.obtenerInteresBancoCentral()));

		labelOperatividad = new JLabel("Operatividad:");
		labelOperatividad.setHorizontalAlignment(SwingConstants.LEFT);
		labelOperatividad.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		labelOperatividad.setBounds(10, 254, 135, 31);
		milamina.add(labelOperatividad);

		booleano_operativa = new JLabel("");
		booleano_operativa.setHorizontalAlignment(SwingConstants.LEFT);
		booleano_operativa.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		booleano_operativa.setBounds(134, 254, 230, 31);
		milamina.add(booleano_operativa);
		booleano_operativa.setText(ImprimirOperatividad(modelo));

		lblSexoDelCliente = new JLabel("Sexo cliente:");
		lblSexoDelCliente.setHorizontalAlignment(SwingConstants.LEFT);
		lblSexoDelCliente.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		lblSexoDelCliente.setBounds(10, 279, 123, 31);
		milamina.add(lblSexoDelCliente);

		Sexo = new JLabel("");
		Sexo.setHorizontalAlignment(SwingConstants.LEFT);
		Sexo.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		Sexo.setBounds(135, 279, 118, 31);
		milamina.add(Sexo);
		Sexo.setText(ImprimirSexo(modelo));

		label_comunitario = new JLabel("Comunitario:");
		label_comunitario.setHorizontalAlignment(SwingConstants.LEFT);
		label_comunitario.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		label_comunitario.setBounds(10, 304, 118, 31);
		milamina.add(label_comunitario);

		comunitario = new JLabel();
		comunitario.setHorizontalAlignment(SwingConstants.LEFT);
		comunitario.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		comunitario.setBounds(132, 304, 118, 31);
		milamina.add(comunitario);
		comunitario.setText(ImprimirComunitario(modelo));

		labelIRPF = new JLabel("El IRPF aplicado:");
		labelIRPF.setHorizontalAlignment(SwingConstants.LEFT);
		labelIRPF.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		labelIRPF.setBounds(10, 329, 160, 31);
		milamina.add(labelIRPF);

		IRPF = new JLabel("0.0");
		IRPF.setHorizontalAlignment(SwingConstants.LEFT);
		IRPF.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		IRPF.setBounds(186, 329, 106, 31);
		milamina.add(IRPF);
		IRPF.setText(String.valueOf(modelo.aplicarIRPF()));

		labelCaducidad = new JLabel("Caducidad:");
		labelCaducidad.setHorizontalAlignment(SwingConstants.LEFT);
		labelCaducidad.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		labelCaducidad.setBounds(10, 229, 104, 31);
		milamina.add(labelCaducidad);

		caducidad = new JLabel((String) null);
		caducidad.setHorizontalAlignment(SwingConstants.LEFT);
		caducidad.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		caducidad.setBounds(117, 229, 135, 31);
		milamina.add(caducidad);
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		String fechaCaducidad = formato.format(modelo.obtenerCaducidad());
		caducidad.setText(fechaCaducidad);

		label_prestamo = new JLabel("Deudas contraidas:");
		label_prestamo.setHorizontalAlignment(SwingConstants.LEFT);
		label_prestamo.setFont(new Font("Dialog", Font.BOLD, 18));
		label_prestamo.setBounds(10, 356, 173, 31);
		milamina.add(label_prestamo);

		deuda = new JLabel("0.0");
		deuda.setHorizontalAlignment(SwingConstants.LEFT);
		deuda.setFont(new Font("Dialog", Font.BOLD, 18));
		deuda.setBounds(186, 356, 106, 31);
		milamina.add(deuda);

		labelProducto = new JLabel("PRODUCTO");
		labelProducto.setHorizontalAlignment(SwingConstants.LEFT);
		labelProducto.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		labelProducto.setBounds(305, 179, 173, 31);
		milamina.add(labelProducto);

		labelImporte = new JLabel("IMPORTE");
		labelImporte.setHorizontalAlignment(SwingConstants.LEFT);
		labelImporte.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		labelImporte.setBounds(445, 179, 173, 31);
		milamina.add(labelImporte);

		IdTransaccion = new JLabel("ID_TRANSACCION");
		IdTransaccion.setHorizontalAlignment(SwingConstants.LEFT);
		IdTransaccion.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		IdTransaccion.setBounds(575, 179, 173, 31);
		milamina.add(IdTransaccion);

		// LOS TEXFIELDS
		gastar_cantidad = new JTextField();
		gastar_cantidad.setHorizontalAlignment(SwingConstants.CENTER);
		gastar_cantidad.setFont(new Font("Verdana Pro Black", Font.PLAIN, 16));
		gastar_cantidad.setColumns(10);
		gastar_cantidad.setBounds(612, 95, 112, 31);
		milamina.add(gastar_cantidad);

		ingresar_cantidad = new JTextField();
		ingresar_cantidad.setHorizontalAlignment(SwingConstants.CENTER);
		ingresar_cantidad.setFont(new Font("Verdana Pro Black", Font.PLAIN, 16));
		ingresar_cantidad.setBounds(612, 52, 112, 31);
		milamina.add(ingresar_cantidad);
		ingresar_cantidad.setColumns(10);

		// LOS BOTONES
		JButton ingresar_boton = new JButton("INGRESAR");
		ingresar_boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double numero = Double.parseDouble(ingresar_cantidad.getText().toString());
					String nombreProducto = "Ingreso";

					// Modificamos los saldos y campos
					modelo.depositar(numero);
					Saldo.setText(String.valueOf(modelo.obtenerSaldo()));
					booleano_operativa.setText(ImprimirOperatividad(modelo));

					// Creamos una lista temporal
					List<String> listaProductosTemporal = new ArrayList<>();
					for (int i = 0; i < listaProductos.getModel().getSize(); i++) {
						listaProductosTemporal.add(listaProductos.getModel().getElementAt(i));
					}

					List<String> listaImporteTemporal = new ArrayList<>();
					for (int i = 0; i < listaImporte.getModel().getSize(); i++) {
						listaImporteTemporal.add(listaImporte.getModel().getElementAt(i));
					}

					// Agrega los datos a las listas temporales
					listaProductosTemporal.add(nombreProducto);
					listaImporteTemporal.add(String.valueOf(numero));

					// Actualiza los datos de las JList
					listaProductos.setListData(listaProductosTemporal.toArray(new String[listaProductosTemporal.size()]));
					listaTransacciones.setListData(modelo.obtenerIdTransacciones());
					listaImporte.setListData(listaImporteTemporal.toArray(new String[listaImporteTemporal.size()]));
				
				} catch (NumberFormatException e1) {
					ingresar_cantidad.setText("ERROR");
					ingresar_cantidad.setForeground(Color.red);
				}
			}
		});
		ingresar_boton.setFont(new Font("Verdana Pro Cond", Font.BOLD, 15));
		ingresar_boton.setBounds(487, 53, 118, 31);
		milamina.add(ingresar_boton);

		JButton gastar_boton = new JButton("RETIRAR");
		gastar_boton.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent e) {
				try {
					if (modelo.EsOperativa() && modelo.obtenerSaldo() > 0) {
						double numero = Double.parseDouble(gastar_cantidad.getText().toString());
						String nombreProducto = "Retirada de efectivo";

						// Retiramos el dinero
						if (modelo.validarRetiros(numero) == true) {
							modelo.retirar(numero);
							Saldo.setText(String.valueOf(modelo.obtenerSaldo()));
							booleano_operativa.setText(ImprimirOperatividad(modelo));

							// Crea una lista temporal
							List<String> listaProductosTemporal = new ArrayList<>();
							for (int i = 0; i < listaProductos.getModel().getSize(); i++) {
								listaProductosTemporal.add(listaProductos.getModel().getElementAt(i));
							}

							List<String> listaImporteTemporal = new ArrayList<>();
							for (int i = 0; i < listaImporte.getModel().getSize(); i++) {
								listaImporteTemporal.add(listaImporte.getModel().getElementAt(i));
							}

							// Agrega los datos a las listas temporales
							listaProductosTemporal.add(nombreProducto);
							listaImporteTemporal.add(String.valueOf(-numero));

							// Actualiza los datos de las JList
							listaProductos
									.setListData(listaProductosTemporal.toArray(new String[listaProductosTemporal.size()]));
							listaTransacciones.setListData(modelo.obtenerIdTransacciones());
							listaImporte.setListData(listaImporteTemporal.toArray(new String[listaImporteTemporal.size()]));
						} else {
							JOptionPane.showMessageDialog(null,
									"La operación no es posible porque no tiene suficiente saldo", "Advertencia",
									JOptionPane.WARNING_MESSAGE);
						}
					} else {
						modelo.mensajeOperatividad();
					}
				}catch (NumberFormatException e1) {
					gastar_cantidad.setText("ERROR");
					gastar_cantidad.setForeground(Color.red);
				}	
			}
		});
		gastar_boton.setFont(new Font("Verdana Pro Cond", Font.BOLD, 15));
		gastar_boton.setBounds(484, 95, 118, 31);
		milamina.add(gastar_boton);

		JButton actualizarSaldo = new JButton("Actualizar datos");
		actualizarSaldo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comunicarSaldos(modelo, Saldo);
				comunicarSaldos2(modelo, Saldo);
				comunicarInteres(modelo, interes, Saldo);
				comunicarIRPF(modelo, IRPF, Saldo);
				comunicarlimiteHuellaCarbono(modelo, carbono);

				try {
					comunicarCaducidad(modelo, caducidad, Saldo, BCE);
					comunicarPrestamo(modelo, deuda, Saldo, BCE);
					comunicarDevolucionPrestamo(modelo, deuda, Saldo, BCE);
					comunicarOperatividadFalse(modelo, booleano_operativa, BCE);
					comunicarOperatividadTrue(modelo, booleano_operativa, BCE);
				} catch (ParseException e1) {
					System.out.println(e1.getMessage());
				}
				booleano_operativa.setText(ImprimirOperatividad(modelo));
			}
		});
		actualizarSaldo.setFont(new Font("Verdana Pro Cond", Font.BOLD, 15));
		actualizarSaldo.setBounds(283, 137, 150, 31);
		milamina.add(actualizarSaldo);

		JButton botonAnadir = new JButton("Añadir Producto");
		botonAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (modelo.EsOperativa() && modelo.obtenerSaldo() > 0) {
					// Metemos mediante interfaz los datos del producto
					String nombreProducto = JOptionPane.showInputDialog("Introduce el nombre del producto");
					double HuellaProducto = Integer
							.parseInt(JOptionPane.showInputDialog("Introduce la huella del producto"));
					double ImporteProducto = Integer
							.parseInt(JOptionPane.showInputDialog("Introduce el importe total"));
					Producto_CBDC producto = new Producto_CBDC(ImporteProducto, HuellaProducto, nombreProducto);

					// Realizamos la compra y actualizamos labels
					if ((modelo.calcularHuellaCarbonoTotal() + HuellaProducto) < modelo.obtenerLimiteHuellaCarbono()) {
						modelo.realizarCompra(producto);
						Saldo.setText(String.valueOf(modelo.obtenerSaldo()));

						// Creamos una lista temporal para almacenar el importe negativo
						List<String> listaImporteTemporal = new ArrayList<>();
						for (int i = 0; i < listaImporte.getModel().getSize(); i++) {
							listaImporteTemporal.add(listaImporte.getModel().getElementAt(i));
						}

						// Agrega los datos a las listas temporales
						listaImporteTemporal.add(String.valueOf(-ImporteProducto));

						// Actualiza los datos de las JList
						listaProductos.setListData(modelo.obtenerNombreProducto());
						listaTransacciones.setListData(modelo.obtenerIdTransacciones());
						listaImporte.setListData(listaImporteTemporal.toArray(new String[listaImporteTemporal.size()])); // Lo
																															// hacemos
																															// asi
																															// para
																															// que
																															// imprima
																															// el
																															// numero
																															// en
																															// negativo
					} else {
						JOptionPane.showMessageDialog(null,
								"Greta Thunberg te informa que la operación no es posible porque te has pasado en tu huella de carbono",
								"Advertencia", JOptionPane.WARNING_MESSAGE);
						modelo.modificarOperativa(false);
						booleano_operativa.setText(ImprimirOperatividad(modelo));
					}
				} else {
					modelo.mensajeOperatividad();
					modelo.modificarOperativa(false);
					booleano_operativa.setText(ImprimirOperatividad(modelo));
				}
			}
		});
		botonAnadir.setFont(new Font("Verdana Pro Cond", Font.BOLD, 15));
		botonAnadir.setBounds(483, 137, 150, 31);
		milamina.add(botonAnadir);

		// LISTAS
		listaTransacciones.setBounds(545, 210, 220, 190);
		milamina.add(listaTransacciones);
		listaProductos.setBounds(275, 210, 150, 190);
		milamina.add(listaProductos);
		listaImporte.setBounds(435, 210, 100, 190);
		milamina.add(listaImporte);
	}
}