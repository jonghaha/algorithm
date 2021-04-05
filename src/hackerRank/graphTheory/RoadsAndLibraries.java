package hackerRank.graphTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class RoadsAndLibraries {
    static long solution(int n, int c_lib, int c_road, int[][] cities) {
        if (c_lib <= c_road) {
            return (c_lib * n);
        }

        long cost = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                long tmpCost = c_lib;
                Stack<Integer> stack = new Stack<>();
                stack.push(i);
                visited[i] = true;
                while (!stack.empty()) {
                    int u = stack.pop();
                    for (int j = 0; j < cities[u].length; j++) {
                        int v = cities[u][j];
                        if (!visited[i]) {
                            stack.push(v);
                            visited[v] = true;
                            tmpCost += c_road;
                        }
                    }
                }
                cost += tmpCost;
            }
        }

        return cost;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int c_lib = Integer.parseInt(str[2]);
        int c_road = Integer.parseInt(str[3]);

        int[][] cities = new int[m][2];

        for(int i = 0; i < m; i++) {
            String[] str2 = br.readLine().split(" ");

            for (int j = 0; j < 2; j++) {
                cities[i][j] = Integer.parseInt(str2[j]);
            }
        }

        System.out.println(solution(n, c_lib, c_road, cities));
    }
}
/*
input
6 6 2 5
1 3
3 4
2 4
1 2
2 3
5 6
output
4
12
*/
