package Array;

import java.util.Scanner;

public class FindDuplicateElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        //Here we use hare and tortoise algo
        int h=0;
        int t=0;
       //find Intersection point of hare and tortoise
        do {
            t=arr[t];
            h=arr[arr[h]];

        }while (t!=h);

        t=0;
        //here hare and tortoise are on same speed
        while (t!=h){
            t=arr[t];
            h=arr[h];
        }
        System.out.println(h);
    }
}
