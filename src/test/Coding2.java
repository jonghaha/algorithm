package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Coding2 {

	// x - 가로, y - 세로
	static int solution(int x, int y, int[][] map) {
		int maxValue = 0;
		int leftTop = map[0][0];
		int rightTop = map[0][x-1];
		// 방문 위치 확인 배열
		boolean[][] visit = new boolean[y][x];

		// 왼쪽 상단, 오른쪽 상단 값 저장
		maxValue = leftTop + rightTop;

		// 초기 x 탐색 범위 셋팅
		int neoRange = 2;
		int prodoRange = 2;
		int divide = x / 2;
		for(int i = 1; i < map.length; i++) {
			if(neoRange > divide) {
				// 각 각의 탐색 범위가 X 길이 반 이상일 때 최대값 2개 선택
				Arrays.sort(map[i]);
				for (int k = x - 1; x-2 <= k; k--) {
					maxValue += map[i][k];
				}
			} else {
				// 최대값 정보
				int iMax = 0;
				int maxX = 0;
				int maxY = 0;

				for (int j = 0; j < neoRange; j++) {
					if (iMax < map[i][j] && !visit[i][j]) {
						// 방문 되지 않은 최대값 선택
						iMax = map[i][j];
						maxY = i;
						maxX = j;
					}
				}

				// 최대값 저장 및 방문 표시
				maxValue += iMax;
				visit[maxY][maxX] = true;
				if (neoRange < x) {
					neoRange++;
				}

				// 최대값 정보 리셋
				iMax = 0;
				maxX = 0;
				maxY = 0;

				for (int j = x - 1; j > prodoRange; j--) {
					if (iMax < map[i][j] && !visit[i][j]) {
						// 방문 되지 않은 최대값 선택
						iMax = map[i][j];
						maxY = i;
						maxX = j;
					}
				}

				// 최대값 저장 및 방문 표시
				maxValue += iMax;
				visit[maxY][maxX] = true;
				if(prodoRange > 0) {
					prodoRange--;
				}
			}
		}

		return maxValue;
	}

	public static void main(String[] args) throws IOException {
/*
example input 1
입력 :
3
4
3,1,1,2,5,1,1,5,5,2,1,1
출력 : 24
*/

/*
example input 2
입력:
7
5
1,0,0,0,0,0,1,2,0,0,0,0,3,0,2,0,9,0,0,0,0,0,3,0,5,4,0,0,1,0,2,3,0,0,6
출력 : 28
*/

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		String[] strArr = br.readLine().split(",");

		int[][] map = new int[y][x];

		int index = 0;
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				map[i][j] = Integer.parseInt(strArr[index]);
				index++;
			}
		}

		System.out.println(solution(x, y, map));
	}
}
