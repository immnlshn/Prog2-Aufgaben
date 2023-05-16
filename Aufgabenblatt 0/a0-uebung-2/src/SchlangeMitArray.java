import java.util.NoSuchElementException;

public class SchlangeMitArray implements Schlange {

    private final Integer[] localStorage;
    private int countOfElementsInStorage = 0;

    public SchlangeMitArray(int maxSize) {
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
        if (countOfElementsInStorage == capacity()) {
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
        if (localStorage[0] != null) {
            if (localStorage[1] != null) {
                for (int i = 1; i < localStorage.length; i++) {
                    localStorage[i - 1] = localStorage[i];
                }
            } else {
                localStorage[0] = null;
            }
            countOfElementsInStorage--;
            return;
        }
        throw new NoSuchElementException("Schlange leer!");
    }

    @Override
    public Integer front() throws NoSuchElementException {
        if(countOfElementsInStorage == 0)
            throw new NoSuchElementException("Schlange leer!");
        return localStorage[0];
    }
}
