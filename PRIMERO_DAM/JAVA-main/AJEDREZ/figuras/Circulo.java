package figuras;

public class Circulo extends Figura_Geometrica{

	private double radio;

	public Circulo(double radio) {
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	@Override
	public double CalcularPerimetro(){
		double perimetro;
		perimetro = 2*Math.PI*radio;
		return perimetro;
	}
	@Override
	public double CalcularArea(){
		double area;
		area = Math.PI*Math.pow(radio, 2);
		return area;
	}
}
