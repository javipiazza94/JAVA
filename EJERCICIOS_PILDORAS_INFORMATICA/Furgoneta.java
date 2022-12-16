package EJERCICIOS_PILDORAS_INFORMATICA;

public class Furgoneta extends coche { //Java no admite herencia multiple (2 clases o mas a la vez)
	
	private int capacidad_Carga;
	private int plazas_Extra;
	
	public Furgoneta(int plazasEx, int capacidad) {
		super(); //Llama al constructor de la clase padre (coche)
		this.capacidad_Carga = capacidad;
		this.plazas_Extra = plazasEx;
	}
	
	public String dameDatosFurgo() {
		return "La capacidad de carga es " +this.capacidad_Carga+ " y el numero de plazas extra es de "+this.plazas_Extra;
	}

}
