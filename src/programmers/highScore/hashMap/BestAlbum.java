package programmers.highScore.hashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BestAlbum {
	static int[] solution(String[] genres, int[] plays) {
		int[] answer = {};
		List<Integer> answerList = new ArrayList<>();
		Map<String, Integer> genresMap = new HashMap<>();

		for(int i = 0; i < genres.length; i++) {
			genresMap.put(genres[i], plays[i]);
		}

		List<String> keySetList = new ArrayList<>(genresMap.keySet());
		Collections.sort(keySetList, (o1, o2) -> (genresMap.get(o2).compareTo(genresMap.get(o1))));

		for (String key : keySetList) {
			Map<Integer, Integer> genre = new HashMap<>();
			for (int i = 0; i < genres.length; i++) {
				if (key.equals(genres[i])) {
					genre.put(i, plays[i]);
				}
			}

			List<Integer> albumSort = new ArrayList<>(genre.keySet());
			Collections.sort(albumSort, (o1, o2) -> genre.get(o2).compareTo(genre.get(o1)));

			for (int i = 0; i < 2; i++) {
				answerList.add(albumSort.get(i));
			}
		}

		answer = new int[answerList.size()];
		for (int i = 0; i < answerList.size(); i++) {
			answer[i] = answerList.get(i);
		}

		return answer;
	}

	public static void main(String[] args) {
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};

		int[] answer = solution(genres, plays);
		for (int i : answer) {
			System.out.println(i);
		}
	}
}
