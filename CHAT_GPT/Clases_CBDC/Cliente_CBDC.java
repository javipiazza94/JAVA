package Clases_CBDC;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Cliente_CBDC extends JFrame {
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
		if (Cuentas.EsOperativa()) {
			res = "La cuenta esta operativa";
		}else {
			res= "La cuenta NO esta operativa";
		}
		return res;
	}
	
	public String ImprimirSexo(Cuenta_bancaria_CBDC Cuentas) {
		String res = null;
		if (Cuentas.obtenerSexo()=='h') {
			res = "Hombre";
		}else {
			res= "Mujer";
		}
		return res;
	}
	
	public String ImprimirComunitario(Cuenta_bancaria_CBDC Cuentas) {
		String res = null;
		if (Cuentas.obtenerComunitario()) {
			res = "SI";
		}else {
			res= "NO";
		}
		return res;
	}

	private JPanel milamina;
	JLabel Saldo, IBAN, Cliente_label, nombre, DNI_label, dni, labelBanco, saldoLabel, labelNumeroDeCuenta, labelhuellaCarbono,
	carbono, labelTipoDeInteres, interes, labelOperatividad, booleano_operativa, label_sexo, Sexo, label_comunitario, comunitario,
	labelIRPF, IRPF;
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
		BCE.crearCuenta(modelo);
		System.out.println(modelo.obtenerDatosCuenta());

		// CREAMOS LAS DIMENSIONES DEL FRAME
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 150, 750, 450);

		// CREAMOS EL JPANEL
		milamina = new JPanel();
		milamina.setLayout(null);
		setContentPane(milamina);
		milamina.setBackground(new Color(192, 192, 192));
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		Image imagen = pantalla.getImage(
				"C:\\Users\\javip\\OneDrive\\Documents\\DAM\\ACTIVIDADES\\EJERCICIOS DE PROGRAMACIÓN\\JAVA\\PROYECTO_CBDC\\src\\euro.png");
		setIconImage(imagen);
		setBackground(SystemColor.window);

		// LOS LABELS	
		labelBanco = new JLabel("");
		labelBanco.setIcon(new ImageIcon(
				"C:\\Users\\javip\\OneDrive\\Documents\\DAM\\ACTIVIDADES\\EJERCICIOS DE PROGRAMACIÓN\\JAVA\\PROYECTO_CBDC\\src\\BANCO EURO.png"));
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
		Cliente_label.setBounds(10, 137, 76, 31);
		milamina.add(Cliente_label);

		nombre = new JLabel("");
		nombre.setHorizontalAlignment(SwingConstants.LEFT);
		nombre.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		nombre.setBounds(107, 137, 361, 31);
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
		DNI_label.setBounds(10, 171, 76, 31);
		milamina.add(DNI_label);

		dni = new JLabel("");
		dni.setHorizontalAlignment(SwingConstants.LEFT);
		dni.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		dni.setBounds(107, 171, 104, 31);
		milamina.add(dni);
		dni.setText(modelo.obtenerDNI());
		
		labelhuellaCarbono = new JLabel("Huella de carbono:");
		labelhuellaCarbono.setHorizontalAlignment(SwingConstants.LEFT);
		labelhuellaCarbono.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		labelhuellaCarbono.setBounds(10, 204, 160, 31);
		milamina.add(labelhuellaCarbono);
		
		carbono = new JLabel("");
		carbono.setHorizontalAlignment(SwingConstants.LEFT);
		carbono.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		carbono.setBounds(174, 204, 118, 31);
		milamina.add(carbono);
		carbono.setText(String.valueOf(modelo.calcularHuellaCarbonoTotal()));

		labelTipoDeInteres = new JLabel("Tipo de interes:");
		labelTipoDeInteres.setHorizontalAlignment(SwingConstants.LEFT);
		labelTipoDeInteres.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		labelTipoDeInteres.setBounds(10, 236, 160, 31);
		milamina.add(labelTipoDeInteres);
		
		interes = new JLabel("");
		interes.setHorizontalAlignment(SwingConstants.LEFT);
		interes.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		interes.setBounds(174, 236, 39, 31);
		milamina.add(interes);
		interes.setText(String.valueOf(modelo.obtenerInteresBancoCentral()));
		
		labelOperatividad = new JLabel("Operatividad:");
		labelOperatividad.setHorizontalAlignment(SwingConstants.LEFT);
		labelOperatividad.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		labelOperatividad.setBounds(10, 269, 135, 31);
		milamina.add(labelOperatividad);
		
		booleano_operativa = new JLabel("");
		booleano_operativa.setHorizontalAlignment(SwingConstants.LEFT);
		booleano_operativa.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		booleano_operativa.setBounds(134, 269, 230, 31);
		milamina.add(booleano_operativa);
		booleano_operativa.setText(ImprimirOperatividad(modelo));
		
		label_sexo = new JLabel("Sexo:");
		label_sexo.setHorizontalAlignment(SwingConstants.LEFT);
		label_sexo.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		label_sexo.setBounds(10, 302, 67, 31);
		milamina.add(label_sexo);
		
		Sexo = new JLabel("");
		Sexo.setHorizontalAlignment(SwingConstants.LEFT);
		Sexo.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		Sexo.setBounds(107, 302, 118, 31);
		milamina.add(Sexo);
		Sexo.setText(ImprimirSexo(modelo));
		
		label_comunitario = new JLabel("Comunitario:");
		label_comunitario.setHorizontalAlignment(SwingConstants.LEFT);
		label_comunitario.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		label_comunitario.setBounds(10, 332, 118, 31);
		milamina.add(label_comunitario);
		
		comunitario = new JLabel();
		comunitario.setHorizontalAlignment(SwingConstants.LEFT);
		comunitario.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		comunitario.setBounds(122, 332, 118, 31);
		milamina.add(comunitario);
		comunitario.setText(ImprimirComunitario(modelo));
		
		labelIRPF = new JLabel("El IRPF aplicado es:");
		labelIRPF.setHorizontalAlignment(SwingConstants.LEFT);
		labelIRPF.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		labelIRPF.setBounds(10, 365, 173, 31);
		milamina.add(labelIRPF);
		
		IRPF = new JLabel("0.0");
		IRPF.setHorizontalAlignment(SwingConstants.LEFT);
		IRPF.setFont(new Font("Verdana Pro Cond", Font.BOLD, 18));
		IRPF.setBounds(186, 365, 39, 31);
		milamina.add(IRPF);
		IRPF.setText(String.valueOf(modelo.aplicarIRPF()));
		
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
			}
		});
		gastar_boton.setFont(new Font("Verdana Pro Cond", Font.BOLD, 15));
		gastar_boton.setBounds(484, 95, 118, 31);
		milamina.add(gastar_boton);

		JButton actualizarSaldo = new JButton("Actualizar datos");
		actualizarSaldo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comunicarSaldos(modelo, Saldo);
				comunicarInteres(modelo, interes, Saldo);
				comunicarIRPF(modelo, IRPF, Saldo);
				comunicarlimiteHuellaCarbono(modelo, carbono);
			}
		});
		actualizarSaldo.setFont(new Font("Verdana Pro Cond", Font.BOLD, 15));
		actualizarSaldo.setBounds(483, 137, 150, 31);
		milamina.add(actualizarSaldo);

	}

}
