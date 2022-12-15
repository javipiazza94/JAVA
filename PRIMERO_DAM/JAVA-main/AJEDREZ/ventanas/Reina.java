package ventanas;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Reina extends Figura {

	public Reina(boolean color) {
		super(new Casilla(), color);
		this.id = 'Q';
		if (color == true) {
			this.Imagen = new ImageIcon (new ImageIcon("C:\\Users\\MEDAC\\Pictures\\Camera Roll\\reina blanca.png").getImage().getScaledInstance(75, 125, Image.SCALE_DEFAULT));
		} else { 
			this.Imagen = new ImageIcon (new ImageIcon("C:\\Users\\MEDAC\\Pictures\\Camera Roll\\reina negra.png").getImage().getScaledInstance(75, 125, Image.SCALE_DEFAULT));
		}
	}

	@Override
	public boolean moverse(char letra, int numero) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void eliminar_figura() {
		this.figura.getCasillita().remove(0);
		
	}

}
