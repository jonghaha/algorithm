package hackerRank.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class MarcsCakewalk {
    static long solution(int[] calorie) {
        Integer[] calorieSort = Arrays.stream(calorie).boxed().toArray(Integer[]::new);
        Arrays.sort(calorieSort, Collections.reverseOrder());

        long result = 0;
        for(int i = 0; i < calorieSort.length; i++) {
            result += calorieSort[i] * Math.pow(2, i);
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        String[] str = br.readLine().split(" ");
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        System.out.println(solution(arr));
    }
}
/*
input
3
1 3 2
output
11
*/