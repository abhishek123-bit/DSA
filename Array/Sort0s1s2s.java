package Array;

import java.util.Scanner;

public class Sort0s1s2s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int s0 = 0, s1 = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i] == 0) {
                    s0 += 1;
                } else if (arr[i] == 1) {
                    s1 += 1;
                }
            }
            for (int i = 0; i < n; i++) {
                if (s0 > 0) {
                    arr[i] = 0;
                    s0--;
                } else if (s1 > 0) {
                    arr[i] = 1;
                    s1--;
                } else {
                    arr[i] = 2;
                }
            }
            for (int a : arr) {
                System.out.print(a + " ");
            }
            t--;
        }
    }
}
