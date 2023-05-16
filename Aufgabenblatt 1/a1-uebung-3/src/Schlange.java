import java.util.NoSuchElementException;

public interface Schlange extends Puffer {

    /* Erstes Element wird zurückgegeben. Kein Element => NoSuchElementException */
    Integer front() throws NoSuchElementException;

}
