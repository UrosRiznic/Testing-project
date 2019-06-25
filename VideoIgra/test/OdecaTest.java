import org.junit.jupiter.api.Test;
import videoigra.Odeca;

import static org.junit.jupiter.api.Assertions.*;

class OdecaTest {

    @Test
    void getTezina_ShouldReturnZero() {
        Odeca od = new Odeca();
        double expected = od.getTezina();
        double actual = 0;
        assertEquals(expected,actual,0.001);
    }

    @Test
    void getOdbrambenaVrednost_ShouldReturnZero() {
        Odeca od = new Odeca();
        double expected = od.getOdbrambenaVrednost();
        double actual = 0;
        assertEquals(expected,actual,0.001);
    }
}