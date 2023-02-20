package biblioteca_manga;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@Transactional


public class MangaDaoTest {

    @Autowired
    private MangaDao mangaDao;

    @Test
    public void testSave() {
        Manga manga = new Manga();
        manga.setTitulo("One Piece");
        manga.setAutor("Eiichiro Oda");
        manga.setGenero("Acción, aventura, comedia");
        manga.setAnioPublicacion(1997);
        manga.setNumeroVolumenes(96);
        
        mangaDao.save(manga);
        
        Manga result = mangaDao.findById(manga.getId());
        assertNotNull(result);
        assertEquals("One Piece", result.getTitulo());
    }

    @Test
    public void testUpdate() {
        Manga manga = mangaDao.findById(1L);
        manga.setTitulo("Naruto");
        mangaDao.update(manga);
        Manga result = mangaDao.findById(1L);
        assertNotNull(result);
        assertEquals("Naruto", result.getTitulo());
    }
    @Test
    public void testDelete() {
        Manga manga = mangaDao.findById(1L);
        mangaDao.delete(manga);
        
        Manga result = mangaDao.findById(1L);
        assertNull(result);
    }

    @Test
    public void testFindAll() {
        List<Manga> result = mangaDao.findAll();
        assertNotNull(result);
        assertTrue(result.size() > 0);
    }
    