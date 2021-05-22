package codility.arrayList;

import java.util.ArrayList;

public class CyclicRotation {
	static int[] solution(int[] A, int K) {
		int aLength = A.length;
		// 배열의 크기와 로테이션하는 숫자가 같을 때
		if(aLength == K) {
			return A;
		}

		boolean equalValue = true;
		ArrayList<Integer> aList = new ArrayList<>();

		for (int i = 0; i < aLength - 1; i++) {
			aList.add(A[i]);
			if (A[i] != A[i + 1]) {
				equalValue = false;
			}
			if (i == (aLength - 2)) {
				aList.add(A[i + 1]);
			}
		}

		// 배열이 같은 숫자일 때
		if (equalValue) {
			return A;
		}

		int aListSize = aList.size();
		for (int i = 0; i < K; i++) {
			int temp = aList.remove(aListSize - 1);
			aList.add(0, temp);
		}

		int[] result = new int[aListSize];
		for (int i = 0; i < aListSize; i++) {
			result[i] = aList.get(i);
		}

		return result;
	}

	public static void main(String[] args) {
		int[] A = {3, 8, 9, 7, 6};
		int K = 3;

		int[] result = solution(A, K);
		for (int r : result) {
			System.out.println(r);
		}
	}
}
