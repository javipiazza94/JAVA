package HERENCIA;

public class BICICLETA extends VEHICULO{

	private int n_frenos;
	private int n_sillines;
	private int n_manillares;
	
	public BICICLETA (){
		super ();
		this.n_manillares = 0;
		this.n_frenos = 0;
		this.n_sillines = 0;
	}
	
	public BICICLETA (int n_asientos, int n_puertas, int n_ruedas,int n_frenos, int n_sillines, int  n_manillares){
		super (n_asientos, n_puertas, n_ruedas);
		this. n_manillares =  n_manillares;
		this.n_sillines = n_sillines;
		this.n_frenos = n_frenos;
		
	}
	
	@Override 
	public void pitar (){
		System.out.println("Me llaman cabra Watusi");
	}
	
	@Override
	public String toString (){
		return "Soy la bicicleta donde tu hermana pega su dildo y tengo "+ this.n_sillines + " asientos";
	}
}
