package Ejercicios_Sockets_11;

import java.io.*;
import java.lang.System.Logger.Level;
import java.net.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Cliente {

	public static void main(String[] args) {
		try {
			boolean salir = false;
			Scanner escaner = new Scanner(System.in);
			String direccionIP = "localhost";
			int puerto = 5056;

			// Conectamos la IP y los puertos el socket cliente
			InetAddress ip = InetAddress.getByName(direccionIP);
			System.out.println("CLIENTE: Conectando con " + direccionIP + ":" + puerto);
			Socket socket = new Socket(ip, puerto);
			System.out.println("CLIENTE: Conexión establecida.");

			// flujos de entrada y salida
			DataInputStream entrada = new DataInputStream(socket.getInputStream());
			DataOutputStream salida = new DataOutputStream(socket.getOutputStream());

			// creamos un switch para interactuar con los flujos del servidor

			while (!salir) {
				// leemos los datos recibidos por el servidor e imprimimos
				String lectura = entrada.readUTF();
				System.out.println(lectura);

				// Pedimos al cliente un numero para enviar al servidor
				String textoenviar = escaner.nextLine();
				salida.writeUTF(textoenviar);

				// Comparamos con el servidor con un switch
				switch (textoenviar) {
				case "A": //Opcion enviar dados. Primero recibimos los datos del servidor, y justo despues enviamos los del cliente
					String mensajerecibido = entrada.readUTF();
					System.out.println(mensajerecibido);
					System.out.println("El numero del servidor es " + mensajerecibido);
					System.out.println("CLIENTE: Va a realizar una tirada al azar con un dado con caras entre 1 y 6");
					int ClienteDado = (int) (Math.random() * 6) + 1;
					salida.writeUTF("El numero generado por el cliente es " + ClienteDado);
					break;
				case "B": // Opción salir
					System.out.println("CLIENTE: Cerrando la conexión...");
					socket.close();
					System.out.println("CLIENTE: Conexión cerrada.");
					salir = true;
					break;
				default:
					System.out.println("CLIENTE: Opción incorrecta.");
					break;
				}
			}

			// Cierro los flujos
			try {
				entrada.close();
				salida.close();
			} catch (IOException e) {
				System.out.println("ERROR CLIENTE 2 -> " + e.toString());
			}

		} catch (UnknownHostException ex) {
			System.out.println("ERROR CLIENTE 2 -> " + ex.getMessage());
		} catch (IOException ex) {
			System.out.println("ERROR CLIENTE 2 -> " + ex.getMessage());
		}
	}
}