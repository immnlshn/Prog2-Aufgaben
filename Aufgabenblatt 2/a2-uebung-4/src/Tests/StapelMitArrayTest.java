import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;

class StapelMitArrayTest {
    @Test
    void isEmpty() {
        assertFalse(() -> {
            StapelMitArray<Integer> stapel = new StapelMitArray<Integer>(10);
            stapel.insert(1);
            StapelMitArray<String> stapel2 = new StapelMitArray<String>(10);
            stapel2.insert("Hallo");
            StapelMitArray<Double> stapel3 = new StapelMitArray<Double>(10);
            stapel3.insert(1.0);
            return stapel.isEmpty() && stapel2.isEmpty() && stapel3.isEmpty();
        });
        assertTrue(() -> {
            StapelMitArray<Integer> stapel = new StapelMitArray<Integer>(10);
            StapelMitArray<String> stapel2 = new StapelMitArray<String>(10);
            StapelMitArray<Double> stapel3 = new StapelMitArray<Double>(10);
            return stapel.isEmpty() && stapel2.isEmpty() && stapel3.isEmpty();
        });
    }

    @Test
    void size() {
        var stapel = new StapelMitArray<Integer>(10);
        stapel.insert(1);
        assertEquals(1, stapel.size());
        var stapel2 = new StapelMitArray<String>(10);
        stapel2.insert("Hallo");
        assertEquals(1, stapel2.size());
        var stapel3 = new StapelMitArray<Double>(10);
        stapel3.insert(1.0);
        assertEquals(1, stapel3.size());

        stapel = new StapelMitArray<Integer>(10);
        assertEquals(0, stapel.size());
        stapel2 = new StapelMitArray<String>(10);
        assertEquals(0, stapel2.size());
        stapel3 = new StapelMitArray<Double>(10);
        assertEquals(0, stapel3.size());

    }

    @Test
    void capacity() {
        StapelMitArray<Integer> stapel = new StapelMitArray<Integer>(10);
        assertEquals(10, stapel.capacity());
        StapelMitArray<String> stapel2 = new StapelMitArray<String>(10);
        assertEquals(10, stapel2.capacity());
        StapelMitArray<Double> stapel3 = new StapelMitArray<Double>(10);
        assertEquals(10, stapel3.capacity());
    }

    @Test
    void insert() {
        assertThrows(IllegalStateException.class, () -> {
            StapelMitArray<Integer> stapel = new StapelMitArray<Integer>(2);
            stapel.insert(1);
            stapel.insert(2);
            stapel.insert(3);
        });
        assertThrows(IllegalStateException.class, () -> {
            StapelMitArray<String> stapel = new StapelMitArray<String>(2);
            stapel.insert("Hallo");
            stapel.insert("Welt");
            stapel.insert("!");
        });
        assertThrows(IllegalStateException.class, () -> {
            StapelMitArray<Double> stapel = new StapelMitArray<Double>(2);
            stapel.insert(1.0);
            stapel.insert(2.0);
            stapel.insert(3.0);
        });
        StapelMitArray<Integer> stapel = new StapelMitArray<Integer>(5);
        stapel.insert(1);
        assertEquals(1, stapel.top());
        StapelMitArray<String> stapel2 = new StapelMitArray<String>(5);
        stapel2.insert("Hallo");
        assertEquals("Hallo", stapel2.top());
        StapelMitArray<Double> stapel3 = new StapelMitArray<Double>(5);
        stapel3.insert(1.0);
        assertEquals(1.0, stapel3.top());

    }

    @Test
    void remove() {
        assertThrows(NoSuchElementException.class, () -> {
            StapelMitArray<Integer> stapel = new StapelMitArray<Integer>(5);
            stapel.remove();
        });
        assertThrows(NoSuchElementException.class, () -> {
            StapelMitArray<String> stapel = new StapelMitArray<String>(5);
            stapel.remove();
        });
        assertThrows(NoSuchElementException.class, () -> {
            StapelMitArray<Double> stapel = new StapelMitArray<Double>(5);
            stapel.remove();
        });
        StapelMitArray<Integer> stapel = new StapelMitArray<Integer>(5);
        stapel.insert(1);
        stapel.insert(2);
        stapel.remove();
        assertEquals(1, stapel.size());
        assertEquals(2, stapel.top());
        StapelMitArray<String> stapel2 = new StapelMitArray<String>(5);
        stapel2.insert("Hallo");
        stapel2.insert("Welt");
        stapel2.remove();
        assertEquals(1, stapel2.size());
        assertEquals("Welt", stapel2.top());
        StapelMitArray<Double> stapel3 = new StapelMitArray<Double>(5);
        stapel3.insert(1.0);
        stapel3.insert(2.0);
        stapel3.remove();
        assertEquals(1, stapel3.size());
        assertEquals(2.0, stapel3.top());
    }

    @Test
    void top() {
        assertThrows(NoSuchElementException.class, () -> {
            StapelMitArray<Integer> stapel = new StapelMitArray<Integer>(5);
            stapel.top();
        });
        assertThrows(NoSuchElementException.class, () -> {
            StapelMitArray<String> stapel = new StapelMitArray<String>(5);
            stapel.top();
        });
        assertThrows(NoSuchElementException.class, () -> {
            StapelMitArray<Double> stapel = new StapelMitArray<Double>(5);
            stapel.top();
        });

        StapelMitArray<Integer> stapel = new StapelMitArray<Integer>(5);
        stapel.insert(1);
        assertEquals(1, stapel.top());

        StapelMitArray<String> stapel2 = new StapelMitArray<String>(5);
        stapel2.insert("Hallo");
        assertEquals("Hallo", stapel2.top());

        StapelMitArray<Double> stapel3 = new StapelMitArray<Double>(5);
        stapel3.insert(1.0);
        assertEquals(1.0, stapel3.top());
    }
}