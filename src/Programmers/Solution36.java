package Programmers;
/*
        221018

        <올바른 괄호>

        문제 설명
        괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다.
        예를 들어, "()()" 또는 "(())()" 는 올바른 괄호입니다.
        ")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
        '(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때,
        문자열 s가 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.

        제한사항
        문자열 s의 길이 : 100,000 이하의 자연수
        문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.

 */


import java.util.Stack;

public class Solution36 {
    /*
        <문제 풀이 - 1.>
        스택 문제라 ... 스택 사용해봤음
        괄호가 짝을 이루면 스택에서 제거하고, 문자열 전부 돌린 후에
        스택의 사이즈가 0이면 올바른 괄호로 반환하는 방법을 생각해봤다.
     */

    public static boolean solution(String s) {
        boolean answer = true;

        // 스택 선언
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char check = s.charAt(i); // s 문자열을 i 번째 인덱스 애들을 하나씩 check로 바꿔줌

            if(check == '(') {
                stack.push(check); // 여는 괄호가 올 때는 일단 스택에 넣어준다.
            }

            if (check == ')') { // 닫는 괄호가 올 때
                if(stack.size() == 0) { // 만약 stack의 사이즈가 0 이라는 건 여는 괄호가 없는 거니까 false !!
                    return false;
                } else { // 사이즈가 0이 아닌 경우라는 건 여는 괄호가 있다는 거고
                    stack.pop();  // 즉, 여는 괄호 다음에 닫는 괄호가 오니까 잘 완료된 괄호 () 들은 스택에서 지워준다.
                }
            }
        }

        // 문자열을 전부 다 돌은 후의 스택의 사이즈가 0이 아니라는 건 == 괄호가 알맞게 맞춰지지 않은 거니까 false를 리턴해야 한다.

        if (stack.size() != 0) {
            answer = false;
        }

        return answer;
    }

    /*
        <문제 풀이 - 2.>
        스택 사용하지 않고 그냥 구현할 수도 있었다 !! ..
     */
    public static boolean solution2(String s){
        boolean answer = false;

        int count = 0; // 올바른 괄호 카운트 변수

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                count++;
            }

            if (s.charAt(i) == ')') {
                count--;
            }

            if (count < 0) {
                break;
            }

        }

        if (count == 0) {
            answer = true;
        }

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution("()()"));
        System.out.println(solution("(())()"));
        System.out.println(solution(")()("));
        System.out.println(solution("(()("));

    }
}
