package hard;

/**
 * @author takaibun
 */
public class MyPow {
    public double myPow(double x, int n) {
        if (n < 0) {
            return 1.0 / myPowADouble(x, -n);
        }
        return myPowADouble(x, n);

    }

    public double myPowADouble(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        double result = myPowADouble(x, n >> 1);
        return n % 2 == 0 ? result * result : result * result * x;
    }
}
