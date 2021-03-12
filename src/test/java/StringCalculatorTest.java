import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCalculatorTest {
    @Test
    public void frameworkCheckTest() {
        //fail();
    }

    @Test
    public void returnZeroOnEmptyString() {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void returnNumOnSingleNum() {
        assertEquals(1, StringCalculator.add("1"));
        assertEquals(2, StringCalculator.add("2"));
    }
}
