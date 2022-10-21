package Programmers;
/*
        221021

        <이상한 문자 만들기>

        문제 설명
        문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
        각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
        각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

        제한 사항
        문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
        첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.

        입출력 예
        s	return
        "try hello world"	"TrY HeLlO WoRlD"
        입출력 예 설명
        "try hello world"는 세 단어 "try", "hello", "world"로 구성되어 있습니다.
        각 단어의 짝수번째 문자를 대문자로, 홀수번째 문자를 소문자로 바꾸면 "TrY", "HeLlO", "WoRlD"입니다.
        따라서 "TrY HeLlO WoRlD" 를 리턴합니다.
 */

public class Solution40 {

    public static String solution(String s) {
        String answer = "";

        String[] str = s.split(""); // [t, r, y,  , h, e, l, l, o,  , w, o, r, l, d]

        int idx = 0;

        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(" ")) { // 배열의 i번째가 공백 " " 일 때 인덱스 번호를 초기화 해준다.
                idx = 0;
            } else if (idx % 2 == 0) {
                str[i] = str[i].toUpperCase(); // 짝수일 때 대문자로 변경해준다.
                idx++; // idx+1 씩 해줘야함, 안 해주면 계속 0번째인 인덱스 값을 가지고 해당 문자만 대문자, 소문자로 바꿔준다 ..
                // +1씩 해줘야 인덱스 번호가 홀수, 숫자인지 파악할 수 있음

            } else if (idx % 2 != 0) {
                str[i] = str[i].toLowerCase(); // 홀수일 때 소문자로 !
                idx++;
            }
            answer += str[i];
        }
        return answer;
    }

    public String solution2(String s) {

        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
    }
}
