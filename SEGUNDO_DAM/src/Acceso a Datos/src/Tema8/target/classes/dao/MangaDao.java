package biblioteca_manga;

import java.util.List;

public interface MangaDao {

    public void save(Manga manga);

    public void update(Manga manga);

    public void delete(Manga manga);

    public Manga findById(long id);

    public List<Manga> findAll();
}