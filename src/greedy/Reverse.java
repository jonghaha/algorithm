package greedy;

import java.util.Scanner;

// 백준
// https://www.acmicpc.net/problem/1439
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count0 = 0;
        int count1 = 0;

        if (s.charAt(0) == '1') {
            count1++;
        } else {
            count0++;
        }

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                if (s.charAt(i) == '1') {
                    count1++;
                } else {
                    count0++;
                }
            }
        }

        System.out.println(Math.min(count0, count1));
    }
}
