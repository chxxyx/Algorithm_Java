package Programmers;
/*
        220928
        <하샤드 수>

        양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
        예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
        자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

        제한 조건
        x는 1 이상, 10000 이하인 정수입니다.
 */
public class Solution8 {

    // 자릿수 추출해서 합을 구하고 해당 합과 x가 나누어 떨어지면 true, 아니면 false 반환 !
    public static boolean solution(int x) {
        int sum = 0;
        int number = x; // 나누기 위해 x 값을 저장해둔다.

        while(number >= 1) {
            sum += number % 10;
            number /= 10;
        }

        // 처음엔 이렇게 조건식을 작성했는데 지저분해 보여서 더 간략하게 수정했다.
        // if(x % sum == 0) {
        //    return true;
        //  } else {
        //      return false;
        //  }

        return x % sum == 0 ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(12));
        System.out.println(solution(11));
        System.out.println(solution(13));

    }
}
