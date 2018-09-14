package pack1;
import org.junit.Test;
import static org.junit.Assert.*;


    public class PalindromeCheckTest {
    @Test
    public void alphaCheck1() {
        String expectedValue = "palindrome";
        PalindromeCheck t = new PalindromeCheck();        //act
        String actualValue = t.checkPalindrome("12 33 21");        //Assert
        assertEquals(expectedValue, actualValue);
    }
    }
