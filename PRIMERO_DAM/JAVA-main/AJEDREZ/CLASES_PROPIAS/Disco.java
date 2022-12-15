package CLASES_PROPIAS;

public class Disco {
	
	//ATRIBUTOS
	
	private int tamaño;
	
	//CONSTRUCTOR 
	public Disco (){
		this.tamaño=0;
	}

	public Disco (int tamaño){
		this.tamaño=tamaño;
	}
	//GETTERS Y SETTERS

	public int getTamaño() {
		return tamaño;
	}

	
	//METODOS
	@Override
	public String toString(){
		String resultado = "";
		for (int i =0; i<this.tamaño; i++){
			resultado +="*";
		}
		return resultado;
	}
	
}