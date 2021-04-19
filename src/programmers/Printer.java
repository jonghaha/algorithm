package programmers;

import java.util.Collections;
import java.util.PriorityQueue;

// 프린터
public class Printer {
    static int solution(int[] priorities, int location) {
        int answer = 1;

        PriorityQueue priority = new PriorityQueue<>(Collections.reverseOrder());

        for(int task : priorities){
            priority.add(task);
        }

        while(!priority.isEmpty()){
            for(int i = 0; i<priorities.length; i++){
                if (priorities[i] == (int) priority.peek()) {
                    if (i == location) {
                        return answer;
                    }
                    priority.poll();
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        // return 1
//        int[] priorities = {2, 1, 3, 2};
//        int location = 2;

        // return 5
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;

        System.out.println(solution(priorities, location));
    }
}
