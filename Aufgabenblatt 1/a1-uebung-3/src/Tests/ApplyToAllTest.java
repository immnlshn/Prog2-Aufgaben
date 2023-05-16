import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ApplyToAllTest {
    @Test
    void applyToAll(){
        StapelMitArray stapel = new StapelMitArray(3);
        stapel.insert(1);
        stapel.insert(2);
        stapel.insert(3);
        stapel.applyToAll((x) -> x * 2);
        assertEquals(6, stapel.top());
        stapel.remove();
        assertEquals(4, stapel.top());
        stapel.remove();
        assertEquals(2, stapel.top());
        stapel.remove();
        stapel.insert(1);
        stapel.insert(2);
        stapel.insert(3);
        stapel.applyToAll((x) -> x * x);
        assertEquals(9, stapel.top());
        stapel.remove();
        assertEquals(4, stapel.top());
        stapel.remove();
        assertEquals(1, stapel.top());
        stapel.remove();
    }

}