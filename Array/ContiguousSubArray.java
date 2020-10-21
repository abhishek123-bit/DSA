package Array;

import java.util.Scanner;

public class ContiguousSubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int max = 0;
            int maxSum = 0;
            int negativesum = arr[0];
            for (int i = 0; i < n; i++) {

                max += arr[i];
               //All element of Array are in negative
                if (max > negativesum) {
                    negativesum = max;
                }

                if (max < 0) {
                    max = 0;
                } else if (max > maxSum) {
                    maxSum = max;
                }
            }
            System.out.println(maxSum > negativesum ? maxSum : negativesum);
            t--;
        }
    }
}
