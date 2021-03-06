package programmers;

public class ZigZeg {
    // n 행렬의 크기, r 행, c 열
    static long solution(int n, int r, int c) {
        long[][] nMatrix = new long[n][n];
        int x = 0, y = 0;
        long count = 1;

        nMatrix[x][y] = count++;

        while(count < n * n) {
            if(y + 1 < n) {
                y++;
            } else {
                x++;
            }

            nMatrix[x][y] = count++;
            while(y - 1 > -1 && x + 1 < n) {
                nMatrix[++x][--y] = count++;
            }

            if(x + 1 < n) {
                x++;
            } else {
                y++;
            }
            nMatrix[x][y] = count++;
            while(x - 1 > -1 && y + 1 < n) {
                nMatrix[--x][++y] = count++;
            }
        }

        for(long[] a : nMatrix) {
            for(long b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }

        return count;
    }

    public static void main(String[] agrs) {
        int n = 6;
        int r = 3;
        int c = 4;

        System.out.println(solution(n, r, c));

//        1 2 6 7 15
//        3 5 8 14 16
//        4 9 13 17 22
//        10 12 18 21 23
//        11 19 20 24 25
    }
}
