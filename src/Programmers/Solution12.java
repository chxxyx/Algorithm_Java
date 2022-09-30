package Programmers;
/*
        220930

        <문자열 내 p와 y의 개수>

        대문자와 소문자가 섞여있는 문자열 s가 주어집니다.
        s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요.
        'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.

        예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.

        제한사항
        문자열 s의 길이 : 50 이하의 자연수
        문자열 s는 알파벳으로만 이루어져 있습니다.
 */

public class Solution12 {

    /*
            방법 1. 반복문 사용 ;
            채점 돌리니까 시간이 너무 오래걸린다고 점수 깎임 ..
     */
    public static boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;

        // p 갯수
        char p = 'p';
        // y 갯수
        char y = 'y';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == p) {
                pCount++;
            } else if (s.charAt(i) == y) {
                yCount++;
            }
        }

        // 각각 센 갯수가 동일하지 않으면 false, 동일하면 true를 반환했다.
        /*
            1. 처음 사용했던 식
             return pCount != yCount ? false : true;
         */
        return pCount == yCount; // 더 간결하게 쓸 수가 있음 ...

    }

    /*
           방법 2. 스트림, 람다 사용
           얘도 똑같음 ..
     */
    public static boolean solution2(String s){

        char p = 'p';
        char y = 'y';

        long pCount= s.chars().filter(ch -> ch == 'p').count();
        long yCount= s.chars().filter(ch -> ch == 'y').count();


        return pCount == yCount;

    }
    /*
            방법 3. toLowcase()
            찾아 보니까 문자열에 있는 대문자, 소문자 ? 때문에 정확성이 떨어지는 거 같아서
            메소드 찾아서 다시 시도했더니 드뎌 통과해땅
     */
    public static boolean solution3(String s) {

        int pCount = 0;
        int yCount = 0;

        // 소문자로 모두 변경해준다.
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') {
                pCount++;
            } else if (s.charAt(i) == 'y') {
                yCount++;
            }
        }

        // 카운트 갯수 비교해서 반환하기 !
        return pCount == yCount;
    }

    public static void main(String[] args) {
        System.out.println(solution3("pPoooyY"));
        System.out.println(solution3("Pyy"));

        System.out.println();

        System.out.println(solution("pPoooyY"));
        System.out.println(solution("Pyy"));

    }
}
