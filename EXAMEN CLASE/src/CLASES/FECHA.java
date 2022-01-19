package CLASES;

public class FECHA {
	// Dia, mes, a�o de atributos
	// Constructor
	// ToString
	// dd/mm/yyyy
	// metodo incrementar un dia la fecha
	// metodo decrementar un dia menos

	// DEFINIMOS ATRIBUTOS
	private int dia;
	private int mes;
	private int a�o;
	private boolean check = false;

	// DEFINIMOS CONSTRUCTORES
	public FECHA() {
	}

	public FECHA(int dia, int mes, int a�o) {
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
		if (mes >= 1 || mes <= 12) {
			check = true;
			if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
				if (dia >= 1 || dia <= 31) {
					check = true;
				}
			}
			if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				if (dia >= 1 || dia <= 30) {
					check = true;
				}
			}
			if (mes == 2) {
				if (dia >= 1 || dia <= 28) {
					check = true;
				}
			}
		}
	}

	// DEFINIMOS GETTERS Y SETTERS
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	// DEFINIMOS TO STRING
	@Override
	public String toString() {
		return "El d�a de hoy es [D�a=" + dia + ", mes=" + mes + " a�o= " + a�o + "]";
	}

	// METODO INCREMENTO
	public void incremento() {
		this.dia++;
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			if (dia > 31) {
				this.dia = 1;
				this.mes++;
				if (mes > 12) {
					this.mes = 1;
					this.a�o++;
				}
			}
		}
		if (mes == 4 || mes == 6 || mes == 8 || mes == 9 || mes == 11) {
			if (dia > 30) {
				this.dia = 1;
				this.mes++;
				
			}
		}
		if (mes == 2) {
			if (dia > 28) {
				this.dia = 1;
				this.mes++;
			}
		}
	}

	public void decremento(){
		this.dia--;
		if (mes == 5 || mes == 7 || mes == 10 || mes == 12) {
			if (dia < 1) {
				this.dia = 30;
				this.mes--;
			}
		}
		if (mes ==1 || mes ==2|| mes == 4 || mes == 6 || mes == 8 || mes == 9 || mes == 11) {
			if (dia < 1) {
				this.dia = 31;
				this.mes--;
				if (mes<1){
					this.mes = 12;
					this.a�o--;
				}	
			}
		}
		if (mes == 3) {
			if (dia < 1) {
				this.dia = 28;
				this.mes--;
			}
		}	
	}
	
}

