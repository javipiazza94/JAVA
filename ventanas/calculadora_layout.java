package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class calculadora_layout {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora_layout window = new calculadora_layout();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculadora_layout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculadora p = new calculadora();
		frame.add(p);
		
	}

	private class calculadora
	extends JPanel{
		public calculadora (){
			setLayout(new BorderLayout());
			JTextField pantallita = new JTextField ("COMEME LOS COJONES");
			add(pantallita, BorderLayout.NORTH);
			botones B = new botones();
			add (B, BorderLayout.CENTER);
			operaciones o = new operaciones();
			add(o,BorderLayout.EAST);
			JPanel j2 = new JPanel();
			add(j2,BorderLayout.WEST);
			JPanel j3 = new JPanel();
			add(j3,BorderLayout.SOUTH);
		}
	}
	private class botones extends JPanel{
		public botones(){
			setLayout(new GridLayout(4,3));
			JToggleButton boton7 = new JToggleButton ("7");
			add(boton7);
			JToggleButton boton8 = new JToggleButton ("8");
			add(boton8);
			JToggleButton boton9 = new JToggleButton ("9");
			add(boton9);
			setLayout(new GridLayout(4,3));
			JToggleButton boton4 = new JToggleButton ("4");
			add(boton4);
			JToggleButton boton5 = new JToggleButton ("5");
			add(boton5);
			JToggleButton boton6 = new JToggleButton ("6");
			add(boton6);
			setLayout(new GridLayout(4,3));
			JToggleButton boton1 = new JToggleButton ("1");
			add(boton1);
			JToggleButton boton2 = new JToggleButton ("2");
			add(boton2);
			JToggleButton boton3 = new JToggleButton ("3");
			add(boton3);
			JButton mipolla = new JButton ("0");
			add(mipolla, BorderLayout.CENTER);
		}
		
	}
	private class operaciones extends JPanel{
		public operaciones(){
		setLayout(new GridLayout(4,1));
		JButton botonsuma = new JButton ("+");
		add(botonsuma);
		JButton botonresta = new JButton ("-");
		add(botonresta);
		JButton botonmultiplicacion = new JButton ("*");
		add(botonmultiplicacion);
		JButton botondivision = new JButton ("/");
		add(botondivision);
		
	}
}
}
