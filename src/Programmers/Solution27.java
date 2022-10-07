package Programmers;

import java.util.stream.Stream;
/*
        221007

        <최댓값과 최솟값>


 */

public class Solution27 {
/*
    나는 그냥 문자열을 " " 공백 기준으로 자르고 int[]을 하나 새로 받았다.
    int[]에서 최댓값, 최솟값을 각각 구해서 String answer에 문자열로 변환해서 넣어줬다.

    필요한 거 : 정수형 배열, 최댓값 변수, 최솟값 변수
 */
    public static String solution(String s) {
        String answer = "";


        // 스트림 사용해서 문자열을 공백 기준으로 하나씩 잘라줬고, int형 배열로 반환해줬음
        // 제발 스트림 까먹지 말자 제발 ... 제발 부탁..
        int[] strArr = Stream.of(s.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

        int min = strArr[0]; // 최솟값 변수
        int max = strArr[0]; // 최댓값 변수 -> (0번째 인덱스를 그냥 냅다 0으로 박아놔서 값이 이상하게 나왔다 걍 바보인 줄 .. ㅎㅎ ;; ^^)

        // 최소값 구하는 반복문
        for (int i = 0; i < strArr.length; i++) {

            if(min > strArr[i]) {
                min = strArr[i];
            }

         //   if(min > strArr[i]) min = strArr[i]; -> 이렇게 줄일 수도 있음 !

            if(max < strArr[i]) {
                max = strArr[i];
            }

         //  if(max > strArr[i]) max = strArr[i];

        }

        // answer 문자열에 min, max 정수를 String으로 변환해서 넣어줬다.
        answer += String.valueOf(min) + " " + String.valueOf(max);

        return answer;
    }

    public static void main(String[] args) {

        String s = "1 2 3 4";
        System.out.println(solution(s));

        String s2 = "-1 -2 -3 -4";
        System.out.println(solution(s2));

        String s3 = "-1 -1";
        System.out.println(solution(s3));

    }
}
