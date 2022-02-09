package ESCUELA;

import java.util.ArrayList;

public class Profesor extends Persona{

	private double sueldo;
	private ArrayList <asignatura> materia;
	
	public Profesor (){
		super();
		this.sueldo = 0;
		this.materia = new ArrayList <asignatura> ();
		
	}

	public Profesor (String dni, String nombre, double sueldo){
		super (dni, nombre);
		this.sueldo = sueldo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public ArrayList<asignatura> getMateria() {
		return materia;
	}

	public void setMateria(ArrayList<asignatura> materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		return "Profesor [sueldo=" + sueldo + ", materia=" + materia + "]";
	}

	
	
	
	
}
