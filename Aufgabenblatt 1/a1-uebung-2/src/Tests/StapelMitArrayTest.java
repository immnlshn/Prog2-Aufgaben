
import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;

class StapelMitArrayTest {

    @Test
    void isEmpty() {
        assertFalse(() -> {
            StapelMitArray stapel = new StapelMitArray(3);
            stapel.insert(2);
            return stapel.isEmpty();
        });
        assertTrue(() -> {
            StapelMitArray stapel = new StapelMitArray(3);
            return stapel.isEmpty();
        });
    }

    @Test
    void size() {
        StapelMitArray stapel = new StapelMitArray(3);
        assertEquals(0, stapel.size());
        stapel.insert(1);
        assertEquals(1, stapel.size());
    }

    @Test
    void capacity() {
        StapelMitArray stapel = new StapelMitArray(3);
        assertEquals(3, stapel.capacity());
    }

    @Test
    void insert() {
        assertThrows(IllegalStateException.class, () -> {
            StapelMitArray stapel = new StapelMitArray(1);
            stapel.insert(1);
            stapel.insert(2);
        });
        StapelMitArray stapel = new StapelMitArray(5);
        stapel.insert(1);
        assertEquals(1, stapel.top());
    }

    @Test
    void remove() {
        assertThrows(NoSuchElementException.class, () -> {
            StapelMitArray stapel = new StapelMitArray(1);
            stapel.remove();
        });
        StapelMitArray stapel = new StapelMitArray(2);
        stapel.insert(1);
        stapel.insert(2);
        stapel.remove();
        assertEquals(1, stapel.size());
        assertEquals(1, stapel.top());

    }

    @Test
    void top() {
        assertThrows(NoSuchElementException.class, () -> {
            StapelMitArray stapel = new StapelMitArray(1);
            stapel.top();
        });
        StapelMitArray stapel = new StapelMitArray(1);
        stapel.insert(1);
        assertEquals(1, stapel.top());
    }


}