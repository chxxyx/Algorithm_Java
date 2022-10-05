package Programmers;
/*
        221005

        <없는 숫자 더하기>

        문제 설명
        0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
        numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.

        제한사항
        1 ≤ numbers의 길이 ≤ 9
        0 ≤ numbers의 모든 원소 ≤ 9
        numbers의 모든 원소는 서로 다릅니다.
 */


public class Solution22 {
    /*
        그냥 간단하게 어차피 0 ~ 9까지인 건 정해졌으니까
        0 ~ 9까지의 합이랑 주어지는 numbers의 합을 빼줬당

        1. 0~9까지의 원소를 갖는 arr 배열 만들기

     */

    public static int solution(int[] numbers) {

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8 ,9};

        int arrSum = 0; // arr의 합
        int numbersSum = 0; // numbers 배열의 합

        // arr[]의 합을 구하는 반복문
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i]; // 45
        }

        // numbers[]의 합을 구하는 반복문
        for (int i = 0; i < numbers.length; i++) {
            numbersSum += numbers[i];
        }

        // arr[] 합 - numbers[] 합
        return arrSum - numbersSum;
    }

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,6,7,8,0};

        System.out.println(solution(numbers));

    }
}
