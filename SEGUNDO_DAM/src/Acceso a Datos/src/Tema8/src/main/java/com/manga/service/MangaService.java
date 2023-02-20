package com.manga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.manga.dao.MangaDao;
import com.manga.entities.Manga;
import com.manga.repository.MangaRepository;

@Service
public class MangaService {

	@Autowired
	private MangaDao mangaDao;

	@Autowired
	private MangaRepository mangaRepository;

	@Autowired
	private PlatformTransactionManager transactionManager;

	public void crearMangaYActualizarVolumenes(Manga nuevoManga, Long idManga, int nuevoNumeroVolumenes)
			throws Exception {
		TransactionStatus status = transactionManager.getTransaction(new DefaultTransactionDefinition());
		try {
			mangaDao.save(nuevoManga);
			mangaDao.updateNumeroVolumenes(idManga, nuevoNumeroVolumenes);
			transactionManager.commit(status);
		} catch (Exception e) {
			transactionManager.rollback(status);
			throw e;
		}

	}

	public Manga buscarPorTitulo(String titulo) {
		return mangaRepository.findByTitulo(titulo);
	}

	public List<Manga> buscarPorGenero(String genero) {
		return mangaRepository.findByGenero(genero);
	}

}