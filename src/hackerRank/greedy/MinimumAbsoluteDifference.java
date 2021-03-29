package hackerRank.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinimumAbsoluteDifference {
    static int solution(int[] arr) {
        int deff = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                deff = Math.min(deff, Math.abs(arr[i] - arr[j]));
            }
        }

        return deff;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int[] arr = new int[n];

        String str = in.readLine();
        int index = 0;
        for(String s : str.split(" ")) {
            arr[index] = Integer.parseInt(s);
            index++;
        }

        System.out.println(solution(arr));
    }
}
/*
input
10
-59 -36 -13 1 -53 -92 -2 -96 -54 75
output
1
*/