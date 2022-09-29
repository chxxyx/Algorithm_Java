package Programmers;
/*
        220929 (코딩테스트 문제)

        문제 :
        당신은 이미 한번 개표를 마쳐서 과반수 성립한다는 점을 알고 있는 투표를 검수하게 되었다.
        공정함을 위해서 당신에게는 누가 투표에서 승리했는지 알려지지 않았고, 모든 투표용지에는 후보의 기호 숫자만이 기재되어 있다.
        예를 들어, 투표 결과가 votes = {1, 4, 2, 2, 2, 3, 2, 2, 1}로 주어졌을 때,
        과반수 투표 결과는 2가 된다.
        위 과반수 투표 결과를 출력하는 프로그램을 작성하시오.

        입력설명 :
        0 < votes.length <= 100000
        출력설명
        과반수 투표 결과를 정수로 반환

        입출력 예시 :
        입력
        votes = [4,3,2,3,3,3,3,1,2,2,3]

        출력 :
        3
       ( 해설 - 전체 11개 중, 3이 6개로, 과반수(11/2 = 5.5)를 넘는다. )

 */

import java.util.*;

public class Solution10 {

    public static int solution1(int[] votes) {

        // 최대값 먼저 구하기
        int max = Arrays.stream(votes).max().getAsInt();
        // 최대값 보다 한 사이즈 크게 count 배열 만들어주기
        int[] cntArr = new int[max+1];

        // count 시작
        for (int i = 0; i < votes.length; i++) {
            cntArr[votes[i]]++;
        }

        // 최댓값의 인덱스 번호 찾기
        int answer = cntArr[0];
        int answerIdx = 0;

        for (int i = 0; i < cntArr.length; i++) {
            if (cntArr[i] > answer) {
                answer = cntArr[i];
                answerIdx = i;
            }
        }

        return answerIdx;
    }

    public static int solution2(int[] votes) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int item: votes) { // 배열의 값들을 키 값으로 !
            // 있으면 해당값, 없으면 0을 가져온다  -> +1 증가시켜 -> 딸 필요한 갯수 만큼만 생성 가능
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        // map의 키 값으로 리스트 생성
        ArrayList<Integer> list = new ArrayList<>(map.keySet());

        // conut 갯수가 큰 순서 대로 정렬해준다.
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o2).compareTo(map.get(o1));
            }
        });

        return list.get(0);
    }

    public static void main(String[] args) {

        int[] votes = {1, 4, 2, 2, 2, 3, 2, 2, 1};
        System.out.println(solution1(votes)); // 2
        System.out.println(solution2(votes)); // 2

        votes = new int[] {4,3,2,3,3,3,3,1,2,2,3};
        System.out.println(solution1(votes)); // 3
        System.out.println(solution2(votes)); // 3

    }
}
