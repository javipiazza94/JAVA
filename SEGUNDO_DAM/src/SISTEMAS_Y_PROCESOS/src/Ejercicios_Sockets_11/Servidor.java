package Ejercicios_Sockets_11;

import java.io.*;
import java.lang.System.Logger.Level;
import java.net.*;
import java.util.logging.Logger;

public class Servidor {
	public static void main(String[] args)  
    {
        try 
        {
            ServerSocket socketservidor = new ServerSocket(5056);     
            System.out.println("SERVIDOR: Abrimos socket");
          
            // Funcionalidad del servidor
            while (true) { 
                Socket socketcliente = null; 
                try   { 
                	//Conectamos al cliente
                    socketcliente = socketservidor.accept(); 
                    System.out.println("SERVIDOR: Cliente nuevo conectado: " + socketcliente); 

                    // Obtengo los flujos de entrada y salida del socket cliente
                    DataInputStream entrada = new DataInputStream(socketcliente.getInputStream()); 
                    DataOutputStream salida = new DataOutputStream(socketcliente.getOutputStream()); 
                    
                    // Creamos el hilo para conectarnos con el cliente
                    System.out.println("SERVIDOR: Hilo creado el cliente nuevo..."); 
                    Hilo clientehebra = new Hilo(socketcliente, entrada, salida); 
                    clientehebra.start();
                } 
                catch (IOException e)
                { 
                    socketcliente.close(); 
                    System.out.println("ERROR SERVIDOR -> " + e.toString());
                } 
            } 
        } 
        catch (IOException ex) 
        {
            System.out.println("ERROR SERVIDOR -> " + ex.getMessage());;
        }
    }
}
