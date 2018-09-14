package pack2;

import org.junit.Test;

import pack1.PalindromeCheck;

import static org.junit.Assert.*;

public class PowerOfFourTest {

@Test

public void Check1() {

    String expectedValue="no";

    PowerOfFour t = new PowerOfFour();

    //act

    String actualValue = t.isPowerOfFour(101);

    //Assert

    assertEquals(expectedValue, actualValue);

}

@Test

public void Check2() {

    String expectedValue="yes";

    PowerOfFour t = new PowerOfFour();

    //act

    String actualValue = t.isPowerOfFour(16);

    //Assert

    assertEquals(expectedValue, actualValue);

}

}