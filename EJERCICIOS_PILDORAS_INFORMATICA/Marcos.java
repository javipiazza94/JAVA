package EJERCICIOS_PILDORAS_INFORMATICA;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Marcos {
	// Compruebo la fuente en este array de la clase Graphics
	public static void ComprobarFuente() {
		boolean fuente = false;
		String fuenteIntroducida = JOptionPane.showInputDialog("INTRODUCE LA FUENTE");
		String[] nombresFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames(); // Para saber las fuentes que hay a traves de un array
		for (int i = 0; i < nombresFuentes.length; i++) {
			if (nombresFuentes[i].equals(fuenteIntroducida)) {
				fuente = true;
			}
		}
		if (fuente) {
			System.out.println("Esta instalada");
		} else {
			System.out.println("No esta instalada");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiMarco marco = new MiMarco();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cuando se cierra la ventana el programa acaba
	}
}

class MiMarco extends JFrame {

	public MiMarco() {
		setTitle("Mi ventana reshulona");
		// setBounds(500, 100, 500, 500); //Es la fusion de los dos metodos anteriores
		setResizable(true); // se puede modificar el tamano
		// setExtendedState(Frame.MAXIMIZED_BOTH);// Se maximiza el tamano. Recibe como
		// parametro una constante estatica. En este caso es =6
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		Dimension tam = pantalla.getScreenSize(); // averiguamos la resolucion de la pantalla y la igualamos a un obj
													// dimension
		int ancho = tam.width;
		int altura = tam.height;
		setSize(ancho / 2, altura / 2);
		setLocation(ancho / 4, altura / 4); // Lo situamos en el centro de la pantalla
		Image imagen = pantalla.getImage(
				"C:\\Users\\javip\\OneDrive\\Documents\\DAM\\ACTIVIDADES\\EJERCICIOS DE PROGRAMACIÓN\\JAVA\\CURSO_JAVA_PILDORAS_INFORMATICAS\\src\\EJERCICIOS_PILDORAS_INFORMATICA\\euro.png");
		setIconImage(imagen);

		MiLamina lamina = new MiLamina();
		add(lamina);
		lamina.setBackground(SystemColor.window);
	}
}

class MiLamina extends JPanel {
	
	private Image imagenfondo;
	
	public MiLamina() {
		try {
			String rutaFondo = "C:\\Users\\javip\\OneDrive\\Documents\\DAM\\ACTIVIDADES\\EJERCICIOS DE PROGRAMACIÓN\\JAVA\\CURSO_JAVA_PILDORAS_INFORMATICAS\\src\\EJERCICIOS_PILDORAS_INFORMATICA\\euro.png";
			File fondo = new File(rutaFondo);
			imagenfondo = ImageIO.read(fondo);
		} catch (IOException e) {
			System.out.println("No se ha podido encontrar la imagen");
		}
		
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//IMAGEN FONDO REPETIDA;
		int anchuraImagen = imagenfondo.getWidth(this);
		int alturaImagen = imagenfondo.getHeight(this);
		
		g.drawImage(imagenfondo, 0, 0, null);
		
		for (int i = 0; i < anchuraImagen; i++) {
			for (int j = 0; j < alturaImagen; j++) {
				if (i+j>0) { //Para que no sobreescriba en el punto 0,0 de la lamina
					g.copyArea(0, 0, anchuraImagen, alturaImagen, i*anchuraImagen, j*alturaImagen);
				}
			}	
		}
		
		// FUENTE
		Font fuente = new Font("Courier", Font.BOLD, 24);
		g.setFont(fuente);
		
		// FRASE
		g.drawString("ADELANTE ESPANOLES, SIN MIEDO A NADA NI A NADIE, POR LA FE Y POR LA PATRIA, \r\n"
				+ " LAS BANDERAS EN ALTO, VIVA CRISTO REY, ARRIBA ESPANA, ADELANTE ESPANA", 5, 100);
		// g.drawRect(100, 200, 100, 100);
		// g.drawLine(5, 50, 500, 50);
		// g.drawArc(300, 300, 250, 240, 90, 120);

		Graphics2D g2 = (Graphics2D) g; // casteamos a la clase Graphics 2D
		
		//CREAMOS OTRA FRASE CON OTRA FUENTE
		g2.setFont(new Font("Georgia", Font.BOLD, 12));
		g2.setColor(Color.CYAN);
		g2.drawString("Mis pelotas mojadas", 5, 50);

		// RECTANGULO
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 150, 200, 150);// creamos el rectangulo
		g2.setColor(Color.BLUE);
		g2.draw(rectangulo);
		g2.setColor(Color.yellow);
		g2.fill(rectangulo); // lo dibujamos

		// ELIPSE
		Ellipse2D elipse = new Ellipse2D.Double();// creamos la instancia de la elipse
		elipse.setFrame(rectangulo); // la creamos con los parametros del rectangulo
		g2.setColor(Color.red.brighter());
		g2.fill(elipse); // la dibujamos

		// LINEA
		g2.setColor(Color.PINK);
		g2.draw(new Line2D.Double(100, 150, 300, 300)); // dibujamos una linea directamente como parametro de la clase
														// instaciada line2d
		// CIRCULO
		double centroRectanguloX = rectangulo.getCenterX(); // almacenamos el punto central del rectangulo por las X
		double centroRectanguloY = rectangulo.getCenterY(); // almacenamos el punto central del rectangulo por las Y
		double radio = 125; // Guardamos el radio
		Ellipse2D circulo = new Ellipse2D.Double(); // instanciamos el circulo
		circulo.setFrameFromCenter(centroRectanguloX, centroRectanguloY, centroRectanguloX + radio,
				centroRectanguloY + radio); // Lo pillamos desde el centro
		g2.setColor(Color.magenta);
		g2.draw(circulo); // lo dibujamos
		g2.setColor(Color.green);
		// g2.fill(circulo); //lo colorea todo por encima

	}

}
