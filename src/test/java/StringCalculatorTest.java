import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    @Test
    public void frameworkCheckTest() {
        //fail();
    }

    @Test
    public void returnZeroOnEmptyString() throws Exception{
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void returnNumOnSingleNum() throws Exception{
        assertEquals(1, StringCalculator.add("1"));
        assertEquals(2, StringCalculator.add("2"));
    }

    @Test
    public void returnSumTwoNumCommaDelimiter() throws Exception{
        assertEquals(3, StringCalculator.add("1,2"));
    }

    @Test
    public void returnSumTwoNumNewLineDelimiter() throws Exception{
        assertEquals(3, StringCalculator.add("1\n2"));
    }

    @Test
    public void returnSumMultiNumCommaDelemiter() throws Exception{
        assertEquals(6, StringCalculator.add("1,2,3"));
    }

    @Test
    public void returnSumMultiNumMixedDelemiter() throws Exception{
        assertEquals(15, StringCalculator.add("1\n2,12"));
    }

    @Test
    public void returnSumMultiPrivateDelemiter() throws Exception{
        assertEquals(24, StringCalculator.add("//;\n1;11;12"));
    }

    @Test
    public void exceptionForMinusValue() throws Exception{
        assertThrows(Exception.class,
                ()->{StringCalculator.add("-1");}
        );
    }

    @Test
    public void exceptionForMultiMinusValue(){
        try{
            StringCalculator.add("-1,2,-12,-3");
        }catch (Exception ex){
            assertEquals("negatives not allowed : -1,-12,-3", ex.getMessage());
        }
    }
    @Test
    public void ignoreOver1000Value() throws Exception{
        assertEquals(4, StringCalculator.add("2\n2,1001"));
    }

    @Test
    public void returnSumWithLongDelimiter() throws Exception{
        assertEquals(5, StringCalculator.add("//***\n2***3"));
    }
}
