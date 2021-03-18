package implementation;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기
        String[] direction = sc.nextLine().split(" ");
        int x = 1, y = 1;

        // 방향벡터
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] moveType = {'L', 'R', 'U', 'D'};

        for(int i = 0; i < direction.length; i++) {
            char d = direction[i].charAt(0);

            int nx = -1, ny = -1;
            for(int j = 0; j < 4; j++) {
                if(d == moveType[j]) {
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }

            if(nx < 1 || ny < 1 || nx > n || ny > n) continue;

            x = nx;
            y = ny;
        }

        System.out.println("좌표 (" + x + ", " + y + ")");
    }
}
