package hackerRank.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Pairs {
    static int solution(int k, int[] arr) {
        Arrays.sort(arr);
        int arrLength = arr.length;
        int matchCount = 0;

//        for (int i = 0; i < arrLength; i++) {
//            for (int j = i + 1; j < arrLength; j++) {
//                int diff = Math.abs(arr[i] - arr[j]);
//                if(k == diff) {
//                    matchCount++;
//                }
//            }
//        }

        for (int i = 0; i < arrLength; i++) {
            int other = arr[i] - k;
            int otherIndex = Arrays.binarySearch(arr, other);
            if (otherIndex >= 0 && otherIndex <= arrLength - 1) {
                matchCount++;
            }
        }

        return matchCount;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);

        String[] str1 = br.readLine().split(" ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str1[i]);
        }

        System.out.print(solution(k, arr));
    }
}
/*
intput
5 2
1 5 3 4 2
output
3
*/