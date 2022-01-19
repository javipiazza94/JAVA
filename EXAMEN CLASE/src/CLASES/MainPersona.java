package CLASES;

public class MainPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		persona Javier = new persona("Javier", "Puente Piazza", "7864520K", 27);
		System.out.println(Javier.getnombre());
		System.out.println(Javier.getapellidos());
		System.out.println(Javier.getDNI());
		System.out.println(Javier.getedad());
		
		Javier.setnombre("IlPotroPiazza");
		System.out.println(Javier.getnombre());
		
	}

}
