import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterManager;

public class PosterManagerTest {

    String film1 = "Матрица";
    String film2 = "Армагеддон";
    String film3 = "Криминальное чтиво";
    String film4 = "Сталкер";
    String film5 = "Аватар";
    String film6 = "Карты, деньги, 2 ствола";
    String film7 = "Бойцовский клуб";
    String film8 = "Хоббит";
    String film9 = "Остров проклятых";
    String film10 = "Дивергент";
    String film11 = "Голодные игры";
    String film12 = "Джуманджи";
    String film13 = "Криминальное чтиво";
    String film14 = "Тоторо";
    String film15 = "Ходячий замок";


    @Test
    public void ShouldShowPoster() {
        PosterManager manager = new PosterManager();

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);

        String[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldShowLastEqual() {
        PosterManager manager = new PosterManager(5);

        manager.addFilm(film11);
        manager.addFilm(film12);
        manager.addFilm(film13);
        manager.addFilm(film14);
        manager.addFilm(film15);

        String[] expected = {film15, film14, film13, film12, film11};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldShowLess() {
        PosterManager manager = new PosterManager(8);

        manager.addFilm(film10);
        manager.addFilm(film11);
        manager.addFilm(film12);

        String[] expected = {film12, film11, film10};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldShowMore() {
        PosterManager manager = new PosterManager();

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);

        String[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldShowMoreWithLimits() {
        PosterManager manager = new PosterManager(5);

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);

        String[] expected = {film11, film10, film9, film8, film7};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldShowZeroWithLimit() {
        PosterManager poster = new PosterManager(5);

        String[] expected = {};
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShowZeroWithZeroLimit() {
        PosterManager poster = new PosterManager(0);

        poster.addFilm(film1);
        poster.addFilm(film2);
        poster.addFilm(film3);

        String[] expected = {};
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowZeroWithoutLimit() {
        PosterManager poster = new PosterManager();

        String[] expected = {};
        String[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldShowLastТen() {
        PosterManager manager = new PosterManager();

        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);
        manager.addFilm(film12);

        String[] expected = {film12, film11, film10, film9, film8, film7, film6, film5, film4, film3};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
