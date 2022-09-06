package CLASES_PROPIAS;

import java.util.*;

public class DNI {
	/*
	 * Atributos
	 * Constructor
	 * setters y getters
	 * calcular letra DNI
	 * */
	
	//ATRIBUTOS
	private String nombre;
	private String Apellido1;
	private String Apellido2;
	private int numero;
	private char letra;
	
	//CONSTRUCTOR
	public DNI (){
		
	}
	public DNI (String nombre, String Apellido1, String Apellido2, int numero){
		this.nombre = nombre;
		this.Apellido1= Apellido1;
		this.Apellido2 = Apellido2;
		this.numero = numero;
		this.letra = Generar_letra(numero);
	}
	

	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return Apellido1;
	}
	public void setApellido1(String apellido1) {
		Apellido1 = apellido1;
	}
	public String getApellido2() {
		return Apellido2;
	}
	public void setApellido2(String apellido2) {
		Apellido2 = apellido2;
	}
	public double getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
		this.letra = Generar_letra(numero);
	}
	public char getLetra() {
		return letra;
	}
	
	
	//DEFINIMOS TO STRING
			@Override
			public String toString() {
				return "El DNI es  [Nombre es=" + nombre + ", Apellidos=" + Apellido1 + "" +Apellido2+" numero= "+numero+  " letra ="+letra+"]";
			}
			
	//HACEMOS METODO GENERAR LETRA
			public  char Generar_letra (int num){
				double num_letra = this.numero%23;
				final String lista = "TRWAGMYFPDXBNJZSQVHLCKE";
				char letra = lista.charAt((int) num_letra);
				return this.letra;
			}
	
}
