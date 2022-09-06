package ESCUELA;

public class Persona implements Cantante{
	
	protected String nombre;
	protected String dni;
	
	
	public Persona (){
		this.dni = " ";
		this.nombre = " ";
	}
	
	public Persona (String nombre, String dni){
		this.dni = dni;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	@Override
	public void cantar(){
		System.out.println("Ay Torito guapo, tiene botines y no va descalzo");
	}
	
}
