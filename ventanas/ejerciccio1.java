package ventanas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ejerciccio1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejerciccio1 window = new ejerciccio1();
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
	public ejerciccio1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextField Numero1 = new JTextField();
		Numero1 .setBounds(56, 48, 86, 20);
		frame.getContentPane().add(Numero1);
		Numero1 .setColumns(10);
		
		JTextField Numero2 = new JTextField();
		Numero2.setBounds(270, 48, 86, 20);
		frame.getContentPane().add(Numero2);
		Numero2.setColumns(10);
		
		JTextField Resultado = new JTextField();
		Resultado.setBounds(171, 118, 86, 20);
		frame.getContentPane().add(Resultado);
		Resultado.setColumns(10);
	
		
		JButton Suma = new JButton(" + ");
		Suma.setBounds(25, 214, 89, 23);
		frame.getContentPane().add(Suma);
		Suma.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
			Double Res = Double.valueOf(Numero1.getText())+ Double.valueOf(Numero2.getText());
				Resultado.setText(String.valueOf(Res));
			}
		
		});
		
		JButton Resta = new JButton(" - ");
		Resta.setBounds(133, 214, 89, 23);
		frame.getContentPane().add(Resta);
		Resta.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Double Res = Double.valueOf(Numero1.getText())- Double.valueOf(Numero2.getText());
				Resultado.setText(String.valueOf(Res));
			}
			
		});
		
		JButton Multiplicacion = new JButton(" * ");
		Multiplicacion.setBounds(335, 214, 89, 23);
		frame.getContentPane().add(Multiplicacion);
		Multiplicacion.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Double Res = Double.valueOf(Numero1.getText())* Double.valueOf(Numero2.getText());
				Resultado.setText(String.valueOf(Res));
			}
			
		});
		
		JButton Division = new JButton(" / ");
		Division.setBounds(232, 214, 89, 23);
		frame.getContentPane().add(Division);
		Division.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Double Res = Double.valueOf(Numero1.getText()) / Double.valueOf(Numero2.getText());
				Resultado.setText(String.valueOf(Res));
			}
			
		});
		
	}
}
