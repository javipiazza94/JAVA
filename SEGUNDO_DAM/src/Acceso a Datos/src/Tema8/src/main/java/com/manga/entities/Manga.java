package com.manga.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@Entity
@EnableAutoConfiguration
@Table(name = "manga")
public class Manga implements Serializable {
	
	private static final int serialVersionUID = (int) -7486171335387433401L;
	@Id
	@Column(name = "id")

	private int id;
	@Column(name = "titulo")

	private String titulo;
	@Column(name = "autor")
	private String autor;
	@Column(name = "genero")
	private String genero;
	@Column(name = "anio_publicacion")
	private int anioPublicacion;
	@Column(name = "numero_volumenes")
	private int numeroVolumenes;

	public Manga(String string, String string2, int i, boolean b) {
	}

	public Manga(int id, String titulo, String autor, String genero, int anioPublicacion, int numeroVolumenes) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.anioPublicacion = anioPublicacion;
		this.numeroVolumenes = numeroVolumenes;
	}

	public Manga() {
		// TODO Auto-generated constructor stub
	}

	// getters y setters
	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	public int getNumeroVolumenes() {
		return numeroVolumenes;
	}

	public void setNumeroVolumenes(int numeroVolumenes) {
		this.numeroVolumenes = numeroVolumenes;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Manga manga = (Manga) o;
		return id == manga.id;
	}

	@Override
	public int hashCode() {
		return Long.hashCode(id);
	}

	@Override
	public String toString() {
		return "Manga [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", genero=" + genero
				+ ", anioPublicacion=" + anioPublicacion + ", numeroVolumenes=" + numeroVolumenes + "]";
	}

}