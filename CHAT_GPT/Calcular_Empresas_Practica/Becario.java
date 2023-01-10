package Calcular_Empresas_Practica;

import java.util.ArrayList;

public class Becario {

		  String nombre;
		  double nota;
		  ArrayList<Empresa> preferencias;

		  public Becario(String nombre, double nota) {
			this.nombre = nombre;
			this.nota = nota;
			this.preferencias = new ArrayList<Empresa>();
		}

		public void añadirPreferencia(Empresa empresa) {
		    this.preferencias.add(empresa);
		  }

		  public void cambiarPreferencia(Empresa empresa, int posicion) {
		    preferencias.remove(empresa);
		    preferencias.add(posicion, empresa);
		  }
		}
