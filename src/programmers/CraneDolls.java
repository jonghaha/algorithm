package programmers;

import java.util.Stack;

// 크레인 인형 뽑기
public class CraneDolls {
    static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i] - 1] != 0) {
                    if (s.isEmpty()) {
                        s.push(board[j][moves[i] - 1]);
                    } else {
                        if (s.peek() == board[j][moves[i] - 1]) {
                            s.pop();
                            answer += 2;
                        } else {
                            s.push(board[j][moves[i] - 1]);
                        }
                    }
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        System.out.println(solution(board, moves));
    }
}
