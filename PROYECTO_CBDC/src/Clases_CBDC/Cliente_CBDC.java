package Clases_CBDC;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
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
import java.util.Date;
import java.awt.event.ActionEvent;

public class Cliente_CBDC extends JFrame {

	private static final long serialVersionUID = 5787738098682905747L;
	
	public static void comunicarPrestamo(Cuenta_bancaria_CBDC modelo, JLabel entrega, JLabel Saldo, Banco_Central_CBDC bce) throws ParseException {
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
	        //Aplicamos el prestamo por el banco central
	        double prestamo = bce.prestarDineroCuenta(modelo, cantidadEmitida, fechaCaducidad);
	        //Escribimos los resultados
	        Saldo.setText(String.valueOf(modelo.obtenerSaldo()+prestamo));
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

	public static void comunicarCaducidad(Cuenta_bancaria_CBDC modelo, JLabel caducidad, JLabel Saldo, Banco_Central_CBDC bce) throws ParseException {
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
			//Aplicamos la caducidad al dinero por el banco central
			bce.establecerCaducidadDineroenCuenta(modelo.obtenerCaducidad(), modelo);
			//Escribimos los resultados
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
			modelo.modificarLimiteHuellaCarbono(cantidadpermitida);;
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
	

	public static void comunicarIRPF(Cuenta_bancaria_CBDC modelo, JLabel IRPF,  JLabel saldo) {
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
	

	public String ImprimirOperatividad(Cuenta_bancaria_CBDC Cuentas) {
		String res = null;
		if (Cuentas.EsOperativa()==true) {
			res = "SÍ";
		}
		if (Cuentas.EsOperativa()==false) {
			res = "NO";
		}
		if(Cuentas.obtenerLimiteHuellaCarbono()<Cuentas.calcularHuellaCarbonoTotal()){
			res = Cuentas.verificarLimite();
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
			res = "SI";
		} else {
			res = "NO";
		}
		return res;
	}
	

	private JPanel milamina;
	JLabel Saldo, IBAN, Cliente_label, nombre, DNI_label, dni, labelBanco, saldoLabel, labelNumeroDeCuenta,
			labelhuellaCarbono, carbono, labelTipoDeInteres, interes, labelOperatividad, booleano_operativa, lblSexoDelCliente,
			Sexo, label_comunitario, comunitario, labelIRPF, IRPF, labelCaducidad, caducidad, label_prestamo, deuda;
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

		// INSTANCIAMOS EL BANCO CENTRAL Y LAS CUENTAS
		BCE = new Banco_Central_CBDC();
		modelo = new Cuenta_bancaria_CBDC("Juan Pérez", 'h', 0, 10000.);

		// CREAMOS LAS DIMENSIONES DEL FRAME
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 150, 750, 450);
		setTitle("Cuenta Bancaria CBDC");

		// CREAMOS EL JPANEL
		milamina = new JPanel();
		milamina.setLayout(null);
		setContentPane(milamina);
		milamina.setBackground(new Color(192, 192, 192));
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		Image imagen = pantalla.getImage(
				".\\src\\IMAGENES\\euro.png");
		setIconImage(imagen);
		setBackground(SystemColor.window);

		// LOS LABELS
		labelBanco = new JLabel("");
		labelBanco.setIcon(new ImageIcon(
				".\\src\\IMAGENES\\BANCO EURO.png"));
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
		carbono.setText(String.valueOf(modelo.calcularHuellaCarbonoTotal()));

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
		comunitario.setBounds(122, 304, 118, 31);
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
				double numero = Double.parseDouble(ingresar_cantidad.getText().toString());
				modelo.depositar(numero);
				Saldo.setText(String.valueOf(modelo.obtenerSaldo()));
				booleano_operativa.setText(ImprimirOperatividad(modelo));
			}
		});
		ingresar_boton.setFont(new Font("Verdana Pro Cond", Font.BOLD, 15));
		ingresar_boton.setBounds(487, 53, 118, 31);
		milamina.add(ingresar_boton);

		JButton gastar_boton = new JButton("GASTAR");
		gastar_boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double numero = Double.parseDouble(gastar_cantidad.getText().toString());
				modelo.retirar(numero);
				Saldo.setText(String.valueOf(modelo.obtenerSaldo()));
				booleano_operativa.setText(ImprimirOperatividad(modelo));
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
				} catch (ParseException e1) {
					System.out.println(e1.getMessage());
				}
				booleano_operativa.setText(ImprimirOperatividad(modelo));
			}
		});
		actualizarSaldo.setFont(new Font("Verdana Pro Cond", Font.BOLD, 15));
		actualizarSaldo.setBounds(483, 137, 150, 31);
		milamina.add(actualizarSaldo);
		
		
		
		

	}
}