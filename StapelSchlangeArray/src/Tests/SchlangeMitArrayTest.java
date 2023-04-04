import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SchlangeMitArrayTest {
    @Test
    void isEmpty() {
        assertFalse(() -> {
            SchlangeMitArray schlange = new SchlangeMitArray(10);
            schlange.insert(1);
            return schlange.isEmpty();
        });
        assertTrue(() -> {
            SchlangeMitArray schlange = new SchlangeMitArray(10);
            return schlange.isEmpty();
        });
    }

    @Test
    void size() {
        SchlangeMitArray schlange = new SchlangeMitArray(10);
        schlange.insert(1);
        schlange.insert(2);
        schlange.insert(3);
        assertEquals(3, schlange.size());
        schlange = new SchlangeMitArray(10);
        assertEquals(0, schlange.size());
    }

    @Test
    void capacity() {
        SchlangeMitArray schlange = new SchlangeMitArray(10);
        Assertions.assertEquals(10, schlange.capacity());
    }

    @Test
    void insert() {
        assertThrows(IllegalStateException.class, () -> {
            SchlangeMitArray schlange = new SchlangeMitArray(2);
            schlange.insert(1);
            schlange.insert(2);
            schlange.insert(3);
        });
        SchlangeMitArray schlange = new SchlangeMitArray(5);
        schlange.insert(1);
        Assertions.assertEquals(1, schlange.front());
    }

    @Test
    void remove() {
        assertThrows(NoSuchElementException.class, () -> {
            SchlangeMitArray schlange = new SchlangeMitArray(5);
            schlange.remove();
        });
        SchlangeMitArray schlange = new SchlangeMitArray(5);
        schlange.insert(1);
        schlange.insert(2);
        schlange.remove();
        assertEquals(1, schlange.size());
        assertEquals(2, schlange.front());

    }

    @Test
    void front() {
        assertThrows(NoSuchElementException.class, () -> {
            SchlangeMitArray schlange = new SchlangeMitArray(5);
            schlange.front();
        });
        SchlangeMitArray schlange = new SchlangeMitArray(5);
        schlange.insert(1);
        assertEquals(1, schlange.front());
    }
}