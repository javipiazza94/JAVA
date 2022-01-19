package CLASES;

import java.util.Scanner;

public class MAIN_CUBATA {

	public static void main(String[] args) {
		
		CUBATA cubatita = new CUBATA ("tubo","hierbabuena", "ginebra", 7, "fanta de limon", 3, 300 );
		CUBATA cubatita2 = new CUBATA ("maceta","hierbabuena", "ron", 7, "cola", 3, 500 );
		System.out.println(cubatita);
		System.out.println(cubatita.getbebidaalcoholica());
		cubatita.beber(50);
		System.out.println(cubatita.getcantidad());
		cubatita.hidalgo();
		System.out.println(cubatita.getcantidad());
		cubatita.llenar();
		System.out.println(cubatita.getcantidad());
		
		cubatita = cubatita.plus(cubatita2);
		System.out.println(cubatita);
		
		
	}
}
