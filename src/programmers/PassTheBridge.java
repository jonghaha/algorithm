package programmers;

import java.util.LinkedList;
import java.util.Queue;

// 다리를 지나는 트럭
public class PassTheBridge {
    static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();

        int max = 0;
        for (int truck : truck_weights) {
            while (true) {
                if (q.isEmpty()) {
                    q.offer(truck);
                    max += truck;
                    answer++;
                    break;
                } else if (q.size() == bridge_length) {
                    max -= q.poll();
                } else {
                    if (max + truck > weight) {
                        q.offer(0);
                        answer++;
                    } else {
                        q.offer(truck);
                        max += truck;
                        answer++;
                        break;
                    }
                }
            }
        }

        return answer + bridge_length;
    }

    public static void main(String[] args) {
//        int bridge_length = 2;
//        int weight = 10;
//        int[] truck_weights = {7, 4, 5, 6};

//        int bridge_length = 100;
//        int weight = 100;
//        int[] truck_weights = {10};

        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};

        System.out.println(solution(bridge_length, weight, truck_weights));
    }
}
