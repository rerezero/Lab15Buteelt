package mn.edu.must.sict.lab15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class MultiplicationTest {

    @Test
    void testPositiveNumbers() {
        assertEquals(6.0, Multiplication.multiply(2.0, 3.0));
    }

    @Test
    void testWithZero() {
        assertEquals(0.0, Multiplication.multiply(0.0, 5.0));
    }
}
