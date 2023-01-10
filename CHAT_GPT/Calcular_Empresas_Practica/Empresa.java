package Calcular_Empresas_Practica;

import java.util.ArrayList;

public class Empresa {
	String nombre;
	int plazasDisponibles;
	ArrayList<Becario> becariosSeleccionados;

	public Empresa(String name, int plazas) {
		this.nombre = name;
		this.plazasDisponibles = plazas;
		this.becariosSeleccionados = new ArrayList<Becario>();
	}

	public void seleccionarBecario(Becario becario) {
		if (this.plazasDisponibles > 0) {
			becariosSeleccionados.add(becario);
			this.plazasDisponibles--;
		}
	}

	public void deseleccionarBecario(Becario becario) {
		becariosSeleccionados.remove(becario);
		plazasDisponibles++;
	}
}
