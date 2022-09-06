package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class IMC {

	private JFrame frame;
	private JTextField peso;
	private JTextField altura;
	public double IMC;
	private String OMS;
	private JTextField sexo;
	private JTextField imc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IMC window = new IMC();
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
	public IMC() {
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
		
		peso = new JTextField();
		peso.setHorizontalAlignment(SwingConstants.CENTER);
		peso.setFont(new Font("Georgia", Font.PLAIN, 13));
		peso.setBounds(41, 40, 148, 20);
		frame.getContentPane().add(peso);
		peso.setColumns(10);
		
		
		altura = new JTextField();
		altura.setHorizontalAlignment(SwingConstants.CENTER);
		altura.setFont(new Font("Georgia", Font.PLAIN, 13));
		altura.setBounds(41, 125, 148, 20);
		frame.getContentPane().add(altura);
		altura.setColumns(10);
		
		imc = new JTextField();
		imc.setFont(new Font("Georgia", Font.BOLD, 13));
		imc.setBounds(250, 188, 174, 62);
		frame.getContentPane().add(imc);
		imc.setColumns(10);
		
		JButton calcular = new JButton("");
		calcular.setFont(new Font("Georgia", Font.PLAIN, 13));
		calcular.setBounds(278, 90, 125, 55);
		frame.getContentPane().add(calcular);
		calcular.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				Double Res = Double.valueOf(peso.getText())/ (Double.valueOf(altura.getText())* Double.valueOf(altura.getText()));
				calcular.setText(String.valueOf(Res));
				OMS = "";
				IMC = Double.parseDouble(calcular.getText());
				if (IMC<18.5){
					OMS = "Tiene bajo peso";
				}else if ((IMC>18.5)&& (IMC<24.9)){
					OMS = "Tiene el peso adecuado";
				}else if ((IMC>25)&& (IMC<29.9)){
					OMS = "Tiene sobrepeso";
				}else if ((IMC>30)&& (IMC<34.9)){
					OMS = "Tiene obesidad de grado 1";
				}else if ((IMC>35)&& (IMC<39.9)){
					OMS = "Tiene obesidad de grado 2";
				}else if (IMC>40){
					OMS = "Tiene obesidad de grado 3";
				}
				imc.setText(OMS);
			}
			});
	
		sexo = new JTextField();
		sexo.setFont(new Font("Gadugi", Font.PLAIN, 13));
		sexo.setBounds(41, 211, 148, 20);
		frame.getContentPane().add(sexo);
		sexo.setColumns(10);
		
		JLabel tuimc = new JLabel("Tu resultado es");
		tuimc.setFont(new Font("Georgia", Font.BOLD, 14));
		tuimc.setHorizontalAlignment(SwingConstants.CENTER);
		tuimc.setBounds(262, 165, 141, 14);
		frame.getContentPane().add(tuimc);
		
		
		JLabel lblCalcula = new JLabel("Calcula IMC");
		lblCalcula.setFont(new Font("Georgia", Font.PLAIN, 13));
		lblCalcula.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalcula.setBounds(292, 65, 89, 14);
		frame.getContentPane().add(lblCalcula);
		
		JLabel tualtura = new JLabel("Introduce tu altura");
		tualtura.setHorizontalAlignment(SwingConstants.CENTER);
		tualtura.setFont(new Font("Georgia", Font.PLAIN, 13));
		tualtura.setBounds(41, 100, 148, 14);
		frame.getContentPane().add(tualtura);
		
		JLabel tupeso = new JLabel("Introduce tu peso");
		tupeso.setFont(new Font("Georgia", Font.PLAIN, 13));
		tupeso.setHorizontalAlignment(SwingConstants.CENTER);
		tupeso.setBounds(41, 15, 148, 14);
		frame.getContentPane().add(tupeso);
		
		JLabel tusexo = new JLabel("Introduce tu sexo");
		tusexo.setFont(new Font("Georgia", Font.PLAIN, 13));
		tusexo.setHorizontalAlignment(SwingConstants.CENTER);
		tusexo.setBounds(41, 190, 142, 14);
		frame.getContentPane().add(tusexo);
		
	}
}
