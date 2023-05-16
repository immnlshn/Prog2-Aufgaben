import java.util.NoSuchElementException;

public class StapelMitArray<T> implements Stapel<T> {

    private final T[] localStorage;
    private int countOfElementsInStorage = 0;

    public StapelMitArray(int maxSize) {
        this.localStorage = (T[]) new Object[maxSize];
    }

    @Override
    public boolean isEmpty() {
        return countOfElementsInStorage == 0;
    }

    @Override
    public int size() {
        return countOfElementsInStorage;
    }

    @Override
    public int capacity() {
        return localStorage.length;
    }

    @Override
    public void insert(T t) throws IllegalStateException {
        if (countOfElementsInStorage == localStorage.length) {
            throw new IllegalStateException("Speicher voll!");
        }
        for (int i = 0; i < localStorage.length; i++) {
            if (localStorage[i] == null) {
                localStorage[i] = t;
                countOfElementsInStorage++;
                return;
            }
        }
    }

    @Override
    public void remove() throws NoSuchElementException {
        for (int i = localStorage.length - 1; i >= 0; i--) {
            if (localStorage[i] != null) {
                localStorage[i] = null;
                countOfElementsInStorage--;
                return;
            }
        }
        throw new NoSuchElementException("Schlange leer!");
    }

    @Override
    public T top() throws NoSuchElementException {
        for (int i = localStorage.length - 1; i >= 0; i--) {
            if (localStorage[i] != null) {
                return localStorage[i];
            }
        }
        throw new NoSuchElementException();
    }
}
