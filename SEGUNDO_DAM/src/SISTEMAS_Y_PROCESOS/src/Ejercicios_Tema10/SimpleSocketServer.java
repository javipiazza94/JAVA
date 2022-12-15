package Ejercicios_Tema10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleSocketServer {
    public static void main(String[] args) throws Exception {
        // Creamos un socket en el puerto 9999
        ServerSocket serverSocket = new ServerSocket(9999);

        // Aceptamos la conexión del cliente
        Socket clientSocket = serverSocket.accept();
        System.out.println("Conexión aceptada");

        // Creamos un PrintWriter para enviar mensajes al cliente
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        // Creamos un BufferedReader para recibir mensajes del cliente
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        // Leemos el mensaje del cliente y lo imprimimos en pantalla
        String inputLine = in.readLine();
        System.out.println("Mensaje recibido del cliente: " + inputLine);

        // Enviamos un mensaje de respuesta al cliente
        out.println("Mensaje recibido. Gracias por conectarte.");

        // Cerramos la conexión
        clientSocket.close();
        serverSocket.close();
    }
}

