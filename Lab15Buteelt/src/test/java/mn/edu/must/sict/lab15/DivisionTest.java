package mn.edu.must.sict.lab15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class DivisionTest {

    @Test
    void testNormalDivision() {
        assertEquals(2.0, Division.divide(6.0, 3.0));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class,
                     () -> Division.divide(1.0, 0.0));
    }
}
