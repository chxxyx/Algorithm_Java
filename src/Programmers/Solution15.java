package Programmers;
/*

        221003

        <콜라츠 추측>

        1-1. 입력된 수가 짝수라면 2로 나눕니다.
        1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
        2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.

        예를 들어, 주어진 수가 6이라면 6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1 이 되어 총 8번 만에 1이 됩니다.
        위 작업을 몇 번이나 반복해야 하는지 반환하는 함수, solution을 완성해 주세요.
        단, 주어진 수가 1인 경우에는 0을, 작업을 500번 반복할 때까지 1이 되지 않는다면 –1을 반환해 주세요.

        제한 사항
        입력된 수, num은 1 이상 8,000,000 미만인 정수입니다.

        입출력 예
        16 → 8 → 4 → 2 → 1 이 되어 총 4번 만에 1이 됩니다.

        입출력 예
        626331은 500번을 시도해도 1이 되지 못하므로 -1을 리턴해야 합니다.

 */


public class Solution15 {

    public static int solution(int num) {

        int answer = 0;

        if (num == 1) {
            return 0;
        }

        while (num != 1) {

            if(num % 2 == 0) {
                num /= 2;
            } else if(num % 3 == 0) {
                num = num * 3 + 1;
            }

            answer++;
            if (answer == 500) { // 여기서 계속 오답이 나왔음 ..
                answer = -1; // 자꾸 488번째만 계산되고 break에 걸렸다 ㅠ
                break;
            }
        }

        return answer;
    }

    public static int solution2(int num) {
        int answer = 0;
        long number = num; // 매개변수로 전달받은 int 타입인 num 값을 long 타입 변수에 저장해서 사용한다.

        if (number == 1) {
            return 0;
        }

        while (number != 1) { // 입력값인 num이 1이 되면 반복문이 멈춘다.

            if(number % 2 == 0) {
                number /= 2;
            } else {
                number = (number * 3) + 1;
            }
            answer++;

            if (answer >= 500) {
                return -1;
            }

               /*
                num이 int형의 최대값(양수)을 초과하여 오버플로우가 발생해 최소값(음수)로 돌아간다.
                num의 값이 중간에 왜곡되어 기대한 결과와 다른게 나온다.

                큰값을 입력받을 경우 int 타입의 값의 범위 (-2,147,483,648 ~ 2,147,483,648)를 넘어서는 오버플로우가 발생할 수 있다.
                -> 큰 정수를 입력받을 때는 int 타입보다 값의 범위가 큰 Long 타입의 변수를 사용해야 한다.
             */
        }
        return answer;
    }


    public static void main(String[] args) {

        System.out.println(solution2(6));
        System.out.println(solution2(16));
        System.out.println(solution2(1));
        System.out.println(solution2(626331));

    }
}
