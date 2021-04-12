package programmers;

public class Continuous1 {
    static int solution(String s) {
        int answer = 0;
        int count1 = 0;
        int sLength = s.length();

        for (int i = 0; i < sLength; i++) {
            if (i == (sLength - 1)) {
                if (s.charAt(i) == '1') {
                    count1++;
                    answer = Math.max(answer, count1);
                } else {
                    answer = Math.max(answer, count1);
                    count1 = 0;
                }
            } else if (s.charAt(i) == '1') {
                count1++;
            } else {
                answer = Math.max(answer, count1);
                count1 = 0;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        String s = "110111";
        System.out.println(solution(s));
    }
}
