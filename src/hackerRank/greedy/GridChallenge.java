package hackerRank.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GridChallenge {
    static String solution(String[] grid) {

        for(int i = 0; i < grid.length; i++) {
            char[] charArray = grid[i].toCharArray();
            Arrays.sort(charArray);
            grid[i] = String.valueOf(charArray);
        }

        for(int i = 0; i < grid[0].length(); i++) {
            for(int j = 0; j < grid.length - 1; j++) {
                if (grid[j].charAt(i) > grid[j + 1].charAt(i)) {
                    return "NO";
                }
            }
        }

        return "YES";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        String[] grid = new String[n];

        for(int i = 0; i < grid.length; i++) {
            grid[i] = br.readLine();
        }

        System.out.println(solution(grid));
    }
}
/*
input
1
5
ebacd
fghij
olmkn
trpqs
xywuv

output
YES
*/