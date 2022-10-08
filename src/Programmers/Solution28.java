package Programmers;
/*
        221008

        <문자열 내림차순으로 배치하기>

        문제 설명
        문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
        s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

        제한 사항
        str은 길이 1 이상인 문자열입니다.
        입출력 예
        s	return
        "Zbcdefg"	"gfedcbZ"
 */

import java.util.Arrays;

public class Solution28 {

    public String solution(String s) {
        String answer = "";

        char[] sArr = s.toCharArray(); // char 배열로 만들어준다.

        Arrays.sort(sArr); // 오름차순으로 먼저 정렬

        answer = new StringBuilder(new String(sArr)) // StringBuilder로 sArr을 받는다.
                    .reverse() // 내림차순 정렬
                    .toString(); // toSTring() 메소드로 객체의 정보나 값을 참조하게 해서 answer로 받는다.

        /*
            String          :  문자열 연산이 적고 멀티쓰레드 환경일 경우
            StringBuffer    :  문자열 연산이 많고 멀티쓰레드 환경일 경우
            StringBuilder   :  문자열 연산이 많고 단일쓰레드이거나 동기화를 고려하지 않아도 되는 경우

         */
        return answer;
    }

}
