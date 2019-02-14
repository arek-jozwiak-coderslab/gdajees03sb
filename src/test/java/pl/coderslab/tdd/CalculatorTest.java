package pl.coderslab.tdd;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private static final int ADD_RESULT = 6;
    private static final int MULTIPLE_RESULT = 9;
    private static final int OPERATION_FIRST_ELEMENT = 3;
    private static final int OPERATION_SECOND_ELEMENT = 3;

    @Test
    public void add() {
        Calculator calculator = new Calculator();
        int add = calculator.add(OPERATION_FIRST_ELEMENT, OPERATION_SECOND_ELEMENT);
        assertEquals(ADD_RESULT, add);
    }

    @Test
    public void multiple(){
        Calculator calculator = new Calculator();
        int result = calculator.multiple(OPERATION_FIRST_ELEMENT,OPERATION_SECOND_ELEMENT );
        assertEquals(MULTIPLE_RESULT, result);
    }
}