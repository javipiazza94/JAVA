package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class Juego_cartas_cromos {

	private JFrame frame;
	private MAZO_CROMOS mazo = new MAZO_CROMOS();
	private int cont, cont1;
	private JToggleButton pulsado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego_cartas_cromos window = new Juego_cartas_cromos();
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
	public Juego_cartas_cromos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450*4, 293*3);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		comparador c = new comparador();
		frame.add(c);

	}

	private class comparador extends JPanel {
		public comparador() {
			setLayout(new BorderLayout());
			JTextField pantallita = new JTextField("COMPARA LOS CROMOS");
			add(pantallita, BorderLayout.NORTH);
			cartas c = new cartas();
			add(c, BorderLayout.CENTER);
		}
	}

	private class cartas extends JPanel {
		public cartas() {

			setLayout(new GridLayout(4, 3));
			
			ImageIcon cromo_detras = new ImageIcon(new ImageIcon("C:\\Users\\MEDAC\\Pictures\\cromo_leyenda.jpg").getImage().getScaledInstance(440, 293, Image.SCALE_DEFAULT));
			
			JToggleButton carta7 = new JToggleButton();
			add(carta7);
			carta7.setIcon(cromo_detras);
			carta7.addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent itemEvent) {
					int estado = itemEvent.getStateChange();
					if (estado == ItemEvent.SELECTED) {
						carta7.setSelectedIcon(mazo.getCarta().get(0).carta);
						if (cont==0) {
							cont++;
							cont1=mazo.getCarta().get(0).getId();
							pulsado=carta7;
						}
				
						else{
							cont=0;
							if(cont1==mazo.getCarta().get(0).getId()){
								
							}else{
								pulsado.setSelected(false);
								carta7.setSelected(false);
								if (cont ==3){
									carta7.setEnabled(false);
									JOptionPane.showMessageDialog(carta7, "Has perdido");}
							}
						}
					} else {
						carta7.setIcon(cromo_detras);
						
					}
				}
			});

			JToggleButton carta8 = new JToggleButton();
			add(carta8);
			carta8.setIcon(cromo_detras);
			carta8.addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent itemEvent) {
					int estado = itemEvent.getStateChange();
					if (estado == ItemEvent.SELECTED) {
						carta8.setSelectedIcon(mazo.getCarta().get(1).carta);
						if (cont==0) {
							cont++;
							cont1=mazo.getCarta().get(1).getId();
							pulsado=carta8;
						}
						else{
							cont=0;
							if(cont1==mazo.getCarta().get(1).getId()){
								
							}else{
								pulsado.setSelected(false);
								carta8.setSelected(false);
							}
						}
			
					} else {
						carta8.setIcon(cromo_detras);
					}
				}
			});
			JToggleButton carta9 = new JToggleButton();
			add(carta9);
			carta9.setIcon(cromo_detras);
			carta9.addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent itemEvent) {
					int estado = itemEvent.getStateChange();
					if (estado == ItemEvent.SELECTED) {
						carta9.setSelectedIcon(mazo.getCarta().get(4).carta);
						if (cont==0) {
							cont++;
							cont1=mazo.getCarta().get(4).getId();
							pulsado=carta9;
						}
						else{
							cont=0;
							if(cont1==mazo.getCarta().get(4).getId()){
								
							}else{
								pulsado.setSelected(false);
								carta9.setSelected(false);
							}
						}
					} else {
						carta9.setIcon(cromo_detras);
					}
				}
			});
			setLayout(new GridLayout(4, 3));
			JToggleButton carta4 = new JToggleButton();
			add(carta4);
			carta4.setIcon(cromo_detras);
			carta4.addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent itemEvent) {
					int estado = itemEvent.getStateChange();
					if (estado == ItemEvent.SELECTED) {
						carta4.setSelectedIcon(mazo.getCarta().get(3).carta);
						if (cont==0) {
							cont++;
							cont1=mazo.getCarta().get(3).getId();
							pulsado=carta4;
						}
						else{
							cont=0;
							if(cont1==mazo.getCarta().get(3).getId()){
								
							}else{
								pulsado.setSelected(false);
								carta4.setSelected(false);
							}
						}
					} else {
						carta4.setIcon(cromo_detras);
					}
				}
			});
			JToggleButton carta5 = new JToggleButton();
			add(carta5);
			carta5.setIcon(cromo_detras);
			carta5.addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent itemEvent) {
					int estado = itemEvent.getStateChange();
					if (estado == ItemEvent.SELECTED) {
						carta5.setSelectedIcon(mazo.getCarta().get(5).carta);
						if (cont==0) {
							cont++;
							cont1=mazo.getCarta().get(5).getId();
							pulsado=carta5;
						}
						else{
							cont=0;
							if(cont1==mazo.getCarta().get(5).getId()){
								
							}else{
								pulsado.setSelected(false);
								carta5.setSelected(false);
							}
						}
					} else {
						carta5.setIcon(cromo_detras);
					}
				}
			});
			JToggleButton carta6 = new JToggleButton();
			add(carta6);
			carta6.setIcon(cromo_detras);
			carta6.addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent itemEvent) {
					int estado = itemEvent.getStateChange();
					if (estado == ItemEvent.SELECTED) {
						carta6.setSelectedIcon(mazo.getCarta().get(3).carta);
						if (cont==0) {
							cont++;
							cont1=mazo.getCarta().get(3).getId();
							pulsado=carta6;
						}
						else{
							cont=0;
							if(cont1==mazo.getCarta().get(3).getId()){
								
							}else{
								pulsado.setSelected(false);
								carta6.setSelected(false);
							}
						}
					} else {
						carta6.setIcon(cromo_detras);
					}
				}
			});
			setLayout(new GridLayout(4, 3));
			JToggleButton carta1 = new JToggleButton();
			add(carta1);
			carta1.setIcon(cromo_detras);
			carta1.addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent itemEvent) {
					int estado = itemEvent.getStateChange();
					if (estado == ItemEvent.SELECTED) {
						carta1.setSelectedIcon(mazo.getCarta().get(0).carta);
						if (cont==0) {
							cont++;
							cont1=mazo.getCarta().get(0).getId();
							pulsado=carta1;
						}
						else{
							cont=0;
							if(cont1==mazo.getCarta().get(0).getId()){
								
							}else{
								pulsado.setSelected(false);
								carta1.setSelected(false);
							}
						}
					} else {
						carta1.setIcon(cromo_detras);
					}
				}
			});
			JToggleButton carta2 = new JToggleButton();
			add(carta2);
			carta2.setIcon(cromo_detras);
			carta2.addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent itemEvent) {
					int estado = itemEvent.getStateChange();
					if (estado == ItemEvent.SELECTED) {
						carta2.setSelectedIcon(mazo.getCarta().get(2).carta);
						if (cont==0) {
							cont++;
							cont1=mazo.getCarta().get(2).getId();
							pulsado=carta2;
						}
						else{
							cont=0;
							if(cont1==mazo.getCarta().get(2).getId()){
								
							}else{
								pulsado.setSelected(false);
								carta2.setSelected(false);
							}
						}
					} else {
						carta2.setIcon(cromo_detras);
					}
				}
			});
			JToggleButton carta3 = new JToggleButton();
			add(carta3);
			carta3.setIcon(cromo_detras);
			carta3.addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent itemEvent) {
					int estado = itemEvent.getStateChange();
					if (estado == ItemEvent.SELECTED) {
						carta3.setSelectedIcon(mazo.getCarta().get(1).carta);
						if (cont==0) {
							cont++;
							cont1=mazo.getCarta().get(1).getId();
							pulsado=carta3;
						}
						else{
							cont=0;
							if(cont1==mazo.getCarta().get(1).getId()){
								
							}else{
								pulsado.setSelected(false);
								carta3.setSelected(false);
							}
						}
					} else {
						carta3.setIcon(cromo_detras);
					}
				}
			});
			setLayout(new GridLayout(4, 3));
			JToggleButton carta10 = new JToggleButton();
			add(carta10);
			carta10.setIcon(cromo_detras);
			carta10.addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent itemEvent) {
					int estado = itemEvent.getStateChange();
					if (estado == ItemEvent.SELECTED) {
						carta10.setSelectedIcon(mazo.getCarta().get(4).carta);
						if (cont==0) {
							cont++;
							cont1=mazo.getCarta().get(4).getId();
							pulsado=carta10;
						}
						else{
							cont=0;
							if(cont1==mazo.getCarta().get(4).getId()){
								
							}else{
								pulsado.setSelected(false);
								carta10.setSelected(false);
							}
						}
					} else {
						carta10.setIcon(cromo_detras);
					}
				}
			});
			JToggleButton carta11 = new JToggleButton();
			add(carta11);
			carta11.setIcon(cromo_detras);
			carta11.addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent itemEvent) {
					int estado = itemEvent.getStateChange();
					if (estado == ItemEvent.SELECTED) {
						carta11.setSelectedIcon(mazo.getCarta().get(5).carta);
						if (cont==0) {
							cont++;
							cont1=mazo.getCarta().get(5).getId();
							pulsado=carta11;
						}
						else{
							cont=0;
							if(cont1==mazo.getCarta().get(5).getId()){
								
							}else{
								pulsado.setSelected(false);
								carta11.setSelected(false);
							}
						}
					} else {
						carta11.setIcon(cromo_detras);
					}
				}
			});
			JToggleButton carta12 = new JToggleButton();
			add(carta12);
			carta12.setIcon(cromo_detras);
			carta12.addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent itemEvent) {
					int estado = itemEvent.getStateChange();
					if (estado == ItemEvent.SELECTED) {
						carta12.setSelectedIcon(mazo.getCarta().get(2).carta);
						if (cont==0) {
							cont++;
							cont1=mazo.getCarta().get(2).getId();
							pulsado=carta12;
						}
						else{
							cont=0;
							if(cont1==mazo.getCarta().get(2).getId()){
								
							}else{
								pulsado.setSelected(false);
								carta12.setSelected(false);
							}
						}
					} else {
						carta12.setIcon(cromo_detras);
					}
				}
			});
		}

	}

	
}
