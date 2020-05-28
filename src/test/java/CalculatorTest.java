import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CalculatorTest {

    private Calculator calculator;
    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        calculator = null;
    }

    @Test
    public void add() {
        assertTrue(calculator.add(10,10) == 20);
    }

    @Test
    public void sub() {
        assertEquals(calculator.sub(10, 20), 10);
    }

    @Test
    public void div() {
        assertEquals(calculator.div(10, 20), 2);
    }
}