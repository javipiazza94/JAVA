package Ejercicios_Tema6;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;

@SuppressWarnings("serial")
public class Componentes_visuales extends JFrame {

	// CONVERSORES A DECIMAL
	public static void hexaADecimal() {
		String digits = "0123456789ABCDEF";
		String hex = numero_calculo.getText().toString();
		hex = hex.toUpperCase();
		int val = 0;
		for (int i = 0; i < hex.length(); i++) {
			char c = hex.charAt(i);
			int d = digits.indexOf(c);
			val = 16 * val + d;
		}
		RESULTADO.setText(String.valueOf(val));
	}

	public static void binarioDecimal() throws NumberFormatException {
		long numero, aux, digito, decimal;
		int exponente;
		boolean esBinario;
		do {
			numero = Integer.parseInt(numero_calculo.getText().toString());
			esBinario = true;
			aux = numero;
			while (aux != 0) {
				digito = aux % 10;
				if (digito != 0 && digito != 1) {
					esBinario = false;
				}
				aux = aux / 10;
			}
		} while (!esBinario);
		exponente = 0;
		decimal = 0;
		while (numero != 0) {
			digito = numero % 10;
			decimal = decimal + digito * (int) Math.pow(2, exponente);
			exponente++;
			numero = numero / 10;
		}
		RESULTADO.setText(String.valueOf(decimal));
	}

	public static void octalADecimal() {
		long decimal = 0;
		int potencia = 0;
		String octal = numero_calculo.getText().toString();

		for (int x = octal.length() - 1; x >= 0; x--) {
			int valorActual = Character.getNumericValue(octal.charAt(x));
			long elevado = (long) Math.pow(8, potencia) * valorActual;
			decimal += elevado;
			potencia++;
		}
		RESULTADO.setText(String.valueOf(decimal));
	}

	// CLASES
	private JPanel contentPane;
	private static JTextField numero_calculo;
	public static int exp;
	public static int digito;
	private static JTextField RESULTADO;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Componentes_visuales frame = new Componentes_visuales();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	@SuppressWarnings("unchecked")
	public Componentes_visuales() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 216);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel IntroducirNum = new JLabel("INTRODUCE EL NÚMERO A CONVERTIR");
		IntroducirNum.setHorizontalAlignment(SwingConstants.CENTER);
		IntroducirNum.setForeground(new Color(255, 255, 128));
		IntroducirNum.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		IntroducirNum.setBounds(61, 11, 457, 41);
		contentPane.add(IntroducirNum);

		JLabel Result = new JLabel("RESULTADO");
		Result.setHorizontalAlignment(SwingConstants.CENTER);
		Result.setForeground(new Color(255, 255, 128));
		Result.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		Result.setBounds(10, 115, 155, 26);
		contentPane.add(Result);

		numero_calculo = new JTextField();
		numero_calculo.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 12));
		numero_calculo.setHorizontalAlignment(SwingConstants.CENTER);
		numero_calculo.setBounds(389, 63, 191, 26);
		contentPane.add(numero_calculo);
		numero_calculo.setText("Introduzca un numero");
		numero_calculo.setColumns(10);
		numero_calculo.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				if (numero_calculo.getText().equals("Introduzca un numero")) {
					numero_calculo.setText("");
					numero_calculo.setForeground(Color.GRAY);
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (numero_calculo.getText().isEmpty()) {
					numero_calculo.setForeground(Color.GRAY);
					numero_calculo.setText("Introduzca un numero");
				}
			}
		});

		RESULTADO = new JTextField();
		RESULTADO.setHorizontalAlignment(SwingConstants.CENTER);
		RESULTADO.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 12));
		RESULTADO.setBounds(155, 115, 425, 26);
		contentPane.add(RESULTADO);
		RESULTADO.setColumns(10);

		@SuppressWarnings("rawtypes")
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 12));
		comboBox.setBounds(10, 63, 285, 26);
		contentPane.add(comboBox);
		comboBox.addItem("SELECCIONA UNA CONERSIÓN");
		comboBox.addItem("Decimal a Binario");
		comboBox.addItem("Decimal a Hexadecimal");
		comboBox.addItem("Decimal a Octal");
		comboBox.addItem("Octal a Decimal");
		comboBox.addItem("Hexadecimal a Decimal");
		comboBox.addItem("Binario a Decimal");

		JButton convertir = new JButton("Pulsa");
		convertir.setBounds(305, 63, 74, 26);
		contentPane.add(convertir);
		convertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int numero = Integer.parseInt(numero_calculo.getText().toString());
					RESULTADO.setForeground(Color.BLACK);
					String resultado;
					switch ((String) (comboBox.getSelectedItem())) {
						case "SELECCIONA UNA CONERSIÓN":
							RESULTADO.setText("Introduce un numero");
							;
							break;
						case "Decimal a Binario":
							resultado = Integer.toBinaryString(numero);
							RESULTADO.setText(resultado);
							break;
						case "Decimal a Hexadecimal":
							resultado = Integer.toHexString(numero);
							RESULTADO.setText(resultado);
							break;
						case "Decimal a Octal":
							resultado = Integer.toOctalString(numero);
							RESULTADO.setText(resultado);
							break;
						case "Octal a Decimal":
							Componentes_visuales.octalADecimal();
							break;
						case "Hexadecimal a Decimal":
							Componentes_visuales.hexaADecimal();
							break;
						case "Binario a Decimal":
							resultado = Integer.toOctalString(numero);
							Componentes_visuales.binarioDecimal();
							break;
						}
				} catch (NumberFormatException e1) {
					RESULTADO.setText("Tipo de numero erróneo. Introduzcalo de nuevo");
					RESULTADO.setForeground(Color.red);
				}
			}
		});
	}
}