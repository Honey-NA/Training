import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {

    @Test
    public void testFactorial() {
        Factorial factorial = new Factorial();
        Assert.assertEquals(Factorial.factorial(0),1);
        Assert.assertEquals(Factorial.factorial(5),120);
    }
}