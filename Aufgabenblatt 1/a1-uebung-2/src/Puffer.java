import java.util.NoSuchElementException;

public interface Puffer {

    boolean isEmpty();

    /* Anzahl Elemente */
    int size();

    /* Größe des Speichers */
    int capacity();

    /* Fügt ein Element a hinzu. Speicher voll => IllegalStateException */
    void insert(int a) throws IllegalStateException;

    /* Entfernt ein Element. Element nicht gefunden => NoSuchElementException */
    void remove() throws NoSuchElementException;
}
