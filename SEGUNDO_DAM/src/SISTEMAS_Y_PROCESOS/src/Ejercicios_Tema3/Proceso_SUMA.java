package Ejercicios_Tema3;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Proceso_SUMA {
	
class Clase_suma {

		int n1;
		int n2;

		Clase_suma() {

		};

		public int getN1() {
			return n1;
		}

		public void setN1(int n1) {
			this.n1 = n1;
		}

		public int getN2() {
			return n2;
		}

		public void setN2(int n2) {
			this.n2 = n2;
		}

		public static int Resultado(int n1, int n2) {
			int res = 0;
			for(int i = n1; i<=n2; i++) {
				res +=i;
			}
			System.out.println("El resultado es " + res);
			return res;
		}
}

	static int ejecucion_proceso(Class clase, int n1, int n2) throws IOException, InterruptedException {
		String JavaHome = System.getProperty("java.home");
		String JavaBin = JavaHome + File.separator + "bin" + File.separator + "java";
		String classpath = System.getProperty("java.class.path");
		String className = clase.getCanonicalName();
		ProcessBuilder Proceso = new ProcessBuilder(JavaBin, "-cp", classpath, className, String.valueOf(n1),
				String.valueOf(n2));
		Process pb = Proceso.start();
		pb.waitFor();
		System.out.println("El PID ES "+ pb.pid());
		return pb.exitValue();
	}

	public static void main(String[] args) throws IOException, InterruptedException {

		/*Programa  un  proceso  que  lance  un  método  Java  que  realice  la  suma  de  los 
		numeros enteros que hay entre un número y otro (pasados por comando). Una vez 
		haya devuelto el resultado, asegúrate de que el proceso se esté destruyendo. */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero");
		int n1 = sc.nextInt();
		System.out.println("Introduce el segundo numero");
		int n2 = sc.nextInt();

	            int estado = ejecucion_proceso(Clase_suma.class , n1, n2);
	     	    System.out.println(Clase_suma.Resultado(n1, n2));

	}
}
