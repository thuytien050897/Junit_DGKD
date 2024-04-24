import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(3, calculator.add(2, 1));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(4, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(8, calculator.multiply(4, 2));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(4, 2));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(4, 0));
    }
}
