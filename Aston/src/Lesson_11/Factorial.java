public class Factorial {
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else {
            int res = 1, i;
            for (i = 2; i <= n; i++)
                res *= i;
            return res;
        }
    }
}
