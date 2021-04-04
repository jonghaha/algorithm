package hackerRank.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MissingNumbers {
    static int[] solution(int[] arr, int[] brr) {
        int[] result;
        Map<Integer, Integer> arrMap = new HashMap<>();
        Map<Integer, Integer> brrMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(arrMap.containsKey(arr[i])) {
                arrMap.put(arr[i], arrMap.get(arr[i]) + 1);
            } else {
                arrMap.put(arr[i], 1);
            }
        }

        for (int i = 0; i < brr.length; i++) {
            if(brrMap.containsKey(brr[i])) {
                brrMap.put(brr[i], brrMap.get(brr[i]) + 1);
            } else {
                brrMap.put(brr[i], 1);
            }
        }

        List<Integer> miss = new ArrayList<>();
        for (Integer i : brrMap.keySet()) {
            if (arrMap.get(i) == null || arrMap.get(i) < brrMap.get(i)) {
                miss.add(i);
            }
        }

        result = new int[miss.size()];
        for (int i = 0; i < miss.size(); i++) {
            result[i] = miss.get(i);
        }
        Arrays.sort(result);

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] str1 = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str1[i]);
        }

        int m = Integer.parseInt(br.readLine());
        int[] brr = new int[m];
        String[] str2 = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            brr[i] = Integer.parseInt(str2[i]);
        }

        int[] result = solution(arr, brr);
        for(int a : result) {
            System.out.print(a + " ");
        }
    }
}
/*
input
10
203 204 205 206 207 208 203 204 205 206
13
203 204 204 205 206 207 205 208 203 206 205 206 204
output
204 205 206
*/