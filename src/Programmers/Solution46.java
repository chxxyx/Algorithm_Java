package Programmers;

public class Solution46 {


    public static String solution(String s, int k) {
        String answer = "";



            answer = s.replaceAll(String.valueOf(k), "");

        if (answer.startsWith("0")) {
          answer = answer.substring(1);
        }



        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("105990", 1));
    }
}
