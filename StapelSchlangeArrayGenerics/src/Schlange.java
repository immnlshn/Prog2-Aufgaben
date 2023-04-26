import java.util.NoSuchElementException;

public interface Schlange<T> extends Puffer<T> {

    /* Erstes Element wird zurückgegeben. Kein Element => NoSuchElementException */
    T front() throws NoSuchElementException;

}
