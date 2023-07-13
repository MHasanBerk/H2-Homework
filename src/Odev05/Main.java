package Odev05;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;

        System.out.print("Dizinin boyutu n : ");
        number = scan.nextInt();

        if(number > 0){
            int[] list = new int[number];
            System.out.println("Dizinin elemanlarını giriniz");

            for(int i = 0; i < list.length; i++){
                System.out.printf("%d. Elemanı : ", i + 1);
                list[i] = scan.nextInt();
            }

            list = sort(list);

            System.out.println(Arrays.toString(list));

            //Alternatively

            //Arrays.sort(list);
        }
    }

    public static int[] sort(int[] arr){
        int temp;

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
                }
            }
        }
        return arr;
    }
}