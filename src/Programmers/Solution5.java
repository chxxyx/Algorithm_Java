package Programmers;
/*
        220927

        문제 설명
        임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
        n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

        제한 사항
        n은 1이상, 50000000000000 이하인 양의 정수입니다.

        입출력 예#
        1121은 양의 정수 11의 제곱이므로, (11+1)를 제곱한 144를 리턴합니다.
        23은 양의 정수의 제곱이 아니므로, -1을 리턴합니다.
 */

public class Solution5 {
    // 1. 첫번째 방법 - 반복문 사용
    public long solution1(long n) {
        long answer = 0;

        for(long i = 1; i <= n; i++) {
            if (i * i == n) {
                answer = (i+1) * (i+1);
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
    }

    // 2. 두번째 방법 - Math 함수 사용
    public long solution2(long n) {
        long answer = 0;

        // n이 몇의 제곱인지 구하기
        double base = Math.sqrt(n);

        if(base % 1 == 0) { // 0으로 나누어 떨어지면 제곱이니까
            answer = (long) Math.pow(base+1, 2); // 제곱이니까 2번만 하면 된다
        } else{
            answer = -1;
        }
        return answer;
    }


}
