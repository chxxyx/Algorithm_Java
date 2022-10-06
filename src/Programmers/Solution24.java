package Programmers;
/*
        221006

        <수박수박수박수박수박수?>

        문제 설명
        길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
        예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

        제한 조건
        n은 길이 10,000이하인 자연수입니다.
 */

public class Solution24 {
    /*
            어렵다고 생각했는데 생각 보다 쉬운 문제였다 .. ;
            나는 그냥 n까지의 갯수 만큼 수, 박을 반복해서 보여줘야 하니까
            문자 '수'는 홀수 번째에, '박'은 짝수 번째에 담는 식으로 생각해서 구현해봤다.
     */

    public static String solution(int n) {

        String answer = "";

        for (int i = 1; i <= n; i++) { // 매개 변수로 받은 n 만큼 반복되어야 하므로 n보다 작거나 같을 때까지 반복해줬다.

            if (i % 2 != 0) {
                answer += "수"; // 1번째, 3번째,  ... 홀수 번째에 출력될 문자
            } else {
                answer += "박"; // 2번째, 4번째,  ... 짝수 번째에 출력될 문자
            }
        }
        return answer;
    }

    public static void main(String[] args) {


        System.out.println(solution(4));
        System.out.println(solution(3));
    }
}
