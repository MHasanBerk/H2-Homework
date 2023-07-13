package Odev02;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPrime(23));
        System.out.println(isPrime(17));
        System.out.println(isPrime(49));
    }

    static boolean isPrime(int number){
        return isPrime(number, 2);
    }

    static boolean isPrime(int number, int divisor){
        if(number <= 1){
            return false; // Numbers less than or equal to 1 are not prime
        }

        if (divisor > Math.sqrt(number)){
            //Math.sqrt is a method from Math class used for finding square root of the number.
            return true; // No divisors found, number is prime
        }

        if (number % divisor == 0){
            return false; // Number is divisible, not prime
        }

        return isPrime(number, divisor + 1);
    }
}