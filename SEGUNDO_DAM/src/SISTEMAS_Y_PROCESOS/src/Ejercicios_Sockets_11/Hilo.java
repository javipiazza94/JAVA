package Ejercicios_Sockets_11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Hilo extends Thread {

	private DataInputStream entrada;
	private DataOutputStream salida;
	private Socket socketcliente;

	public Hilo(Socket socketcliente, DataInputStream entrada, DataOutputStream salida) {
		this.socketcliente = socketcliente;
		this.entrada = entrada;
		this.salida = salida;
	}

	@Override
	    public void run() {
	        boolean salir = true;
	        String mensajerecibido;

	        while (salir) {
	        	System.out.println("SERVIDOR: hola soy el inicio del while del hilo");
	            try {
	                // Pregunto al cliente qué quiero hacer
	                salida.writeUTF("SERVIDOR: ¿Qué quieres hacer?\n\tA.- Generar número aleatorio.\n\tB.- Salir.\n\t(Esperando petición del cliente...)");

	                // Recibo la respuesta del cliente 
	                mensajerecibido = entrada.readUTF();
	                String clienteDado = mensajerecibido;
	                System.out.println(clienteDado);

	                // Hacemos un switch para gestionar los mensajes con el cliente y las respuestas
	                switch (mensajerecibido) {
	                    case "A":
	                    	int servidorDado = (int) (Math.random() * 6) + 1;
	                        salida.writeUTF("SERVIDOR: El número aleatorio generado es " + servidorDado);
	                        System.out.println("Dado del servidor: " + servidorDado);
	                        String mensajerecibido2 = entrada.readUTF(); 
	                        System.out.println(mensajerecibido2+ " y el número aleatorio generado es " + servidorDado); 	                        
	                        break;
	                    case "B":
	                        System.out.println("SERVIDOR: El cliente " + this.socketcliente + " envía salir...");
	                        this.socketcliente.close();
	                        System.out.println("SERVIDOR: Conexión cerrada.");
	                        salir = false;
	                        break;
	                }
	            } catch (IOException e) {
	                System.out.println("ERROR SERVIDOR 2 -> " + e.toString());
	            }
	        }

	// Cierro los flujos
	try{
		this.entrada.close();
		this.salida.close();
	}catch(
	IOException e)	{
		System.out.println("ERROR SERVIDOR 3 -> " + e.toString());
	}
}}
