package CLASES_PROPIAS;

public class CUBATA {
	//METODO LLENAR
	//METODO BEBER
	//METODO HIDALGO
	
	//DEFINIMOS LOS ATRIBUTOS (VALORES PRETEDETERMINADOS DE LA CLASE)
	private String tipovaso;
	private String condimentos;
	private String bebidaalcoholica;
	private int precio;
	private String refresco;
	private int hielos;
	private int cantidad;
	
	//DEFINIMOS AL CONSTRUCTOR (Se tiene que llamar igual que la clase)
			public CUBATA (String tipovaso, String condimentos, String bebidaalcoholica, int precio, String refresco, int hielos, int cantidad) {
				this.tipovaso= tipovaso;
				this.condimentos= condimentos;
				this.bebidaalcoholica=bebidaalcoholica;
				this.precio=precio;
				this.refresco=refresco;
				this.hielos=hielos;
				this.cantidad=cantidad;
		}
		
	//HACEMOS EL GET
			public String gettipovaso() {
				return tipovaso;
			}
			public String getcondimentos() {
				return condimentos;
			}
			public String getbebidaalcoholica() {
				return bebidaalcoholica;
			}
			public int getprecio(){
				return precio;
			}
			public String getrefrescoo() {
				return refresco;
			}
			public int gethielos() {
				return hielos;
			}
			public int getcantidad() {
				return cantidad;
			}
			
	//HACEMOS EL SET
			
			public void settipovaso(String tipovaso) {
				this.tipovaso = tipovaso;
			}
			public void setcondimentos(String condimentos) {
				this.condimentos = condimentos;
			}
			public void setbebidaalcoholica(String bebidaalcoholica) {
				this.bebidaalcoholica = bebidaalcoholica;
			}
			public void setprecio(int precio) {
				this.precio = precio;
			}
			public void setrefresco(String refresco) {
				this.refresco = refresco;
			}
			public void sethielos(int hielos) {
				this.hielos = hielos;
			}
			public void setcantidad(int cantidad) {
				this.hielos = cantidad;
			}
	
	//METODOS 
			public void llenar (){
				this.cantidad=this.cantidad;
			}
			public void beber (int trago){
				this.cantidad=this.cantidad - trago;
				System.out.println("Te queda en ml "+this.cantidad);
			}
			public void hidalgo (){
				this.cantidad = 0;
				System.out.println("Enhorabuena, eres un borracho de mierda");
			}
			
		@Override
		public String toString(){
			return "Tu cubata es de " + this.bebidaalcoholica + "con" +this.refresco+ "y tiene" +this.hielos+ "y estos" +this.condimentos;	
			}
		public void plus (CUBATA cubata){
			String bebidaalcoholica = this.bebidaalcoholica +" y " +cubata.bebidaalcoholica;
			String refresco = this.refresco+ "y" +cubata.refresco;
			int cantidad = this.cantidad + cubata.cantidad;
			
			CUBATA cubatita = new CUBATA (tipovaso, condimentos, bebidaalcoholica, precio, refresco, hielos, cantidad);
		}
			

}
