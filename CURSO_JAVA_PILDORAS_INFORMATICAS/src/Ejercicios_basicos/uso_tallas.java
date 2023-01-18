package Ejercicios_basicos;

import java.util.Scanner;

public class uso_tallas {
	
	//enum Tallas {PEQUENA, MEDIANA, LARGA, GRANDE, EXTRAGRANDE}; ES UN TIPO ENUMERADO EN EL QUE TENEMOS UNAS VIARABLES FIJAS POR DEFECTO
	
	enum Tallas{
		PEQUENA("S"), MEDIANA("M"), LARGA("L"), GRANDE("XL"), EXTRAGRANDE("XXL");
		private String abreviatura;
		
		Tallas(String iniciales){
			this.abreviatura = iniciales;
		}

		public String getAbreviatura() {
			return abreviatura;
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("INTRODUCE UNA TALLA: PEQUENA, MEDIANA, LARGA, GRANDE, EXTRAGRANDE");
		String datos = sc.next().toUpperCase();
		
		Tallas laTalla = Enum.valueOf(Tallas.class, datos);
		System.out.println("La talla es "+laTalla);
		System.out.println("La abreviatura es: "+laTalla.getAbreviatura());
	}

}
