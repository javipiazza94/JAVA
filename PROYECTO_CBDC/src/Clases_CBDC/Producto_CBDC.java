package Clases_CBDC;

public class Producto_CBDC {

	    private double precio;
	    private double huellaCarbono;
	    private String nombre, empresa;    
	    
		public Producto_CBDC(double precio, double huellaCarbono, String nombre) {
			this.precio = precio;
			this.huellaCarbono = huellaCarbono;
			this.nombre = nombre;
		}
		
		public Producto_CBDC() {
			
		}
		public double getPrecio() {
			return precio;
		}
		public void setPrecio(double precio) {
			this.precio = precio;
		}
		public double getHuellaCarbono() {
			return huellaCarbono;
		}
		public void setHuellaCarbono(double huellaCarbono) {
			this.huellaCarbono = huellaCarbono;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getEmpresa() {
			return empresa;
		}
		public void setEmpresa(String empresa) {
			this.empresa = empresa;
		}
	    

	    
	}
