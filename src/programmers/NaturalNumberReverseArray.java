package programmers;

// 자연수 뒤집어 배열로 만들기
public class NaturalNumberReverseArray {
    static int[] solution(long n) {
        String a = "" + n;
        int[] answer = new int[a.length()];
        int cnt=0;

        while (n > 0) {
            answer[cnt] = (int) (n % 10);
            n /= 10;
            cnt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        long n = 12345;
        int[] result = solution(n);

        for (int r : result) {
            System.out.println(r);
        }
    }
}
