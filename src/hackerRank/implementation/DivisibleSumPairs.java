package hackerRank.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisibleSumPairs {
    static int solution(int n, int k, int[] ar) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if ((ar[i] + ar[j]) % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);

        int[] ar = new int[n];

        String[] str2 = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            ar[i] = Integer.parseInt(str2[i]);
        }

        System.out.println(solution(n, k, ar));
    }
}

/*
input
6 3
1 3 2 6 1 2
output
5
*/