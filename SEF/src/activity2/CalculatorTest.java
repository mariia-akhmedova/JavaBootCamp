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
public void testMultiply() {
        assertEquals(81, calculator.multiply(9, 9));
    assertEquals(100, calculator.multiply(-10, -10));
    assertEquals(-60, calculator.multiply(15, -4));
    assertEquals(-18, calculator.multiply(-3, 6));
    assertEquals(0, calculator.multiply(0, 0));
    assertEquals(0, calculator.multiply(-0, 1));
    assertEquals(80513996, calculator.multiply(37052, 2173));
}
public void testDivide() {
    assertEquals(1, calculator.divide(9, 9));
    assertEquals(99, calculator.divide(-99, -1));
    assertEquals(0, calculator.divide(0, 0));
    assertEquals(0, calculator.divide(15, 0));
    assertEquals(-11, calculator.divide(-121, 11));
    assertEquals(0, calculator.divide(0, -2));
}
}
