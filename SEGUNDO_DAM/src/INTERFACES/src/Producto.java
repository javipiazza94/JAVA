package INTERFACES.src;
import java.util.ArrayList;


public abstract class Producto {

	String id;
	double precio;
	int cantidad;
	ArrayList<String> compatible = new ArrayList <String>();

	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Producto(String id, double precio, int cantidad) {
		super();
		this.id = id;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public ArrayList<String> getCompatible() {
		return compatible;
	}

	public void setCompatible() {
		this.compatible.addAll(compatible);
	}

	public boolean esCompatible (Producto producto) {
		boolean res= false;
		for (String compatible : producto.getCompatible()) {
			if(compatible.contains(this.getId())) {
				System.out.println(producto.getId()+" y "+ this.getId()+" son compatibles entre si");
				res= true;
			}
			else {System.out.println(producto.getId()+" y "+ this.getId()+" no son compatibles entre si");
				res= false;}
		}
		return res;
	}
	
	public void addId(String id) {
	     this.compatible.add(id);
	}
	
	public Double PrecioTotal(int cantidad) {
		double res = 0;
		if(cantidad<=this.cantidad) {
			res = this.precio*cantidad;
		}else {
			res = 0;
		}
		return res;
		
	}
	
	@Override
	public String toString() {
		return " \n " + id + " " + precio + " " + cantidad + "  " + compatible	+ " "+PrecioTotal(cantidad);
	}
	
	public String toString2() {
		return " " + id + " " + precio + " " + cantidad +  "";
	}
	

}
