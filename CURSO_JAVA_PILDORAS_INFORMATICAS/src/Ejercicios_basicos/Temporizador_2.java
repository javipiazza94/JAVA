package Ejercicios_basicos;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Temporizador_2 {

	public static void main(String[] args) {

		Reloj miReloj = new Reloj();
		miReloj.funciona(true, 3000);
		JOptionPane.showMessageDialog(null, "Pulsa para detener");
		System.exit(0);
	}
}

class Reloj {

	public void funciona(boolean sonido, int intervalo) {
		class Dame_La_Hora2 implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				Date hora = new Date();
				System.out.println("La hora cada 3 segundos es " + hora);
				if (sonido) {
					Toolkit.getDefaultToolkit().beep();
				}
			}
		}
		ActionListener oyente = new Dame_La_Hora2();
		Timer miTemporizador = new Timer(intervalo, oyente);
		miTemporizador.start();
	}
}