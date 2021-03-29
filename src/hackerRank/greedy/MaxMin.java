package hackerRank.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaxMin {
    static int solution(int k, int[] arr) {
        Arrays.sort(arr);

        int unfairness = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - k + 1; i++) {
            unfairness = Math.min(unfairness, arr[i + k - 1] - arr[i]);
        }

        return unfairness;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int k = Integer.parseInt(in.readLine());
        int[] arr = new int[n];

        for(int i = 0; i < n; i ++)
            arr[i] = Integer.parseInt(in.readLine());

        System.out.println(solution(k, arr));
    }
}
/*
input
7
3
10
100
300
200
1000
20
30
output
20
*/
