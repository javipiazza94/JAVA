package CLASES_PROPIAS;

import java.util.*;

public class MAIN_BLACKJACK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		ArrayList <JUGADOR> jugones = new ArrayList <JUGADOR> ();
		System.out.println("¿Cuantos jugadores hay?");
		int njug = sc.nextInt();
		for (int i = 0; i<njug; i++){
			System.out.println("Dime tu nombre para inscribirte");
			jugones.add(new JUGADOR(sc.next()));
		}
		
		PARTIDA P1 = new PARTIDA (jugones);
		System.out.println("Comiensa la partida: ");
		for (int i=0; i<jugones.size(); i++){
			P1.primera_ronda(i);
			System.out.println(jugones.get(i));
		}
		while (!P1.isTerminado()){
			for (int i = 0; i<jugones.size(); i++){
				if (jugones.get(i).isPlantado()){
					System.out.println("Lo siento " +jugones.get(i).getId_jugador()+ " ya estas plantado");
			}else {
				System.out.println("¿Quieres robar o plantarte?");
				P1.ronda(i, sc.next());
				System.out.println(jugones.get(i));
			}
		} P1.final_juego();
	}
		P1.comprobarGanador();
		System.out.println("Felicidades "+ P1.getGanador().getId_jugador());

}}