package Programmers;
/*
        221009

        <문자열 다루기 기본>

        문제 설명
        문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
        예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

        제한 사항
        s는 길이 1 이상, 길이 8 이하인 문자열입니다.
        s는 영문 알파벳 대소문자 또는 0부터 9까지 숫자로 이루어져 있습니다.

 */

public class Solution29 {

    /*
        1.
        Double.parseDouble() 방법을 검색해봤다.

        Double.parseDouble() 그리고 Double.valueOf() 메서드는
        주어진 문자열을 이중으로 구문 분석하고 이 두 메서드 모두 NumberFormatException 문자열을 구문 분석할 수 없는 경우.
        주어진 문자열이 숫자인지 확인하려면 Double.parseDouble() try-catch 블록 내에서 메서드를 호출하고,
        예외가 throw되지 않으면 true를 반환합니다. 그렇지 않으면 거짓.
     */
    public static boolean solution(String s) {
        if(s.length() == 4 || s.length() ==6 ) {  // s 문자열의 길이를 설정해주지 않아서 계속 오답이었다 ㅠㅠ

            // 예외 처리 문으로 시도했음
            try {
                Integer.parseInt(s);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        else return false;
        // 근데 오답이었음 .. 왜 계속 틀리나 했더니 내가 s 문자열 길이를 제한 길이에 맞춰서 조건을 안 적어서 .. ㅠ
        // 문제를 좀 정확하게 보자 쉬운 거 같다고 까불지 말고 ;
    }

    /*
        이건 그냥 참고용 !
        regex를 인수로 사용하고true 또는false 부울 값을 반환하는String 클래스의 matched()메서드를 사용
     */
    public static boolean solution2(String s) {

        boolean answer = true;
        if(s.length() == 4 || s.length() ==6 ) {
            answer = s.matches("[+-]?\\d*(\\.\\d+)?");
        }else {
            answer = false;
        }
        return answer;
    }

    public static boolean solution3(String s) {
        boolean answer = true;

        if (s.length() == 4 || s.length() ==6) { // s 문자열의 길이를 설정해주지 않아서 계속 오답이었다 ㅠㅠ

            for (int i = 0; i < s.length(); i++) {

                if (!Character.isDigit(s.charAt(i))) {
                    answer = false;
                }
            }
        } else { // 제한 길이가 맞지 않으면 그냥 false 반환
            return false;
        }

        return answer;
    }

}
