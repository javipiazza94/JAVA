package EJERCICIOS_BOOTCAMP;

public class COCHE {
	
	//ATRIBUTOS
	private int puertas;
	
	public COCHE(int n_puertas) {
		this.puertas = n_puertas;
	}
	public COCHE() {
	}
	
	//METODO
	public void aumentoPuertas () {
		this.puertas++;
	}

	//MAIN
	public static void main(String[] args) {
		
		COCHE Micoche = new COCHE(3);
		Micoche.aumentoPuertas();
		
		System.out.println(Micoche.puertas);
		
	}

}
