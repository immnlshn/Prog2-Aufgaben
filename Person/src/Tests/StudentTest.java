import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentTest {

    @Test
    void equals() {
        Student a = new Student("Thomas", "Bröse", 69420);
        Student b = new Student("Thomas", "Bröse", 69420);
        Student c = new Student("Thomas", "Bröse", 69420);

        // Test reflexiv
        assertTrue(a.equals(a));

        // Test symmetrisch
        assertTrue(a.equals(b));

        // Test transitiv
        assertTrue(a.equals(b));
        assertTrue(b.equals(c));
        assertTrue(a.equals(c));

        // Test null
        assertFalse(a.equals(null));
    }
}