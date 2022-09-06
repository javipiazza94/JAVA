package ventanas;

import javax.swing.ImageIcon;

public abstract class Figura {

    //atributos
	protected Figura figura;
	protected Casilla casillita;
    protected char id;
    protected boolean Color = false;
    protected ImageIcon Imagen;

    

    public Figura(Casilla casillita, boolean color) {
		this.casillita = casillita;
		if (color = true) {
			this.Imagen = new ImageIcon();
		} else {
			this.Imagen = new ImageIcon();
		};
	}


    public Figura getFigura() {
		return figura;
	}


	public void setFigura(Figura figura) {
		this.figura = figura;
	}

	public ImageIcon getImagen() {
		return Imagen;
	}



	public void setImagen(ImageIcon imagen) {
		Imagen = imagen;
	}



	public Casilla getCasillita() {
		return casillita;
	}



	public void setCasillita(Casilla casillita) {
		this.casillita = casillita;
	}



	public char getId() {
		return id;
	}



	public void setId(char id) {
		this.id = id;
	}



	public boolean isColor() {
		return Color;
	}



	public void setColor(boolean color) {
		Color = color;
	}



	@Override
	public String toString() {
		 
		return Character.toString(this.id);
	}

	public abstract boolean moverse( char letra, int numero);
	
	public abstract void eliminar_figura();


		

    
}