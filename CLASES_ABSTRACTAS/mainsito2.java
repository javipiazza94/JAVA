package CLASES_ABSTRACTAS;

public class mainsito2 {

	public static void main(String[] args) {
		
		Pila pilon = new Pila();
		pilon.push(6);
		pilon.push(5);
		System.out.println(pilon);
		pilon.pop();
		System.out.println(pilon);
	}

}
