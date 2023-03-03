import org.calculator.Calculate;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculateTest {
    private static final double DELTA = 1e-15;
    Calculate calculator = new Calculate();

    @Test
    public void additionTruePositive(){
        assertEquals("Finding addition for True Positive", 100, calculator.addition(50,50), DELTA);
        assertEquals("Finding addition for True Positive", 1, calculator.addition(1,0), DELTA);
        assertEquals("Finding addition for True Positive", 6, calculator.addition(7,-1), DELTA);
        assertEquals("Finding addition for True Positive", 14, calculator.addition(10,4), DELTA);
        assertEquals("Finding addition for True Positive", 0, calculator.addition(0,0), DELTA);
    }

    @Test
    public void additionFalsePositive(){
        assertEquals("Finding addition for True Positive", 100, calculator.addition(50,55), DELTA);
        assertEquals("Finding addition for True Positive", 1, calculator.addition(1,-1), DELTA);
        assertEquals("Finding addition for True Positive", 60, calculator.addition(10,-1), DELTA);
        assertEquals("Finding addition for True Positive", 14, calculator.addition(100,4), DELTA);
        assertEquals("Finding addition for True Positive", -1, calculator.addition(0,0), DELTA);
    }
}
