package com.main.dao;

import java.util.List;

import javax.persistence.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.manga.dao.MangaDao;
import com.manga.entities.Manga;

import org.springframework.*;
@Repository
@Transactional
public class MangaDaoImpl implements MangaDao {

    @Autowired
    private EntityManager entityManager;

    public void save(Manga manga) {
        entityManager.persist(manga);
    }

  
    public void update(Manga manga) {
        entityManager.merge(manga);
    }

  
    public void delete(Manga manga) {
        entityManager.remove(manga);
    }

  
    public Manga findById(long id) {
        return entityManager.find(Manga.class, id);
    }

  
    public List<Manga> findAll() {
        TypedQuery<Manga> query = entityManager.createQuery("SELECT m FROM Manga m", Manga.class);
        return query.getResultList();
    }


	public void updateNumeroVolumenes(Long idManga, int nuevoNumeroVolumenes) {
		// TODO Auto-generated method stub
		
	}
}
