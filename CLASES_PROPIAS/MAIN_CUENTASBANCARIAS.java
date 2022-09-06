package CLASES_PROPIAS;

import java.util.Scanner;

public class MAIN_CUENTASBANCARIAS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		CUENTA_BANCARIA CuentaA = new CUENTA_BANCARIA ("Javi Piazza", 789456);
		CUENTA_BANCARIA CuentaB = new CUENTA_BANCARIA ("Ever Galarga", 69);
		
		System.out.println(CuentaA.toString());
		System.out.print("\n");
		System.out.println(CuentaB.toString());
		System.out.print("\n");
	}

}
