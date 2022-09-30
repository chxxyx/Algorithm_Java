package Programmers;
/*
        220930

        <x만큼 간격이 있는 n개의 숫자>

        함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
        다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

        x는 -10000000 이상, 10000000 이하인 정수입니다.
        n은 1000 이하인 자연수입니다.

        x	n	answer
        2	5	[2,4,6,8,10]
        4	3	[4,8,12]
        -4	2	[-4, -8]
 */
import java.util.Arrays;
public class Solution11 {

        public static long[] solution(int x, int n) {
            long[] answer = new long[n]; // n의 개수 만큼

            long number = x;
            /*
                x : 더할 간격
                n : 배열 길이 (숫자 개수)
             */
            // answer[]를 순회하며 x를 넣어준다
            for(int i = 0; i < answer.length; i++) {
                answer[i] = number; // 0 번째 왔을 때 그대로 입력받을 값 x가 들어가고 (x값부터 시작해서 x간격 만큼 더해줘야 하니까)
                number += x; // x에 x를 더해줌 (x = 간격)
             }

            return answer;
        }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(2, 5)));
        System.out.println(Arrays.toString(solution(4, 3)));
        System.out.println(Arrays.toString(solution(-4, 2)));

    }
}
