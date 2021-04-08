package programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// 기능 개발
public class FunctionalDevelopment {
    static int[] solution(int[] progresses, int[] speeds) {
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = progresses.length - 1; i >= 0; i--)
            stack.add((100 - progresses[i]) / speeds[i] + ((100 - progresses[i]) % speeds[i] > 0 ? 1 : 0));

        List<Integer> s = new ArrayList<Integer>();

        while (!stack.isEmpty()) {
            int cnt = 1;
            int top = stack.pop();

            while (!stack.isEmpty() && stack.peek() <= top) {
                cnt++;
                stack.pop();
            }

            s.add(cnt);
        }

        int[] answer = new int[s.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = s.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        // return {2, 1}
//        int[] progresses = {93, 30, 55};
//        int[] speeds = {1, 30, 5};

        // return {1, 3, 2}
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};

        System.out.println(solution(progresses, speeds));
    }
}
