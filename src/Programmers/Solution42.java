package Programmers;




import java.util.ArrayList;
import java.util.Collections;


public class Solution42 {

    public static int solution(int num) {
        int answer = 0;

        ArrayList<Integer> list = new ArrayList<>();

        while (num > 0) {
            list.add(num % 10);
            num /= 10;
        }

        int max = Collections.max(list);
        int idx = list.indexOf(max);


        Collections.swap(list, 0, idx);

        String str = list.toString()
                    .replace(", ","")
                    .replace("[","")
                    .replace("]","");
        answer = Integer.valueOf(str);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(43824));
    }

}
