package CLASES_PROPIAS;

import java.util.Scanner;

public class MAIN_LIBROS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		BIBLIOTECA_LIBR libroA = new BIBLIOTECA_LIBR ("8416854238", "Maria Elvira Roca Barea", "Siruela", "Ensayo histórico", "Imperiofobia y leyenda negra: Roma, Rusia, Estados Unidos y el Imperio español", 460, 2021, true);
		BIBLIOTECA_LIBR libroB = new BIBLIOTECA_LIBR ("8408233114", "Jordan Peterson", "Booket", "Prácticos del siglo XXI", "12 reglas para vivir: Un antídoto al caos", 512, 2018, false);
	
		System.out.println(libroA.toString());
		System.out.print("\n");
		System.out.println(libroB.toString());
		System.out.print("\n");
		System.out.println(libroA.IsDisponible());
		System.out.println(libroB.IsDisponible());
		
		
		
	}
	

}
