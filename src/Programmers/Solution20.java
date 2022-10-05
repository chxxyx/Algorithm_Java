package Programmers;
/*
        221005

        <제일 작은 수 제거하기>
        문제 설명
        정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
        단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
        예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

        제한 조건
        arr은 길이 1 이상인 배열입니다.
        인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
        입출력 예
        arr	return
        [4,3,2,1]	[4,3,2]
        [10]	[-1]
 */

import java.util.ArrayList;

public class Solution20 {

    /*
            1. ArrayList로 반환하게 바꿔주기
            2. arr의 최소값 찾아서 최소값보다 큰 수만 answer에 담아주려고 한당

     */

    public static ArrayList<Integer> solution(int[] arr) {

        // 반환할 arrayList 만들기
        ArrayList<Integer> answer = new ArrayList<>();

        // 최소값 구할 변수
        int min = arr[0];

        // 최소값 구하는 반복문
        for (int i = 0; i < arr.length; i++) {

            if(min > arr[i]) {
                min = arr[i];
            }
        }

        // 최소값보다 큰 수만 찾아서 answer 리스트에 추가해준다.
        for (int i = 0; i < arr.length; i++) {
            if(min < arr[i]) {
                answer.add(arr[i]);
            }
        }

        // arr의 원소 갯수가 1개일 경우에는 -1 반환하기
        if(arr.length == 1) {
            answer.add(-1);
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] arr = {4,3,2,1};
        System.out.println(solution(arr));

        arr = new int[]{10};
        System.out.println(solution(arr));

    }

}
