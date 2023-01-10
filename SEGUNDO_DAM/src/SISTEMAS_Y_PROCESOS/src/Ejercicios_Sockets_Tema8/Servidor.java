package Ejercicios_Sockets_Tema8;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Logger;

public class Servidor {
	public static void main(String[] args) throws IOException, UnknownHostException{

		// Instanciamos clases del servidor
		ServerSocket servidor = null; // Servidor
		Socket clienteTCP = null; // Conector TCP del cliente
		DataInputStream entrada; // Recibe flujo de info
		DataOutputStream salida; // Envia flujo de info

		// Puerto del servidor
		final int Puerto = 2000;

		// Creamos el socket
		servidor = new ServerSocket(Puerto);
		System.out.println("Servidor iniciado");

		// Siempre estara escuchando peticiones
		while (true) {
			clienteTCP = servidor.accept(); // Aceptamos peticiones hasta que el servidor sea distinto de null
			System.out.println("Cliente conectado");
			entrada = new DataInputStream(clienteTCP.getInputStream()); // Declaro la info que voy a recibir
			salida = new DataOutputStream(clienteTCP.getOutputStream()); // Declaro la info que voy a enviar

			// Leo el mensaje que envia
			String mensaje = entrada.readUTF();
			System.out.println(mensaje);

			// Enviamos mensaje
			salida.writeUTF("UNA, GRANDE Y LIBRE");
			;

			// Cerramos servidor
			clienteTCP.close();
			System.out.println("Cliente desconectado");
		}

	}
}
