package Programmers;
/*
        221011

        <JadenCase 문자열 만들기>

        문제 설명
        JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다.
        단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)
        문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.

        제한 조건
        s는 길이 1 이상 200 이하인 문자열입니다.
        s는 알파벳과 숫자, 공백문자(" ")로 이루어져 있습니다.
        숫자는 단어의 첫 문자로만 나옵니다.
        숫자로만 이루어진 단어는 없습니다.
        공백문자가 연속해서 나올 수 있습니다.

 */

public class Solution31 {
    /*

        1. s 문자열을 먼저 소문자로 다 바꿔주기
        2. split 써서 문자 전부 다 자르기
        3. 자른 애들 새로운 배열에 넣기
        4. 공백 체크용 변수 선언
        5. 이전에 공백이 왔는지 체크 해주고,
        5-1. 이전이 공백이면 대문자, 아니면 소문자로 둔다.

     */

    public static String solution(String s) {
        String answer = "";

        String[] str = s.toLowerCase().split("");
        boolean check = true;

        for (String s2: str) {

            answer += check ? s2.toUpperCase() : s2;

            check = s2.equals(" ") ? true : false;

        }

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution("3people unFollowed me"));
    }
}
