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

    @Test
    public void returnSumTwoNumCommaDelimiter() {
        assertEquals(3, StringCalculator.add("1,2"));
    }

    @Test
    public void returnSumTwoNumNewLineDelimiter() {
        assertEquals(3, StringCalculator.add("1\n2"));
    }

    @Test
    public void returnSumMultiNumCommaDelemiter() {
        assertEquals(6, StringCalculator.add("1,2,3"));
    }

    @Test
    public void returnSumMultiNumMixedDelemiter() {
        assertEquals(15, StringCalculator.add("1\n2,12"));
    }

}
