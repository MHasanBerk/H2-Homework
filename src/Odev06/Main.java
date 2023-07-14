package Odev06;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int count;
        boolean[] isCheck = new boolean[list.length];
        Arrays.fill(isCheck,false);

        for(int i = 0; i < list.length; i++){
            if(isCheck[i]){
                continue;
            }
            count = 1;
            for(int j = i + 1; j < list.length; j++){
                if(list[i] == list[j]){
                    isCheck[j] = true;
                    count++;
                }
            }

            System.out.printf("%d sayısı %d kere tekrar edildi.\n",list[i],count);
        }

    }
}
