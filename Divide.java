public class Divide {
    public int divide(int dividend, int divisor) {
        int len_dividend = 0;
        int sign_a = (dividend >> 31) == 0 ? 1 : -1;
        int sign_b = (divisor >> 31) == 0 ? 1 : -1;
        long a = sign_a==1 ? (long)dividend : -(long)dividend;
        long b = sign_b==1 ? (long)divisor : -(long)divisor;

        while (a >> len_dividend != 0 && a >> len_dividend != -1)
            len_dividend ++;
        long result = fun(a, b, len_dividend);
        if (sign_a + sign_b == 0 && result > Integer.MAX_VALUE)
            return Integer.MIN_VALUE;
        if (sign_a + sign_b == 0)
            return -(int)result;
        if (result >= Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        return (int)result;
    }

    long fun(long dividend, long divisor, int n){
        if ((dividend >> n) >= divisor){
            if (n == 0) return 1;
            return ((long)1 << n) + fun(dividend - (divisor << n), divisor, n -1);
        }
        else {
            if (n == 0) return 0;
            return fun(dividend, divisor, n -1);
        }
    }

    public static void main(String[] args) {
        Divide divide = new Divide();
        System.out.println(2^3);
        int a = divide.divide(7, -3);
        System.out.println(a);
    }

}
