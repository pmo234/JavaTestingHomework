import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public void before(){
        calculator = new Calculator();
    }
    @Test
    public void canAdd2Numbers() {
        assertEquals(5, calculator.sum(2,3));
    }
    @Test
    public void canSubtract2Numbers() {
        assertEquals(-1, calculator.takeAway(2,3));
    }
    @Test
    public void canMultiply2Numbers() {
        assertEquals(6, calculator.product(3,2));
    }
    @Test
    public void canDivide2Numbers() {
        assertEquals(1.5, calculator.divide(3,2),0.0);
    }
}
