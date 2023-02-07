package Clases_CBDC;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
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
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
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
	public final int _PuertoDevolver = 9975;
	public final int _PuertoPrestar = 9976;
	public final int _PuertoSaldos2 = 9977;
	public final int _PuertoSaldos = 9978;
	public final int _PuertoInteres = 9979;
	public final int _PuertoIRPF = 9980;
	public final int Puerto_carbono = 9981;
	public final int Puerto_caducidad = 9982;
	public final int PuertoOperatividad = 9983;
	public final int PuertoOperatividad2 = 9984;
	private JLabel bce_logo, emision, interes, EstableceLimiteCO2, AplicarIrpf, caducidad_dinero, prestamo,
			lblFechaDeEntrega, lblCantidad, Operatividad, BM, CF, OM, lblBaseMonetaria, lblReservas, lblOfertaMonetaria;
	private JTextField cantidad, tipo_interes, carbono, fecha_caducidad, cantidad_prestar, fecha_entrega;
	private JButton Emitir, tipo_interes_boton, carbono_boton, IRPF_boton, caducidad_prestamos, Prestar, Eliminar,
			Devolver;
	private Banco_Central_CBDC BCE;
	private ArrayList<Cuenta_bancaria_CBDC> Cuentas;
	private Cuenta_bancaria_CBDC modelo;
	private JRadioButton radioOperativa, radioNoOperativa;
	private ButtonGroup grupoRadio;	
	private void actualizarLabels() {
		  BM.setText(String.valueOf(BCE.obtenerBaseMonetaria()));
		  CF.setText(String.valueOf(BCE.obtenerReserva()));
		  OM.setText(String.valueOf(BCE.obtenerOfertaMonetaria()));
		}

	public static void main(String[] args) {
		Servidor_CBDC marco = new Servidor_CBDC();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setTitle("Servidor CBDC del BCE");
	}

	public Servidor_CBDC() {

		// INSTANCIAMOS EL BANCO CENTRAL Y LAS CUENTAS
		boolean datoscorrectos = false;
		while (!datoscorrectos) {
			try {
				String CC = JOptionPane.showInputDialog("Introduce el coeficiente de caja del Banco Central");
				double caja_inicial = Double.parseDouble(CC);
				if (CC == null) {
					System.exit(0);
				}
				BCE = new Banco_Central_CBDC(caja_inicial);
				datoscorrectos=true;
			} catch (NumberFormatException e1) {
				JOptionPane.showMessageDialog(null, "Introduzca bien los datos. Gracias", "Advertencia",
						JOptionPane.WARNING_MESSAGE);
			}	catch (IllegalArgumentException e) {
			    JOptionPane.showMessageDialog(null, e.getMessage(), "Advertencia", JOptionPane.WARNING_MESSAGE);
			  }
		}
		
		modelo = new Cuenta_bancaria_CBDC("Random", 'h', 0);
		BCE.crearCuenta(modelo);

		// TAMAÑO DEL FRAME
		setResizable(false);
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		Dimension tam = pantalla.getScreenSize();
		int ancho = tam.width / 4;
		int altura = tam.height / 4;
		setBounds(ancho, altura, 780, 450);

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
		bce_logo.setBounds(211, 7, 231, 100);
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

		Operatividad = new JLabel("Modificar la operatividad de las cuentas");
		Operatividad.setForeground(Color.BLUE);
		Operatividad.setFont(new Font("Verdana", Font.BOLD, 11));
		Operatividad.setBounds(10, 362, 290, 27);
		milamina.add(Operatividad);

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
		
		lblReservas = new JLabel("Coeficiente de reservas");
		lblReservas.setForeground(Color.BLUE);
		lblReservas.setFont(new Font("Verdana", Font.BOLD, 11));
		lblReservas.setBounds(484, 36, 164, 27);
		milamina.add(lblReservas);		
		
		lblOfertaMonetaria = new JLabel("Oferta monetaria");
		lblOfertaMonetaria.setForeground(Color.BLUE);
		lblOfertaMonetaria.setFont(new Font("Verdana", Font.BOLD, 11));
		lblOfertaMonetaria.setBounds(526, 60, 127, 27);
		milamina.add(lblOfertaMonetaria);
		
		BM = new JLabel("");
		BM.setBounds(666, 18, 88, 14);
		BM.setForeground(Color.BLUE);
		BM.setFont(new Font("Verdana", Font.BOLD, 11));
		milamina.add(BM);
		
		CF = new JLabel("");
		CF.setBounds(666, 43, 88, 14);
		CF.setForeground(Color.BLUE);
		CF.setFont(new Font("Verdana", Font.BOLD, 11));
		milamina.add(CF);
		
		OM = new JLabel("");
		OM.setBounds(666, 65, 88, 14);
		OM.setForeground(Color.BLUE);
		OM.setFont(new Font("Verdana", Font.BOLD, 11));
		milamina.add(OM);
		
		lblBaseMonetaria = new JLabel("Base monetaria");
		lblBaseMonetaria.setForeground(Color.BLUE);
		lblBaseMonetaria.setFont(new Font("Verdana", Font.BOLD, 11));
		lblBaseMonetaria.setBounds(538, 11, 110, 27);
		milamina.add(lblBaseMonetaria);	
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantidad.setForeground(Color.BLUE);
		lblCantidad.setFont(new Font("Verdana", Font.BOLD, 11));
		lblCantidad.setBounds(314, 292, 137, 27);
		milamina.add(lblCantidad);

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
		Emitir.setFont(new Font("Verdana Pro Cond Semibold", Font.PLAIN, 11));
		Emitir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double numero = Double.parseDouble(cantidad.getText().toString());
					BCE.crearDineroTotal(numero);
					actualizarLabels();
				} catch (NumberFormatException e1) {
					cantidad.setText("ERROR");
					cantidad.setForeground(Color.red);
				}
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
						} catch (NumberFormatException e1) {
							cantidad.setText("ERROR");
							cantidad.setForeground(Color.red);
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
		tipo_interes_boton.setFont(new Font("Verdana Pro Cond Semibold", Font.PLAIN, 11));
		tipo_interes_boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double numero = Double.parseDouble(tipo_interes.getText().toString());
					BCE.establecerTipoInteres(numero);
				} catch (NumberFormatException e1) {
					tipo_interes.setText("ERROR");
					tipo_interes.setForeground(Color.red);
				}
				Thread hiloEmitir = new Thread(new Runnable() {
					public void run() {
						try {
							ServerSocket socket_servidor = new ServerSocket(_PuertoInteres);
							Socket socket_cliente = socket_servidor.accept();
							DataOutputStream entrada = new DataOutputStream(socket_cliente.getOutputStream());
							entrada.writeDouble(modelo.obtenerInteresBancoCentral());
							entrada.flush();
							entrada.close();
							socket_servidor.close();
							socket_cliente.close();
						} catch (IOException e1) {
							System.out.println(e1.getMessage());
						} catch (NumberFormatException e1) {
							tipo_interes.setText("ERROR");
							tipo_interes.setForeground(Color.red);
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
		carbono_boton.setFont(new Font("Verdana Pro Cond Semibold", Font.PLAIN, 11));
		carbono_boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double numero = Double.parseDouble(carbono.getText().toString());
					BCE.modificarLimiteHuellaCuenta(numero);
				} catch (NumberFormatException e1) {
					carbono.setText("ERROR");
					carbono.setForeground(Color.red);
				}
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
		IRPF_boton.setFont(new Font("Verdana Pro Cond Semibold", Font.PLAIN, 11));
		IRPF_boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BCE.establecerTramosIrpfCuenta(modelo);
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

		caducidad_prestamos = new JButton("Caducidad");
		caducidad_prestamos.setFont(new Font("Verdana Pro Cond Semibold", Font.PLAIN, 11));
		caducidad_prestamos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fecha_caducidad2 = fecha_caducidad.getText();
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				try {
					Date date = (Date) sdf.parse(fecha_caducidad2);
					BCE.establecerCaducidadDinero(date);
					System.out.println(date);
				} catch (ParseException e1) {
					System.out.println(e1.getMessage());
				}catch (NumberFormatException e1) {
					fecha_entrega.setText("ERROR");
					fecha_entrega.setForeground(Color.red);
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
		caducidad_prestamos.setBounds(462, 264, 103, 25);
		milamina.add(caducidad_prestamos);

		Prestar = new JButton("Prestar");
		Prestar.setFont(new Font("Verdana Pro Cond Semibold", Font.PLAIN, 11));
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
						}catch (NumberFormatException e1) {
							cantidad_prestar.setText("ERROR");
							cantidad_prestar.setForeground(Color.red);
						}
					}
				});
				// Inicia el hilo
				hiloEmitir.start();
			}
		});
		Prestar.setBounds(666, 314, 88, 25);
		milamina.add(Prestar);

		Eliminar = new JButton("Eliminar");
		Eliminar.setFont(new Font("Verdana Pro Cond Semibold", Font.PLAIN, 11));
		Eliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double numero = Double.parseDouble(cantidad.getText().toString());
				BCE.eliminarDineroTotal(numero);
				actualizarLabels();
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
						}catch (NumberFormatException e1) {
							cantidad.setText("ERROR");
							cantidad.setForeground(Color.red);
						}
					}
				});
				// Inicia el hilo
				hiloEmitir.start();
			}
		});
		Eliminar.setBounds(560, 120, 88, 25);
		milamina.add(Eliminar);

		Devolver = new JButton("Devolver");
		Devolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Thread hiloEmitir = new Thread(new Runnable() {
					public void run() {
						try {
							String fecha_caducidad2 = fecha_entrega.getText();
							SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
							Date date = (Date) sdf.parse(fecha_caducidad2);
							double numero = Double.parseDouble(cantidad_prestar.getText().toString());
							double prestamo = BCE.pedirDineroCuenta(modelo, numero, date);
							System.out.println(modelo.obtenerSaldo());
							ServerSocket socket_servidor = new ServerSocket(_PuertoDevolver);
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
						}catch (NumberFormatException e1) {
							cantidad_prestar.setText("ERROR");
							cantidad_prestar.setForeground(Color.red);
						}
					}
				});
				// Inicia el hilo
				hiloEmitir.start();
			}
		});
		Devolver.setFont(new Font("Verdana Pro Cond Semibold", Font.PLAIN, 11));
		Devolver.setBounds(575, 314, 88, 25);
		milamina.add(Devolver);

		radioOperativa = new JRadioButton("Operativa");
		radioOperativa.setBounds(315, 364, 100, 25);
		radioOperativa.addActionListener(e -> {
			Thread hiloEmitir = new Thread(new Runnable() {
				public void run() {
					try {
						BCE.cambiarOperatividad(modelo, true);
						;
						ServerSocket socket_servidor = new ServerSocket(PuertoOperatividad);
						while (true) {
							Socket socket_cliente = socket_servidor.accept();
							DataOutputStream entrada = new DataOutputStream(socket_cliente.getOutputStream());
							entrada.writeBoolean(modelo.EsOperativa());
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
		});
		milamina.add(radioOperativa);

		radioNoOperativa = new JRadioButton("No Operativa");
		radioNoOperativa.setBounds(423, 364, 100, 25);
		radioNoOperativa.addActionListener(e -> {
			Thread hiloEmitir = new Thread(new Runnable() {
				public void run() {
					try {
						BCE.cambiarOperatividad(modelo, false);
						ServerSocket socket_servidor = new ServerSocket(PuertoOperatividad2);
						while (true) {
							Socket socket_cliente = socket_servidor.accept();
							DataOutputStream entrada = new DataOutputStream(socket_cliente.getOutputStream());
							entrada.writeBoolean(modelo.EsOperativa());
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
		});
		milamina.add(radioNoOperativa);

		grupoRadio = new ButtonGroup();
		grupoRadio.add(radioOperativa);
		grupoRadio.add(radioNoOperativa);
		
	}
}
