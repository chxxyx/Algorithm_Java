package zb;

import java.util.ArrayList;

public class Solution3 {
	public int[] solution(int[] answers) {

		int[][] person = {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5},
			{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};

		int[] count = new int[3];


		for (int i = 0; i < answers.length; i++) {
			if(answers[i] == person[0][i % person[0].length]) {
				count[0]++;
			}
			if(answers[i] == person[1][i % person[1].length]) {
				count[1]++;
			}
			if(answers[i] == person[2][i % person[2].length]) {
				count[2]++;
			}
		}

		int score = 0;

		// 가장 높은 스코어 확인
		for(int i = 0; i < 3; i++) {
			if(score < count[i]) {
				score = count[i];
			}
		}

		// 가장 높은 점수의 수포자 번호 ArrayList에 입력
		ArrayList<Integer> list = new ArrayList<Integer>();

		for(int i = 0; i < 3; i++) {
			if(score == count[i]) {
				list.add(i + 1);
			}
		}

		// ArrayList에 담긴 정보 Array에 입력
		int[] answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}
}
