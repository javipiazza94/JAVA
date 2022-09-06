package EXCEPCIONES;

public class persona {

		private int edad;
		private String nombre;
		
		public persona(int edad, String nombre) {
			this.edad = edad;
			this.nombre = nombre;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			try{
				if (edad<0) {
					throw new Exception ("Tienes el Sindrome de Benjamin Button");
				} else {
					this.edad = edad;
					throw new Exception ("Eres una persona normal");
				}
			}catch (Exception error){
				System.out.println(error.toString());
			}
			
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		@Override
		public String toString() {
			return "persona [edad=" + edad + ", nombre=" + nombre + "]";
		}
		
		
		
	}


