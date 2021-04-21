package programmers;

// 소수 찾기
public class FindDecimal {
    static int solution(int n) {
        int answer = 0;
        boolean[] checked = new boolean[n + 1];

        // 에라토스테네스의 체
        for (int i = 2; i <= n; i++) {
            if (!checked[i]) {
                answer++;
            }
            for (int j = i; j <= n; j += i) {
                if (!checked[j]) {
                    checked[j] = true;
                }
            }
        }
        
        return answer;
    }
    public static void main(String[] args) {
        // return 4
        int n = 10;
        // return 3
//        int n = 5;

        System.out.println(solution(n));
    }
}
