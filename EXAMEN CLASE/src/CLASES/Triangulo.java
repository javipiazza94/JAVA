package CLASES;

public class Triangulo {

	//METODO PERIMETRO
	//METODO AREA
	//METODO TIPO (ISOSCELES, EQUILATERO, ESCLANO)
	
	//DEFINIMOS LOS ATRIBUTOS (VALORES PRETEDETERMINADOS DE LA CLASE)
	private boolean isosceles =false;
	private boolean equilatero=false;
	private boolean escaleno= false;
	private double lado1;
	private double lado2;
	private double lado3;
	private double base;
	private double altura;
	private double perimetro;
	private double area;
	
	//DEFINIMOS AL CONSTRUCTOR (Se tiene que llamar igual que la clase)
	public Triangulo (){
		
	}
	public Triangulo (double lado1, double lado2, double lado3) {
		this.isosceles = isosceles;
		this.equilatero= equilatero;
		this.escaleno = escaleno;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.altura = altura;
		this.base = base;
		this.perimetro = perimetro;
		this.area = area;
	}
	//HACEMOS EL GET
		public boolean getisosceles() {
			return isosceles;
		}
		public boolean getequilatero() {
			return equilatero;
		}
		public boolean getescaleno() {
			return escaleno;
		}
		public double getlado11(){
			return lado1;
		}
		public double getlado12() {
			return lado2;
		}
		public double getlado13() {
			return lado3;
		}
		public double getaltura() {
			return altura;
		}
		public double getbase() {
			return base;
		}
		public double getperimetro() {
			return perimetro;
		}
		public double getarea() {
			return area;
		}
		
	//HACEMOS EL SET
		public void setisosceles(boolean isosceles) {
			this.isosceles = isosceles;
		}
		public void setequilatero(boolean equilatero) {
			this.equilatero= equilatero;
		}
		public void setescaleno(boolean escaleno) {
			this.escaleno = escaleno;
		}
		public void setlado1(double lado1) {
			this.lado1 = lado1;
		}
		public void setlado2(double lado2) {
			this.lado2 = lado2;
		}
		public void setlado3(double lado3) {
			this.lado3 = lado3;
		}
		public void setbase(double base) {
			this.base = base;
		}
		public void setaltura(double altura) {
			this.altura = altura;
		}
		public void setperimetro(double perimtetro) {
			this.perimetro = perimetro;
		}
		public void setarea(double area) {
			this.area = area;
		}
		
	//METODO TIPO DE TRIANGULO
		public boolean IsEquilatero(){
			if (lado1==lado2 && lado2 ==lado3){
				this.equilatero = true;
			}
			return this.equilatero;
		}
		public boolean IsEscaleno(){
			if (lado1!=lado2 && lado2 !=lado3 && lado1!=lado3){
				this.escaleno= true;
			}
			return this.escaleno;
		}
		public boolean IsIsosceles(){
			if ((lado1!=lado2 && lado2 ==lado3) || (lado1 ==lado2 && lado2!=lado3) || (lado1 != lado2 && lado1 == lado3)){
				this.isosceles= true;
			}
			return this.isosceles;
		}
	//METODO CALCULAR ALTURA
		public double altura (){
			if (this.equilatero){
				this.altura =(Math.sqrt(3)*lado1/2); 
			}
			if (this.escaleno){
				double S = (lado1+lado2+lado3)/2;
				this.altura = (double) Math.round((double)(2/lado1)*Math.sqrt(S*(S-lado2)*(S-lado3))*100)/100;
			}
			if (this.isosceles){
				this.altura=(Math.sqrt(Math.pow(lado1, 2)-(Math.pow(lado2, 2))/4));
			}
		
		return this.altura;
		}
		
	//METODO PERIMETRO
		public double perimetro(){
			this.perimetro = lado1+lado2+lado3;
			return this.perimetro;
		}
		
	//METODO AREA
		public double area(){
			this.area = (base*altura)/2;
			return this.area;
		}
	
}


