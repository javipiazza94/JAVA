package ventanas;

import javax.swing.JButton;

public class Casilla extends JButton{
	
	private char letra;
	private int num;
	private boolean ocupada;
	private Figura pieza;
	
	public Casilla (){
		letra = 0;
		num = 0;
		ocupada = false;
		pieza = null;
	}

	public Casilla(char letra, int num, Figura pieza) {
		this.letra = letra;
		this.num = num;
		this.ocupada = true;
		this.pieza = pieza;
		this.setIcon(pieza.Imagen);
	}
	
	public Casilla(char letra, int num) {
		this.letra = letra;
		this.num = num;
		this.ocupada = false;
		this.pieza = null;
	}
	

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	public Figura getPieza() {
		return pieza;
	}

	public void setPieza(Figura pieza) {
		this.pieza = pieza;
	}

	@Override
	public String toString() {
		String res = ""; 
		if (this.pieza == null){
			res+= "[ ]";
		}else {
			res = "[" + this.pieza + "]";
		}
		return res;
	
	
	
	}

}
