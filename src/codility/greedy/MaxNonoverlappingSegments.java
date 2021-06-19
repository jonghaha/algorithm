package codility.greedy;

public class MaxNonoverlappingSegments {
	static int solution(int[] A, int[] B) {
		int count = 1;
		int aLength = A.length;
		int bLength = B.length;
		if (aLength < 1 || bLength < 1) {
			return 0;
		}

		int bEnd = B[0];
		for (int i = 1; i < aLength; i++) {
			if (A[i] > bEnd) {
				count++;
				bEnd = B[i];
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int[] A = {1, 3, 7, 9, 9};
		int[] B = {5, 6, 8, 9, 10};

		System.out.println(solution(A, B));
	}
}
