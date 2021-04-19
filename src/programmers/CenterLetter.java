package programmers;

// 가운데 글자 가져오기
public class CenterLetter {
    static String solution(String s) {
        String answer = "";

        if (s.length() % 2 == 0) {
            answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
        } else {
            answer = s.substring(s.length() / 2, s.length() / 2 + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        // return "c"
        String s = "abcde";
        // return "we"
//        String s = "qwer";
        System.out.println(solution(s));
    }
}
