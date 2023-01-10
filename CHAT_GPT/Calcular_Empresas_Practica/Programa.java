package Calcular_Empresas_Practica;

import java.util.ArrayList;
			  

		public class Programa {
			  public static void main(String[] args) {
			   
			    // Crea una lista de empresas y becarios
			    Empresa empresa1 = new Empresa("Accenture", 3);
			    Empresa empresa2 = new Empresa("Deloitte", 3);
			    Empresa empresa3 = new Empresa("Job Impulse", 2);
			    Empresa empresa4 = new Empresa("ATSistemas", 3);
			    Becario becario1 = new Becario("Edu", 8.5);
			    Becario becario2 = new Becario("Domin", 7.0);
			    Becario becario3 = new Becario("Ivan", 9.0);
			    Becario becario4 = new Becario("Piazza", 7.5);
			    Becario becario5 = new Becario("Josemi", 8.0);
			    
			    ArrayList<Empresa> empresas = new ArrayList<>();
			    ArrayList<Becario> becarios = new ArrayList<>();

			    // Añade las empresas y los becarios a las listas
			    empresas.add(empresa1);
			    empresas.add(empresa2);
			    empresas.add(empresa3);
			    empresas.add(empresa4);
			    becarios.add(becario1);
			    becarios.add(becario2);
			    becarios.add(becario3);
			    becarios.add(becario4);
			    becarios.add(becario5);

			    // Añade las preferencias de los becarios
			    becario1.añadirPreferencia(empresa1);
			    becario1.añadirPreferencia(empresa3);
			    becario1.añadirPreferencia(empresa2);
			    becario1.añadirPreferencia(empresa4);
			    becario2.añadirPreferencia(empresa2);
			    becario2.añadirPreferencia(empresa1);
			    becario2.añadirPreferencia(empresa3);
			    becario2.añadirPreferencia(empresa4);
			    becario3.añadirPreferencia(empresa3);
			    becario3.añadirPreferencia(empresa2);
			    becario3.añadirPreferencia(empresa4);
			    becario3.añadirPreferencia(empresa1);
			    becario4.añadirPreferencia(empresa4);
			    becario4.añadirPreferencia(empresa2);
			    becario4.añadirPreferencia(empresa1);
			    becario4.añadirPreferencia(empresa3);
			    becario5.añadirPreferencia(empresa3);
			    becario5.añadirPreferencia(empresa4);
			    becario5.añadirPreferencia(empresa1);
			    becario5.añadirPreferencia(empresa2);

			    // Ordena la lista de becarios por nota de mayor a menor
			    becarios.sort((b1, b2) -> Double.compare(b2.nota, b1.nota));

			    // Asigna plazas a los becarios de acuerdo a sus preferencias y notas
			    for (Becario becario : becarios) {
			      for (Empresa empresa : becario.preferencias) {
			        empresa.seleccionarBecario(becario);
			        if (empresa.plazasDisponibles == 0) {
			          break;
			        }
			      }
			    }

			    // Imprime la lista de becarios seleccionados de cada empresa
			    for (Empresa empresa : empresas) {
			      System.out.println(empresa.nombre + ": ");
			      for (Becario becario : empresa.becariosSeleccionados) {
			        System.out.println("- " + becario.nombre);
			      }
			      System.out.println();
			    }
			  }
			}

