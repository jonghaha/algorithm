package sorting;

// 퀵정렬 시간복잡도 O(NlogN) 최악의 경우는 O(N2)
// 기준 데이터를 설정하고 기준보다 큰 데이터와 작은 데이터의 위치를 바꾸는 방법
// 가장 많이 사용되는 정렬 알고리즘, 프로그래밍 언어의 정렬 라이브러리으 근간이 되는 알고리즘
public class Solution3 {
    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) return; // 원소가 1개인 경우 종료
        int pivot = start; // 기준값(피벗)은 첫 번째 원소
        int left = start +1;
        int right = end;
        while (left <= right) {
            // 피벗보다 큰 데이터를 찾을 때까지 반복
            while (left <= end && arr[left] <= arr[pivot]) left++;
            // 피벗보다 작은 데이터를 찾을 때까지 반복
            while (right > start && arr[right] >= arr[pivot]) right--;
            // 엇갈렸다면 작은 데이터와 피벗을 교체
            if (left > right) {
                int temp = arr[pivot];
                arr[pivot] = arr[right];
                arr[right] = temp;
            } else { // 엇갈리지 않았으면 작은 데이터와 큰 데이터를 교체
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        // 분할 이후 왼쪽 부분과 오른쪽 부분에서 가가 정렬 수행
        quickSort(arr, start, right - 1);
        quickSort(arr, right + 1, end);
    }
    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
        int arrLength = arr.length;

        quickSort(arr, 0, arrLength - 1);
    }
}
