package parametrizedtests;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest {
    
    //one row of data
    private Integer inputNumber;
    private Boolean expectedResult;
    private PrimeNumberChecker primeNumberChecker;
    
    @Before
    public void init(){
        primeNumberChecker = new PrimeNumberChecker();
    }

    //Each parameter should be placed as an argument here
    //every time runner triggers, it will pass the arguments from parameters we defined
    //from primeNumbers() method
    public PrimeNumberCheckerTest(Integer inputNumber, Boolean expectedResult) {
        this.inputNumber = inputNumber;
        this.expectedResult = expectedResult;
    }

    //this method provides the data set
    @Parameterized.Parameters
    public static Collection primeNumbers(){
        return Arrays.asList (new Object[][]{
            {2, true},
            {6, false},
            {13, true},
            {19, true},
            {23, true},
            {32, false}
        });
    }    
    
    //this test will be called and run 6 times, since we have 6 parameter rows defined in data
    @Test
    public void testPrimeNumber(){
        System.out.println("Parameterized number is : " + inputNumber);
        assertEquals (expectedResult, primeNumberChecker.validate(inputNumber));
    }
}
