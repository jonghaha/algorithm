package programmers;

import java.util.ArrayList;
import java.util.Arrays;

// 두 개 뽑아서 더하기
public class TwoOutAndPlus {
    static int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();

        int result = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                result = numbers[i] + numbers[j];
                if (!list.contains(result)) {
                    list.add(result);
                }
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        // return {2, 3, 4, 5, 6, 7}
        int[] numbers = {2, 1, 3, 4, 1};
        // return {2, 5, 7, 9, 12}
//        int[] numbers = {5, 0, 2, 7};

        int[] result = solution(numbers);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
