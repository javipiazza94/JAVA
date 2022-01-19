package CLASES;

public class FRACCION {
	//Coge una fraccion y haz operaciones con ella
	//Usa setters, getters, ToString y las operaciones de + - / *
	
	//DEFINIMOS ATRIBUTOS
	private int numerador;
	private int denominador;
	private double resultado;
	
	//DEFINIMOS CONSTRUCTOR
	public FRACCION (){
		
	}
	public FRACCION (int numerador, int denominador){
		this.numerador = numerador;
		this.denominador = denominador;
	}
	public FRACCION (int numerador, int denominador, double resultado){
		this.numerador = numerador;
		this.denominador = denominador;
		this.resultado = (double)this.numerador/this.denominador;
	}
	
	//DEFINIMOS GETTERS Y SETTERS
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	public int getNumerador() {
		return numerador;
	}
	public void setNumerador(int numerador) {
		this.numerador = numerador;
		this.resultado = (double) this.numerador/this.denominador;
	}
	public int getDenominador() {
		return denominador;
	}
	public void setDenominador(int denominador) {
		this.denominador = denominador;
		this.resultado = (double) this.numerador/this.denominador;
	}
	
	//DEFINIMOS TO STRING
		@Override
		public String toString() {
			return "La fraccion es  [Numerador=" + numerador + ", denominador=" + denominador + ", resultado =" +resultado+"]";
		}
	
	//DEFINIMOS LOS METODOS DE LAS OPERACIONES
		public void CalculaResult(){
			this.resultado = (double) this.numerador/this.denominador;
		}
		
		public FRACCION multiplicacion (FRACCION f2){
			FRACCION fresult = new FRACCION ();
			int den = (this.denominador * f2.denominador);
			int num = (this.numerador* f2.numerador);
			fresult.denominador = den;
			fresult.numerador = num;
			fresult.CalculaResult();
			return fresult;			
		}
		public FRACCION division (FRACCION f2){
			FRACCION fresult = new FRACCION ();
			int den = (this.denominador * f2.numerador);
			int num = (this.numerador* f2.denominador);
			fresult.denominador = den;
			fresult.numerador = num;
			fresult.CalculaResult();
			return fresult;
		}
		public FRACCION suma (FRACCION f2){
			FRACCION fresult = new FRACCION ();
			int den = (this.denominador * f2.denominador);
			int num = (this.numerador* f2.denominador) + (f2.numerador*this.denominador);
			fresult.denominador = den;
			fresult.numerador = num;
			fresult.CalculaResult();
			return fresult;
			
		}
		public FRACCION resta (FRACCION f2){
			FRACCION fresult = new FRACCION ();
			int den = (this.denominador * f2.numerador);
			int num = (this.numerador* f2.denominador) - (f2.numerador*this.denominador);
			fresult.denominador = den;
			fresult.numerador = num;
			fresult.CalculaResult();
			return fresult;
		}
	

}
