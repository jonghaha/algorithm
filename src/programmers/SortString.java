package programmers;

import java.util.ArrayList;
import java.util.Collections;

// 문자열 내 마음대로 정렬하기
public class SortString {
    static String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        ArrayList<String> array = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            array.add(strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(array);

        for (int i = 0; i < array.size(); i++) {
            answer[i] = array.get(i).substring(1);
        }

        return answer;
    }
    public static void main(String[] args) {
        // return {"car", "bed", "sun"}
        String[] strings = {"sun", "bed", "car"};
        int n = 1;

        // return {"abcd", "abce", "cdx"}
//        String[] strings = {"abce", "abcd", "cdx"};
//        int n = 2;

        String[] answer = solution(strings, n);

        for(String s : answer) {
            System.out.println(s);
        }
    }
}
