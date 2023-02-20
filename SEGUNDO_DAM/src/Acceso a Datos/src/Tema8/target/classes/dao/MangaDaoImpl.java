package biblioteca_manga;

import java.util.List;
@Repository
@Transactional
public class MangaDaoImpl implements MangaDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    public void save(Manga manga) {
        entityManager.persist(manga);
    }

    @Override
    public void update(Manga manga) {
        entityManager.merge(manga);
    }

    @Override
    public void delete(Manga manga) {
        entityManager.remove(manga);
    }

    @Override
    public Manga findById(long id) {
        return entityManager.find(Manga.class, id);
    }

    @Override
    public List<Manga> findAll() {
        TypedQuery<Manga> query = entityManager.createQuery("SELECT m FROM Manga m", Manga.class);
        return query.getResultList();
    }
}
