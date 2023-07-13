package Odev03;

public class Test {
    public static void main(String[] args) {
        printPattern(13);
    }
    public static void printPattern(int num) {
        if (num <= 0) {
            System.out.print(num + " ");
        } else {
            System.out.print(num + " ");
            printPattern(num - 5);
            System.out.print(num + " ");
        }
    }
}
