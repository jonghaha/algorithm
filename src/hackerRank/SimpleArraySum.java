package hackerRank;

import java.io.IOException;

public class SimpleArraySum {
    static int solution(int[] ar) {
        int sum = 0;
        for(int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }

        return sum;
    }

    public static void main(String[] args) throws IOException {
        // input
        // 6
        // 1 2 3 4 10 11
        // output
        // 31
    }
}
