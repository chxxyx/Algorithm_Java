package Programmers;
/*
        220930
        <문자열을 정수로 바꾸기>
        문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.

        제한 조건
        s의 길이는 1 이상 5이하입니다.
        s의 맨앞에는 부호(+, -)가 올 수 있습니다.
        s는 부호와 숫자로만 이루어져있습니다.
        s는 "0"으로 시작하지 않습니다.

        입출력 예
        예를들어 str이 "1234"이면 1234를 반환하고, "-1234"이면 -1234를 반환하면 됩니다.
        str은 부호(+,-)와 숫자로만 구성되어 있고, 잘못된 값이 입력되는 경우는 없습니다.
 */

public class Solution13 {
    /*
            간단하게 String을 int로 변환해주는 메소드를 사용해봤다.
     */

    public int solution(String s) {
        /*
        java.lang.Integer 클래스의 static 메소드인 parseInt() 메소드는
        파라미터로 숫자로 변환할 문자열을 입력받고,
        입력받은 문자열을 integer로 변환한 int 값을 리턴한다.
        */

        int answer = Integer.parseInt(s);

        return answer;
    }

    public int solution2(String s) {
        /*
        마찬가지로, valueOf() 메소드는 java.lang.Integer 클래스의 static 메소드이고,
        파라미터로 숫자로 변환할 문자열을 입력받는다 !
        parseInt() 와 가장 큰 차이점은,
        valueOf() 메소드는 문자열을 변환하여 Integer Object를 리턴한다.
        parseInt() 메소드는 primitive type인 int를 리턴한다.
         */

        int answer = Integer.valueOf(s).intValue();


        return answer;
    }

}
