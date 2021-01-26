package other;

/**
 * @author takaibun
 */
public class Fibonacci {

    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    private int f = 0;

    public int fib2(int n) {
        if (n < 2) {
            return n;
        }
        int f1 = fib2(n - 1);
        int f2;

        if (f == 0) {
            f = f1;
            f2 = fib2(n - 2);
        } else {
            f2 = f;
            f = f1;
        }
        return (f1 + f2)%1000000007;
    }

    private int[] fs = new int[100];

    public int fib3(int n) {
        if (n < 2) {
            return n;
        }
        if (fs[n] != 0) {
            return fs[n];
        }
        int f = fib3(n - 1) + fib3(n - 2);
        fs[n] = f;
        return f%1000000007;
    }

    public int fib4(int n) {
        if (n < 2) {
            return n;
        }
        int f1 = 0;
        int f2 = 1;
        int fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = (f1 + f2)%1000000007;
            f1 = f2;
            f2 = fib;
        }
        return fib;
    }
    
}
