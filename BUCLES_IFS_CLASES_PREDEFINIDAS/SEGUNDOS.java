package BUCLES_IFS_CLASES_PREDEFINIDAS;
///Realiza un programa en Java que acepte por teclado un número de segundos y muestre por pantalla a cuantas horas, minutos y segundos corresponde.

import java.util.Scanner;

public class SEGUNDOS {
	public static void main (String[] args){
	// Colocamos el  main para iniciar
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Introduzca el numero de segundos ");
	int segundostotales = sc.nextInt();
	
	int segundaux = segundostotales;// Añadimos una variable auxiliar de segundos para no repetir la misma
	int segundos= segundaux%60;//Descomponemos los segundos de los minutos
	int minutos = segundostotales/60; //Pasamos los segundos a minutos
	int minutaux = minutos;minutos = minutos&60; //Cogemos los restos de los minutos 
	int horas = minutaux/60;// Pasamos los minutos a horas
	
	System.out.println("Los segundos son "+segundos+" los minutos son "+minutos+" y las horas son "+horas+" ");
	//Declaramos la descomposicion final
	sc.close();
}}
