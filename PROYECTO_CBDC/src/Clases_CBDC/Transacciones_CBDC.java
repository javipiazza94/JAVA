package Clases_CBDC;

import java.util.Date;

public class Transacciones_CBDC {
	private String id;
	private Date fecha;
	private double importe;
	private Producto_CBDC producto;
	private Cuenta_bancaria_CBDC cuenta;

	public Transacciones_CBDC() {
	}

	public Transacciones_CBDC(String id, Date fecha, double importe, Producto_CBDC producto,
			Cuenta_bancaria_CBDC cuenta) {
		this.id = id;
		this.fecha = fecha;
		this.importe = importe;
		this.producto = producto;
		this.cuenta = cuenta;
	}
	public Transacciones_CBDC(String id, double importe, Producto_CBDC producto,
			Cuenta_bancaria_CBDC cuenta) {
		this.id = id;
		this.importe = importe;
		this.producto = producto;
		this.cuenta = cuenta;
	}
	
	public Transacciones_CBDC(String id, double importe,
			Cuenta_bancaria_CBDC cuenta) {
		this.id = id;
		this.importe = importe;
		this.cuenta = cuenta;
	}

	public String getId() {
		return id;
	}

	public Date getFecha() {
		return fecha;
	}

	public double getImporte() {
		return importe;
	}

	public Producto_CBDC getProducto() {
		return producto;
	}

	public void setProducto(Producto_CBDC producto) {
		this.producto = producto;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public Cuenta_bancaria_CBDC getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta_bancaria_CBDC cuenta) {
		this.cuenta = cuenta;
	}

	@Override
	public String toString() {
		return "Transacciones_CBDC [id=" + id + ", fecha=" + fecha + ", importe=" + importe + ", producto=" + producto
				+ ", cuenta=" + cuenta + "]";
	}
	
	public String toString2() {
	    return producto.getNombre() + " - euros" + importe + " - ID: " + id;
	}

}
