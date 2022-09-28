package Programmers;
/*
       220927

       자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

       제한 조건
       n은 10,000,000,000이하인 자연수입니다.

 */
public class Solution6 {
    public int[] solution(long n) {

        // long n을 문자열로 바꿔주기
        String num = String.valueOf(n);

        int[] answer = new int[num.length()];
        int idx = 0; // answer 배열 인덱스 번호

        // 자릿수 합 문제 응용
        while(n > 0) {
            answer[idx] = (int) (n % 10); // 제발 배열 좀 까먹지 말아 주라 ..
            n /= 10;
            idx++;
        }
        return answer;
    }
}
