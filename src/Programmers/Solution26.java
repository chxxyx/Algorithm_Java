package Programmers;
/*
        221006

        <내적>

        - 문제 설명
        길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다.
        a와 b의 내적을 return 하도록 solution 함수를 완성해주세요.

        이때, a와 b의 내적은 a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1] 입니다. (n은 a, b의 길이)

        입출력 설명

        1. a와 b의 내적은 1*(-3) + 2*(-1) + 3*0 + 4*2 = 3 입니다.
        2. a와 b의 내적은 (-1)*1 + 0*0 + 1*(-1) = -2 입니다.
 */

public class Solution26 {

    /*
            진짜 너무 쉽게 풀어서 당황한 문제 ..
            a, b 배열의 길이가 동일하므로 나는 그냥 a 배열을 돌면서
             a[i] * b[i] 값을 계속 answer에 더해줬다.

     */

    public static int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};
        System.out.println(solution(a,b));

        a = new int[] {-1,0,1};
        b = new int[] {1,0,-1};
        System.out.println(solution(a, b));

    }
}
