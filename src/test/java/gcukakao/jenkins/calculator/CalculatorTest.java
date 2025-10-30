package gcukakao.jenkins.calculator; // [cite: 48]

import org.junit.jupiter.api.Test; // [cite: 50]
import static org.junit.jupiter.api.Assertions.assertEquals; // [cite: 51-52]

public class CalculatorTest {
    private final Calculator calculator = new Calculator(); // [cite: 55, 57]

    @Test // [cite: 56]
    public void testSum() {
        assertEquals(5, calculator.sum(2, 3)); // [cite: 60]
    }

    @Test // [cite: 63]
    public void testSub() {
        assertEquals(-3, calculator.sub(3, 6)); // [cite: 64, 66]
    }

    @Test // [cite: 65]
    public void testMul() {
        assertEquals(10, calculator.mul(2, 5)); // [cite: 68]
    }

    @Test // [cite: 70]
    public void testDiv() {
        assertEquals(6, calculator.div(12, 2)); // [cite: 72]
    }

    @Test
    public void testHelloName() {
        String myName = "곽다현";
        assertEquals("Hello, " + myName, calculator.helloName(myName));
    }
}