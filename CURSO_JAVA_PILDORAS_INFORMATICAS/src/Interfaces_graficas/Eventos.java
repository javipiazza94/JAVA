package Interfaces_graficas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Eventos {

	public static void main(String[] args) {
		Marco marco = new Marco();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Marco extends JFrame {

	public Marco() {
		setTitle("Eventos con botones");
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
		Lamina lamina = new Lamina();
		add(lamina);
		lamina.setBackground(SystemColor.window);
	}
}

class Lamina extends JPanel {// implements ActionListener {

	JButton boton_azul = new JButton("Pulsa aqui para cambiar el fondo a azul");
	JButton boton_verde = new JButton("Pulsa aqui para cambiar el fondo a verde");
	JButton boton_rojo = new JButton("Pulsa aqui para cambiar el fondo a rojo");
	JButton boton_amarillo = new JButton("Pulsa aqui para cambiar el fondo a amarillo");

	public Lamina() {
		// Anadimos los botones
		add(boton_azul);
		add(boton_amarillo);
		add(boton_rojo);
		add(boton_verde);

		// Instanciamos los colores de la clase Color
		colorFondo amarillo = new colorFondo(Color.yellow);
		colorFondo azul = new colorFondo(Color.blue);
		colorFondo rojo = new colorFondo(Color.red);
		colorFondo verde = new colorFondo(Color.green);

		// Creamos los Listener para cada e introducimos los colores
		boton_azul.addActionListener(azul);
		boton_amarillo.addActionListener(amarillo);
		boton_rojo.addActionListener(rojo);
		boton_verde.addActionListener(verde);
		// JBUTTON = Objeto origen del evento
		// Action = Tipo de evento
		// this (Dirigido al objeto actual, que es el JPanel) = Donde se va a realizar
		// la accion
	}

	class colorFondo implements ActionListener {

		private Color color;

		public colorFondo(Color colorfondo) {
			this.color = colorfondo;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			setBackground(color);
		}

	}
	/*
	 * @Override public void actionPerformed(ActionEvent e) { Object boton_pulsado =
	 * e.getSource(); if (boton_pulsado == boton_azul) { setBackground(Color.cyan);
	 * } else if (boton_pulsado == boton_amarillo) { setBackground(Color.yellow); }
	 * else if (boton_pulsado == boton_rojo) { setBackground(Color.red); } else if
	 * (boton_pulsado == boton_verde) { setBackground(Color.green); } }
	 */

}
