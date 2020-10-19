package Array;

import java.util.Scanner;

public class KthMinandMaxElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int min = Integer.MAX_VALUE;
            int x = 0;
            boolean[] isTr = new boolean[n];
            for (int i = 0; i < k; i++) {
                min = Integer.MAX_VALUE;
                for (int j = 0; j < n; j++) {
                    if (arr[j] < min && !isTr[j]) {
                        min = arr[j];
                        x = j;
                    }

                }
                isTr[x] = true;
            }
            System.out.println(min);
            t--;
        }
    }
}
