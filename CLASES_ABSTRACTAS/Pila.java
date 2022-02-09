package CLASES_ABSTRACTAS;

import java.util.ArrayList;

public class Pila implements iLista{
	
	private final int capacidadMx = 30;
	private ArrayList <Integer> pila;
	
	public Pila() {
		this.pila = new ArrayList  <Integer> ();
	}


	public int getCapacidadMx() {
		return capacidadMx;
	}



	public ArrayList<Integer> getPila() {
		return pila;
	}


	public void setPila(ArrayList<Integer> pila) {
		this.pila = pila;
	}
	
	@Override
	public boolean isEmpty() {
		boolean vacio = false;
		if (pila.size()==0){
			vacio = true;
		}
		return vacio;
	}

	@Override
	public void push( int pushito) {
		if (pila.size()<this.capacidadMx){
			pila.add(pushito);
		}
	}

	@Override
	public int pop() {
		int aux = this.pila.get(this.pila.size()-1);
		pila.remove(this.pila.size()-1);
		return aux;
	}
	
	@Override
	public String toString() {
		return "Pila [pila=" + pila + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
