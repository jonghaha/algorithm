package programmers;

import java.util.HashMap;

// 완주하지 못한 선수
public class UnfinishedRunner {
    static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> participantManage = new HashMap<>();

        for(String name : participant) {
            participantManage.put(name, participantManage.getOrDefault(name, 0) + 1);
        }

        for(String name : completion) {
            participantManage.put(name, participantManage.get(name) - 1);
        }

        for(String name : participantManage.keySet()) {
            if(participantManage.get(name) != 0) {
                answer = name;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        // return "leo"
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        // return "vinko"
//        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
//        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        // return "mislav"
//        String[] participant = {"mislav", "stanko", "mislav", "ana"};
//        String[] completion = {"stanko", "ana", "mislav"};

        System.out.println(solution(participant, completion));
    }
}
