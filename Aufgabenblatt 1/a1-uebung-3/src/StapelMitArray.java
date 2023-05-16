import java.util.NoSuchElementException;

public class StapelMitArray implements Stapel {

    private final Integer[] localStorage;
    private int countOfElementsInStorage = 0;

    public StapelMitArray(int maxSize) {
        this.localStorage = new Integer[maxSize];
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
    public void insert(int a) throws IllegalStateException {
        if (countOfElementsInStorage == localStorage.length) {
            throw new IllegalStateException("Speicher voll!");
        }
        for (int i = 0; i < localStorage.length; i++) {
            if (localStorage[i] == null) {
                localStorage[i] = a;
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
    public Integer top() throws NoSuchElementException {
        for (int i = localStorage.length - 1; i >= 0; i--) {
            if (localStorage[i] != null) {
                return localStorage[i];
            }
        }
        throw new NoSuchElementException();
    }

    public void applyToAll(Funktion f){
        for (int i = 0; i < localStorage.length; i++) {
            if (localStorage[i] != null) {
                localStorage[i] = f.auswerten(localStorage[i]);
            }
        }
    }

}
