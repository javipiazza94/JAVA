package CLASES_PROPIAS;

public class Dado {
	//DEFINIMOS LOS ATRIBUTOS DE LA CLASE DADO
	private static int ncaras = 6;
	private static int valor;
	
	//DEFINIMOS EL CONSTRUCTOR (VALORES PRETEDETERMINADOS DE LA CLASE)
			public Dado (int ncaras) {
				this.ncaras= ncaras;
				this.valor= (int)(1+(Math.random()*ncaras));
			}
				
	//HACEMOS EL GET
				public static int getncaras() {
					return ncaras;
				}
				public static int getvalor() {
					return valor;
				}
				
	//HACEMOS EL SET
				public void setncaras(String nombre) {
					this.ncaras = ncaras;
				}
				public void setvalor(String apellidos) {
					this.valor = valor;
				}
	//HACEMOS EL METODO TIRAR
				public void tirar(){
					this.valor= (int)(1+(Math.random()*ncaras));
				}
				public int tirarvalor(){
					this.valor= (int)(1+(Math.random()*ncaras));
					return this.valor;
				}

}
