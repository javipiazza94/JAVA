package Ejercicios_basicos;

public class coche {
	
	private int cilindrada;
	private int largo;
	private int pesototal;
	private int ancho;
	private int ruedas;
	private String color;
	String marca;
	boolean asientos_cuero, climatizador;
	
	
	public coche () {
		this.pesototal = getPeso();
		this.largo = 3;
		this.ancho = 2;
		this.ruedas = 4;
		this.marca = "Peugeot";	
		this.asientos_cuero = false;
		this.climatizador = true;
	}

	public String getColor () {
		return "El color del coche es " +color;
	}
	public String getMarca() {
		return "La marca es "+marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void estableceColor (String colorcoche) {
		this.color = colorcoche;
	}

	public void setAsientos_cuero(String asientos_cuero) {
		if (asientos_cuero.equals("Si")) {
			this.asientos_cuero = true;
		}else {
			this.asientos_cuero=false;
		}
	}
	public String isAsientos_cuero() {
		if( asientos_cuero == true){
			return "Este coche tiene asientos de cuero";
		} else {
			return "Este coche no tiene asientos de cuero";
		}
	}

	public String isClimatizador() {
		if( climatizador == true){
			return "Este coche tiene climatizador";
		} else {
			return "Este coche tiene climatizador";
		}
	}

	public void setClimatizador(String climatizador) {
		if (climatizador.equalsIgnoreCase("Si")) {
			this.climatizador = true;
		}else {
			this.climatizador=false;
		}
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada_coche) {
		cilindrada = cilindrada_coche;
	}

	public int getPeso() {
		int peso_carroceria = 500;
		if (asientos_cuero == true) {
			peso_carroceria+=50;
		} if(climatizador == true) {
			peso_carroceria+=20;
		}
		return peso_carroceria;
	}

	
	public String DimeDatosGenerales () {
		return "Este coche es "+this.color+", su marca es "+this.marca+ ", tiene "+this.ruedas+" ruedas, "+this.pesototal+" kilos es su peso, "+largo+" metros es su largo y "+ancho+ " metros es su ancho";
	}
	

	public int Preciototal() {
		int precio_inicial = 5000;
		if (asientos_cuero == true) {
			precio_inicial+=500;
		} if(climatizador == true) {
			precio_inicial+=200;
		}
		return precio_inicial;
	}
}
