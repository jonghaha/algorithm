package sorting;

// 계수 정렬 시간복잡도 O(N + K)
// 특정한 조건이 부합할 때만 사용할 수 있지만 매우 빠르게 동작하는 정렬 알고리즘(데이터의 크기 범위가 제한되어 정수 형태로 표현할 수 있을 때)
// 성적의 경우 100점 맞은 학생이 여러 명일 수 있기 때문에 계수 정렬이 효과적(같은 데이터가 여러 개 등장할 때)
public class Solution4 {
    public static final int MAX_VALUE = 9;

    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2};
        int arrLength = arr.length;

        int[] cnt = new int[MAX_VALUE + 1];

        for (int i = 0; i < arrLength; i++) {
            cnt[arr[i]] += 1;
        }
        for (int i = 0; i <= MAX_VALUE; i++) {
            for (int j = 0; j < cnt[i]; j++) {
                System.out.print(i + " ");
            }
        }
    }
}
