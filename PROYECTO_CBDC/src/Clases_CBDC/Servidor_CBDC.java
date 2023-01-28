package Clases_CBDC;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Servidor_CBDC extends JFrame {

	private static final long serialVersionUID = -2809579001833735375L;
	private JPanel milamina;
	public final String IP = "localhost";
	public final int _PuertoPrestar = 9976;
	public final int _PuertoSaldos2 = 9977;
	public final int _PuertoSaldos = 9978;
	public final int _PuertoInteres = 9979;
	public final int _PuertoIRPF = 9980;
	public final int Puerto_carbono = 9981;
	public final int Puerto_caducidad = 9982;
	private JLabel bce_logo, emision, interes, EstableceLimiteCO2, AplicarIrpf, caducidad_dinero, prestamo,
			lblFechaDeEntrega, lblCantidad;
	private JTextField cantidad, tipo_interes, carbono, fecha_caducidad, cantidad_prestar, fecha_entrega;
	private JButton Emitir, tipo_interes_boton, carbono_boton, IRPF_boton, tipo_interes_boton_1, Prestar, Eliminar;
	private Banco_Central_CBDC BCE;
	private ArrayList<Cuenta_bancaria_CBDC> Cuentas;
	private Cuenta_bancaria_CBDC modelo;

	public static void main(String[] args) {
		Servidor_CBDC marco = new Servidor_CBDC();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setTitle("Servidor CBDC del BCE");
	}

	public Servidor_CBDC() {

		// INSTANCIAMOS EL BANCO CENTRAL Y LAS CUENTAS
		BCE = new Banco_Central_CBDC();
		modelo = new Cuenta_bancaria_CBDC("Juan Pérez", 'h', 0, 10000.);
		BCE.crearCuenta(modelo);

		// TAMAÑO DEL FRAME
		setResizable(true);
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		Dimension tam = pantalla.getScreenSize();
		int ancho = tam.width;
		int altura = tam.height;
		setSize(ancho / 2, altura / 2);
		setLocation(ancho / 4, altura / 4);

		// CREAMOS EL JPANEL
		milamina = new JPanel();
		milamina.setLayout(null);
		setContentPane(milamina);
		milamina.setBackground(new Color(255, 255, 255));
		Image imagen = pantalla.getImage("./src/IMAGENES/euro.png");
		setIconImage(imagen);
		setBackground(SystemColor.window);

		// ETIQUETAS
		bce_logo = new JLabel("");
		bce_logo.setIcon(new ImageIcon("./src/IMAGENES/European-Central-Bank-logo.jpg"));
		bce_logo.setBounds(221, 11, 231, 100);
		milamina.add(bce_logo);

		emision = new JLabel("Introduce la cantidad a emitir a cada cuenta");
		emision.setForeground(new Color(0, 0, 255));
		emision.setFont(new Font("Verdana", Font.BOLD, 11));
		emision.setBounds(10, 118, 290, 27);
		milamina.add(emision);

		interes = new JLabel("Introduce el tipo de interés general");
		interes.setForeground(Color.BLUE);
		interes.setFont(new Font("Verdana", Font.BOLD, 11));
		interes.setBounds(10, 152, 290, 27);
		milamina.add(interes);

		EstableceLimiteCO2 = new JLabel("Establece el límite de huella de carbono");
		EstableceLimiteCO2.setForeground(Color.BLUE);
		EstableceLimiteCO2.setFont(new Font("Verdana", Font.BOLD, 11));
		EstableceLimiteCO2.setBounds(10, 186, 290, 27);
		milamina.add(EstableceLimiteCO2);

		AplicarIrpf = new JLabel("Aplicar IRPF");
		AplicarIrpf.setForeground(Color.BLUE);
		AplicarIrpf.setFont(new Font("Verdana", Font.BOLD, 11));
		AplicarIrpf.setBounds(10, 224, 290, 27);
		milamina.add(AplicarIrpf);

		caducidad_dinero = new JLabel("Establecer caducidad");
		caducidad_dinero.setForeground(Color.BLUE);
		caducidad_dinero.setFont(new Font("Verdana", Font.BOLD, 11));
		caducidad_dinero.setBounds(10, 262, 290, 27);
		milamina.add(caducidad_dinero);

		prestamo = new JLabel("Introduce el préstamo a realizar por cuenta\r\n");
		prestamo.setForeground(Color.BLUE);
		prestamo.setFont(new Font("Verdana", Font.BOLD, 11));
		prestamo.setBounds(10, 314, 299, 27);
		milamina.add(prestamo);

		lblFechaDeEntrega = new JLabel("Fecha de entrega");
		lblFechaDeEntrega.setHorizontalAlignment(SwingConstants.CENTER);
		lblFechaDeEntrega.setForeground(Color.BLUE);
		lblFechaDeEntrega.setFont(new Font("Verdana", Font.BOLD, 11));
		lblFechaDeEntrega.setBounds(440, 292, 137, 27);
		milamina.add(lblFechaDeEntrega);

		// TEXTO
		cantidad = new JTextField();
		cantidad.setBounds(315, 121, 137, 23);
		cantidad.setColumns(10);
		milamina.add(cantidad);

		tipo_interes = new JTextField();
		tipo_interes.setColumns(10);
		tipo_interes.setBounds(315, 155, 137, 23);
		milamina.add(tipo_interes);

		fecha_caducidad = new JTextField();
		fecha_caducidad.setColumns(10);
		fecha_caducidad.setBounds(315, 265, 137, 23);
		milamina.add(fecha_caducidad);

		carbono = new JTextField();
		carbono.setColumns(10);
		carbono.setBounds(315, 189, 137, 23);
		milamina.add(carbono);

		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantidad.setForeground(Color.BLUE);
		lblCantidad.setFont(new Font("Verdana", Font.BOLD, 11));
		lblCantidad.setBounds(314, 292, 137, 27);
		milamina.add(lblCantidad);

		cantidad_prestar = new JTextField();
		cantidad_prestar.setColumns(10);
		cantidad_prestar.setBounds(315, 317, 127, 23);
		milamina.add(cantidad_prestar);

		fecha_entrega = new JTextField();
		fecha_entrega.setColumns(10);
		fecha_entrega.setBounds(450, 317, 117, 23);
		milamina.add(fecha_entrega);

		// BOTONES
		Emitir = new JButton("Emitir");
		Emitir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double numero = Double.parseDouble(cantidad.getText().toString());
				BCE.crearDineroTotal(numero);
				System.out.println(modelo.obtenerSaldo());
				Thread hiloEmitir = new Thread(new Runnable() {
					public void run() {
						try {
							ServerSocket socket_servidor = new ServerSocket(_PuertoSaldos);
							while (true) {
								Socket socket_cliente = socket_servidor.accept();
								DataOutputStream entrada = new DataOutputStream(socket_cliente.getOutputStream());
								entrada.writeDouble(modelo.obtenerSaldo());
								entrada.close();
								socket_servidor.close();
								socket_cliente.close();
							}

						} catch (IOException e1) {
							System.out.println(e1.getMessage());
						}
					}
				});
				// Inicia el hilo
				hiloEmitir.start();
			}
		});
		Emitir.setBounds(462, 120, 88, 25);
		milamina.add(Emitir);

		tipo_interes_boton = new JButton("Interes");
		tipo_interes_boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double numero = Double.parseDouble(tipo_interes.getText().toString());
				BCE.establecerTipoInteres(numero);
				System.out.println(modelo.obtenerInteresBancoCentral());
				Thread hiloEmitir = new Thread(new Runnable() {
					public void run() {
						try {
							ServerSocket socket_servidor = new ServerSocket(_PuertoInteres);
							Socket socket_cliente = socket_servidor.accept();
							DataOutputStream entrada = new DataOutputStream(socket_cliente.getOutputStream());
							entrada.writeDouble(numero);
							entrada.flush();
							entrada.close();
							socket_servidor.close();
							socket_cliente.close();
						} catch (IOException e1) {
							System.out.println(e1.getMessage());
						}
					}
				});
				// Inicia el hilo
				hiloEmitir.start();
			}
		});
		tipo_interes_boton.setBounds(462, 154, 88, 25);
		milamina.add(tipo_interes_boton);

		carbono_boton = new JButton("CO2");
		carbono_boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double numero = Double.parseDouble(carbono.getText().toString());
				BCE.modificarLimiteHuellaCuenta(numero);
				System.out.println(modelo.obtenerLimiteHuellaCarbono());
				try {
					ServerSocket socket_servidor = new ServerSocket(Puerto_carbono);
					Socket socket_cliente = socket_servidor.accept();
					DataOutputStream entrada = new DataOutputStream(socket_cliente.getOutputStream());
					entrada.writeDouble(modelo.obtenerLimiteHuellaCarbono());
					entrada.close();
					socket_servidor.close();
					socket_cliente.close();
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		carbono_boton.setBounds(462, 189, 88, 25);
		milamina.add(carbono_boton);

		IRPF_boton = new JButton("IRPF");
		IRPF_boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BCE.establecerTramosIrpfCuenta(modelo);
				System.out.println(modelo.aplicarIRPF());
				Thread hiloEmitir = new Thread(new Runnable() {
					public void run() {
						try {
							ServerSocket socket_servidor = new ServerSocket(_PuertoIRPF);
							Socket socket_cliente = socket_servidor.accept();
							DataOutputStream entrada = new DataOutputStream(socket_cliente.getOutputStream());
							entrada.writeDouble(modelo.calcularPorcentajeAplicadoIRPF());
							entrada.close();
							socket_servidor.close();
							socket_cliente.close();
						} catch (IOException e1) {
							System.out.println(e1.getMessage());
						}
					}
				});
				// Inicia el hilo
				hiloEmitir.start();
			}
		});
		IRPF_boton.setBounds(314, 226, 88, 25);
		milamina.add(IRPF_boton);

		tipo_interes_boton_1 = new JButton("Caducidad");
		tipo_interes_boton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fecha_caducidad2 = fecha_caducidad.getText();
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				try {
					Date date = (Date) sdf.parse(fecha_caducidad2);
					BCE.establecerCaducidadDinero(date);
					System.out.println(date);
				} catch (ParseException e1) {
					System.out.println(e1.getMessage());
				}

				Thread hiloEmitir = new Thread(new Runnable() {
					public void run() {
						ServerSocket socket_servidor;
						try {
							socket_servidor = new ServerSocket(Puerto_caducidad);
							Socket socket_cliente = socket_servidor.accept();
							DataOutputStream entrada = new DataOutputStream(socket_cliente.getOutputStream());
							entrada.writeUTF(fecha_caducidad2);
							entrada.close();
							socket_servidor.close();
							socket_cliente.close();
						} catch (IOException e) {
							System.out.println(e.getMessage());
							;
						}
					}
				});
				// Inicia el hilo
				hiloEmitir.start();
			}
		});
		tipo_interes_boton_1.setBounds(462, 264, 103, 25);
		milamina.add(tipo_interes_boton_1);

		Prestar = new JButton("Prestar");
		Prestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Thread hiloEmitir = new Thread(new Runnable() {
					public void run() {
						try {
							String fecha_caducidad2 = fecha_entrega.getText();
							SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
							Date date = (Date) sdf.parse(fecha_caducidad2);
							double numero = Double.parseDouble(cantidad_prestar.getText().toString());
							double prestamo = BCE.prestarDineroCuenta(modelo, numero, date);
							System.out.println(modelo.obtenerSaldo());
							ServerSocket socket_servidor = new ServerSocket(_PuertoPrestar);
							while (true) {
								Socket socket_cliente = socket_servidor.accept();
								DataOutputStream entrada = new DataOutputStream(socket_cliente.getOutputStream());
								entrada.writeDouble(prestamo);
								entrada.writeUTF(fecha_caducidad2);
								entrada.close();
								socket_servidor.close();
								socket_cliente.close();
							}

						} catch (IOException e1) {
							System.out.println(e1.getMessage());
						} catch (ParseException e1) {
							System.out.println(e1.getMessage());
						}
					}
				});
				// Inicia el hilo
				hiloEmitir.start();
			}
		});
		Prestar.setBounds(574, 316, 88, 25);
		milamina.add(Prestar);

		Eliminar = new JButton("Eliminar");
		Eliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double numero = Double.parseDouble(cantidad.getText().toString());
				BCE.eliminarDineroTotal(numero);
				System.out.println(modelo.obtenerSaldo());
				Thread hiloEmitir = new Thread(new Runnable() {
					public void run() {
						try {
							ServerSocket socket_servidor = new ServerSocket(_PuertoSaldos2);
							while (true) {
								Socket socket_cliente = socket_servidor.accept();
								DataOutputStream entrada = new DataOutputStream(socket_cliente.getOutputStream());
								entrada.writeDouble(modelo.obtenerSaldo());
								entrada.close();
								socket_servidor.close();
								socket_cliente.close();
							}

						} catch (IOException e1) {
							System.out.println(e1.getMessage());
						}
					}
				});
				// Inicia el hilo
				hiloEmitir.start();
			}
		});
		Eliminar.setBounds(560, 121, 88, 25);
		milamina.add(Eliminar);

	}
}
