package codility.timeComplexity;

public class PermMissingElem {
	static int solution(int[] A) {
		int sum = 0;
		int aLength = A.length;
		int N = aLength + 1;
		int nSum = 0;

		for (int i = 0; i < aLength; i++) {
			sum += A[i];
		}

		for (int i = 1; i <= N; i++) {
			nSum += i;
		}

		return nSum - sum;
	}

	public static void main(String[] args) {
		int[] A = {2, 3, 1, 5};
		System.out.println(solution(A));
	}
}
