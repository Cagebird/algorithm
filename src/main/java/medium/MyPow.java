package medium;

/**
 * @author takaibun
 */
public class MyPow {
    public double myPow(double x, int n) {
        if (n < 0) {
            return 1.0 / myPowDouble(x, -n);
        }
        return myPowDouble(x, n);

    }

    public double myPowDouble(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        double result = myPowDouble(x, n >> 1);
        return n % 2 == 0 ? result * result : result * result * x;
    }
}
