package CLASES;

import java.util.*;

public class LINEA {
	//HACEMOS UNA CLASE LINEA CON DOS OBJETOS DE LA CLASE PUNTO.
	//METODOS: DESPLAZAR LA LINEA A IZQDA, DECHA, ARRIBA Y ABAJO
	
	
	//ATRIBUTOS
	private double x, x1, x2, y, y1, y2;
	private PUNTO P1 = new PUNTO ();
	private PUNTO P2 = new PUNTO ();
	
	//CONSTRUCTOR
	public LINEA(){
		this.P1 = new PUNTO ();
		this.P2 = new PUNTO ();
	}
	public LINEA (PUNTO P1, PUNTO P2){
		this.P1 = P1;
		this.P2 = P2;
	}
	public LINEA (double x1, double y1, double x2, double y2){
		this.P1= new PUNTO (x1, y2);
		this.P2= new PUNTO (x2, y2);
		
	}
	public LINEA (double x, double y){
		this.P1= new PUNTO (0,0);
		this.P2= new PUNTO (x, y);
	}
	
	//SETTERS Y GETTERS
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getX1() {
		return x1;
	}
	public void setX1(double x1) {
		this.x1 = x1;
	}
	public double getX2() {
		return x2;
	}
	public void setX2(double x2) {
		this.x2 = x2;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getY1() {
		return y1;
	}
	public void setY1(double y1) {
		this.y1 = y1;
	}
	public double getY2() {
		return y2;
	}
	public void setY2(double y2) {
		this.y2 = y2;
	}
	public PUNTO getP1() {
		return P1;
	}
	public void setP1(PUNTO p1) {
		P1 = p1;
	}
	public PUNTO getP2() {
		return P2;
	}
	public void setP2(PUNTO p2) {
		P2 = p2;
	}
	
	
	//DEFINIMOS TO STRING
		@Override
		public String toString() {
			return "LA LINEA ES [P1=" + P1 + ", P2=" + P2+"]";
		}
		
	//METODOS
		public void mov_izquierda (double izqda){
			this.P1.MoverX(-izqda);
			this.P2.MoverX(-izqda);
		}
		public void mov_derecha (double dcha){
			this.P1.MoverX(dcha);
			this.P2.MoverX(dcha);
		}
		public void mov_arriba (double arriba){
			this.P1.MoverY(arriba);
			this.P2.MoverY(arriba);
		}
		public void mov_abajo (double abajo){
			this.P1.MoverY(-abajo);
			this.P2.MoverY(-abajo);
		}
}
