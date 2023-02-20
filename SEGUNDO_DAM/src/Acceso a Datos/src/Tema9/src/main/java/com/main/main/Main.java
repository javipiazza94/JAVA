package com.main.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.main.entities.Manga;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Crear una conexión a la base de datos
		// (crear una nueva base de datos si aún no existe):
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("$objectdb/db/p3.odb");
		EntityManager em = emf.createEntityManager();

		// Almacenar prueba:
		em.getTransaction().begin();
		ArrayList<Manga> total = new ArrayList<Manga>();
		Manga p;

		boolean salir = false;
		while (!salir) {
			if (!em.getTransaction().isActive()) {
				em.getTransaction().begin();
			}
			System.out.println(
					"¿Que consulta quieres hacer?\n \t salir\t crear manga\t select\t bestseller \t contar\t delete\t salir");
			String consulta = sc.nextLine();

			System.out.println("Entrando en la consulta...");
			switch (consulta) {

			case "crear manga": {

				while (true) {
					System.out.println("Ingrese ID de manga (numero entero):");
					int id = sc.nextInt();
					sc.nextLine();

					System.out.println("Ingrese titulo de manga (texto):");
					String titulo = sc.nextLine();

					System.out.println("Ingrese autor de manga (texto):");
					String autor = sc.nextLine();

					System.out.println("Ingrese genero de manga (texto):");
					String genero = sc.nextLine();

					System.out.println("Ingrese numero de volumenes de manga (numero entero):");
					int volumenes = sc.nextInt();
					sc.nextLine();

					System.out.println("Ingrese numero de año de publicacíon (numero entero):");
					int anio_publicacion = sc.nextInt();
					sc.nextLine();

					System.out.println("El manga es bestseller (s/n)?");
					String bestSellerStr = sc.nextLine();
					boolean bestseller;
					if (bestSellerStr.equals("s")) {
						bestseller = true;
					} else {
						bestseller = false;
					}

					try {
						// Realiza operaciones de persistencia aquí

						total.add(new Manga(id, titulo, autor, genero, volumenes, anio_publicacion, bestseller));
						em.persist(new Manga(id, titulo, autor, genero, volumenes, anio_publicacion, bestseller));
						em.getTransaction().commit();
					} catch (Exception ex) {
						em.getTransaction().rollback();
						// Maneja la excepción
					}

					// em.getTransaction().commit();

					System.out.println("Información actualizada: ");

					System.out.println("Crear otro manga (s/n)?");
					String continueStr = sc.nextLine();
					if (!continueStr.equals("s")) {
						break;
					}
				}

			}
				break;

			case "contar": {// Encuentra el número de objetos Manga en la base de datos:

				Query q = em.createQuery("SELECT COUNT(m) FROM Manga m");
				System.out.println("Total Mangas: " + q.getSingleResult());

			}
				break;
			case "select": { // Recuperar todos los objetos Manga de la base de datos:

				Query query = em.createQuery("SELECT m FROM Manga m", Manga.class);
				List<Manga> results = query.getResultList();
				for (Manga m : results) {
					System.out.println(m);
				}

			}
				break;

			case "bestseller": {// Encuentra el título de los mangas que son best seller:

				Query query = em.createQuery("SELECT m FROM Manga m WHERE m.bestseller = true", Manga.class);
				List<Manga> result = query.getResultList();
				System.out.println("Títulos de mangas best seller: \n");
				for (Manga m : result) {
					System.out.println(m);
				}
			}
				break;

			case "delete": {
				System.out.println("¿Cual es el id del manga a eliminar?");
				int ids = sc.nextInt();
				Query query = em.createQuery("SELECT m FROM Manga m WHERE m.id =" + ids + "", Manga.class);
				List<Manga> result = query.getResultList();
				Manga g = result.get(0);
				// Manga objetoAEliminar = em.find(Manga.class, ids);
				em.remove(g);
				em.getTransaction().commit();

			}break;

			case "salir": { // Cerrar la conexión a la base de datos:
				em.close();
				emf.close();
				salir = true;
			}
				break;
			}
		}

	}
}