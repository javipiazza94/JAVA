import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class MangaTests {

	@Autowired
	private MangaRepository mangaRepository;

	@Test
	@Transactional
	public void testCreateManga() {
		Manga manga = new Manga("One Piece", "Eiichiro Oda", "Acción, Aventura", 1997, 90);
		mangaRepository.save(manga);
		List<Manga> mangas = mangaRepository.findAll();
		assertEquals(1, mangas.size());
		assertEquals("One Piece", mangas.get(0).getTitulo());
	}

	@Test
	@Transactional
	public void testUpdateManga() {
		Manga manga = new Manga("One Piece", "Eiichiro Oda", "Acción, Aventura", 1997, 90);
		mangaRepository.save(manga);
		manga.setTitulo("One Piece: The New Era");
		mangaRepository.save(manga);
		List<Manga> mangas = mangaRepository.findAll();
		assertEquals(1, mangas.size());
		assertEquals("One Piece: The New Era", mangas.get(0).getTitulo());
	}

	@Test
	@Transactional
	public void testDeleteManga() {
		Manga manga = new Manga("One Piece", "Eiichiro Oda", "Acción, Aventura", 1997, 90);
		mangaRepository.save(manga);
		mangaRepository.delete(manga);
		List<Manga> mangas = mangaRepository.findAll();
		assertEquals(0, mangas.size());
	}
	@Test
    @Transactional
    public void deleteMangaTest() {
        Manga manga = new Manga();
        manga.setTitle("Bleach");
        manga.setAuthor("Tite Kubo");
        manga.setGenre("Action-Adventure");
        manga.setPublicationYear(2001);
        manga.setVolumeCount(74);

        mangaRepository.save(manga);

        mangaRepository.delete(manga);
	@Test
	public void testCreateManga() {
		// Crea un nuevo manga
		Manga manga = new Manga("Titulo de prueba", "Autor de prueba", "Genero de prueba", 2000, 3);
		mangaRepository.save(manga);

		// Comprueba que el manga se ha guardado correctamente
		Manga savedManga = mangaRepository.findById(manga.getId());
		assertNotNull(savedManga);
		assertEquals("Titulo de prueba", savedManga.getTitulo());
		assertEquals("Autor de prueba", savedManga.getAutor());
		assertEquals("Genero de prueba", savedManga.getGenero());
		assertEquals(2000, savedManga.getAnioPublicacion());
		assertEquals(3, savedManga.getNumeroVolumenes());
	}
	public void testReadManga(){
	    //Arrange
	    Manga manga = new Manga("One Piece", "Eiichiro Oda", "Acción", 1997, 100);
	    mangaRepository.save(manga);
	    //Act
	    Manga result = mangaRepository.findById(manga.getId()).get();
	    //Assert
	    assertEquals(manga.getTitulo(), result.getTitulo());
	    assertEquals(manga.getAutor(), result.getAutor());
	    assertEquals(manga.getGenero(), result.getGenero());
	    assertEquals(manga.getAnioPublicacion(), result.getAnioPublicacion());
	    assertEquals(manga.getNumeroVolumenes(), result.getNumeroVolumenes());
	}

	@Test
	public void testUpdateManga(){
	    //Arrange
	    Manga manga = new Manga("One Piece", "Eiichiro Oda", "Acción", 1997, 100);
	    mangaRepository.save(manga);
	    //Act
	    manga.setTitulo("One Piece: Renewal");
	    mangaRepository.save(manga);
	    Manga result = mangaRepository.findById(manga.getId()).get();
	    //Assert
	    assertEquals("One Piece: Renewal", result.getTitulo());
	}

	@Test
	public void testDeleteManga(){
	    //Arrange
	    Manga manga = new Manga("One Piece", "Eiichiro Oda", "Acción", 1997, 100);
	    mangaRepository.save(manga);
	    //Act
	    mangaRepository.delete(manga);
	    //Assert
	    assertFalse(mangaRepository.findById(manga.getId()).isPresent());
	}
	
	public void testReadManga(){
	    //Arrange
	    Manga manga = new Manga("One Piece", "Eiichiro Oda", "Acción", 1997, 100);
	    mangaRepository.save(manga);
	    //Act
	    Manga result = mangaRepository.findById(manga.getId()).get();
	    //Assert
	    assertEquals(manga.getTitulo(), result.getTitulo());
	    assertEquals(manga.getAutor(), result.getAutor());
	    assertEquals(manga.getGenero(), result.getGenero());
	    assertEquals(manga.getAnioPublicacion(), result.getAnioPublicacion());
	    assertEquals(manga.getNumeroVolumenes(), result.getNumeroVolumenes());
	}

	@Test
	public void testUpdateManga(){
	    //Arrange
	    Manga manga = new Manga("One Piece", "Eiichiro Oda", "Acción", 1997, 100);
	    mangaRepository.save(manga);
	    //Act
	    manga.setTitulo("One Piece: Renewal");
	    mangaRepository.save(manga);
	    Manga result = mangaRepository.findById(manga.getId()).get();
	    //Assert
	    assertEquals("One Piece: Renewal", result.getTitulo());
	}

	@Test
	public void testDeleteManga(){
	    //Arrange
	    Manga manga = new Manga("One Piece", "Eiichiro Oda", "Acción", 1997, 100);
	    mangaRepository.save(manga);
	    //Act
	    mangaRepository.delete(manga);
	    //Assert
	    assertFalse(mangaRepository.findById(manga.getId()).isPresent());
	}
	
	
	public void testReadManga(){
	    //Arrange
	    Manga manga = new Manga("One Piece", "Eiichiro Oda", "Acción", 1997, 100);
	    mangaRepository.save(manga);
	    //Act
	    Manga result = mangaRepository.findById(manga.getId()).get();
	    //Assert
	    assertEquals(manga.getTitulo(), result.getTitulo());
	    assertEquals(manga.getAutor(), result.getAutor());
	    assertEquals(manga.getGenero(), result.getGenero());
	    assertEquals(manga.getAnioPublicacion(), result.getAnioPublicacion());
	    assertEquals(manga.getNumeroVolumenes(), result.getNumeroVolumenes());
	}

	@Test
	public void testUpdateManga(){
	    //Arrange
	    Manga manga = new Manga("One Piece", "Eiichiro Oda", "Acción", 1997, 100);
	    mangaRepository.save(manga);
	    //Act
	    manga.setTitulo("One Piece: Renewal");
	    mangaRepository.save(manga);
	    Manga result = mangaRepository.findById(manga.getId()).get();
	    //Assert
	    assertEquals("One Piece: Renewal", result.getTitulo());
	}

	@Test
	public void testDeleteManga(){
	    //Arrange
	    Manga manga = new Manga("One Piece", "Eiichiro Oda", "Acción", 1997, 100);
	    mangaRepository.save(manga);
	    //Act
	    mangaRepository.delete(manga);
	    //Assert
	    assertFalse(mangaRepository.findById(manga.getId()).isPresent());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}