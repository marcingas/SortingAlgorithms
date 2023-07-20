package pl.marcin.graphimp;

import java.util.Arrays;

public class GraphAsArray {
    public static void main(String[] args) {
        int[] data = {7, 13, 0, 1, 1, 7, 0, 7, 1, 5, 1, 2, 1, 3, 2, 3, 2, 5, 2, 4, 3, 5, 4, 7, 5, 6, 6, 7};
        for(var el:arrayGraphImpl(data) ){
            System.out.println(Arrays.toString(el));
        }
        ;
    }

    public static int[][] arrayGraphImpl(int[] data) {
        int n = data[0];
        int m = data[1];
        int index = 2;
        int[][] dataArr = new int[n + 1][n + 1];
        for(int i =0; i < dataArr.length; i++){
            dataArr[i][i]=-1;
        }
        while (index < data.length - 1) {
            dataArr[data[index]][data[index + 1]] = 1;
            dataArr[data[index + 1]][data[index]] = 1;
           index+=2;
        }
        return dataArr;
    }
}
