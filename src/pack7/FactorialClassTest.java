package pack7;

import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialClassTest {
@Test
public void checkFactorial() {
    long expectedValue = 120;
    FactorialClass t = new FactorialClass();        //act
    long actualValue = t.calculateFactorial(5);    //Assert
    assertEquals(expectedValue, actualValue);
}


}