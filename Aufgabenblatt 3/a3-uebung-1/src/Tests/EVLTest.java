import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EVLTest {

    @Test
    void getFirst(){
        EVL<Integer> evl = new EVL<Integer>();
        evl.appendLast(1);
        evl.appendLast(2);
        assertEquals(1, evl.getFirst());
        EVL<Integer> evl2 = new EVL<Integer>();
        assertThrows(NoSuchElementException.class, () -> evl2.getFirst());


        EVL<String> evl3 = new EVL<String>();
        evl3.appendLast("Hallo");
        evl3.appendLast("Welt");
        assertEquals("Hallo", evl3.getFirst());
        EVL<String> evl4 = new EVL<String>();
        assertThrows(NoSuchElementException.class, () -> evl4.getFirst());
    }

    @Test
    void getLast(){
        EVL<Integer> evl = new EVL<Integer>();
        evl.appendLast(1);
        evl.appendLast(2);
        assertEquals(2, evl.getLast());
        EVL<Integer> evl2 = new EVL<Integer>();
        assertThrows(NoSuchElementException.class, () -> evl2.getLast());


        EVL<String> evl3 = new EVL<String>();
        evl3.appendLast("Hallo");
        evl3.appendLast("Welt");
        assertEquals("Welt", evl3.getLast());
        EVL<String> evl4 = new EVL<String>();
        assertThrows(NoSuchElementException.class, () -> evl4.getLast());
    }

    @Test
    void addLast(){
        EVL<Integer> evl = new EVL<Integer>();
        evl.addLast(1);
        evl.addLast(2);
        assertEquals(2, evl.getLast());
        EVL<Integer> evl2 = new EVL<Integer>();
        assertThrows(NoSuchElementException.class, () -> evl2.getLast());


        EVL<String> evl3 = new EVL<String>();
        evl3.addLast("Hallo");
        evl3.addLast("Welt");
        assertEquals("Welt", evl3.getLast());
        EVL<String> evl4 = new EVL<String>();
        assertThrows(NoSuchElementException.class, () -> evl4.getLast());
    }

    @Test
    void removeLast(){
        EVL<Integer> evl = new EVL<Integer>();
        evl.addLast(1);
        evl.addLast(2);
        assertEquals(2, evl.removeLast());
        EVL<Integer> evl2 = new EVL<Integer>();
        assertThrows(NoSuchElementException.class, () -> evl2.removeLast());

        EVL<String> evl3 = new EVL<String>();
        evl3.addLast("Hallo");
        evl3.addLast("Welt");
        assertEquals("Welt", evl3.removeLast());
        EVL<String> evl4 = new EVL<String>();
        assertThrows(NoSuchElementException.class, () -> evl4.removeLast());
    }

    @Test
    void contains(){
        EVL<Integer> evl = new EVL<Integer>();
        evl.addLast(1);
        evl.addLast(2);
        assertEquals(true, evl.contains(2));
        EVL<Integer> evl2 = new EVL<Integer>();
        assertThrows(NoSuchElementException.class, () -> evl2.contains(2));

        EVL<String> evl3 = new EVL<String>();
        evl3.addLast("Hallo");
        evl3.addLast("Welt");
        assertEquals(true, evl3.contains("Welt"));
        EVL<String> evl4 = new EVL<String>();
        assertThrows(NoSuchElementException.class, () -> evl4.contains("Welt"));
    }

    @Test
    void size(){
        EVL<Integer> evl = new EVL<Integer>();
        evl.addLast(1);
        evl.addLast(2);
        assertEquals(2, evl.size());
        EVL<Integer> evl2 = new EVL<Integer>();
        assertEquals(0, evl2.size());

        EVL<String> evl3 = new EVL<String>();
        evl3.addLast("Hallo");
        evl3.addLast("Welt");
        assertEquals(2, evl3.size());
        EVL<String> evl4 = new EVL<String>();
        assertEquals(0, evl4.size());
    }

    @Test
    void toStringTest(){
        // teste ob es den output hat: 1-42-13-27-0-11
        EVL<Integer> evl = new EVL<Integer>();
        evl.addLast(1);
        evl.addLast(42);
        evl.addLast(13);
        evl.addLast(27);
        evl.addLast(0);
        evl.addLast(11);
        assertEquals("1-42-13-27-0-11", evl.toString());
    }

}
