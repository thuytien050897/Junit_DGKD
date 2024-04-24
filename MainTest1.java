import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest1 {

    @Test
    public void testPositiveNumber() {
        int number = 5;
        assertEquals("Số dương", Main.classifyNumber(number));
    }

    @Test
    public void testNegativeNumber() {
        int number = -5;
        assertEquals("Số âm", Main.classifyNumber(number));
    }

    @Test
    public void testZeroNumber() {
        int number = 0;
        assertEquals("Số không", Main.classifyNumber(number));
    }

    @Test
    public void testNumberSequence() {
        int number = 3;
        assertEquals("Các số từ 1 đến 3:\n1 2 3 ", Main.getNumberSequence(number));
    }
}
