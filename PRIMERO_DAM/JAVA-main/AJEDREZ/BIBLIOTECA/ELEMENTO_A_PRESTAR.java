package BIBLIOTECA;

public abstract class ELEMENTO_A_PRESTAR {

	private int codigo;
	private int año;
	private String autor;
	private String titulo;
	protected boolean propiedad;
	protected boolean consultado;
	
	public ELEMENTO_A_PRESTAR (){
		
	}
	
	public ELEMENTO_A_PRESTAR(int codigo, int año_pub , String autor_pub, String titulo_pub) {
		this.codigo = codigo;
		this.autor = autor_pub;
		this.año = año_pub;
		this.titulo = titulo_pub;
		this.propiedad = false;
		this.consultado = false;
	}

	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getAño() {
		return año;
	}

	public String getAutor() {
		return autor;
	}
	public void setAño(int año) {
		this.año = año;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public boolean isPropiedad() {
		return propiedad;
	}

	public void setPropiedad(boolean propiedad) {
		this.propiedad = propiedad;
	}

	public boolean isConsultado() {
		return consultado;
	}

	public void setConsultado(boolean consultado) {
		this.consultado = consultado;
	}

	@Override
	public String toString() {
		return "ELEMENTO_A_PRESTAR [a�o=" + año + ", autor=" + autor + ", titulo=" + titulo + ", propiedad=" + propiedad
				+ ", consultado=" + consultado + "]";
	}
	
	
	
	
	
}
