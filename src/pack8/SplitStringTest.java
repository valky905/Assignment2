package pack8;

import org.junit.Test;


import java.io.IOException;

import static org.junit.Assert.*;

public class SplitStringTest {
@Test

public void Check1() throws IOException {

    String expectedValue="i3";
    SplitString t = new SplitString();
    //act

    String  actualValue = t.splitCheck();
    //Assert

    assertEquals(expectedValue,actualValue);

}


}