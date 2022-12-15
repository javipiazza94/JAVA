package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class traductor {

	private JFrame frame;
	private JTextField palabra;
	private JButton traductor;
	private traductor_clase traductorGoogle = new traductor_clase();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					traductor window = new traductor();
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
	public traductor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Georgia", Font.PLAIN, 13));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox desplegable = new JComboBox();
		desplegable.setModel(new DefaultComboBoxModel(new String[] {"Introduzca datos", "Valverde", "Rafita", "Javi", "Josan"}));
		desplegable.setFont(new Font("Georgia", Font.PLAIN, 13));
		desplegable.setBounds(21, 70, 160, 20);
		frame.getContentPane().add(desplegable);
	
		
		palabra = new JTextField();
		palabra.setBounds(275, 71, 135, 20);
		frame.getContentPane().add(palabra);
		palabra.setColumns(10);
		
		
		traductor = new JButton("Traduce");
		traductor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				palabra.setText(traductorGoogle.getDiccionario().get(desplegable.getSelectedItem())
);
			}
		});
		traductor.setBounds(181, 122, 89, 23);
		frame.getContentPane().add(traductor);
	}
}
