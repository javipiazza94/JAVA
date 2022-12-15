package Ejercicios_Tema6;

public class Fumador extends Thread{
	
	private Estanco estanco;
	private int id;
	
	public Fumador(Estanco estanco, int id) {
		this.estanco = estanco;
		this.id = id;
	}
	
	public void run(){
        while(true){
        	try {
        	estanco.fumar(id);
        	Thread.sleep(500);
        	estanco.sinfumar(id);
        	Thread.sleep( 500);
        	} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
	
	}
   
}
