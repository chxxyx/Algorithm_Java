package Programmers;
/*
        221005

        <나누어 떨어지는 숫자 배열>

        문제 설명
        array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
        divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

        제한사항
        arr은 자연수를 담은 배열입니다.
        정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
        divisor는 자연수입니다.
        array는 길이 1 이상인 배열입니다.

        입출력 예
            arr	      divisor	   return
        [5, 9, 7, 10]	 5	    [5, 10]
        [2, 36, 1, 3]	 1	    [1, 2, 3, 36]
        [3,2,6]	         10	    [-1]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution19 {

    public static int[] solution(int[] arr, int divisor) {
        /*
                1. 정렬 먼저 해주기
                2. 나눠 떨어지는 수 담을 어레이 리스트
                2. 반복문 돌리면서 divisor랑 나누어 떨어지는 수 구하기
                3. 나눠 떨어지는 수를 list에 담아준다
                4. 배열을 다 돌았는데도 나눠 떨어지는 수가 없으면 -1을 리스트에 넣어준다.
                5. 리스트를 배열로 변환해준다.
         */

        Arrays.sort(arr); // 매개 변수로 받은 arr 배열 먼저 정렬해준다.
        ArrayList<Integer> list = new ArrayList<Integer>();

//        for (int i = 0; i < arr.length; i++) {
           // 바보 짓 함 인덱스 번호로 나누니까 잘못 나오지 .. 인덱스의 '값'으로 나ㅝ야 되는데 ..
//            if (arr[i] % divisor == 0) {
//                list.add(arr[i]);
//            }
//        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }

        if(list.isEmpty()) {
            list.add(-1);
        }

        int[] answer = list.stream()
//                .sorted() (그냥 스트림 정렬 함수도 있었당 !)
                .mapToInt(Integer::intValue)
                .toArray();

        return answer;
    }

    public static int[] solution2(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();

        // for each문 사용
        for (int item : arr) {
            if (item % divisor == 0) {
                list.add(item);
            }
        }

        // 나누어 떨어진 수가 하나도 없을 경우
        if (list.isEmpty()) {
            list.add(-1);
        }

        return list.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

            // 아예 리스트를 반환하는 메소드로 만든다.
    public static ArrayList<Integer> solution3(int[] arr, int divisor) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<arr.length;i++){
            if(arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }

        if(list.isEmpty()) {
            list.add(-1);
        }

        Collections.sort(list);

        return list;
    }

    /*
            아니 이걸 한 번에 끝내는 사람이 있냐
     */
    public int[] divisible(int[] array, int divisor) {
        //ret에 array에 포함된 정수중, divisor로 나누어 떨어지는 숫자를 순서대로 넣으세요.
        return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
    }

    public static void main(String[] args) {

        int[] arr = {5, 9, 7, 10};
        System.out.println(Arrays.toString(solution(arr, 5)));
        //System.out.println(solution3(arr, 5));

        arr = new int[] {2, 36, 1, 3};
        System.out.println(Arrays.toString(solution(arr, 1)));

        arr = new int[] {3,2,6};
        System.out.println(Arrays.toString(solution(arr, 10)));
       // System.out.println(solution3(arr, 10));

    }
}
