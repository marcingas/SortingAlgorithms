package pl.marcin.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int n = arr.length;
        recursionBubbleSort(arr,n);
        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(bubbleSort(arr)));
        //TC = O((N*(N+1))/2); N*N, SC = O(1);
    }

    private static int[] bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    private static void recursionBubbleSort(int[]arr,int n){
        if(n==1)return;
        for(int j = 0;j<n-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        recursionBubbleSort(arr,n-1);
    }
}
