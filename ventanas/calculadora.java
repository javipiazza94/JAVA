package ventanas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class calculadora {
	public float primernumero;
	public float segundonumero;
	public String operador;
	public String SinCero (float resultado){
		String devolucion = "";
		devolucion  = Float.toString(resultado);
		if (resultado%1==0) {
			devolucion = devolucion.substring(0, devolucion.length()-2);
		}
		return devolucion;
	}

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora window = new calculadora();
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
	public calculadora() {
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
		
		JTextField Resultado = new JTextField();
		Resultado.setBounds(10, 11, 300, 42);
		frame.getContentPane().add(Resultado);
		Resultado.setColumns(10);
		
		JButton button = new JButton("1");
		button.setBounds(10, 69, 89, 23);
		frame.getContentPane().add(button);
		button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Resultado.setText(Resultado.getText() + "1");
			}
		});
		
		JButton button_1 = new JButton("4");
		button_1.setBounds(10, 122, 89, 23);
		frame.getContentPane().add(button_1);
		button_1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Resultado.setText(Resultado.getText() + "4");
			}
		});
		
		JButton button_2 = new JButton("7");
		button_2.setBounds(10, 174, 89, 23);
		frame.getContentPane().add(button_2);
		button_2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Resultado.setText(Resultado.getText() + "7");
			}
		});
		
		JButton button_3 = new JButton("2");
		button_3.setBounds(128, 69, 89, 23);
		frame.getContentPane().add(button_3);
		button_3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Resultado.setText(Resultado.getText() + "2");
			}
		});
		
		JButton button_4 = new JButton("3");
		button_4.setBounds(242, 69, 89, 23);
		frame.getContentPane().add(button_4);
		button_4.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Resultado.setText(Resultado.getText() + "3");
			}
		});
		
		JButton button_9 = new JButton("5");
		button_9.setBounds(128, 122, 89, 23);
		frame.getContentPane().add(button_9);
		button_9.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Resultado.setText(Resultado.getText() + "5");
			}
		});
		
		JButton button_10 = new JButton("6");
		button_10.setBounds(242, 122, 89, 23);
		frame.getContentPane().add(button_10);
		button_10.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Resultado.setText(Resultado.getText() + "6");
			}
		});
		
		JButton button_11 = new JButton("8");
		button_11.setBounds(128, 174, 89, 23);
		frame.getContentPane().add(button_11);
		button_11.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Resultado.setText(Resultado.getText() + "8");
			}
		});
		
		JButton button_12 = new JButton("9");
		button_12.setBounds(242, 174, 89, 23);
		frame.getContentPane().add(button_12);
		button_12.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Resultado.setText(Resultado.getText() + "9");
			}
		});
		
		JButton button_13 = new JButton("0");
		button_13.setBounds(128, 227, 89, 23);
		frame.getContentPane().add(button_13);
		button_13.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Resultado.setText(Resultado.getText() + "0");
			}
		});
		
		JButton CLEAR = new JButton("C");
		CLEAR.setBounds(10, 227, 89, 23);
		frame.getContentPane().add(CLEAR);
		CLEAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Resultado.setText(" ");
			}
		});
		
		JButton button_15 = new JButton(".");
		button_15.setBounds(242, 227, 89, 23);
		frame.getContentPane().add(button_15);
		button_15.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (!Resultado.getText().contains(".")){
					Resultado.setText(Resultado.getText() + ".");
			}
		}});
		
		JButton button_5 = new JButton("+");
		button_5.setBounds(341, 69, 89, 23);
		frame.getContentPane().add(button_5);
		button_5.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				primernumero = Float.parseFloat(Resultado.getText());
				operador = "+";
				Resultado.setText(" ");
				
			}
		});
		
		JButton button_6 = new JButton("-");
		button_6.setBounds(341, 122, 89, 23);
		frame.getContentPane().add(button_6);
		button_6.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				primernumero = Float.parseFloat(Resultado.getText());
				operador = "-";
				Resultado.setText(" ");
				
			}
		});
		
		JButton button_7 = new JButton("*");
		button_7.setBounds(341, 174, 89, 23);
		frame.getContentPane().add(button_7);
		button_7.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				primernumero = Float.parseFloat(Resultado.getText());
				operador = "*";
				Resultado.setText(" ");
				
			}
		});
		
		JButton button_8 = new JButton("/");
		button_8.setBounds(341, 11, 89, 23);
		frame.getContentPane().add(button_8);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primernumero = Float.parseFloat(Resultado.getText());
				operador = "/";
				Resultado.setText(" ");
				
			}
		});
	
		JButton button_14 = new JButton("=");
		button_14.setBounds(341, 227, 89, 23);
		frame.getContentPane().add(button_14);
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				segundonumero = Float.parseFloat(Resultado.getText());
				
				switch (operador) {
				case "+":
					Resultado.setText(SinCero(primernumero + segundonumero));
					break;
				case "-":
					Resultado.setText(SinCero(primernumero - segundonumero));
					break;
				case "*":
					Resultado.setText(SinCero(primernumero * segundonumero));
					break;
				case "/":
					if (segundonumero==0) {
					 	Resultado.setText("El resultado es infinito");
					} else {
					Resultado.setText(SinCero(primernumero / segundonumero));}
					break;

				}
			}
		});		
	}
}
