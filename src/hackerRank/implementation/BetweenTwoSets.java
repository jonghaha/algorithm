package hackerRank.implementation;

import java.util.List;

public class BetweenTwoSets {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int gcdInt = gcd(b);
        int lcmInt = lcm(a);

        int count = 0;
        int index = 1;
        int comp = 0;

        while (comp < gcdInt) {
            comp = lcmInt * index;

            if (gcdInt % comp == 0) {
                count ++;
            }

            index++;
        }

        return count;
    }

    private static int gcd(int a, int b) {
        while (b > 0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    private static int gcd(List<Integer> input){
        int result = input.get(0);

        for(int i = 1; i < input.size(); i++) {
            result = gcd(result, input.get(i));
        }

        return result;
    }

    private static int lcm(int a, int b){
        return a * (b / gcd(a, b));
    }

    private static int lcm(List<Integer> input){
        int result = input.get(0);

        for(int i = 1; i < input.size(); i++) {
            result = lcm(result, input.get(i));
        }

        return result;
    }

    public static void main(String[] args) {
        // input
        // 2 3
        // 2 4
        // 16 32 96
        // output
        // 3
    }
}
