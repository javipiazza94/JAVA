package CLASES;

import java.util.*;

public class MAIN_FRACCION {

	public static void main(String[] args) {
		// PROGRAMA DE LA FRACCION
		
		FRACCION f1 = new FRACCION (1,2);
		System.out.println(f1);
		FRACCION f2 = new FRACCION (2,3);
		System.out.println(f2.getResultado());
		
		FRACCION f3 = f1.multiplicacion(f2);
		System.out.println(f3);

	}

}
