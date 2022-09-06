package CLASES_ABSTRACTAS;

public abstract class Animales {
	private String reino;
	private String familia;
	
	
	public Animales(String reino, String familia) {
		super();
		this.reino = reino;
		this.familia = familia;
	}


	public String getReino() {
		return reino;
	}


	public void setReino(String reino) {
		this.reino = reino;
	}


	public String getFamilia() {
		return familia;
	}


	public void setFamilia(String familia) {
		this.familia = familia;
	}
	
	//METODOS
	public abstract void emitirSonido();
		
	public void morirse (){
		System.out.println("Me hice la morisión");
	}
	
	
	
	
	
}
