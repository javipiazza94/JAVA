package Ejercicios_Tema3;
public class Chrome_NO_PROCESSBUILDER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime r = Runtime.getRuntime();
		String ruta = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
		Process proceso = null;
		try {
			proceso = r.exec(ruta);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		int exitVal;
		try {
			exitVal = proceso.waitFor();
			System.out.println("Valor de Salida: " + exitVal);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
