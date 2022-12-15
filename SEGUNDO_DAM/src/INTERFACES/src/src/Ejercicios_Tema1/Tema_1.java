package Ejercicios_Tema1;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JPasswordField;

public class Tema_1 extends JFrame {
	private JTextField Producto_busqueda;
	private JTextField Usuario;
	private JPasswordField Contraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tema_1 frame = new Tema_1();
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
	public Tema_1() {
		getContentPane().setBackground(new Color(176, 224, 230));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 400);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 606, 63);
		panel.setBackground(new Color(0, 0, 128));
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel MARCA = new JLabel("");
		MARCA.setIcon(new ImageIcon(Tema_1.class.getResource("/Imagenes_Tema_1/amazon_logo._CB633267048_.png")));
		MARCA.setBackground(Color.RED);
		MARCA.setBounds(0, 0, 137, 63);
		MARCA.setVerticalAlignment(SwingConstants.TOP);
		panel.add(MARCA);
		
		JButton Buscar = new JButton("Buscar");
		Buscar.setBounds(268, 31, 81, 23);
		panel.add(Buscar);
		
		Producto_busqueda = new JTextField();
		Producto_busqueda.setBounds(139, 32, 119, 20);
		panel.add(Producto_busqueda);
		Producto_busqueda.setColumns(10);
		
		Usuario = new JTextField();
		Usuario.setBounds(498, 11, 86, 20);
		panel.add(Usuario);
		Usuario.setColumns(10);
		
		JLabel Password = new JLabel("Contraseña");
		Password.setForeground(new Color(255, 250, 240));
		Password.setHorizontalAlignment(SwingConstants.CENTER);
		Password.setFont(new Font("Georgia", Font.BOLD, 12));
		Password.setBounds(407, 44, 86, 17);
		panel.add(Password);
		
		JLabel Login = new JLabel("Usuario");
		Login.setFont(new Font("Georgia", Font.BOLD, 12));
		Login.setForeground(new Color(255, 250, 240));
		Login.setBounds(428, 13, 74, 17);
		panel.add(Login);
		
		Contraseña = new JPasswordField();
		Contraseña.setBounds(498, 43, 86, 20);
		panel.add(Contraseña);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 314, 606, 47);
		panel_1.setBackground(new Color(25, 25, 112));
		getContentPane().add(panel_1);
		
		JCheckBox Terminos = new JCheckBox("Acepto todos los términos y condiciones");
		Terminos.setSelected(true);
		panel_1.add(Terminos);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(607, 0, 17, 350);
		getContentPane().add(scrollBar);
		
		JLabel Etiqueta_1 = new JLabel("Foto1");
		Etiqueta_1.setIcon(new ImageIcon(Tema_1.class.getResource("/Imagenes_Tema_1/Monster.jpg")));
		Etiqueta_1.setBounds(298, 74, 127, 109);
		getContentPane().add(Etiqueta_1);
		
		JLabel Etiqueta_4 = new JLabel("Foto 4");
		Etiqueta_4.setIcon(new ImageIcon(Tema_1.class.getResource("/Imagenes_Tema_1/furro.jpg")));
		Etiqueta_4.setBounds(30, 74, 81, 109);
		getContentPane().add(Etiqueta_4);
		
		JLabel Etiqueta_5 = new JLabel("Foto 5");
		Etiqueta_5.setIcon(new ImageIcon(Tema_1.class.getResource("/Imagenes_Tema_1/mein kampf.jpg")));
		Etiqueta_5.setBounds(30, 194, 73, 109);
		getContentPane().add(Etiqueta_5);
		
		JLabel Etiqueta_6 = new JLabel("Foto 6");
		Etiqueta_6.setIcon(new ImageIcon(Tema_1.class.getResource("/Imagenes_Tema_1/aida.jpg")));
		Etiqueta_6.setBounds(154, 194, 81, 108);
		getContentPane().add(Etiqueta_6);
		
		JLabel Etiqueta_8 = new JLabel("");
		Etiqueta_8.setIcon(new ImageIcon(Tema_1.class.getResource("/Imagenes_Tema_1/doritos.jpg")));
		Etiqueta_8.setBounds(308, 194, 127, 109);
		getContentPane().add(Etiqueta_8);
		
		JLabel Etiqueta_10 = new JLabel("Foto 10");
		Etiqueta_10.setIcon(new ImageIcon(Tema_1.class.getResource("/Imagenes_Tema_1/wiskas.jpg")));
		Etiqueta_10.setBounds(471, 74, 109, 109);
		getContentPane().add(Etiqueta_10);
		
		JLabel Etiqueta_3_1 = new JLabel("Foto 3");
		Etiqueta_3_1.setIcon(new ImageIcon(Tema_1.class.getResource("/Imagenes_Tema_1/lexatin.jpg")));
		Etiqueta_3_1.setBackground(new Color(128, 255, 255));
		Etiqueta_3_1.setBounds(450, 194, 147, 109);
		getContentPane().add(Etiqueta_3_1);
		
		JLabel Etiqueta_3_1_1 = new JLabel("Foto 3");
		Etiqueta_3_1_1.setIcon(new ImageIcon(Tema_1.class.getResource("/Imagenes_Tema_1/bozal.jpg")));
		Etiqueta_3_1_1.setBackground(new Color(128, 255, 255));
		Etiqueta_3_1_1.setBounds(154, 74, 91, 109);
		getContentPane().add(Etiqueta_3_1_1);
	}
}
