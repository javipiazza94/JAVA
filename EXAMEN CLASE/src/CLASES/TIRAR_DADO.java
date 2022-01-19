package CLASES;

public class TIRAR_DADO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dado tirar_dado = new Dado (20);
		System.out.println(Dado.getncaras());
		tirar_dado.tirar();
		System.out.println(Dado.getvalor());
	}

}
