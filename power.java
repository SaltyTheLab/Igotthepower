public class power {

    public static int naive(int x, int n) {
        if (x == 0)
            return 0;
        if (n == 0)
            return 1;
        else
            return x * naive(x, n - 1);
    }

    public static int unoptimizedpower(int x, int n) {
        if (x == 0)
            return 0;
        if (n == 0)
            return 1;
        if (n % 2 == 0)
            return unoptimizedpower(x, n / 2) * unoptimizedpower(x, n / 2);
        else
            return x * unoptimizedpower(x, n / 2) * unoptimizedpower(x, n / 2);
    }

    public static int optimizedpower(int x, int n) {
        if (x == 0)
            return 0;
        if (n == 0)
            return 1;
        int temp = optimizedpower(x, n / 2);
        if (n % 2 == 0)
            return temp * temp;
        else
            return x * temp * temp;
    }

    public static void main(String[] args) {
        int number = 2;
        int n = 20;
        System.out.println(naive(number, n));
        System.out.println(unoptimizedpower(number, n));
        System.out.println(optimizedpower(number, n));
    }
}
