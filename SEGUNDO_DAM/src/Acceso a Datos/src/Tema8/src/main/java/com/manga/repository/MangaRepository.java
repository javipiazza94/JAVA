package com.manga.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.manga.entities.Manga;
@Repository
@Transactional
@EnableJpaRepositories("com.manga.repository")
public interface MangaRepository extends JpaRepository<Manga, Integer> {

	Manga findByTitulo(String titulo);

	List<Manga> findByGenero(String genero);

}
