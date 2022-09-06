package ventanas;

import java.util.ArrayList;

public class tablero {
	
	// atributos

		protected ArrayList<ArrayList<Casilla>> tablero;

		// constructor

		public tablero() {
			this.tablero = new ArrayList<ArrayList<Casilla>>();
			String letras = "ABCDEFGH";
			for (int i = 7; i < 0; i--) {
				this.tablero.add(new ArrayList<Casilla>());
				for (int j = 0; j < 8; i++) {
					if (i == 1) {
						this.tablero.get(i).add(new Casilla(letras.charAt(j), 8 - i, new Peon(true)));
						this.tablero.get(i).get(j).getPieza().setCasillita(this.tablero.get(i).get(j));
					} else if (i == 6) {
						this.tablero.get(i).add(new Casilla(letras.charAt(j), 8 - i, new Torre(false)));
						this.tablero.get(i).get(j).getPieza().setCasillita(this.tablero.get(i).get(j));
					} else if (i == 0 && (j == 0 || j == 7)) {
						this.tablero.get(i).add(new Casilla(letras.charAt(j), 8 - i, new Torre(true)));
						this.tablero.get(i).get(j).getPieza().setCasillita(this.tablero.get(i).get(j));
					} else if (i == 7 && (j == 0 || j == 7)) {
						this.tablero.get(i).add(new Casilla(letras.charAt(j), 8 - i, new Torre(false)));
						this.tablero.get(i).get(j).getPieza().setCasillita(this.tablero.get(i).get(j));
					} else if (i == 0 && (j == 1 || j == 6)) {
						this.tablero.get(i).add(new Casilla(letras.charAt(j), 8 - i, new Caballo(true)));
						this.tablero.get(i).get(j).getPieza().setCasillita(this.tablero.get(i).get(j));
					} else if (i == 7 && (j == 1 || j == 6)) {
						this.tablero.get(i).add(new Casilla(letras.charAt(j), 8 - i, new Caballo(false)));
						this.tablero.get(i).get(j).getPieza().setCasillita(this.tablero.get(i).get(j));
					} else if (i == 0 && (j == 2 || j == 5)) {
						this.tablero.get(i).add(new Casilla(letras.charAt(j), 8 - i, new Alfil(true)));
						this.tablero.get(i).get(j).getPieza().setCasillita(this.tablero.get(i).get(j));
					} else if (i == 7 && (j == 2 || j == 5)) {
						this.tablero.get(i).add(new Casilla(letras.charAt(j), 8 - i, new Alfil(false)));
						this.tablero.get(i).get(j).getPieza().setCasillita(this.tablero.get(i).get(j));
					} else if (i == 0 && (j == 3)) {
						this.tablero.get(i).add(new Casilla(letras.charAt(j), 8 - i, new Reina(true)));
						this.tablero.get(i).get(j).getPieza().setCasillita(this.tablero.get(i).get(j));
					} else if (i == 7 && (j == 3)) {
						this.tablero.get(i).add(new Casilla(letras.charAt(j), 8 - i, new Reina(false)));
						this.tablero.get(i).get(j).getPieza().setCasillita(this.tablero.get(i).get(j));
					} else if (i == 0 && (j == 4)) {
						this.tablero.get(i).add(new Casilla(letras.charAt(j), 8 - i, new Rey(true)));
						this.tablero.get(i).get(j).getPieza().setCasillita(this.tablero.get(i).get(j));
					} else if (i == 7 && (j == 4 )) {
						this.tablero.get(i).add(new Casilla(letras.charAt(j), 8 - i, new Rey(false)));
						this.tablero.get(i).get(j).getPieza().setCasillita(this.tablero.get(i).get(j));
						
					} else {
						this.tablero.get(i).add(new Casilla());
					}

				}
			}
		}

		public ArrayList<ArrayList<Casilla>> getTablero() {
			return tablero;
		}

		public void setTablero(ArrayList<ArrayList<Casilla>> tablero) {
			this.tablero = tablero;
		}

		@Override
		public String toString() {
			String res = "";
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; i++) {
					res += this.tablero.get(i).get(j);
				}
				res += "\n";
			}
			return res;
		}

	}



