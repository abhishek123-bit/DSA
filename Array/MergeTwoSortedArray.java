package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[n];
        int[] arr1=new int[m];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        for(int i = 0; i <m ; i++) {
            arr1[i]=sc.nextInt();
        }
        merging(arr,arr1,n,m);
        for(int a:arr){
            System.out.print(a+" ");
        }
        for(int a:arr1){
            System.out.print(a+" ");
        }
    }
    static  void merging(int[] arr1,int[]arr2,int n,int m){
        int i=0,j=n-1;
        while (i<m&&j>=0){
            if(arr1[j]>arr2[i]){
                int temp=arr1[j];
                arr1[j]=arr2[i];
                arr2[i]=temp;
                i++;
                j--;
            }
            else{
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

    }

}
