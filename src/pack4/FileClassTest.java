package pack4;

import org.junit.Test;

import java.io.IOException;
import java.lang.String;


import static org.junit.Assert.*;

public class FileClassTest {
@Test

public void Check1() {

    long expectedValue=12;

    FileClass t = new FileClass();
    //act

    long actualValue = t.checkLength();

    //Assert

    assertEquals(expectedValue,actualValue);

}

@Test

public void Check2() throws IOException {

    String expectedValue="ABCSFLJJRET";

    FileClass t = new FileClass();
    //act

    String actualValue = t.checkUpperCase();

    //Assert

    assertEquals(expectedValue,actualValue);

}


}