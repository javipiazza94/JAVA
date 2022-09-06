package EXCEPCIONES;


public class TemperaturaBajaException extends Exception {
	
	private int temperatura;
	public TemperaturaBajaException (int temperatura){
		this.temperatura = temperatura;
		try {
			this.comprobarTemperatura();
		} catch (TemperaturaBajaException e) {
			System.out.println(e);
		}
	}
	
	public TemperaturaBajaException(String mensaje) {
		super(mensaje);
	}

	public void comprobarTemperatura() throws TemperaturaBajaException{
		if (this.temperatura<0){
			throw new TemperaturaBajaException ("Nos vamos a congelar");
		}
		}
	
	public static void main(String[] args) {
		TemperaturaBajaException temp = new TemperaturaBajaException(-23);
		
		System.out.println(temp);
		
}
	
}
	
	
	


