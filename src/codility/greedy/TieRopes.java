package codility.greedy;

public class TieRopes {
	static int solution(int K, int[] A) {
		int count = 0;
		int sum = 0;
		int aLength = A.length;

		if (aLength < 1 || K < 1) {
			return 0;
		}

		for (int i = 0; i < A.length; i++) {
			sum += A[i];
			if (sum >= K) {
				count++;
				sum = 0;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int K = 4;
		int[] A = {1, 2, 3, 4, 1, 1, 3};

		System.out.println(solution(K, A));
	}
}
