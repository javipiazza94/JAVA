package Ejercicios_Sockets_Tema8;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {

	public static void main(String[] args) throws UnknownHostException, IOException {

		// Host del servidor
		final String HOST = "127.0.0.1";

		// Puerto del servidor
		final int Puerto = 2000;
		DataInputStream entrada;
		DataOutputStream salida;

		Socket cliente = new Socket(HOST, Puerto);
		entrada = new DataInputStream(cliente.getInputStream());
		salida = new DataOutputStream(cliente.getOutputStream());
		
		salida.writeUTF("Dime que opinas sobre ESPAÑA");

		String mensaje = entrada.readUTF();
		System.out.println(mensaje);

		cliente.close();
	}
}
