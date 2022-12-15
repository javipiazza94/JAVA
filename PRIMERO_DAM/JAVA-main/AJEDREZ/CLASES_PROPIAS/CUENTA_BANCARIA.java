package CLASES_PROPIAS;


public class CUENTA_BANCARIA {
/*
 * Titular - obligatorio
 * Saldo - saldo inicial 0, no obligatorio
 * gets y sets
 * sobrecargar ToString
 * se deben poder hacer: ingresar, retirar y transferir a otra cuenta
 */
	
	//DEFINIMOS LOS ATRIBUTOS (VALORES PRETEDETERMINADOS DE LA CLASE)
			private String Titular;
			private double Saldo;
			
			
	//DEFINIMOS AL CONSTRUCTOR (Se tiene que llamar igual que la clase)
			public CUENTA_BANCARIA (){				
			}
			public  CUENTA_BANCARIA (String Titular, double Saldo) {				
				this.Titular = Titular;				
				this.Saldo= Saldo;
			}			
			public  CUENTA_BANCARIA (String Titular) {
				this.Titular = Titular;
			}
			
	 //HACEMOS EL GETTERS Y SETTERS
 			public String getTitular() {
				return Titular;
			}
			public void setTitular(String titular) {
				Titular = titular;
			}
			public double getSaldo(){
				if (Saldo>=0){
					System.out.println("Su saldo es positivo");
				}
				return Saldo;
			}
			public void setSaldo(double saldo) {
				Saldo = saldo;
			}
			
	 //DEFINIMOS TO STRING
			@Override
			public String toString() {
				return "CUENTA_BANCARIA [Titular=" + Titular + ", Saldo=" + Saldo + "]";
			}
			
	 //	INGRESOS
			public void ingresar(double cantidad){
				if (Saldo>=0){
				this.Saldo+=cantidad;
				System.out.println("La cantidad total es "+this.Saldo);
				}
					
			}
			
	  // RETIROS
			public void retirar(double cantidad){
				if (Saldo>=0){
				this.Saldo-=cantidad;
				System.out.println("La cantidad total es "+this.Saldo);
				}
							
			}
			
	  // TRANSFERENCIAS
			public void Transferencias(CUENTA_BANCARIA CuentaA, CUENTA_BANCARIA CuentaB, double cantidad){
				CuentaA.Saldo -=cantidad;
				CuentaB.Saldo +=cantidad;
				System.out.println("El resultado de la operacion es "+CuentaA.Saldo+" y" +CuentaB.Saldo+"");
			}
			
	
			
}
