package Ejercicios_basicos;

public class Impresora {
	private int usos_faltantes;

	  public Impresora(int usos_iniciales) {
	    usos_faltantes = usos_iniciales;
	  }

	  public void imprimir() {
	    if (usos_faltantes > 0) {
	      System.out.println("Imprimiendo...");
	      usos_faltantes--;
	    } else {
	      System.out.println("Lo siento, esta impresora ya no se puede usar.");
	    }
	  }
	  
	  public static void main(String[] args) {

		  Impresora HP = new Impresora(3);
		  HP.imprimir();
		  HP.imprimir();
		  HP.imprimir();
		  HP.imprimir();
		  
		  
	  }

	
}

