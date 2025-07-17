import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CodeWarsTest {
    @Test
    public void testThatArgumentsReturnSumOfMultiples(){
        assertEquals(20, CodeWars.sumMul(2, 9));
    }
}