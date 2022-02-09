package Figuras;

public class Rectangulo extends Figura_Geometrica {
	private double base;
	private double altura;
	
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public double CalcularPerimetro(){
		double perimetro;
		perimetro = base*2 + altura*2;
		return perimetro;
	}
	@Override
	public double CalcularArea(){
		double area;
		area = base*altura;
		return area;
	}
}
