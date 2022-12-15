package BUCLES_IFS_CLASES_PREDEFINIDAS;
//Realiza un programa en Java que acepte por teclado la latitud y la longitud de dos puntos del globo terrestre y muestre por pantalla la distancia entre ellos.
import java.util.Scanner;

public class LATITUDESLONGITUDES {
	public static void main(String[] args){
		// Colocamos el  main para iniciar
		Scanner sc = new Scanner (System.in);
		final double RADIOTIERRA= 6371.01;
		
		System.out.println("Introduzca la posicion A de las coordenadas de longitud en la Tierra");
		double longitud= sc.nextDouble();
		System.out.println("Introduzca la posicion A de las coordenadas de latitud en la Tierra");
		double latitud= sc.nextDouble();
		System.out.println("Introduzca la posicion B de las coordenadas de longitud en la Tierra");
		double longitud2= sc.nextDouble();
		System.out.println("Introduzca la posicion B de las coordenadas de latitud en la Tierra");
		double latitud2= sc.nextDouble();
	
		double latradians1= Math.cos(Math.toRadians(latitud));
		double latradians2= Math.cos(Math.toRadians(latitud2));
		double longradians1= Math.cos(Math.toRadians(longitud));
		double longradians2= Math.cos(Math.toRadians(longitud2));
		
		double distancia= RADIOTIERRA*Math.acos(Math.sin(latradians1)*Math.sin(latradians2) + (Math.cos(latradians1)*Math.cos(latradians2)*Math.cos(longradians1-longradians2)));
		
		//radio*arcocoseno(senlatitud1)*senolatitud2 + cosenolatitud1*coseolatitud2*coseno(longitud - longitud2)
		System.out.println("Tu posicion en la Tierra es "+distancia);
		sc.close();	
	
}}
