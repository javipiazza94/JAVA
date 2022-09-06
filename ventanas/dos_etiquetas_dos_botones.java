package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class dos_etiquetas_dos_botones {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dos_etiquetas_dos_botones window = new dos_etiquetas_dos_botones();
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
	public dos_etiquetas_dos_botones() {
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
		
		JLabel label1 = new JLabel("0");
		label1.setFont(new Font("Georgia", Font.PLAIN, 17));
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setVisible(false);
		label1.setBounds(52, 157, 82, 43);
		frame.getContentPane().add(label1);
		
		JLabel label = new JLabel("0");
		label.setFont(new Font("Georgia", Font.PLAIN, 17));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setVisible(false);
		label.setBounds(259, 157, 89, 43);
		frame.getContentPane().add(label);
		
		
		JButton boton1 = new JButton("");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label1.setVisible(true);
				label1.setText(String.valueOf(Integer.parseInt(label1
						
						.getText())+1));
			}
		});
		boton1.setBounds(45, 70, 89, 23);
		frame.getContentPane().add(boton1);
		
		
		JButton boton2 = new JButton("");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setVisible(true);
				label.setText(String.valueOf(Integer.parseInt(label.getText())+1));
			}
		});
		boton2.setBounds(259, 70, 89, 23);
		frame.getContentPane().add(boton2);
		
		
	}

}
