package Programmers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/*
        220928
        <정수 내림차순으로 정렬하기>

        함수 solution은 정수 n을 매개변수로 입력받습니다.
        n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
        예를들어 n이 118372면 873211을 리턴하면 됩니다.

        제한 조건
        n은 1이상 8000000000 이하인 자연수입니다.
 */

public class Solution9 {
        public static long solution(long n) {

            // 1. long n을 문자열로 바꿔주기
            String str = Long.toString(n);

            // 2. 리스트를 사용해서 문자 하나씩 리스트에 넣어줄 거임
            List<Character> list = new ArrayList<Character>();

            // 3. 문자열을 char타입으로 변환해서 한글자씩 리스트에 담아준다.
            // charAt(문자열에서 문자의 순서) : String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해주는 메소드이다.
            for (int i = 0; i < str.length(); i++) {
                list.add(str.charAt(i)); // 문자열을 char타입으로 변환해서 한글자씩 리스트에 담아준다.
            }

            // 4. 정렬은 리스트의 내림차순 정렬 메소드를 사용
            list.sort(Comparator.reverseOrder());

            // 5. 리스트를 다시 새로운 문자열에 담아준다.
            String strResult = "";
            for (int i = 0; i < list.size(); i++) {
                strResult += list.get(i);
            }

            // 6. 반환은 문자열을 long 타입으로 반환해준다.
            return Long.parseLong(strResult);
        }

        public static void main(String[] args) {

            System.out.println(solution(118372));

        }
}

