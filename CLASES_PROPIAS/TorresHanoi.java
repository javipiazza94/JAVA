package CLASES_PROPIAS;

import java.util.*;
public class TorresHanoi {
	
	private ArrayList <PilaOrdenada> torres;
	private int ndiscos;
	private boolean terminado;
	
	
	//CONSTRUCTOR
	public TorresHanoi(){
		this.terminado = false;
		torres = new ArrayList <PilaOrdenada>();
		this.ndiscos = 0;
	}
		
	public TorresHanoi(int ndiscos){
		this.terminado = false;
		torres = new ArrayList <PilaOrdenada>();
		torres.add(new PilaOrdenada());
		torres.add(new PilaOrdenada());
		torres.add(new PilaOrdenada());
		this.ndiscos = ndiscos;
		for (int i = this.ndiscos; i>0; i--){
			this.torres.get(0).meter_disco(new Disco(i));
		}
		
	}

	//GETTERS Y SETTERS
	public ArrayList<PilaOrdenada> getTorres() {
		return torres;
	}

	public int getNdiscos() {
		return ndiscos;
	}

	public boolean isTerminado() {
		return terminado;
	}

	public void setTerminado(boolean terminado) {
		this.terminado = terminado;
	}
	

	//METODOS
	@Override
	public String toString(){
		String result = "";
		for (int i =0; i< this.torres.size(); i++){
			result+=this.torres.get(i) + "\n";
		}
		result += "===========";
		return result;
	}
	
	public boolean meter (int origen, int destino){
		boolean resultado = false;
		if (this.torres.get(origen).cina().getTamaño()<this.torres.get(destino).cina().getTamaño()){
			Disco sacado = this.torres.get(origen).sacar_disco();
		 if(this.torres.get(destino).meter_disco(sacado)){
			resultado = true;
			}
		}else if (this.torres.get(destino).cina().getTamaño()==0){
			Disco sacado = this.torres.get(origen).sacar_disco();
			this.torres.get(destino).meter_disco(sacado);
		}
	return resultado;
}
	
	public boolean juego_terminado (){
		return this.torres.get(2).getN_discos() == this.ndiscos;
	}
}
