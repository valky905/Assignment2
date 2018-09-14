package pack3;

import org.junit.Assert;

import org.junit.Test;

import pack2.PowerOfFour;

import static org.junit.Assert.assertEquals;

public class MemberTest {

@Test

public void printMember() {

    String expectedValue = "Priya 55 10000.0";

    MemberVariable m = new MemberVariable();

    //act

    String actualValue = m.printMember();

    assertEquals(expectedValue, actualValue);

}

}