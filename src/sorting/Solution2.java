package sorting;

// 삽입정렬 시간복잡도 - O(N2)
// 삽입정렬은 거의 정렬되어 있는 상태이면 최소의 경우 O(N)의 시간 복잡도
public class Solution2 {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
        int arrLength = arr.length;

        for(int i = 1; i < arrLength; i++) {
            for(int j = i; j > 0; j--) {
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }

        for(int a : arr) {
            System.out.print(a);
        }
    }
}
