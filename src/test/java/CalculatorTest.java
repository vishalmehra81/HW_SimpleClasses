import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator( "TX-100");
    }
    @Test
    public void canAddTwoInts(){
        assertEquals(10, calculator.add(4,6));
    }
    @Test
    public void canSubtractSecondFromOne(){
        assertEquals(4, calculator.subtract(10,6));
    }
    @Test
    public void canMultiplyTwoInts(){
        assertEquals(25, calculator.multiply(5,5));
    }
    @Test
    public void canDivideTwoInts(){
        assertEquals(5.00, calculator.divide(25.00,5.00), 0.01);
    }
}
