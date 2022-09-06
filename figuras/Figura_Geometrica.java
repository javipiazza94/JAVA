package figuras;

public abstract class Figura_Geometrica {
	
	public abstract double CalcularArea();
	public abstract double CalcularPerimetro();
	
	public String comparaArea (Figura_Geometrica f){
		String res = "";
		if (this.CalcularArea()>f.CalcularArea()){
			res = "El area es mayor";
		}else{
			res="El area es menor";
		}
		return res;
	}
		
		public String comparaPerimetro (Figura_Geometrica f){
			String res = "";
			if (this.CalcularPerimetro()>f.CalcularPerimetro()){
				res = "El perimetro es mayor";
			}else{
				res="El perimtro es menor";
			}
			return res;
	}
}
