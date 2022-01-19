package CLASES;

public class CARTA {
	
	//ATRIBUTO
	private int palo; 
	private int numero;
	private int valor;
	private int figura;
	
	//CONSTRUCTOR
	public CARTA (){
		
	}
	
	public CARTA (int palo,int numero, int figura){
		this.palo = palo;
		this.numero = numero;
		this.valor = Generar_valor();
		this.figura = figura;
	}

	//SETTERS Y GETTERS
	public int getPalo() {
		return palo;
	}

	public void setPalo(int palo) {
		this.palo = palo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	//METODO 
	public String ConvertirAPalo (){
		String palo = "";
		if (this.palo == 1){
			palo = "CORAZONES";
		}
		if (this.palo == 2){
			palo = "TRÉBOLES";
		}
		if (this.palo == 3){
			palo = "ROMBOS";
		}
		if (this.palo == 4){
			palo = "PICAS";
		}
		return palo;
	}
		
	public int Generar_valor(){
		
		if (this.numero == 13){
			valor = 10;
		}
		if (this.numero == 12){
			valor = 10;
		}
		if (this.numero == 11){
			valor = 10;
		}
		return valor;
	}
	public String ConvertirAFigura (){
		String figura = "";
		if (this.figura == 11){
			figura = "SOTA";
		}
		if (this.figura == 12){
			figura = "REINA";
		}
		if (this.figura == 13){
			figura = "REY";
		}
		return figura;
	}
	
	
	@Override
	public String toString() {
		return "La carta es  ["+this.numero+" de palo "+ConvertirAPalo()+" y de valor "+this.valor+" y su figura es "+this.figura+"]";
	}
}
