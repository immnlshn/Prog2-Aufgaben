import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;

class SchlangeMitArrayTest {
    @Test
    void isEmpty() {
        assertFalse(() -> {
            SchlangeMitArray<Integer> schlange = new SchlangeMitArray<Integer>(10);
            schlange.insert(1);
            SchlangeMitArray<String> schlange2 = new SchlangeMitArray<String>(10);
            schlange2.insert("Hallo");
            SchlangeMitArray<Double> schlange3 = new SchlangeMitArray<Double>(10);
            schlange3.insert(1.0);
            return schlange.isEmpty() && schlange2.isEmpty() && schlange3.isEmpty();
        });
        assertTrue(() -> {
            SchlangeMitArray<Integer> schlange = new SchlangeMitArray<Integer>(10);
            SchlangeMitArray<String> schlange2 = new SchlangeMitArray<String>(10);
            SchlangeMitArray<Double> schlange3 = new SchlangeMitArray<Double>(10);
            return schlange.isEmpty() && schlange2.isEmpty() && schlange3.isEmpty();
        });
    }

    @Test
    void size() {
        var schlange = new SchlangeMitArray<Integer>(10);
        schlange.insert(1);
        assertEquals(1, schlange.size());
        var schlange2 = new SchlangeMitArray<String>(10);
        schlange2.insert("Hallo");
        assertEquals(1, schlange2.size());
        var schlange3 = new SchlangeMitArray<Double>(10);
        schlange3.insert(1.0);
        assertEquals(1, schlange3.size());

        schlange = new SchlangeMitArray<Integer>(10);
        assertEquals(0, schlange.size());
        schlange2 = new SchlangeMitArray<String>(10);
        assertEquals(0, schlange2.size());
        schlange3 = new SchlangeMitArray<Double>(10);
        assertEquals(0, schlange3.size());

    }

    @Test
    void capacity() {
        SchlangeMitArray<Integer> schlange = new SchlangeMitArray<Integer>(10);
        assertEquals(10, schlange.capacity());
        SchlangeMitArray<String> schlange2 = new SchlangeMitArray<String>(10);
        assertEquals(10, schlange2.capacity());
        SchlangeMitArray<Double> schlange3 = new SchlangeMitArray<Double>(10);
        assertEquals(10, schlange3.capacity());
    }

    @Test
    void insert() {
        assertThrows(IllegalStateException.class, () -> {
            SchlangeMitArray<Integer> schlange = new SchlangeMitArray<Integer>(2);
            schlange.insert(1);
            schlange.insert(2);
            schlange.insert(3);
        });
        assertThrows(IllegalStateException.class, () -> {
            SchlangeMitArray<String> schlange = new SchlangeMitArray<String>(2);
            schlange.insert("Hallo");
            schlange.insert("Welt");
            schlange.insert("!");
        });
        assertThrows(IllegalStateException.class, () -> {
            SchlangeMitArray<Double> schlange = new SchlangeMitArray<Double>(2);
            schlange.insert(1.0);
            schlange.insert(2.0);
            schlange.insert(3.0);
        });
        SchlangeMitArray<Integer> schlange = new SchlangeMitArray<Integer>(5);
        schlange.insert(1);
        assertEquals(1, schlange.front());
        SchlangeMitArray<String> schlange2 = new SchlangeMitArray<String>(5);
        schlange2.insert("Hallo");
        assertEquals("Hallo", schlange2.front());
        SchlangeMitArray<Double> schlange3 = new SchlangeMitArray<Double>(5);
        schlange3.insert(1.0);
        assertEquals(1.0, schlange3.front());

    }

    @Test
    void remove() {
        assertThrows(NoSuchElementException.class, () -> {
            SchlangeMitArray<Integer> schlange = new SchlangeMitArray<Integer>(5);
            schlange.remove();
        });
        assertThrows(NoSuchElementException.class, () -> {
            SchlangeMitArray<String> schlange = new SchlangeMitArray<String>(5);
            schlange.remove();
        });
        assertThrows(NoSuchElementException.class, () -> {
            SchlangeMitArray<Double> schlange = new SchlangeMitArray<Double>(5);
            schlange.remove();
        });
        SchlangeMitArray<Integer> schlange = new SchlangeMitArray<Integer>(5);
        schlange.insert(1);
        schlange.insert(2);
        schlange.remove();
        assertEquals(1, schlange.size());
        assertEquals(2, schlange.front());
        SchlangeMitArray<String> schlange2 = new SchlangeMitArray<String>(5);
        schlange2.insert("Hallo");
        schlange2.insert("Welt");
        schlange2.remove();
        assertEquals(1, schlange2.size());
        assertEquals("Welt", schlange2.front());
        SchlangeMitArray<Double> schlange3 = new SchlangeMitArray<Double>(5);
        schlange3.insert(1.0);
        schlange3.insert(2.0);
        schlange3.remove();
        assertEquals(1, schlange3.size());
        assertEquals(2.0, schlange3.front());
    }

    @Test
    void front() {
        assertThrows(NoSuchElementException.class, () -> {
            SchlangeMitArray<Integer> schlange = new SchlangeMitArray<Integer>(5);
            schlange.front();
        });
        assertThrows(NoSuchElementException.class, () -> {
            SchlangeMitArray<String> schlange = new SchlangeMitArray<String>(5);
            schlange.front();
        });
        assertThrows(NoSuchElementException.class, () -> {
            SchlangeMitArray<Double> schlange = new SchlangeMitArray<Double>(5);
            schlange.front();
        });

        SchlangeMitArray<Integer> schlange = new SchlangeMitArray<Integer>(5);
        schlange.insert(1);
        assertEquals(1, schlange.front());

        SchlangeMitArray<String> schlange2 = new SchlangeMitArray<String>(5);
        schlange2.insert("Hallo");
        assertEquals("Hallo", schlange2.front());

        SchlangeMitArray<Double> schlange3 = new SchlangeMitArray<Double>(5);
        schlange3.insert(1.0);
        assertEquals(1.0, schlange3.front());
    }
}