package CLASES_PROPIAS;

public class BIBLIOTECA_LIBR {
	
	/*Metodos
	 * prestado
	 * comprobar NPaginas
	 * sobrecarga ToString para sacar info
	 */
	

	//DEFINIMOS LOS ATRIBUTOS (VALORES PRETEDETERMINADOS DE LA CLASE)
		private String ISBN;
		private String Autor;
		private String Editorial;
		private String Categoria;
		private String Titulo;
		private int NPaginas;
		private int Año;
		private boolean disponible = false;
		
		
	//DEFINIMOS AL CONSTRUCTOR (Se tiene que llamar igual que la clase)
		public BIBLIOTECA_LIBR (){
			
		}
		public BIBLIOTECA_LIBR (String ISBN,String Autor,String Editorial,String Categoria,String Titulo, int NPaginas,int Año, boolean disponible) {
			this.ISBN = ISBN;
			this.Autor= Autor;
			this.Editorial = Editorial;
			this.Categoria = Categoria;
			this.Titulo = Titulo;
			this.NPaginas = NPaginas;
			this.Año = Año;
			this.disponible = disponible;
		}
		
	//HACEMOS EL GET
				public String getISBN() {
					return ISBN;
				}
				public String getAutor() {
					return Autor;
				}
				public String getEditorial() {
					return Editorial;
				}
				public String getCategoria(){
					return Categoria;
				}
				public String Titulo() {
					return Titulo;
				}
				public int NPaginas() {
					return NPaginas;
				}
				public int Año() {
					return Año;
				}
				public boolean getdisponible() {
					return disponible;
				}	
				
	//HACEMOS EL SET
				public void setISBN(String ISBN) {
					this.ISBN = ISBN;
				}
				public void setAutor(String Autor) {
					this.Autor= Autor;
				}
				public void setEditorial(String Editorial) {
					this.Editorial = Editorial;
				}
				public void setCategoria(String Categoria) {
					this.Categoria = Categoria;
				}
				public void setTitulo(String Titulo) {
					this.Titulo = Titulo;
				}
				public void setAño(int Año) {
					this.Año = Año;
				}
				public void setNPaginas(int NPaginas) {
					this.NPaginas = NPaginas;	
				}
				public void setdisponible(boolean disponible) {
					this.disponible = disponible;	
				}
				
		//METODO PRESTAMOS
				
				public boolean IsDisponible(){
					if (this.disponible = true){
						System.out.println("Su libro est� disponible para el pr�stamo");
					}else {
						System.out.println("Su libro no est� disponible para el pr�stamo");
					}
					return this.disponible;
				}
				
		//METODO COMPROBAR NPAGINAS
			
				public void ComprobarNPaginas(BIBLIOTECA_LIBR libroA, BIBLIOTECA_LIBR libroB){
					if (libroA.NPaginas>libroB.NPaginas){
						System.out.println("El "+libroA+" tiene m�s paginas que el "+libroB+"");
					}else if (libroA.NPaginas==libroB.NPaginas){
							System.out.println("El "+libroA+" tiene las mismas paginas que el "+libroB+"");
					}else {
						System.out.println("El "+libroB+" tiene m�s paginas que el "+libroA+"");
					}
				}
		
		//METODO SOBRECARGAR	
		@Override
		public String toString(){
			return " Libro de: " + this.Autor + 
					"\n Publicado en: " +this.Año+ 
					"\n ISBN:" +this.ISBN+ 
					"\n Categoria: "+this.Categoria+
					"\n T�tulo: " +this.Titulo;	
			}
}
