package ESCUELA;

import java.util.*;

public class estudiante extends Persona{

	private double nota_media;
	private ArrayList <asignatura> materia;
	
	public estudiante (){
		super ();
		this.nota_media = 0;
		this.materia = new ArrayList <asignatura> ();
	}
	
	public estudiante (String dni, String nombre, ArrayList <asignatura> materia, double nota_media){
		super (dni, nombre);
		this.nota_media = nota_media;
		this.materia = materia;
	}
	
	
	public estudiante (String dni, String nombre,  double nota_media) {
		super (dni, nombre);
		this.nota_media = nota_media;
		this.materia = materia;
	}

	public ArrayList<asignatura> getMateria() {
		return materia;
	}

	public void setMateria(ArrayList<asignatura> materia) {
		this.materia = materia;
	}

	public double getNota_media() {
		return nota_media;
	}
	public void setNota_media(double nota_media) {
		this.nota_media = nota_media;
	}
	
	@Override
	public String toString() {
		return "estudiante [nota_media=" + nota_media + ", materia=" + materia + "]";
	}

	public void listarAsignaturas (){
		System.out.println(this.materia.toString());
	}
}
