package EJERCICIOS_PILDORAS_INFORMATICA;

public class coche {
	
	private int cilindrada;
	private int peso;
	private int largo;
	private int ancho;
	private int ruedas;
	String marca;
	boolean asientos_cuero, climatizador;
	
	
	public coche () {
		peso = 700;
		largo = 3;
		ancho = 2;
		ruedas = 4;
		marca = "Peugeot";	
		asientos_cuero = false;
		climatizador = true;
	}

	public boolean isAsientos_cuero() {
		return asientos_cuero;
	}

	public void setAsientos_cuero(boolean asientos_cuero) {
		this.asientos_cuero = asientos_cuero;
	}

	public boolean isClimatizador() {
		return climatizador;
	}

	public void setClimatizador(boolean climatizador) {
		this.climatizador = climatizador;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada_coche) {
		cilindrada = cilindrada_coche;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	

}
