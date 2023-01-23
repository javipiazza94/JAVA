package Sockets;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
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
		setLocation(ancho / 4, altura / 4);
		setBackground(SystemColor.window);
		Lamina miLamina = new Lamina();
		add(miLamina);
		setVisible(true);
	}
}

class Lamina extends JPanel implements Runnable {

	public final String IP = "192.168.1.38";
	public final int Puerto = 9999;
	private JTextField campo1, nick, destinatario;
	private JButton boton;
	private JTextArea area_chat;

	public Lamina() {
		JLabel nombre = new JLabel("NOMBRE");
		add(nombre);
		nick = new JTextField(10);
		add(nick);
		JLabel texto = new JLabel("CHAT");
		add(texto);
		destinatario = new JTextField(10);
		add(destinatario);
		JLabel ip = new JLabel("IP");
		add(ip);
		area_chat = new JTextArea(10, 100);
		add(area_chat);
		campo1 = new JTextField(20);
		add(campo1);
		enviaTexto accion = new enviaTexto();
		boton = new JButton("ENVIAR");
		boton.addActionListener(accion);
		add(boton);
		Thread hilo = new Thread(this);
		hilo.start();
	}

	class enviaTexto implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				Socket miconector = new Socket(IP, Puerto);
				paqueteEnvio datos = new paqueteEnvio();
				// Escribimos desde la instancia donde guardamos el tipo de los datos creados en
				// los componentes
				datos.setNick(nick.getText());
				datos.setDestinatario(destinatario.getText());
				datos.setCampo(campo1.getText());
				// Creamos los fluijos de datos a enviar desde la clase Objetct al ser un objetp
				// de una clase
				ObjectOutputStream flujo_salida = new ObjectOutputStream(miconector.getOutputStream());
				flujo_salida.writeObject(datos);
				miconector.close();

				/*
				 * DataOutputStream flujo_salida = new
				 * DataOutputStream(miconector.getOutputStream());
				 * flujo_salida.writeUTF(campo1.getText()); flujo_salida.close(); //PARA
				 * TRANSMITIR SOLO TEXTO//
				 */

			} catch (IOException e1) {
				System.out.println("No conecta");
				e1.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		try {
			ServerSocket servidor_cliente = new ServerSocket(9090);
			Socket cliente;
			paqueteEnvio paqueteRecibido;
			while (true) {
				cliente = servidor_cliente.accept();
				ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
				paqueteRecibido = (paqueteEnvio) entrada.readObject();
				area_chat.append(paqueteRecibido.getNick()+": "+paqueteRecibido.getCampo());
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

class paqueteEnvio implements Serializable { // Empaquetamos los datos y los serializamos para convertirlos en bytes y
												// ser enviados por la red

	private static final long serialVersionUID = -1928732993041291594L;
	private String nick, destinatario, campo;

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}

}
