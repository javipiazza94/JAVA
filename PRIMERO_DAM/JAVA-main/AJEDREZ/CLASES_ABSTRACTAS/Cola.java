package CLASES_ABSTRACTAS;

import java.util.ArrayList;

public abstract class Cola implements iLista {

	private final int capacidadMx = 30;
	private ArrayList <Integer> cola;
	

	public Cola(ArrayList<Integer> cola) {
		super();
		this.cola = cola;
	}
	

	public ArrayList<Integer> getCola() {
		return cola;
	}


	public void setCola(ArrayList<Integer> cola) {
		this.cola = cola;
	}


	public int getCapacidadMx() {
		return capacidadMx;
	}

	@Override
	public String toString(){
		return this.cola.toString();
	}

	@Override
	public boolean isEmpty() {
		boolean vacio = false;
		if (cola.size()==0){
			vacio = true;
		}
		return vacio;
	}

	@Override
	public void push(int pushito){
		if (cola.size()<=this.capacidadMx){
			cola.add(pushito);
		}
	}

	@Override
	public int pop() {
		int aux = 0;
		if (!this.isEmpty()){
			aux = this.cola.get(0);
			cola.remove(0);
		}
			return aux;
		}
		
	}