package Ejercicios_Tema5;

import org.jfugue.player.Player;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Caso_2 extends JFrame {

	private JPanel contentPane;
	public Player player = new Player();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Caso_2 frame = new Caso_2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Caso_2() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 536, 300);
			contentPane = new JPanel();
			contentPane.setBackground(Color.DARK_GRAY);
			contentPane.setBorder(new EmptyBorder(5,5,5,5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JButton DO = new JButton("DO");
			DO.setBackground(new Color(255, 255, 255));
			DO.setBounds(10, 11, 63, 239);
			contentPane.add(DO);
			DO.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				player.play("C");
				}
				});
			
			JButton RE = new JButton("RE");
			RE.setBackground(new Color(255, 255, 255));
			RE.setBounds(83, 11, 63, 239);
			contentPane.add(RE);
			RE.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				player.play("D");
				}
				});
			
			JButton MI = new JButton("MI");
			MI.setBackground(new Color(255, 255, 255));
			MI.setBounds(156, 11, 63, 239);
			contentPane.add(MI);
			MI.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				player.play("E");
				}
				});
			
			JButton FA = new JButton("FA");
			FA.setBackground(new Color(255, 255, 255));
			FA.setBounds(229, 11, 63, 239);
			contentPane.add(FA);
			FA.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				player.play("F");
				}
				});
			
			JButton SOL = new JButton("SOL");
			SOL.setBackground(new Color(255, 255, 255));
			SOL.setBounds(302, 11, 63, 239);
			contentPane.add(SOL);
			SOL.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				player.play("G");
				}
				});
			
			JButton LA = new JButton("LA");
			LA.setBackground(new Color(255, 255, 255));
			LA.setBounds(375, 11, 63, 239);
			contentPane.add(LA);
			LA.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				player.play("A");
				}
				});
			
			JButton SI = new JButton("SI");
			SI.setBackground(new Color(255, 255, 255));
			SI.setBounds(448, 11, 63, 239);
			contentPane.add(SI);
			SI.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				player.play("B");
				}
				});
			
			
			
		
			
			
			
			}	
}
