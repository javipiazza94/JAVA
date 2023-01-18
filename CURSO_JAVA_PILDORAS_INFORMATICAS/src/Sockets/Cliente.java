package Sockets;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Cliente {

	public static void main(String[] args) {
		marco_cliente marco = new marco_cliente();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setTitle("Cliente");
	}
}

class marco_cliente extends JFrame {

	public marco_cliente() {
		setResizable(true);
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		Dimension tam = pantalla.getScreenSize();
		int ancho = tam.width;
		int altura = tam.height;
		setSize(ancho / 2, altura / 2);
		setLocation(ancho / 4, altura / 4); //
		Image imagen = pantalla.getImage(
				"C:\\Users\\javip\\OneDrive\\Documents\\DAM\\ACTIVIDADES\\EJERCICIOS DE PROGRAMACIÓN\\JAVA\\CURSO_JAVA_PILDORAS_INFORMATICAS\\src\\EJERCICIOS_PILDORAS_INFORMATICA\\euro.png");
		setIconImage(imagen);
		setBackground(SystemColor.window);
		Lamina miLamina = new Lamina();
		add(miLamina);
		setVisible(true);
}
}

class Lamina extends JPanel{
	
	public final String IP = "192.168.1.38";
	public final int Puerto = 9999;
	private JTextField campo1;
	private JButton boton;
	
	public Lamina() {
		JLabel texto = new JLabel("TEXTO");
		add(texto);
		campo1 = new JTextField(20);
		add(campo1);
		enviaTexto accion = new enviaTexto();
		boton = new JButton("ENVIAR");
		boton.addActionListener(accion);
		add(boton);	
	}	
		
	class enviaTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				Socket miconector = new Socket(IP, Puerto);
				DataOutputStream flujo_salida = new DataOutputStream(miconector.getOutputStream());
				flujo_salida.writeUTF(campo1.getText());
				flujo_salida.close();
				
			} catch (IOException e1) {
				System.out.println("No conecta");
				e1.printStackTrace();
			}
		}
	}
	}
	