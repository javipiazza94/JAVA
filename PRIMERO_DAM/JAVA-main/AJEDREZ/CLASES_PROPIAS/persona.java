package CLASES_PROPIAS;

	public class persona { //Definimos aqui la clase, sus atributos (caracteristicas) y sus metodos (funciones/acciones que hacen)
		
		//DEFINIMOS LOS ATRIBUTOS
		private String nombre;
		private String apellidos;
		private String DNI;
		private int edad;
		
		private int NBrazos = 2;
		private int NPiernas = 2;
		
		//DEFINIMOS AL CONSTRUCTOR (Se tiene que llamar igual que la clase)
		public persona (String nombre, String apellidos, String DNI, int edad) {
			this.nombre= nombre;
			this.apellidos= apellidos;
			this.DNI=DNI;
			this.edad=edad;
	}
		public persona (String nombre, String apellidos, String DNI, int edad, int NBrazos, int NPiernas) {
			this.nombre= nombre;
			this.apellidos= apellidos;
			this.DNI=DNI;
			this.edad=edad;
			this.NBrazos = NBrazos;
			this.NPiernas = NPiernas;
}
		//DEFINIMOS LOS METODOS
		// 2 tipos de metodos: get y set. Uno da el valor y otro las modifica
		//Pondremos que es void cuando no devuelve nada
		
		//HACEMOS EL GET
		public String getnombre() {
			return nombre;
		}
		public String getapellidos() {
			return apellidos;
		}
		public String getDNI() {
			return DNI;
		}
		public int getedad() {
			return edad;
		}
		
		//HACEMOS EL SET
		public void setnombre(String nombre) {
			this.nombre = nombre;
		}
		public void setapellidos(String apellidos) {
			this.apellidos = apellidos;
		}
		public void setDNI(String DNI) {
			this.DNI = DNI;
		}
		public void setedad(int edad) {
			this.edad = edad;
		}
	}
