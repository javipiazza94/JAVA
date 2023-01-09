package EJERCICIOS_PILDORAS_INFORMATICA;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Prueba_Temporizador {

	public static void main(String[] args) {
		
		Dame_La_Hora oyente = new Dame_La_Hora();
		Timer MiTemporizador = new Timer(5000, oyente);
		MiTemporizador.start();
		JOptionPane.showMessageDialog(null, "Pulsa para detener");
		System.exit(0);
	}
}
class Dame_La_Hora implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Date hora = new Date();
		System.out.println("La hora cada 5 segundos es "+hora);
		Toolkit.getDefaultToolkit().beep();
		
	}
	
}
