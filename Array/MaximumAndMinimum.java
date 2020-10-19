package Array;

import java.util.Scanner;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }

        int minElement;
        int maxElement;
        int i;
        if(n%2==0){
            if(arr[0]>arr[1]){
                minElement=arr[1];
                maxElement=arr[0];
            }
            else{
                minElement=arr[0];
                maxElement=arr[1];

            }
            i=2;
        }
        else{
            minElement=arr[0];
            maxElement=arr[0];
            i=1;
        }
        while(i<n-1){
            if(arr[i]>arr[i+1]){
                if(maxElement<arr[i]){
                    maxElement=arr[i];
                }
                if(arr[i+1]<minElement){
                    minElement=arr[i+1];
                }
            }
            else{
                if(maxElement<arr[i+1]){
                    maxElement=arr[i+1];
                }
                if(arr[i]<minElement){
                    minElement=arr[i];
                }
            }
            i+=2;
        }
        System.out.println(minElement +" "+maxElement);
    }
}
//
//        for (int i = 0; i <n ; i++) {
//            if(minElement>arr[i]){
//                minElement=arr[i];
//            }
//            if(maxElement<=arr[i]){
//                maxElement=arr[i];
//            }
//        }
