package com.oracle.intgraf;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import com.oracle.conector.*;


public class Main {

   private JFrame frame;
   private JButton addButton;
   private JButton retrieveButton;
   private JButton updateButton;
   private JButton deleteButton;
   private JTextField textField;
   private conector conect;
   public Main() throws SQLException {
      frame = new JFrame("Oracle Connection Manager");
      frame.setSize(400, 200);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(new FlowLayout());

      addButton = new JButton("Create");
      retrieveButton = new JButton("Select");
      updateButton = new JButton("Update");
      deleteButton = new JButton("Delete");
      conect.establishConnection();
      textField = new JTextField();
      
      addButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Call add method
        	 String mensaje = textField.getText();
        	try {
				conect.executeQuery(mensaje);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
         }
      });

      retrieveButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Call select method
        	 String mensaje = textField.getText();
        	 try {
				conect.selectData(mensaje);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
         }
      });

      updateButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Call update method
        	 String mensaje = textField.getText();
        	 try {
				conect.executeUpdate(mensaje);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
         }
      });

      deleteButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Call delete method
        	 String mensaje = textField.getText();
        	 try {
				conect.deleteData(mensaje);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
         }
      });

      frame.getContentPane().add(addButton);
      frame.getContentPane().add(retrieveButton);
      frame.getContentPane().add(updateButton);
      frame.getContentPane().add(deleteButton);
      
      
      frame.getContentPane().add(textField);
      textField.setColumns(10);
   }

   public static void main(String[] args) throws SQLException {
      Main main = new Main();
      main.frame.setVisible(true);
   }
}