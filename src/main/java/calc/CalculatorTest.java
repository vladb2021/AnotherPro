package calc;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(8, Calculator.add(5, 3));
    }

    @Test
    void multiply() {
        assertAll(() -> assertEquals(16, Calculator.multiply(0.5, 32)),
                () -> assertEquals(-52, Calculator.multiply(13, -4)),
                () -> assertEquals(32, Calculator.multiply(-8, -4)),
                () -> assertEquals(0, Calculator.multiply(21, 0)));
    }
}