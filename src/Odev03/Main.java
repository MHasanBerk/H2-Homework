package Odev03;

public class Main {
    static void func1(int num, int original){
        if(num > 0){
            System.out.print(num + " ");
            func1(num - 5, original);
        }else{
            func2(num, original);
        }
    }

    static void func2(int num, int original){
        if(num <= original){
            System.out.print(num + " ");
            func2(num + 5, original);
        }
    }

    static void func(int num){
        func1(num, num);
    }

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

/*
15 10 5 0 -5
 */