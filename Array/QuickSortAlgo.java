package Array;

import java.util.Scanner;

public class QuickSortAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        QuickSort(arr,0,n-1);
        for (int a:arr){
            System.out.print(a+" ");
        }
    }

    static int Partion(int[] arr, int l, int h) {
        int pivot = arr[l];
        int i=l,j=h;
        while (i < j) {
            while (i<arr.length&&pivot >= arr[i]) {
                i++;
            }

            while (pivot < arr[j]) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[l]=arr[j];
        arr[j]=pivot;
        return j;
    }
    static void QuickSort(int []arr,int l,int h){
        if(l<h){
            int j=Partion(arr,l,h);
            QuickSort(arr,l,j-1);
            QuickSort(arr,j+1,h);
        }
    }

}

