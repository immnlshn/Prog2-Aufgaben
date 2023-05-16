import java.util.NoSuchElementException;

public interface Stapel extends Puffer {

    /* Letztes Element wird zurückgegeben. Kein Element => NoSuchElementException */
    Integer top() throws NoSuchElementException;

}
