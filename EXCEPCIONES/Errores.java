package EXCEPCIONES;

public class Errores {
	
	public static void Array(){
		int array [] = {1,2,3,4,5,6,7,8,9,10};
	
		for (int i = 0; i<array.length; i++){
			System.out.println(array[i]);
		}
}
	
	public static void main(String[] args) {
		
		try{
			Array();
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("El error es: "+e);
		}

	}

}
