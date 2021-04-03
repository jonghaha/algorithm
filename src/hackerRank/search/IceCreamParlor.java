package hackerRank.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class IceCreamParlor {
    static void solution(int m, int[] arr) {
        HashMap<Integer, Integer> iceCream = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            int iceCreamID = i + 1;
            int cost = arr[i];
            int otherCost = m - cost;
            if (iceCream.containsKey(otherCost)) {
                System.out.println(iceCream.get(otherCost) + " " + iceCreamID);
            }
            iceCream.putIfAbsent(cost, iceCreamID);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        solution(m, arr);
    }
}
/*
input
5
5
1 4 5 3 2
output
1 4
*/
