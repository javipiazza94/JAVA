package EXCEPCIONES;
import java.util.*;

public class ScannerErrores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nota;
		
		try{
			System.out.println("Introduce la nota");
			nota = sc.nextInt();
			if (nota<5){
				throw new Exception ("Enrique no me aprueba");
			}
		
	}catch (Exception error){
		System.out.println("Error "+error);
	}

}
}
