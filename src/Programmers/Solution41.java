package Programmers;
/*
        221022

        <3진법 뒤집기>

        문제 설명
        자연수 n이 매개변수로 주어집니다.
        n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.

        제한사항
        n은 1 이상 100,000,000 이하인 자연수입니다.

        입출력 예
        n	result
        45	7
        125	229
        입출력 예 설명
        입출력 예 #1

        답을 도출하는 과정은 다음과 같습니다.
        n (10진법)	n (3진법)	앞뒤 반전(3진법)	10진법으로 표현
        45	        1200	        0021	        7
        따라서 7을 return 해야 합니다.
        입출력 예 #2

        답을 도출하는 과정은 다음과 같습니다.
        n (10진법)	n (3진법)	앞뒤 반전(3진법)	10진법으로 표현
        125	        11122	        22111	        229

 */

public class Solution41 {

    public static int solution(int n) {
        int answer = 0;

        // 입력받은 정수를 3진법으로 바꿔서 문자열 base 변수에 담아줬다.
        String base = Integer.toString(n,3);

        // 3진법 앞뒤 반전 ->StringBuffer를 사용해 문자열 앞뒤를 바꿔줬다.
        StringBuffer sb = new StringBuffer(base);
        String flip = sb.reverse().toString();

        // 3진법 10진법으로 바꾸기
        answer = Integer.parseInt(flip,3);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(125));
    }
}
