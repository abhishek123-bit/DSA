package Array;

import java.util.Scanner;

public class NegativeElementLS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        int l=0;
        int i=0;
        while(i<n){
            if(arr[i]>=0){
                i++;
            }
            else {
                int temp=arr[i];
                arr[i]=arr[l];
                arr[l]=temp;
                i++;
                l++;
            }
        }
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
