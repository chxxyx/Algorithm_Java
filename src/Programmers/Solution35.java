package Programmers;
/*
        221014

        <최대공약수와 최소공배수>

        문제 설명
        두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
        배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
        예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
 */

import java.util.Arrays;

public class Solution35 {

    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
            answer[0] += gdc(n,m);
            answer[1] += lcm(n,m);

        return answer;
    }

    static int gdc(int n, int m) {
        if (n<m) {
            int tmp = n;
            n = m;
            m= tmp;
        }

        while (m!=0) {
            int r = n % m;
            n = m;
            m = r;
        }

        return n;
    }

    static int lcm(int n, int m) {
        return n * m / gdc(n,m);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 12)));
        System.out.println(Arrays.toString(solution(2, 5)));
        //System.out.println(solution(2, 5));
    }
}
