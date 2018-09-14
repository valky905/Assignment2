package pack6;

import org.junit.Test;


import static org.junit.Assert.*;

public class GradeClassTest {

@Test
public void alphaCheck1() {
    int expectedValue = 20;
    GradeClass t = new GradeClass();
    //act
    int a[] = {20, 40, 30, 50};
    int actualValue = t.minValue(a, 4);  //Assert
    assertEquals(expectedValue, actualValue);

}

@Test
public void alphaCheck2() {
    int expectedValue = 50;
    GradeClass t = new GradeClass();      //act
    int a[] = {20, 40, 30, 50};
    int actualValue = t.maxValue(a, 4);   //Assert
    assertEquals(expectedValue, actualValue);

}

@Test
public void alphaCheck3() {
    float expectedValue = (float) 35;
    GradeClass t = new GradeClass();      //act
    int a[] = {20, 40, 30, 50};
    float actualValue = t.avgValue(a, 4);
    assertEquals(expectedValue,actualValue,0.0f);


}
}
