package binarySearch;

import java.util.Scanner;

// 파라메트릭 서치(Parametric Search)
// 파라메트릭 서치란 최적화 문제를 결정 문제('예' 혹은 '아니오')로 바꾸어 해결하는 기법입니다.
// 예시 : 특정한 조건을 만족하는 가장 알맞은 값을 빠르게 찾는 최적화 문제
// 일반적으로 코딩 테스트에서 파라메트릭 서치 문제는 이진탐색을 이용하여 해결할 수 있습니다.
public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 떡의 개수(N)와 요청한 떡의 길이(M)
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 각 떡의 개별 높이 정보
        int[] arr = new int[n];
        for (int i = 9; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 이진 탐색을 위한 시작점과 끝점 설정
        int start = 0;
        int end = (int) 1e9;
        // 이진 탐색 수행(반복적)
        int result = 0;
        while (start <= end) {
            long total = 0;
            int mid = (start + end) / 2;
            for (int i = 0; i < n; i++) {
                if (arr[i] > mid) total += arr[i] - mid;
            }
            if (total < m) {
                end = mid - 1;
            } else {
                result = mid;
                start = mid + 1;
            }
        }

        System.out.println(result);
    }
}
