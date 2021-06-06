package activity2;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
    private Calculator calculator;


    protected void setUp() throws Exception {
        super.setUp();
        calculator = new Calculator();
    }
    public void testAdd() {

        assertEquals(11, calculator.add(5,6));
        assertEquals(-15, calculator.add(-7,-8));
        assertEquals(0, calculator.add(0,0));
        assertEquals(-4, calculator.add(-12,8));
        assertEquals(-24, calculator.add(-24,0));
        assertEquals(-11, calculator.add(-5,-6));
        assertEquals(19, calculator.add(0,19));
        assertEquals(71, calculator.add(71,0));
        assertEquals(2000000000, calculator.add(1000000000,1000000000));
    }
    public void testSubtract() {
        assertEquals(33, calculator.subtract(39,6));
        assertEquals(79, calculator.subtract(-12,-91));
        assertEquals(-52, calculator.subtract(-42, 10));
        assertEquals(0, calculator.subtract(0,0));
        assertEquals(5, calculator.subtract(5, 0));
        assertEquals(8, calculator.subtract(0,-8));
    }

}
