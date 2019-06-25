import org.junit.jupiter.api.Test;
import videoigra.Oruzje;

import static org.junit.jupiter.api.Assertions.*;

class OruzjeTest {

    @Test
    void getTezina_ShouldReturnZero() {
        Oruzje or = new Oruzje();
        double expected = or.getTezina();
        double actual = 0;
        assertEquals(expected,actual,0.001);
    }

    @Test
    void getPotrebnaSnaga_ShouldReturnZero() {
        Oruzje or = new Oruzje();
        double expected = or.getPotrebnaSnaga();
        double actual = 0;
        assertEquals(expected,actual,0.001);
    }

    @Test
    void getSteta_ShouldReturnZero() {
        Oruzje or = new Oruzje();
        double expected = or.getSteta();
        double actual = 0;
        assertEquals(expected,actual,0.001);
    }
}