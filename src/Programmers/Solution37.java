package Programmers;
/*
        221020

        <이진 변환 반복하기>

        문제 설명
        0과 1로 이루어진 어떤 문자열 x에 대한 이진 변환을 다음과 같이 정의합니다.

        x의 모든 0을 제거합니다.
        x의 길이를 c라고 하면, x를 "c를 2진법으로 표현한 문자열"로 바꿉니다.
        예를 들어, x = "0111010"이라면, x에 이진 변환을 가하면 x = "0111010" -> "1111" -> "100" 이 됩니다.

        0과 1로 이루어진 문자열 s가 매개변수로 주어집니다. s가 "1"이 될 때까지 계속해서 s에 이진 변환을 가했을 때,
        이진 변환의 횟수와 변환 과정에서 제거된 모든 0의 개수를 각각 배열에 담아 return 하도록 solution 함수를 완성해주세요.

 */

public class Solution37 {
    /*
            반환해야 하는 거 : [해당 문자열이 1이 될 때까지의 횟수, 제거된 0의 개수]

            1. 문자열에서 0을 제거해야함  -> 0111010 이면,
            2. 제거한 0의 갯수 담을 zeroCount 변수, 제거할 때마다 ++ -> 제거해야 할 0의 갯수는 == 3
            3. 처음 한 번 0을 다 제거하고, 제거한 후의 s 문자열의 길이를 이진법을 변환해주는 거임 -> 한 번 제거하고
            4. 1이 될 때까지 제거 -> 이진 변환 반복

            <공부한 내용>
            java.lang패키지에 있는 Integer클래스는 10진수 값을 2진수로 바꾸고 2진수를 10진수로 바꿔주는 함수를 지원한다.

            10진수 -> 2진수(int) : Integer.toBinaryString(8); == 1000
            2진수 -> 10진수(String) : Integer.parseInt("1000",2); == 8

     */

    public static int[] solution(String s) {

        int zeroCount = 0; // 제거된 0의 갯수
        int cnt = 0; // 1이 될 때까지 이진 변환하는 횟수

        while (!s.equals("1")) { // 1. 문자열이 1이 될 때까지 반복
           int length = s.length(); // 2. 현재 문자열 길이
           s = s.replace("0", ""); // 0 제거
           cnt++; // 제거한 후 횟수 추가
           zeroCount += (length-s.length()); // 현재 문자열의 길이 - 지금 제거된 문자열 길이 = 제거된 0의 갯수

           s = Integer.toBinaryString(s.length()); // 이진변환 Integer 클래스의 메소드 활용
        }
        return new int[]{cnt, zeroCount};
    }

    public static void main(String[] args) {

        System.out.println(solution("0111010"));
    }

}
