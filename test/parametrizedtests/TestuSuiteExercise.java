package parametrizedtests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    FibonacciTest.class, 
    PrimeNumberCheckerTest.class
})

public class TestuSuiteExercise {
    //class is there just to hold the annotations, it will remain empty
}
