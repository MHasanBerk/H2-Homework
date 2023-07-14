package Odev07;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{2,3,4}, {5,6,4}};
        matrix = transpose(matrix);

        //Printing the array
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Transpose method
    public static int[][] transpose(int[][] arr){
        int rowLength = arr[0].length;
        boolean isSameLength = true;

        //Checking if all rows are the same length.

        for(int k = 1; k < arr.length; k++){
            if(arr[k].length != rowLength){
                isSameLength = false;
                break;
            }
        }


        if(isSameLength){
            //After checking rows, creating a new multidimensional array to transpose
            //the original array.
            int[][] transposed = new int[rowLength][arr.length]; //Notice that rows and columns are switched.

            for(int n = 0; n < arr.length; n++) {
                for (int m = 0; m < arr[n].length; m++) {
                    transposed[m][n] = arr[n][m];
                }
            }
            return transposed;
        }

        return arr;
    }
}