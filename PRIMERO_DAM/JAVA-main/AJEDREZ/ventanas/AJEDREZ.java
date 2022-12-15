package ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class AJEDREZ {

	private JFrame frame;
	private tablero tablero = new tablero();
	private Casilla casilla = new Casilla();
	private Alfil alfil = new Alfil(false);
	private Caballo caballo = new Caballo(false);
	private Peon peon = new Peon(false);
	private Reina reina = new Reina (false);
	private Rey rey = new Rey(false);
	private Torre torre = new Torre(false);
	private int cont, cont1;
	private JButton pulsado;
	private int x, y;
	private int a,b,c,d,e,f,g,h;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AJEDREZ window = new AJEDREZ();
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
	public AJEDREZ() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		tablero t1 = new tablero ();
		frame.getContentPane().add(t1);
	}
	
	private class tablero extends JPanel {
		public tablero (){
			setLayout(new BorderLayout());
			setVisible(true);
			figuras fi = new figuras();
			add(fi, BorderLayout.CENTER);
			barra_superior bs = new barra_superior();
			add(bs, BorderLayout.NORTH);
			barra_lateral ls = new barra_lateral();
			add(ls, BorderLayout.WEST);
			barra_superior bs2 = new barra_superior();
			add(bs2, BorderLayout.SOUTH);
			barra_lateral ls2 = new barra_lateral();
			add(ls2, BorderLayout.EAST
					
					);
		}
	}
		

	private class barra_superior extends JPanel {
		public barra_superior() {
			setLayout(new GridLayout(1, 0));
			setVisible(true);
			JLabel A = new JLabel("A");
			A.setHorizontalAlignment(SwingConstants.CENTER);
			add(A);
			JLabel B = new JLabel("B");
			B.setHorizontalAlignment(SwingConstants.CENTER);
			add(B);
			JLabel C = new JLabel("C");
			C.setHorizontalAlignment(SwingConstants.CENTER);
			add(C);
			JLabel D = new JLabel("D");
			D.setHorizontalAlignment(SwingConstants.CENTER);
			add(D);
			JLabel E = new JLabel("E");
			E.setHorizontalAlignment(SwingConstants.CENTER);
			add(E);
			JLabel F = new JLabel("F");
			F.setHorizontalAlignment(SwingConstants.CENTER);
			add(F);
			JLabel G = new JLabel("G");
			G.setHorizontalAlignment(SwingConstants.CENTER);
			add(G);
			JLabel H = new JLabel("H");
			H.setHorizontalAlignment(SwingConstants.CENTER);
			add(H);
			}
	}
			
			
	private class barra_lateral extends JPanel {
		public barra_lateral() {
			setLayout(new GridLayout(0, 1));
			setVisible(true);
			JLabel UNO = new JLabel("1");
			add(UNO,BorderLayout.WEST);
			JLabel DOS = new JLabel("2");
			add(DOS,BorderLayout.WEST);
			JLabel TRES = new JLabel("3");
			add(TRES,BorderLayout.WEST);
			JLabel CUATRO = new JLabel("4");
			add(CUATRO,BorderLayout.WEST);
			JLabel CINCO = new JLabel("5");
			add(CINCO,BorderLayout.WEST);
			JLabel SEIS = new JLabel("6");
			add(SEIS,BorderLayout.WEST);
			JLabel SIETE = new JLabel("7");
			add(SIETE,BorderLayout.WEST);
			JLabel OCHO = new JLabel("8");
			add(OCHO,BorderLayout.WEST);
						
		}
	}

	private class figuras extends JPanel {
		public figuras() {

			setLayout(new GridLayout(8, 8, 0, 0));
			Casilla A1 = new Casilla('A', 1, new Torre (true));
			add(A1);
			A1.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
					
			A1.setBackground(Color.GRAY);
			Casilla A2 = new Casilla('A', 2, new Peon (true));
			add(A2);
			A2.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					x = A2.getX();
					y = A2.getY();
				System.out.println(A2.getLocation());
				
					
				}
				
			});
			
			A2.setBackground(Color.WHITE);
			JButton A3 = new JButton();
			add(A3);
			A3.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			A3.setBackground(Color.GRAY);
			JButton A4 = new JButton();
			add(A4);
			A4.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			A4.setBackground(Color.WHITE);
			JButton A5 = new JButton();
			add(A5);
			A5.setBackground(Color.GRAY);
			A5.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			JButton A6 = new JButton();
			add(A6);
			A6.setBackground(Color.WHITE);
			A6.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			Casilla A7 = new Casilla('A', 7, new Peon (false));
			add(A7);
			A7.setBackground(Color.GRAY);
			A7.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			Casilla A8 = new Casilla('A', 8, new Torre (false));
			add(A8);
			A8.setBackground(Color.WHITE);
			A8.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			
			Casilla B1 = new Casilla('B', 1, new Caballo (true));
			add(B1);
			B1.setBackground(Color.WHITE);
			B1.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			Casilla B2 = new Casilla('B', 2, new Peon (true));
			add(B2);
			B2.setBackground(Color.GRAY);
			B2.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			JButton B3 = new JButton();
			add(B3);
			B3.setBackground(Color.WHITE);
			B3.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			JButton B4 = new JButton();
			add(B4);
			B4.setBackground(Color.GRAY);
			B4.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			JButton B5 = new JButton();
			add(B5);
			B5.setBackground(Color.WHITE);
			B5.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			JButton B6 = new JButton();
			add(B6);
			B6.setBackground(Color.GRAY);
			B6.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			Casilla B7 = new Casilla('B', 7, new Peon (false));
			add(B7);
			B7.setBackground(Color.WHITE);
			B7.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			Casilla B8 = new Casilla('B', 8, new Caballo (false));
			add(B8);
			B8.setBackground(Color.GRAY);
			B8.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			
			Casilla C1 = new Casilla('C', 1, new Alfil (true));
			add(C1);
			C1.setBackground(Color.GRAY);
			C1.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			Casilla C2 = new Casilla('C', 2, new Peon (true));
			add(C2);
			C2.setBackground(Color.WHITE);
			C2.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			JButton C3 = new JButton();
			add(C3);
			C3.setBackground(Color.GRAY);
			C3.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			JButton C4 = new JButton();
			add(C4);
			C4.setBackground(Color.WHITE);
			C4.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			JButton C5 = new JButton();
			add(C5);
			C5.setBackground(Color.GRAY);
			C5.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			JButton C6 = new JButton();
			add(C6);
			C6.setBackground(Color.WHITE);
			C6.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			Casilla C7 = new Casilla('C', 7, new Peon (false));
			add(C7);
			C7.setBackground(Color.GRAY);
			C7.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			Casilla C8 = new Casilla('C', 8, new Alfil (false));
			add(C8);
			C8.setBackground(Color.WHITE);
			C8.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
						
			
			Casilla D1 = new Casilla('D', 1, new Reina (true));
			add(D1);
			D1.setBackground(Color.WHITE);
			D1.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			Casilla D2 = new Casilla('D', 2, new Peon (true));
			add(D2);
			D2.setBackground(Color.GRAY);
			D2.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			JButton D3 = new JButton();
			add(D3);
			D3.setBackground(Color.WHITE);
			D3.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			JButton D4 = new JButton();
			add(D4);
			D4.setBackground(Color.GRAY);
			D4.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			JButton D5 = new JButton();
			add(D5);
			D5.setBackground(Color.WHITE);
			D5.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			JButton D6 = new JButton();
			add(D6);
			D6.setBackground(Color.GRAY);
			D6.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			Casilla D7 = new Casilla('D', 7, new Peon (false));
			add(D7);
			D7.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			D7.setBackground(Color.WHITE);
			Casilla D8 = new Casilla('D', 8, new Reina (false));
			add(D8);
			D8.setBackground(Color.GRAY);
			D8.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
						
			
			Casilla E1 = new Casilla('E', 1, new Rey (true));
			add(E1);
			E1.setBackground(Color.GRAY);
			E1.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			Casilla E2 = new Casilla('E', 2, new Peon (true));
			add(E2);
			E2.setBackground(Color.WHITE);
			E2.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			JButton E3 = new JButton();
			add(E3);
			E3.setBackground(Color.GRAY);
			E3.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			JButton E4 = new JButton();
			add(E4);
			E4.setBackground(Color.WHITE);
			E4.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			JButton E5 = new JButton();
			add(E5);
			E5.setBackground(Color.GRAY);
			E5.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			JButton E6 = new JButton();
			add(E6);
			E6.setBackground(Color.WHITE);
			E6.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			Casilla E7 = new Casilla('E', 7, new Peon (false));
			add(E7);
			E7.setBackground(Color.GRAY);
			E7.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			Casilla E8 = new Casilla('E', 8, new Rey (false));
			add(E8);
			E8.setBackground(Color.WHITE);
			E8.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			
			
			Casilla F1 = new Casilla('F', 1, new Torre (true));
			add(F1);
			F1.setBackground(Color.WHITE);
			F1.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			Casilla F2 = new Casilla('F', 2, new Peon (true));
			add(F2);
			F2.setBackground(Color.GRAY);
			F2.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			JButton F3 = new JButton();
			add(F3);
			F3.setBackground(Color.WHITE);
			F3.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			JButton F4 = new JButton();
			add(F4);
			F4.setBackground(Color.GRAY);
			F4.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			JButton F5 = new JButton();
			add(F5);
			F5.setBackground(Color.WHITE);
			F5.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			JButton F6 = new JButton();
			add(F6);
			F6.setBackground(Color.GRAY);
			F6.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			Casilla F7 = new Casilla('F', 7, new Peon (false));
			add(F7);
			F7.setBackground(Color.WHITE);
			F7.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			Casilla F8 = new Casilla('F', 8, new Torre (false));
			add(F8);
			F8.setBackground(Color.GRAY);
			F8.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			Casilla G1 = new Casilla('G', 1, new Caballo (true));
			add(G1);
			G1.setBackground(Color.GRAY);
			G1.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			Casilla G2 = new Casilla('G', 2, new Peon (true));
			add(G2);
			G2.setBackground(Color.WHITE);
			G2.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			JButton G3 = new JButton();
			add(G3);
			G3.setBackground(Color.GRAY);
			G3.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			JButton G4 = new JButton();
			add(G4);
			G4.setBackground(Color.WHITE);
			G4.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			JButton G5 = new JButton();
			add(G5);
			G5.setBackground(Color.GRAY);
			G5.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			JButton G6 = new JButton();
			add(G6);
			G6.setBackground(Color.WHITE);
			G6.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			Casilla G7 = new Casilla('G', 7, new Peon (false));
			add(G7);
			G7.setBackground(Color.GRAY);
			G7.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			Casilla G8 = new Casilla('G', 8, new Caballo (false));
			add(G8);
			G8.setBackground(Color.WHITE);
			G8.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			
			
			Casilla H1 = new Casilla('H', 1, new Alfil (true));
			add(H1);
			H1.setBackground(Color.WHITE);
			H1.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			Casilla H2 = new Casilla('H', 2, new Peon (true));
			add(H2);
			H2.setBackground(Color.GRAY);
			H2.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			JButton H3 = new JButton();
			add(H3);
			H3.setBackground(Color.WHITE);
			H3.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			JButton H4 = new JButton();
			add(H4);
			H4.setBackground(Color.GRAY);
			H4.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			JButton H5 = new JButton();
			add(H5);
			H5.setBackground(Color.WHITE);
			H5.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			JButton H6 = new JButton();
			add(H6);
			H6.setBackground(Color.GRAY);
			H6.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			Casilla H7 = new Casilla('H', 7, new Peon (false));
			add(H7);
			H7.setBackground(Color.WHITE);
			H7.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			Casilla H8 = new Casilla('H', 8, new Alfil (false));
			add(H8);
			H8.setBackground(Color.GRAY);
			H8.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			
		}
	}
}
