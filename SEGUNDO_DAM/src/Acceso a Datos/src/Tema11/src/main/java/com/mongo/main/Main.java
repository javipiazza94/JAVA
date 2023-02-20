package com.mongo.main;

//Importar clases necesarias
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.MongoCollection;

import java.util.Scanner;

import org.bson.Document;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean salir = false;

		// Conectarse a MongoDB
		MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");

		// Seleccionar una base de datos
		MongoDatabase database = mongoClient.getDatabase("biblioteca_manga");

		// Seleccionar una colección
		MongoCollection<Document> collection = database.getCollection("manga");

		while (!salir) {

			System.out.println("¿Qué quieres hacer?\n(crear documento/salir/mostrar todo/actualizar/borrar)");
			String orden = sc.nextLine();
			switch (orden) {

			case "crear documento": { // Crear un documento

				System.out.println("Introduzca titulo");
				String titulo = sc.nextLine();
				System.out.println("Introduzca autor");
				String autor = sc.nextLine();
				System.out.println("Introduzca genero");
				String genero = sc.nextLine();
				System.out.println("Introduzca año de publicacion");
				String anio_publicacion = sc.nextLine();
				System.out.println("Introduzca numero de volumenes");
				String numero_volumenes = sc.nextLine();

				Document document = new Document("titulo", titulo).append("autor", autor).append("genero", genero)
						.append("anio_publicacion", anio_publicacion).append("numero_volumenes", numero_volumenes);

				// Insertar el documento en la colección
				collection.insertOne(document);
				System.out.println("Documento insertado exitosamente");
				break;
			}

			case "salir": {// salimos
				salir = true;
				System.out.println("Saliendo...");
				break;
			}
			case "mostrar todo": { // Consultar todos los documentos en la colección
				for (Document doc : collection.find()) {
					System.out.println(doc.toJson());
					break;
				}
			}
			case "actualizar": {
				// Actualizar un documento en la colección
				System.out.println("introduce el titulo del documento a actualizar");
				String titulus = sc.nextLine();

				System.out.println("Introduzca autor");
				String autor = sc.nextLine();
				System.out.println("Introduzca genero");
				String genero = sc.nextLine();
				System.out.println("Introduzca año de publicacion");
				String anio_publicacion = sc.nextLine();
				System.out.println("Introduzca numero de volumenes");
				String numero_volumenes = sc.nextLine();
				Document nuevo = new Document("titulo", titulus).append("autor", autor).append("genero", genero)
						.append("anio_publicacion", anio_publicacion).append("numero_volumenes", numero_volumenes);

				collection.updateOne(Filters.eq("titulo", titulus), nuevo);
				System.out.println("Documento actualizado exitosamente");
				break;
			}
			case "borrar": {
				System.out.println("introduce el titulo del documento a borrar");
				String titulus = sc.nextLine();
				collection.deleteOne(Filters.eq("titulo", titulus));
				System.out.println("Documento borrado exitosamente");
				break;
			}
			}
		}

	}
}