package Programmers;
/*
        220929

        같은 숫자는 싫어

        배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다.
        이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
        단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다.
        예를 들면, arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
        arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
        배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.

        제한사항 ;
        배열 arr의 크기 : 1,000,000 이하의 자연수
        배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수

 */

import java.util.ArrayList;
import java.util.Arrays;

public class Solution7 {

    public static int[] solution(int[] arr) {

        // 중복 제거한 값들만 모아놓을 리스트를 하나 생성한다.
        ArrayList<Integer> temp = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {

            // 우선 0번째 인덱스는 무조건 넣어 준다.
            if(i == 0) {
                temp.add(arr[i]);
              // temp 리스트의 가장 끝 인덱스 번호와 arr이 같지 않은 경우(=같은 수가 없다는 것) 에만 temp에 넣어준다.
            } else if (arr[i] != temp.get(temp.size()-1)) {
                temp.add(arr[i]);
            }
        }

//       ! 가장 처음 시도한 방법 !
//        int[] answer = new int[temp.size()];
//        for (int i = 0; i < temp.size(); i++) {
//            answer[i] = temp.get(i);
//        }

        int[] answer = temp.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        /*
            리스트를 스트림으로 변환 후, map을 이용해서 intStream을 가져오고, 그 후에 toArray()를 통해 배열로 만드는 방법.
            (java 5 이상) intValue 메서드를 통해 각 요소를 int형으로 변경해준다.
         */

        return answer;
    }

    public static void main(String[] args) {


        int[] arr = {1,1,3,3,0,1,1};
        System.out.println(Arrays.toString(solution(arr)));

        arr = new int[] {4,4,4,3,3};
        System.out.println(Arrays.toString(solution(arr)));


    }
}
