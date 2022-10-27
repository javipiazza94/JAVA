package ACCESO_A_DATOS;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JFileChooser;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class Seleccion_fichero extends JFrame {

	private JPanel contentPane;
	private JTextField AveriguarFormato;
	private JTextField AveriguarTamaño;
	private JTextField AveriguarNombre;
	private JTextField UltimaModificacion;
	private JTextField RutaAbsoluta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Seleccion_fichero frame = new Seleccion_fichero();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Seleccion_fichero() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		AveriguarFormato = new JTextField();
		AveriguarFormato.setBounds(11, 236, 499, 20);
		contentPane.add(AveriguarFormato);
		AveriguarFormato.setColumns(10);
		
		AveriguarTamaño = new JTextField();
		AveriguarTamaño.setColumns(10);
		AveriguarTamaño.setBounds(11, 316, 499, 20);
		contentPane.add(AveriguarTamaño);
		
		AveriguarNombre = new JTextField();
		AveriguarNombre.setColumns(10);
		AveriguarNombre.setBounds(11, 393, 499, 20);
		contentPane.add(AveriguarNombre);
		
		UltimaModificacion = new JTextField();
		UltimaModificacion.setColumns(10);
		UltimaModificacion.setBounds(11, 530, 499, 20);
		contentPane.add(UltimaModificacion);
		
		RutaAbsoluta = new JTextField();
		RutaAbsoluta.setColumns(10);
		RutaAbsoluta.setBounds(11, 465, 499, 20);
		contentPane.add(RutaAbsoluta);
		
		JLabel Formato = new JLabel("Formato");
		Formato.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		Formato.setHorizontalAlignment(SwingConstants.CENTER);
		Formato.setBounds(95, 191, 111, 23);
		contentPane.add(Formato);
		
		JLabel Tamaño = new JLabel("Tamaño");
		Tamaño.setHorizontalAlignment(SwingConstants.CENTER);
		Tamaño.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		Tamaño.setBounds(95, 267, 111, 23);
		contentPane.add(Tamaño);
		
		JLabel Nombre = new JLabel("Nombre");
		Nombre.setHorizontalAlignment(SwingConstants.CENTER);
		Nombre.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		Nombre.setBounds(105, 347, 111, 23);
		contentPane.add(Nombre);
		
		JLabel Ruta_Absoluta = new JLabel("Ruta Absoluta");
		Ruta_Absoluta.setHorizontalAlignment(SwingConstants.CENTER);
		Ruta_Absoluta.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		Ruta_Absoluta.setBounds(105, 424, 111, 23);
		contentPane.add(Ruta_Absoluta);
		
		JLabel Modificacion = new JLabel("Modificación");
		Modificacion.setHorizontalAlignment(SwingConstants.CENTER);
		Modificacion.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		Modificacion.setBounds(105, 496, 111, 23);
		contentPane.add(Modificacion);
		
		JButton Consulta = new JButton("Consulta los datos del fichero");
		Consulta.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 13));
		Consulta.setBounds(11, 47, 499, 60);
		contentPane.add(Consulta);
		
		JLabel Logo = new JLabel("");
		Logo.setIcon(new ImageIcon("C:\\Users\\Usuario\\Downloads\\Logo (1).png"));
		Logo.setBounds(620, 11, 254, 214);
		contentPane.add(Logo);
		Consulta.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser selector=new JFileChooser();
				selector.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.TXT", "txt");
				selector.setFileFilter(filtro);
				int seleccion=selector.showOpenDialog(contentPane);					 
				if(seleccion==JFileChooser.APPROVE_OPTION){
					 
				    File fichero=selector.getSelectedFile();
				    RutaAbsoluta.setText(fichero.getAbsolutePath());
				    AveriguarNombre.setText(fichero.getName());
				    String ext1= fichero.getName();
					String ext=ext1.substring(ext1.indexOf(".")+1);
				    AveriguarFormato.setText(ext);
				    String fecha= new SimpleDateFormat("MMMM dd, yyyy hh:mm a").format(new Date(fichero.lastModified()));
				    UltimaModificacion.setText(fecha);
				    AveriguarTamaño.setText(""+fichero.length()+" bytes");
				}  
	}});
	}
}
