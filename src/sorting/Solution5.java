package sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 입력 값
/*
5 3
1 2 5 4 3
5 5 6 6 5
 */
public class Solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Integer[] b = new Integer[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        Arrays.sort(a); // 오름차순 정렬
        Arrays.sort(b, Collections.reverseOrder()); // 내림차순 정렬

        for (int i = 0; i < k; i++) {
            if (a[i] < b[i]) {
                int temp = a[i];
                a[i] = b[i];
                b[i] = temp;
            } else {
                break;
            }
        }

        long result = 0;
        for (int i = 0; i < n; i++) {
            result += a[i];
        }

        System.out.println(result);
    }
}
