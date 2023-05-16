import java.util.NoSuchElementException;

public interface Stapel<T> extends Puffer<T> {

    /* Letztes Element wird zurückgegeben. Kein Element => NoSuchElementException */
    T top() throws NoSuchElementException;

}
