package CLASES_PROPIAS;

public class Disco {
	
	//ATRIBUTOS
	
	private int tama�o;
	
	//CONSTRUCTOR 
	public Disco (){
		this.tama�o=0;
	}

	public Disco (int tama�o){
		this.tama�o=tama�o;
	}
	//GETTERS Y SETTERS

	public int getTama�o() {
		return tama�o;
	}

	
	//METODOS
	@Override
	public String toString(){
		String resultado = "";
		for (int i =0; i<this.tama�o; i++){
			resultado +="*";
		}
		return resultado;
	}
	
}