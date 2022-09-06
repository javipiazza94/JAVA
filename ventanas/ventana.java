package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventana {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana window = new ventana();
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
	public ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel vecinita = new JLabel("PERROSANXE HIJUEPUTA: 3");
		vecinita.setFont(new Font("Comic Sans MS", Font.BOLD, 34));
		vecinita.setBackground(Color.MAGENTA);
		vecinita.getText();
		vecinita.setText("La vecinita tiene antojo");
		frame.getContentPane().add(vecinita, BorderLayout.CENTER);
		
		
		JTextField Textitaco = new JTextField();
		frame.getContentPane().add(textField);
		Textitaco.setBackground(Color.MAGENTA);
		Textitaco.setHorizontalAlignment((SwingConstants.CENTER));
		Textitaco.setForeground(Color.GREEN);
		Textitaco.setFont(new Font("Courier New", Font.BOLD | Font.ITALIC, 16));
		Textitaco.setText("PAPITO");
		textField.setColumns(10);
		
		JButton botoncito = new JButton("Comeme los cojones");
		botoncito.setFont(new Font("Georgia", Font.PLAIN, 14));
		botoncito.setForeground(Color.RED);
		frame.getContentPane().add(botoncito, BorderLayout.SOUTH);
		botoncito.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				Textitaco.setText("DOMIN PONTE PELO");
			}
			
		});
		
		
		
	}

}
