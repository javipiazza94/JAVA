package SISTEMAS_Y_PROCESOS;

import java.util.*;

public class Persona_ {

	// ATRIBUTOS
	protected String nombre;
	protected char sexo;
	protected int edad;
	protected double peso;
	protected double altura;
	protected String DNI;

	// COSNTRUCTORES
	public Persona_() {
	}

	public Persona_(String name, char sex, int age, double weight, double height) {
		this.sexo = sex; // (sex.toUpperCase()).charAt(0) --> Coge solo la primera letra
		this.edad = age;
		this.nombre = name;
		this.peso = weight;
		this.comprobarSexo(sex);
		this.altura = height;
		this.DNI = Generar_DNI();
	}

	public Persona_(String name, char sex, int age) {
		this.sexo = sex;
		this.edad = age;
		this.nombre = name;
		this.peso = 78;
		this.altura = 1.78;
		this.DNI = Generar_DNI();
		this.comprobarSexo(sex);
	}

	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	// METODOS
	public boolean EsMayorEdad() {
		if (this.edad > 18) {
			return true;
		} else {
			return false;
		}
	}

	public double IMC() {
		double IMC;
		IMC = this.peso / Math.pow(this.altura, 2);
		if (IMC < 20) {
			System.out.println("Infrapeso");
		} else if ((IMC > 20) && (IMC < 25)) {
			System.out.println("Esta en su peso");
		} else if (IMC > 25) {
			System.out.println("Tiene sobrepeso");
		}
		return IMC;
	}

	public boolean CompararDNI(Persona_ persona2) {
		if (this.DNI.equals(persona2.DNI)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sexo=" + comprobarSexo(sexo) + ", edad=" + edad + ", peso=" + peso
				+ ", altura=" + altura + ", DNI=" + DNI + " , IMC=" + IMC() + " , MAYOR DE EDAD=" + EsMayorEdad() + "]"; // METEMOS EN EL TOSTRING LOS RESULTADOS DE LOS ATRIBUTOS Y METODOS
	}

	public String Generar_DNI() {
		String Res = "";
		Random r = new Random();
		double DNI = 10000000 + Math.random() * 90000000;
		int numero = (int) DNI;
		char letra = (char) (r.nextInt(26) + 'a');
		this.DNI = String.valueOf(numero) + String.valueOf(letra); // METODO PARA CASTEAR A STRING
		Res = this.DNI;
		return Res;

	}

	public char comprobarSexo(char sex) { // METODO PARA COMPROBAR EL SEXO
		char sexoDefecto;
		if (sex != 'h') {
			sexoDefecto = 'm';
		} else {
			sexoDefecto = 'h';
		}
		return sexoDefecto;
	}
}