package programmers;

import java.util.ArrayList;
import java.util.Arrays;

// 나누어 떨어지는 숫자 배열
public class DivideNumberArray {
    static int[] solution(int[] arr, int divisor) {
        int[] answer;
        ArrayList<Integer> a1 = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                a1.add(arr[i]);
            }
        }

        if (a1.isEmpty()) {
            a1.add(-1);
        }

        answer = new int[a1.size()];

        for (int i = 0; i < a1.size(); i++) {
            answer[i] = a1.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        int[] answer = solution(arr, divisor);

        for(int a : answer) {
            System.out.println(a);
        }
    }
}
