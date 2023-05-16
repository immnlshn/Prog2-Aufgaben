import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class PersonTest {
    @Test
    void konstruktor() {
        Paar<Integer, String> paar = new Paar<Integer, String>(1, "hallo");
    }

    @Test
    void getErstes() {
        int e = 1;
        String z = "hallo";
        Paar<Integer, String> paar = new Paar<Integer, String>(e, z);
        assertEquals(e, paar.getErstes());
    }

    @Test
    void getZweites() {
        int e = 1;
        String z = "hallo";
        Paar<Integer, String> paar = new Paar<Integer, String>(e, z);
        assertEquals(z, paar.getZweites());
    }

    @Test
    void setErstes(){
        int e = 1;
        String z = "hallo";
        Paar<Integer, String> paar = new Paar<Integer, String>(e, z);
        int e2 = 187;
        paar.setErstes(e2);
        assertEquals(e2, paar.getErstes());
    }

    @Test
    void setZweites(){
        int e = 1;
        String z = "hallo";
        Paar<Integer, String> paar = new Paar<Integer, String>(e, z);
        String z2 = "jojo";
        paar.setZweites(z2);
        assertEquals(z2, paar.getZweites());
    }

    @Test
    void setBeide(){
        int e = 1;
        String z = "hallo";
        Paar<Integer, String> paar = new Paar<Integer, String>(e, z);
        int e2 = 187;
        String z2 = "jojo";
        paar.setBeide(e2, z2);
        assertEquals(e2, paar.getErstes());
        assertEquals(z2, paar.getZweites());
    }

    @Test
    void equals(){
        int e = 1;
        String z = "hallo";
        Paar<Integer, String> paar = new Paar<Integer, String>(e, z);
        Paar<Integer, String> paar2 = new Paar<Integer, String>(e, z);
        assertTrue(()->{
            return paar.equals(paar2);
        });
        paar2.setBeide(187, "hdf");
        assertFalse(()->{
            return paar.equals(paar2);
        });
    }

    @Test
    void toStringTest(){
        int e = 1;
        String z = "hallo";
        Paar<Integer, String> paar = new Paar<Integer, String>(e, z);
        assertEquals(("(" + e + ", " + z + ")"), paar.toString());
    }
}
