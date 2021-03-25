package hackerRank;

public class PlusMinus {
    static void solution(int[] arr) {
        int arrSize = arr.length;
        int positiveCount = 0;
        int negativeCount = 0;
        int zerosCount = 0;

        for(int a : arr) {
            if(a == 0) {
                zerosCount++;
            }
            if(a > 0) {
                positiveCount++;
            }
            if(a < 0) {
                negativeCount++;
            }
        }

        System.out.println(String.format("%.6f", (float)positiveCount / arrSize));
        System.out.println(String.format("%.6f", (float)negativeCount / arrSize));
        System.out.println(String.format("%.6f", (float)zerosCount / arrSize));
    }

    public static void main(String[] args) {
        // input
        // -4, 3, -9, 0, 4, 1
        // output
        // 0.500000
        // 0.333333
        // 0.166667
    }
}
