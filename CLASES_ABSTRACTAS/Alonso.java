package CLASES_ABSTRACTAS;

public class Alonso extends Animales{
	private int n_hijos;

	public Alonso(String reino, String familia, int n_hijos) {
		super(reino, familia);
		this.n_hijos = n_hijos;
	}
	
	@Override
	public void emitirSonido(){
		System.out.println("El mono Hamilton me la come por debajo del culo");
	}
	
}
