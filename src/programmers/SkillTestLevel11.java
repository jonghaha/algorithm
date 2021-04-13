package programmers;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// 스킬 체크 테스트 Level.1 문제 1
public class SkillTestLevel11 {
    static int[] solution(int N, int[] stages) {
        int[] answer = {};
        Map<Integer, Integer> stageSum = new HashMap<>();

        for (int i = 0; i < stages.length; i++) {
            if (stages[i] <= N) {
                if(stageSum.containsKey(stages[i])) {
                    stageSum.put(stages[i], stageSum.get(stages[i]) + 1);
                } else {
                    stageSum.put(stages[i], 1);
                }
            }
        }

        List<Map.Entry<Integer, Integer>> result = stageSum.entrySet().stream().sorted(Comparator.comparing(s -> s.getValue())).collect(Collectors.toList());
        answer = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i).getKey();
        }

        return answer;
    }

    public static void main(String[] args) {
        // return {3, 4, 2, 1, 5}
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        // return {4, 1, 2, 3}
//        int N = 4;
//        int[] stages = {4, 4, 4, 4, 4};

        int[] result = solution(N, stages);
        for (int r : result) {
            System.out.println(r);
        }
    }
}
