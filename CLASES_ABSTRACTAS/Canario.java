package CLASES_ABSTRACTAS;

public class Canario extends Animales implements Cantante{
	public String nombre;

	public Canario(String reino, String familia, String nombre) {
		super(reino, familia);
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public void cantar(){
		System.out.println("Ay Torito guapo, tiene botines y no va descalzo");
	}

	@Override
	public void emitirSonido() {
		System.out.println("Me gustan las mujeres, me gusta el pollo frito");
		
	}
	
}
