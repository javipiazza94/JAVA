package CLASES;

public class PUNTO {
	//Definir la clase punto
	//Atributos X e y (coordenadas)
	//Constructor vacio inicializara x e y a 0, y el normal por parametro
	//getters y setters
	//desplazar x e y
	
	//ATRIBUTOS
	private double x;
	private double y;
	
	//CONSTRUCTOR
	public PUNTO (){
		this.x=0;
		this.y=0;
	}
	public PUNTO (double x, double y){
		this.x=x;
		this.y=y;
	}
	
	//GETTERS Y SETTERS
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	//METODOS DE DESPLAZAMIENTO
	public void MoverX(double x){
		this.x += x;
	}
	public void MoverY(double y){
		this.y += y;
	}
	public void MoverXYvez(double pro){
		this.x += pro;
		this.y += pro;	
	}
	public void MoverXY(double x, double y){
		this.x += x;
		this.y += y;
	}
	// DEFINIMOS TO STRING
		@Override
		public String toString() {
			return "La grafica es [X=" + x + ", y=" + y + "]";
		}
}
