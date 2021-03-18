package greedy;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // 첫 번째 문자를 숫자로 변경하여 결과에 대입.
        long result = str.charAt(0) - '0';
        for(int i = 1; i < str.length(); i++) {
            int num = str.charAt(i) - '0';
            // 두 수 중에 하나라도 0이나 1이면 + 연산.
            if(num < 2 || result < 2) {
                result += num;
            } else {
                result *= num;
            }
        }

        System.out.println(result);
    }
}
