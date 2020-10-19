package Array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UnionTwoArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[n];
        int[] arr2=new int[m];

        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i <m ; i++) {
            arr2[i]=sc.nextInt();
        }
        int[] newarray=new int[1000000];
        System.out.println("Union Of Two Array is:");
        for (int i = 0; i <n ; i++) {
            if(newarray[arr[i]]==0){
                System.out.print(arr[i]+" ");
                ++newarray[arr[i]];
            }
        }
        for (int i = 0; i <m ; i++) {
            if(newarray[arr2[i]]==0){
                System.out.print(arr2[i]+" ");
                ++newarray[arr2[i]];
            }
        }
        System.out.println("\nIntersection of Two Array is: ");
        for (int i = 0; i <n ; i++) {
            if(newarray[arr[i]]==0){
                ++newarray[arr[i]];
            }
        }
        for (int i = 0; i <m ; i++) {
            if(newarray[arr2[i]]!=0){
                System.out.print(arr2[i]+" ");
                ++newarray[arr2[i]];
            }
        }
    }

}
