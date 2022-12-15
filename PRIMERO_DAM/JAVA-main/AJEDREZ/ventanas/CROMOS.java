package ventanas;

import java.awt.Image;

import javax.swing.ImageIcon;

public class CROMOS {
	//ATRIBUTO
		protected int id;
		protected static int ID_siguiente = 1;
		protected ImageIcon carta;
		
		
		//CONSTRUCTOR
		public CROMOS(){
			
		}
		
		public CROMOS ( int id, String Ruta){
			this.id= ID_siguiente;
			this.ID_siguiente++;
			this.carta = new ImageIcon(Ruta);
		}

			//SETTERS Y GETTERS

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public ImageIcon getCarta() {
			return carta;
		}

		public void setCarta(ImageIcon carta) {
			this.carta = carta;
		}
		
		//METODO 
				public Image getImage() {
					// TODO Auto-generated method stub
					return null;
				}

				

}
		
		
