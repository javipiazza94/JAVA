package BUCLES_IFS_CLASES_PREDEFINIDAS;
import java.util.Scanner;

public class EXPERIMENTOFISICA {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] t = new int [5];
		int [] result = new int [5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce los tiempos");
		for (int i =0; i<t.length; i++) {
				t[i]= sc.nextInt();
		}
		
		for (int j=0; j<1; j++) {
			System.out.println("Imprimimos el primer tiempo = " +t[0]);
		}
		
		for (int i =0; i<t.length; i++) {
			result [i] = t[i]-t[0];
			System.out.println("Imprimimos el resultado total  " +result[i]);
		}
	}

}
