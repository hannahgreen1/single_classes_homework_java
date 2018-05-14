import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(6, 6);
    }

    @Test
    public void hasAdd(){
        assertEquals(12, calculator.getAdd());
    }

    @Test
    public void hasSubtract(){
        assertEquals(0, calculator.getSubtract());
    }

    @Test
    public void hasMultiply(){
        assertEquals(36, calculator.getMultiply());
    }

    @Test
    public void hasDivide(){
        assertEquals(1, calculator.getDivide());
    }
}
