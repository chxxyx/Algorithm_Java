package inflearn;
/*
        221106

        <Two Pointers Algorithm>

        [두 배열 합치기]
 */

import jdk.jfr.internal.tool.Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution1 {

    public ArrayList<Integer> solution1(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;

        while (p1<n && p2<m) {
            if (a[p1]<b[p2]) {
                answer.add(a[p1]);
            } else {
                answer.add(b[p2++]);
            }
        }

        while (p1<n) {
            answer.add(a[p1++]);
        }
        while (p2<m) {
            answer.add(b[p2++]);
        }

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();


        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i]=kb.nextInt();
        }

        int m = kb.nextInt();
        int[] b = new int[m];

        for (int i = 0; i < m; i++) {
            b[i] = kb.nextInt();
        }
    }
}
