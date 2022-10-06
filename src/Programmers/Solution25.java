package Programmers;
/*
        221006

        <가운데 글자 가져오기>

        - 문제 설명
        단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

        - 재한사항
        s는 길이가 1 이상, 100이하인 스트링입니다.

        - 입출력 예
               s	    return
            "abcde"	     "c"
            "qwer"	     "we"
 */

public class Solution25 {

    /*
            해당 문자열을 char 배열로 바꿔주고
            문자열의 길이가 짝수일 때와 홀수일 때의 조건문을 만들어줬다
            그다음 해당 문자열의 중간값을 구했다.
            짝수일 때는 가운데 글자가 2개씩 나오게끔 작성해봤다ㅠ

     */


    public static String solution(String s) {
        String answer = "";

        // char로 변환해서 받을 배열 생성
        char[] chArr = s.toCharArray();


        // 홀수일 때는 가운데 문자 1개만 출력하면 된다.
        if(s.length() % 2 != 0) {

            // 문자열(char 배열에서 mid 값을 가져오려고)의 중간값 구하기.
            int mid = s.length() / 2;

            // answer 문자열에 chArr[mid] = 가운데 문자를 문자열로 변환해서 담아줬다.
            answer = String.valueOf(chArr[mid]);
            return answer;

            // 짝수일 때는 가운데 문자 2개를 출력해야 한다.
        } else {

            // 중간값은 구현하기 편하게 중간 값보다 앞에 있는 인덱스로 구했다.
            int mid = s.length() / 2 - 1;

            // 마찬가지로,
            // answer 문자열에 chArr[mid]와 [mid+1]의 문자를 변환해서 담아줬다.
            answer += String.valueOf(chArr[mid]);
            answer += String.valueOf(chArr[mid+1]);
        }

        return answer;
    }


    public static void main(String[] args) {

        String s = "abcde";

        System.out.println(solution(s));

        String s2 = "test";

        System.out.println(solution(s2));

        String s3 = "helloword";

        System.out.println(solution(s3));


    }
}
