package BIBLIOTECA;

public class Main_Biblioteca {

	public static void main(String[] args) {
		
		Disco disquito = new Disco(344566, 1986, "Metallica", "Master Of Puppets");
		Libro librito = new Libro(787656, 1945, "Friedrich Hayek", "Camino a la Servidumbre");
		Revista revistita = new Revista(876578, 2006, "Elsa Pataky en bolas", "Interviu");
		
		disquito.setPropiedad(true);
		
		System.out.println(disquito.estaPrestado());
		
		System.out.println(librito.toString());
		
		revistita.setConsultado(true);
		
		System.out.println(revistita.estaconsultando());
	}

}
