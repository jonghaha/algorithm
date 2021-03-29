package hackerRank.implementation;

import java.util.List;

public class SubarrayDivision {
    static int birthday(List<Integer> s, int d, int m) {
        int ways = 0;

        for(int i = 0; i < s.size() - m + 1; i++) {
            int startNum = i;
            int sum = 0;
            for(int j = 0; j < m; j++) {
                sum += s.get(startNum);
                startNum++;
            }

            if(d == sum) {
                ways++;
            }
        }

        return ways;
    }

    public static void main(String[] args) {
        // input
        // 1 2 1 3 2
        // 3 2
        // output
        // 2
    }
}
