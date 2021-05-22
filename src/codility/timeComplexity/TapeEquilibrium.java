package codility.timeComplexity;

import java.util.Arrays;

public class TapeEquilibrium {
	static int solution(int[] A) {
		int result = Integer.MAX_VALUE;
		int p = 0;
		int aLength = A.length;

		while (p < aLength - 1) {
			int pSum = 0;
			int exSum = 0;
			int diff = 0;
			int[] pArrary = Arrays.copyOf(A, p + 1);
			int[] exArrary = Arrays.copyOfRange(A, p + 1, aLength);

			pSum = Arrays.stream(pArrary).sum();
			exSum = Arrays.stream(exArrary).sum();
			diff = Math.abs(pSum - exSum);

			result = Math.min(result, diff);
			p++;
		}

		return result;
	}

	public static void main(String[] args) {
		int[] A = {3, 1, 2, 4, 3};
		System.out.println(solution(A));
	}
}
