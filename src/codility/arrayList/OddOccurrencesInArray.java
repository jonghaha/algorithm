package codility.arrayList;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {
	static int solution(int[] A) {
		int result = 0;

		Map<Integer, Integer> groupByInteger = new HashMap<>();

		for (int i = 0; i < A.length; i++) {
			groupByInteger.put(A[i], groupByInteger.getOrDefault(A[i], 0) + 1);
		}

		for (int key : groupByInteger.keySet()) {
			if (groupByInteger.get(key) % 2 != 0) {
				result = key;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] A = {9, 3, 9, 3, 9, 7, 9};
		System.out.println(solution(A));
	}
}
