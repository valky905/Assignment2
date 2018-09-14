package pack5;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {
@Test
public void oddEvenCheck() {
    boolean expectedValue = true;
    EvenNumTest obj = new EvenNumTest();        //act
    boolean actualValue = obj.isEven(24);        //Assert
    assertEquals(expectedValue,actualValue);
}

}



