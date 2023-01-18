package Interfaces_graficas;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class Eventos_ventanas {

	public static void main(String[] args) {
		Frame marco = new Frame();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame marco2 = new Frame();
		marco2.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		marco.setTitle("Ventana 1");
		marco2.setTitle("Ventana 2");
	}
}

class Frame extends JFrame {

	public Frame() {
		//setTitle("Eventos de ventanas");
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
		ventana ventana_eventos = new ventana();
		addWindowListener(ventana_eventos);
	}
}

class ventana implements WindowListener{

	
	public void windowOpened(WindowEvent e) {
		System.out.println("La ventana se ha abierto");
	}

	public void windowClosing(WindowEvent e) {
		System.out.println("La ventana se ha cerrado");
	}

	public void windowClosed(WindowEvent e) {
		System.out.println("Ventana cerrada");
	}

	public void windowIconified(WindowEvent e) {
		System.out.println("La ventana se ha minimizado");
	}
	
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Ventana restaurada");
	}

	public void windowActivated(WindowEvent e) {
		System.out.println("La ventana se ha activado");
	}

	public void windowDeactivated(WindowEvent e) {
		System.out.println("Ventana desactivada");
	}
	
	
}
