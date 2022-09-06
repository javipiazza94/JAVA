package EXCEPCIONES;

public class error_divisor {
	
	public double division (double dividendo, double divisor) throws ArithmeticException{
		if (divisor!=0){
			return dividendo/divisor;
		}else {
			throw new ArithmeticException ("El divisor no puede ser 0");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
