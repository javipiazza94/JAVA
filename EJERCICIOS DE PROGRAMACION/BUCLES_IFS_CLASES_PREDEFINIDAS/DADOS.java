package BUCLES_IFS_CLASES_PREDEFINIDAS;
//2 dados de 6 caras. Si sale doble 6 es excelente, si sale uno solo es bueno, y si no sale ninguno suma ambos resultados
import java.util.Random;

public class DADOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Random dado = new Random(); //Declaramos el dado
		System.out.println("Toca cualquier tecla para lanzar el dado 1");
		int dado1= 1+dado.nextInt(6); //Variable de numero aleatorio, pero con valores enteros entre 1 y 6
		System.out.println("Ha salido "+dado1+""); //Declaramos el dado 1
		System.out.println("Toca cualquier tecla para lanzar el dado 2");
		int dado2= 1+dado.nextInt(6); //Variable de numero aleatorio, pero con valores enteros entre 1 y 6
		System.out.println("Ha salido "+dado2+"");//Declaramos el dado 1
		
		if (dado1==6 && dado2 ==6)
		{ System.out.println("Excellente"); //Si sale doble 6 es excelente
		} 
		else if (dado1==6 || dado2 ==6) //Si sale un 6 es bueno
		{System.out.println("Bueno");
		} 
		else
		{System.out.println("El resultado es "+(dado1+dado2)+""); //Hacemos la suma del resto
		} 
	}

}
