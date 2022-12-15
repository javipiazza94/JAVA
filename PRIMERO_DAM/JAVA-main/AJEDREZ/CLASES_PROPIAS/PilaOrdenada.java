package CLASES_PROPIAS;

import java.util.*;

public class PilaOrdenada {
	
	//ATRIBUTOS
	private ArrayList <Disco> discos;
	private int n_discos;
	
	//CONSTRUCTOR
	public PilaOrdenada(){
		this.n_discos = 0;
		discos = new ArrayList <Disco>();
	}
	
	//GETTERS Y SETTERS
	public ArrayList<Disco> getDiscos() {
		return discos;
	}


	public int getN_discos() {
		return n_discos;
	}

	
	//METODOS
	@Override
	public String toString(){
		String resultado = "";
		
		for (int i =0 ; i<this.n_discos; i++){
			resultado+= this.discos.get(i).toString() + '\n';
		}
		return resultado;
	}
	
	public boolean meter_disco (Disco disco){
		boolean respuesta = false;
		if (this.n_discos!=0){
			if (this.discos.get(0).getTamaño()>disco.getTamaño()){
			respuesta = true;
			this.discos.add(0, disco);
			this.n_discos++;
		}
		}else {
			respuesta = true;
			this.discos.add(0, disco);
			this.n_discos++;
		}
		return respuesta;
	}
	
	public Disco sacar_disco (){
		Disco aux = this.discos.get(0);
		this.discos.remove(0);
		this.n_discos--;
		return aux;
	}
	
	public Disco cina (){
		return this.discos.get(0);
	}
	
	
	
}