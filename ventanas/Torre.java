package ventanas;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Torre extends Figura {

	public Torre( boolean color) {
		super(new Casilla(), color);
		this.id = 'T';
		if (color == true) {
			this.Imagen = new ImageIcon (new ImageIcon("C:\\Users\\MEDAC\\Pictures\\Camera Roll\\torre blanca.png").getImage().getScaledInstance(75, 125, Image.SCALE_DEFAULT));
		} else { 
			this.Imagen = new ImageIcon (new ImageIcon("C:\\Users\\MEDAC\\Pictures\\Camera Roll\\torre negra.png").getImage().getScaledInstance(75, 125, Image.SCALE_DEFAULT));
		}
			
	}

	@Override
	public boolean moverse(char letra, int numero) {
		boolean res = false;
		
		return res;
	}

	@Override
	public void eliminar_figura() {
		this.figura.getCasillita().remove(0);
		
	}


}
