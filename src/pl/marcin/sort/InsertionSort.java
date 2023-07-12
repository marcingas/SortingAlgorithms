package pl.marcin.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        insertionSortRecursive(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(insertionSorting(arr)));
        //TC = O((N*(N+1))/2); N*N, SC = O(1);
    }

    public static int[] insertionSorting(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        return arr;
    }

    public static void insertionSortRecursive(int[] arr, int i, int n) {
        if (i == n) return;
        int j = i;
        while (j>0 && arr[j-1]>arr[j]){
            int temp = arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            j--;
        }
        insertionSortRecursive(arr,i+1,n);
    }
}
