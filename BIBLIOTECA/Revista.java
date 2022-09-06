package BIBLIOTECA;

public class Revista extends ELEMENTO_A_PRESTAR implements iPUBLICACION, iCONSULTABLE{

	public Revista(int codigo, int a�o_pub, String autor_pub, String titulo_pub) {
		super(codigo, a�o_pub, autor_pub, titulo_pub);
	}

	@Override
	public void retirar() {
		if (!this.isConsultado() && !this.isPropiedad()){
			this.consultado = true;
		}
	}

	@Override
	public void devolverConsulta() {
		if (this.isPropiedad()==true && this.isConsultado() == true){
			this.propiedad = false;
		} 
	}

	@Override
	public boolean estaconsultando() {
		return this.consultado;
	}
	

}
