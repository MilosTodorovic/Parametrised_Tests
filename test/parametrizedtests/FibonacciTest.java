package parametrizedtests;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FibonacciTest {
    
    private int inputNumber;
    private int expectedResult;
    
    public FibonacciTest(int inputNumber, int expectedResult) {
        this.inputNumber = inputNumber;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection fibonacciData(){
        return Arrays.asList(new Object[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 3},
            {4, 5},
            {5, 8},
            {6, 13}
        });
    }
    
    @Test
    public void testFibonacci(){
        int actual = Fibonacci.fibonacci(inputNumber);
        System.out.println("Fibonacci: " + actual);
        assertEquals(expectedResult, actual);
    }
    
}
