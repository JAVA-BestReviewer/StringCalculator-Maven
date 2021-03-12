import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCalculatorTest {
    @Test
    public void frameworkCheckTest(){
        //fail();
    }
    @Test
    public void returnZeroOnEmptyString(){
        assertEquals(0, StringCalculatorTest.add(""));
    }
}