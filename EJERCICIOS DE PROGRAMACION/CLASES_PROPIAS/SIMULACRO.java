package CLASES_PROPIAS;

public class SIMULACRO {
	/*
	 * Implemente la clase Persona con los atributos que considere necesarios y con las siguientes funcionalidades:
	Constructores y métodos de acceso a las propiedades.
	Un método para mostrar los valores por pantalla con un formato adecuado.
	calcularIMC: Devuelve el índice de masa corporal de la persona, que se calcula como peso(kg)/altura2(m).
	obtenerClasificaciónOMS: A partir de un valor de IMC, y en base a la tabla adjunta, debe devolver una cadena indicando la clasificación que le corresponde.
	esMayorDeEdad: Devuelve si la persona es mayor de edad.
	comprobarSexo: Debe comprobar si el sexo coincide con el que se pase como parámetro.
	  */
	
	//ATRIBUTOS
	private double IMC;
	private double numero;
	private char sexo;
	private int altura;
	private int peso;
	private int edad;
	private String nombre;
	private String Apellido1;
	private String Apellido2;
	private String OMS;
	private DNI Persona_DNI = new DNI ();
	
	//CONSTRUCTOR
	public SIMULACRO (){
		
	}
	public SIMULACRO (double IMC, char sexo, int altura, int peso, int edad, String nombre, String Apellido1, String Apellido2, double numero){
		this.IMC = IMC;
		this.altura= altura;
		this.sexo = sexo;
		this.peso = peso;
		this.edad = edad;
		this.nombre = nombre;
		this.Apellido1 = Apellido1;
		this.Apellido2 = Apellido2;
		this.Persona_DNI = generarDNI ();
	}
	
	//GETTERS Y SETTERS
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
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
	public DNI getPersona_DNI() {
		return Persona_DNI;
	}
	public void setPersona_DNI(DNI persona_DNI) {
		Persona_DNI = persona_DNI;
	}
	
	//METODOS
	
	public double calcularIMC (){
		int IMC = (peso/(altura*altura));
		return this.IMC;
		
	}
	public String obtenerClasificaciónOMS (){
		this.calcularIMC();
		if (IMC<18.5){
			OMS = "Tiene bajo peso";
		}else if ((IMC>18.5)&& (IMC<24.9)){
			OMS = "Tiene el peso adecuado";
		}else if ((IMC>25)&& (IMC<29.9)){
			OMS = "Tiene sobrepeso";
		}else if ((IMC>30)&& (IMC<34.9)){
			OMS = "Tiene obesidad de grado 1";
		}else if ((IMC>35)&& (IMC<39.9)){
			OMS = "Tiene obesidad de grado 2";
		}else if (IMC>40){
			OMS = "Tiene obesidad de grado 3";
		}
		return OMS;
	}
	
	public int esMayorDeEdad (){
		if (edad > 18){
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("Es menor de edad");
		}
		return edad;
	}
		
	public char ComprobarSexo (){
		if (sexo == 'H'){
			System.out.println("Es hombre");
		} else  if (sexo == 'M'){
			System.out.println("Es mujer");
		}
		return sexo;
	}
	public DNI generarDNI(){
		this.numero = (Math.random()*8);
		Persona_DNI = new DNI (nombre, Apellido1, Apellido2, numero, sexo, sexo);
		return Persona_DNI;
	}
	
	

}
