package Clases_CBDC;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Lista_Transacciones_CBDC extends JFrame {

	private JPanel Panel;
	private ArrayList<Transacciones_CBDC> transacciones = new ArrayList<Transacciones_CBDC>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lista_Transacciones_CBDC frame = new Lista_Transacciones_CBDC();
					frame.setVisible(true);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setTitle("LISTA DE TRANSACCIONES CBDC DEL BCE");
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
	public Lista_Transacciones_CBDC() {
		
		//CREAMOS UN PANEL
		Panel = new JPanel();
		setResizable(false);
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		Dimension tam = pantalla.getScreenSize();
		int ancho = tam.width/4;
		int altura = tam.height/4;
		setBounds(ancho, altura, 780, 420);
		Image imagen = pantalla.getImage("./src/IMAGENES/euro.png");
		setIconImage(imagen);
		setBackground(SystemColor.window);
		setContentPane(Panel);
		Panel.setBackground(new Color(255, 255, 255));
		
		
	}

}
