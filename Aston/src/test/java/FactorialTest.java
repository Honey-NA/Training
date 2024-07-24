import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {
    Factorial factorial = new Factorial();
    @Test
    public void testFactorialZero() {
        int result = Factorial.factorial(0);
        Assert.assertEquals(result,1);
    }
    @Test
    public void testFactorial() {
        int result = Factorial.factorial(5);
        Assert.assertEquals(result,120);
    }
}