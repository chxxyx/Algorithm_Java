package Programmers;
/*
        221010

        <약수의 개수와 덧셈>

        문제 설명
        두 정수 left와 right가 매개변수로 주어집니다.
        left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고,
        약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.

        제한사항
        1 ≤ left ≤ right ≤ 1,000

 */

public class Solution30 {
    /*
          문제 풀이 .
          1. left ~ right까지 반복문을 돌리고,
          2. 약수 갯수를 센다.
          3. 약수 갯수는 i++이 될 때마다 초기화 필요.
          4. 약수 갯수 세는 반복문이 종료되면,
          4-1. 약수 갯수가 짝수 일때, 홀수 일때의 조건문을 작성
          5. 홀수면 빼주고, 짝수면 더해준다.

          ->  사실 나는 문제를 또 급하게 봐서 ...
            약수 갯수만 더하면 되는 줄 알고 arrayList 만들고 그랬는데 그럴 필요가 전혀 없었음 ..
            문제를 좀 천천히 잘 보고 풀자 ... ^^..
     */

    public static int solution(int left, int right) {
        /*
             필요 한 거 :
                          1. 약수 갯수를 위한 cnt 변수
                          2.더해주고 빼줄 result 변수
                          3. 반복문과 조건문
         */

        int cnt = 0; //  약수 갯수
        int result = 0; // 반환 할 변수

        // left ~ right 까지 약수를 구하는 반복문 1.
        for(int i = left; i <= right; i++) {

            cnt = 0; // i++ 될 때마다 이전에 구했던 cnt 갯수를 초기화 해야 온전한 약수 갯수를 구할 수 있다.

            // 약수를 구하는 반복문 및 조건문 2.
            for(int p = 1; p <= i; p++) {
                if (i % p == 0) {
                  cnt++; // 약수를 찾을 때마다 cnt 변수에 하나씩 추가해줬다.
                }
            }
            // cnt 홀짝 여부 조건문
            if(cnt % 2 == 0) {
                result += i; // 짝수면 더하기
            } else {
                result -= i; // 홀수면 빼기
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution(13, 17));
    }
}
