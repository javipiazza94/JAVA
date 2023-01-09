package EJERCICIOS_PILDORAS_INFORMATICA;

import java.util.Scanner;

public class Calcular_gasolina {
	
	private double precioReal;
	private double precioPagado;
	private double dineroAportado;
	
	public Calcular_gasolina (double precioReal, double dinero) {
		this.precioReal = precioReal;
		this.precioPagado = precioReal-0.20;
		this.dineroAportado = dinero;
	}
	
	public double CalcularCantidadSuministrada(){
		double cantidad = this.dineroAportado/this.precioPagado;
		return cantidad;
	}
	
	public double CalcularDineroPagadoReal(){
		double cantidad = CalcularCantidadSuministrada()*this.precioReal;
		return cantidad;
	}
	
	public double CalcularDescuento(){
		double cantidad = CalcularDineroPagadoReal()- this.dineroAportado;
		return cantidad;
	}
	
	public double IVA () {
		double IVA = this.dineroAportado - (this.dineroAportado*0.21);
		return IVA;
	}
		
	public double precioSinIVA() {
		double precio = this.dineroAportado - IVA();
		return precio;
	
		
	}
	public String Mensaje(){
		String res = "";
		res = " Has pagado "+ this.dineroAportado + " euros por una cantidad de combustible de " + CalcularCantidadSuministrada() +" litros a un precio de "+this.precioPagado+ " "
				+ "\n Has ahorrado "+CalcularDescuento()+" euros. "
						+ "\n Respostaje sujeto a bonificacion"
						+ " \n Art 16 del RDL 6/2022  "
						+ " \n 29 de marzo de 2022";
		return res;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el precio del combustible");
		double precio = sc.nextDouble();
		System.out.println("Introduce la cantidad a pagar");
		double cantidad = sc.nextDouble();
		
		Calcular_gasolina Repostaje = new Calcular_gasolina(precio, cantidad);
		Repostaje.CalcularCantidadSuministrada();
		Repostaje.CalcularDineroPagadoReal();
		Repostaje.CalcularDescuento();
		
		System.out.println(Repostaje.Mensaje());
	}

}
