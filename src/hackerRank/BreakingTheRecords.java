package hackerRank;

public class BreakingTheRecords {
    static int[] solution(int[] scores) {
        int min = 0;
        int max = 0;
        int minCount = 0;
        int maxCount = 0;
        int[] result = new int[2];

        min = scores[0];
        max = scores[0];

        for(int i = 1; i < scores.length; i++) {
            if(scores[i] < min) {
                min = scores[i];
                minCount++;
            }

            if(scores[i] > max) {
                max = scores[i];
                maxCount++;
            }
        }

        result[0] = maxCount;
        result[1] = minCount;
        return result;
    }

    public static void main(String[] args) {
        // input
        // 9
        // 10 5 20 20 4 5 2 25 1
        // output
        // 2 4
    }
}
