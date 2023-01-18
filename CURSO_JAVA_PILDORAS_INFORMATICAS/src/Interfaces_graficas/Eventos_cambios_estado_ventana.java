package Interfaces_graficas;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class Eventos_cambios_estado_ventana {

	public static void main(String[] args) {
		Frame_ventana marco = new Frame_ventana();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Frame_ventana extends JFrame {

	public Frame_ventana() {
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
		cambio_estado estado = new cambio_estado();
		addWindowStateListener(estado);
	}

}

class cambio_estado implements WindowStateListener{

	@Override
	public void windowStateChanged(WindowEvent e) {
		if (e.getNewState()==Frame.NORMAL) {
			System.out.println("La ventana esta en estado normal");
		}
		if (e.getNewState()==Frame.MAXIMIZED_BOTH) { //este metodo devuelve 6 porque es una constante de clase de Windows Event, y ese numero es igual a maximizarse
			System.out.println("Se cambio el estado a la ventana a maximizada totalmente");
		}
		if (e.getNewState()==Frame.ICONIFIED) { // El 1 en la constante de clase es igual a ventana minimizada totalmente
			System.out.println("Se cambio el estado de la ventana a minimizado totalmente");
		}
		if (e.getNewState()==Frame.MAXIMIZED_HORIZ) { //este metodo devuelve 2 porque es una constante de clase de Windows Event, y ese numero es igual a maximizarse horizontalmente
			System.out.println("Se cambio el estado a la ventana a maximizada horizontalmente");
		}
		if (e.getNewState()==Frame.MAXIMIZED_VERT) { // El 4 en la constante de clase es igual a ventana maximizada verticalmente
			System.out.println("Se cambio el estado de la ventana a maximizada verticalmente");
		}
		
		
	}
	
}
