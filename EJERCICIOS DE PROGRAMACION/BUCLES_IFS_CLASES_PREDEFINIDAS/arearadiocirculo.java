package BUCLES_IFS_CLASES_PREDEFINIDAS;
//Pide el radio de un circulo y calcula su area

import java.util.Scanner;

public class arearadiocirculo {
	public static void main(String[] args){
		// Colocamos el  main para iniciar
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca el radio");
		double radio = sc.nextDouble();
		
		double area = Math.round(Math.PI*radio*radio)*100/100;
		
		System.out.println("El resultado final es "+area+" centimetros");
		sc.close();

}}