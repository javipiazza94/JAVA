package BIBLIOTECA;

public class Libro extends ELEMENTO_A_PRESTAR implements iPUBLICACION, iPRESTABLE, iCONSULTABLE{

	public Libro(int codigo, int año_pub, String autor_pub, String titulo_pub) {
		super(codigo, año_pub, autor_pub, titulo_pub);
		
	}


	@Override
	public void prestar() {
		if (this.isPropiedad()==false && this.isConsultado() == false){
			this.propiedad = true;
		} 
	}

	@Override
	public void devolver() {
		if (this.isPropiedad()==true && this.isConsultado() == true){
			this.propiedad = false;
		} 
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
			this.propiedad = false;}
		} 


	@Override
	public boolean estaconsultando() {
		return this.consultado;
	}

	@Override
	public boolean estaPrestado() {
		return this.propiedad;
	}

	
}
