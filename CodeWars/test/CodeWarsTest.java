import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CodeWarsTest {
    @Test
    public void testThatArgumentsReturnSumOfMultiples(){
        assertEquals(20, CodeWars.sumMul(2, 9));
    }
    @Test
    public void testThatInvalidArgumentsThrowsException(){
        assertThrows(IllegalArgumentException.class, () -> {
            CodeWars.sumMul(0, 0);
            CodeWars.sumMul(9, 0);
            CodeWars.sumMul(0, 9);
            CodeWars.sumMul(-2, 9);
            CodeWars.sumMul(2, -9);
        });
    }
}