package Odev01;

public class Main {
    public static void main(String[] args) {
        System.out.println(pow(5,3));
    }

    static int pow(int base, int exponent){
        if(exponent == 0) {
            return 1;
        }

        return base * pow(base, exponent-1);
    }
}

/*
    2^5 = 2 * 2 ^ 4
    2^4 = 2 * 2 ^ 3
    2^3 = 2 * 2 ^ 2
    2^2 = 2 * 2 ^ 1
    2^1 = 2 * 2 ^ 0

    f(n,m) = n * f(n, m-1);
 */
