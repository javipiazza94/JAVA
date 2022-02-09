package ESCUELA;

import java.util.*;

public class asignatura {
	
	private String nombre;
	private ArrayList <estudiante> lista;
	private Profesor profe;
	
	public asignatura (){
		this.nombre = "";
		this.profe = new Profesor();
		this.lista = new ArrayList <estudiante> ();
		
	}
	
	public asignatura (String nombre, ArrayList <estudiante> lista, Profesor profe){
		this.nombre = nombre;
		this.lista = lista;
		this.profe = profe;
	}

	public asignatura(String nombre ) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<estudiante> getLista() {
		return lista;
	}

	public void setLista(ArrayList<estudiante> lista) {
		this.lista = lista;
	}

	
	public boolean matriculado (estudiante listado){
		boolean matriculado = false;
		for (int i = 0; i<lista.size(); i++){
			if (lista.contains(listado)){
				lista.add(listado);
				listado.getMateria().add(this);
				matriculado = true;
			}
		}
		return matriculado;
	}
	
	public boolean baja (estudiante listado){
		boolean baja = false;
		for (int i = 0; i<lista.size(); i++){
			if (!lista.contains(listado)){
				lista.remove(listado);
				listado.getMateria().remove(this);
				baja = true;
			}
		}
		return baja;
	}
	
	
	
	@Override
	public String toString() {
		return "asignatura [nombre=" + nombre + ", lista=" + lista + ", profe=" + profe + ", getNombre()=" + getNombre()
				+ ", getLista()=" + getLista() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public void ListarAlumnos (){
		System.out.println(this.lista.toString());
	}

}
