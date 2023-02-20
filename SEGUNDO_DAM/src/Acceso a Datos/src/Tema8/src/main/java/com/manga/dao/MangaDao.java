package com.manga.dao;

import java.util.List;

import com.manga.entities.Manga;

public interface MangaDao {

    public void save(Manga manga);

    public void update(Manga manga);

    public void delete(Manga manga);

    public Manga findById(long id);

    public List<Manga> findAll();

	public void updateNumeroVolumenes(Long idManga, int nuevoNumeroVolumenes);
}