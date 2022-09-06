package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class etiqueta_dosbotones {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					etiqueta_dosbotones window = new etiqueta_dosbotones();
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
	public etiqueta_dosbotones() {
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
		
		JLabel result = new JLabel("");
		result.setFont(new Font("Georgia", Font.PLAIN, 13));
		result.setHorizontalAlignment(SwingConstants.CENTER);
		result.setBounds(93, 155, 220, 34);
		frame.getContentPane().add(result);
		
		JButton cont1 = new JButton("EL PLAN");
		cont1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				result.setText("El Plan");
				
			}
		});
		cont1.setBounds(51, 58, 94, 34);
		frame.getContentPane().add(cont1);
		
		JButton cont2 = new JButton("HAMILTON LLORON");
		cont2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText("Hamilton LLORON");
			}
		});
		cont2.setBounds(231, 58, 135, 34);
		frame.getContentPane().add(cont2);
		
		
	}
}
