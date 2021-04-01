package hackerRank.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LuckBalance {
    static int solution(int k, int[][] contests) {
        int totalLuck = 0;
        int importContestCount = 0;
        List<Integer> importContests = new ArrayList<>();

        for(int i = 0; i < contests.length; i++) {
            if (contests[i][1] == 1) {
                importContests.add(contests[i][0]);
            } else {
                totalLuck += contests[i][0];
            }
        }

        Collections.sort(importContests, Collections.reverseOrder());

        for(int luck : importContests) {
            if(importContestCount < k) {
                totalLuck += luck;
                importContestCount++;
            } else {
                totalLuck -= luck;
            }
        }

        return totalLuck;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);
        int[][] contests = new int[n][2];

        for(int i = 0; i < n; i++) {
            String[] luck = br.readLine().split(" ");
            for(int j = 0; j < 2; j++) {
                contests[i][j] = Integer.parseInt(luck[j]);
            }
        }

        System.out.println(solution(k, contests));
    }
}
/*
input
6 3
5 1
2 1
1 1
8 1
10 0
5 0
output
29
*/