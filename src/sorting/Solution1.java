package sorting;

// 선택정렬 시간복잡도 - O(N2)
public class Solution1 {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
        int arrLength = arr.length;

        for(int i = 0; i < arrLength; i++) {
            int min_index = i;
            for(int j = i + 1; j < arrLength; j++) {
                if (arr[min_index] > arr[j]) {
                    min_index = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }

        for(int a : arr) {
            System.out.print(a + " ");
        }
    }
}
