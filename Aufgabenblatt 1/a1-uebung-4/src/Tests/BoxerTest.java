package Tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class BoxerTest {

    @Test
    void equals() {
        Boxer a = new Boxer("Peter", "Maffay", 80);
        Boxer b = new Boxer("Peter", "Maffay", 80);
        Boxer c = new Boxer("Peter", "Maffay", 80);

        // Test reflexiv
        assertTrue(a.equals(a));

        // Test symmetrisch
        assertTrue(a.equals(b));
        assertTrue(b.equals(a));

        // Test transitiv
        assertTrue(a.equals(b));
        assertTrue(b.equals(c));
        assertTrue(a.equals(c));

        // Test null
        assertFalse(a.equals(null));
    }
}