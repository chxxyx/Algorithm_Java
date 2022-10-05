package Programmers;
/*
        221005

        <핸드폰 번호 가리기>

        문제 설명
        프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
        전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.

        제한 조건
        phone_number는 길이 4 이상, 20이하인 문자열입니다.
 */


public class Solution18 {

        public String solution(String phone_number) {
            //   StringBuilder : String 객체를 더할 때 새로운 객체를 생성하는 것이 아니기 때문에 상대적으로 속도도 빠르고 메모리도 효율적으로 이용할 수 있다.
            StringBuilder answer = new StringBuilder(phone_number);

                                // 뒷자리 4개 전까지는 다 *로 표시해줘야 함
            for (int i = 0; i < phone_number.length()-4; i++) {

                    answer.setCharAt(i, '*');
                    //StringBuilder의 함수인 setCharAt(int index, char ch)를 사용하여 주어진 인덱스에 있는 문자를 주어진 char로 바꿔준다.
            }

            return answer.toString();
            //StringBuilder는 문자열을 뽑아낼 때 .toString()을 사용한다.
        }


    public static void main(String[] args) {

    }
}
