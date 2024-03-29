package Sockets;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Servidor {

	public static void main(String[] args) {
		marco_servidor marco = new marco_servidor();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setTitle("Servidor");
	}
}

class marco_servidor extends JFrame implements Runnable{
	
	public final String IP = "192.168.1.38";
	public final int Puerto = 9999;	
	private TextArea areaTexto;

	public marco_servidor() {
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
		
		JPanel milamina = new JPanel();
		milamina.setLayout(new BorderLayout());
		areaTexto = new TextArea();
		milamina.add(areaTexto, BorderLayout.CENTER);
		add(milamina);
	
		Thread hilo = new Thread(this);
		hilo.start();
		
	}
	@Override
	public void run() {
		
		try {
			ServerSocket socket_servidor = new ServerSocket(Puerto);
			String ip, nick, mensaje; //Para coger los datos
			paqueteEnvio recibido; //instanciamos el paquete recibido
			while (true) {
				Socket socket_cliente = socket_servidor.accept();
				ObjectInputStream entrada = new ObjectInputStream(socket_cliente.getInputStream());
				recibido = (paqueteEnvio) entrada.readObject(); //leemos el paquete
				ip = recibido.getDestinatario();
				nick = recibido.getNick();
				mensaje = recibido.getCampo();
				/*
				DataInputStream entrada = new DataInputStream(socket_cliente.getInputStream());
				String mensaje = entrada.readUTF();
				areaTexto.append("\n" + mensaje);*/	
				areaTexto.append("\n" + nick+ ": " + mensaje +" para "+ ip);
				Socket socket_destinatario = new Socket(ip, 9090);
				ObjectOutputStream envio = new ObjectOutputStream(socket_destinatario.getOutputStream());
				envio.writeObject(recibido);
				socket_destinatario.close();
				socket_cliente.close();
				
			}	
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
}
