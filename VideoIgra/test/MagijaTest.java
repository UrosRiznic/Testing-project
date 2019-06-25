import org.junit.jupiter.api.Test;
import videoigra.Magija;

import static org.junit.jupiter.api.Assertions.*;

class MagijaTest {

    @Test
    void getPotrebnaEnergija_ShouldReturnZero() {
        Magija m = new Magija();
        double expected = m.getSteta();
        double actual = 0;
        assertEquals(expected,actual,0.001);
    }

    @Test
    void getPotrebnaInteligencija_ShouldReturnZero() {
        Magija m = new Magija();
        double expected = m.getPotrebnaEnergija();
        double actual = 0;
        assertEquals(expected,actual,0.001);
    }

    @Test
    void getSteta_ShouldReturnZero() {
        Magija m = new Magija();
        double expected = m.getPotrebnaInteligencija();
        double actual = 0;
        assertEquals(expected,actual,0.001);
    }
}