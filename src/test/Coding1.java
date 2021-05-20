package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coding1 {
	static int index = 0;

	static String solution(String encodingString) {
		StringBuilder decodingString = new StringBuilder();
		int recurringNumber = 0;

		while (index < encodingString.length()) {
			char chr = encodingString.charAt(index);
			index++;
			if (Character.isDigit(chr)) {
				recurringNumber = chr - '0';
			} else if (chr == '[') {
				String recurringString = solution(encodingString);
				for (int i = 0; i < recurringNumber; i++) {
					decodingString.append(recurringString);
				}
			} else if (chr == ']') {
				break;
			} else {
				decodingString.append(chr);
			}
		}

		return decodingString.toString();
	}

	public static void main(String[] args) throws IOException {
		// example input 1 - 3[a]z
		// example input 2 - 3[a4[c]]
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String encodingString = br.readLine();

		System.out.println(solution(encodingString));
	}
}
