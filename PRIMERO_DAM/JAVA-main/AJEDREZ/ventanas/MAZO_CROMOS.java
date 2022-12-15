package ventanas;

import java.util.ArrayList;
import java.util.Collections;

public class MAZO_CROMOS {


		//ATRIBUTOS
		protected ArrayList <CROMOS> cromo ;
		
		//CONSTRUCTOR
		
		public MAZO_CROMOS (){
			cromo =new ArrayList<CROMOS>();
			for ( int i = 1; i<=6 ; i++){
					if (i==1) {
						this.cromo.add(new CROMOS(1,"C:\\Users\\MEDAC\\Pictures\\paqui.jpg"));
					} else if (i==2) {
						this.cromo.add(new CROMOS(2,"C:\\Users\\MEDAC\\Pictures\\kasac.jpg"));
					} else if (i==3){
						this.cromo.add(new CROMOS(3,"C:\\Users\\MEDAC\\Pictures\\manusovich.jpg"));
					} else if (i==4) {
						this.cromo.add(new CROMOS(4,"C:\\Users\\MEDAC\\Pictures\\estampita ronaldo.jpg"));
					} else if (i==5){
						this.cromo.add(new CROMOS(5,"C:\\Users\\MEDAC\\Pictures\\dertycia.jpg"));
					} else if (i==6){
						this.cromo.add(new CROMOS(6,"C:\\Users\\MEDAC\\Pictures\\chanchas lesionado.jpg"));
					}
				}
			Collections.shuffle(cromo);
			
		}


		//GETTERS Y SETTERS
		public ArrayList<CROMOS> getCarta() {
			return cromo;
		}

		public void setCarta(ArrayList<CROMOS> carta) {
			this.cromo = carta;
		}
		
		//METODOS
		
		public CROMOS Sacar(){
			return this.cromo.get(0);
		}
		
		public void eliminar_carta(){
			this.cromo.remove(0);
		}
		
	
}
