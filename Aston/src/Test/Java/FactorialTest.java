import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class FactorialTest {
    Factorial factorial = new Factorial();
    @Test
    void factorialTestZero() {
        int result = factorial.factorial(0);
        assertEquals(1,result);
    }
    @Test
    void factorialTest() {
        int result = factorial.factorial(5);
        assertEquals(120,result);
    }
}