package codility.timeComplexity;

public class FrogJmp {
	static int solution(int X, int Y, int D) {
		if (X == Y || D < 0) {
			return 0;
		}

		int count = 0;
		int division = (Y - X) / D;
		int remainder = (Y - X) % D;

		count += division;
		if (remainder > 0) {
			count += 1;
		}

		return count;
	}

	public static void main(String[] args) {
		int X = 1;
		int Y = 5;
		int D = 2;

		System.out.println(solution(X, Y, D));
	}
}
