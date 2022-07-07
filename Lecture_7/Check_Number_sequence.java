/*
You are given S, a sequence of n integers i.e. S = s1, s2, ..., sn. Compute if it is possible to split S into two parts : s1, s2, ..., si and si+1, si+2, ….., sn (0 <= i <= n) in such a way that the first part is strictly decreasing while the second is strictly increasing one.
*/

import java.util.Scanner;

public class Check_Number_sequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int previous = Integer.MAX_VALUE;
        int cur;
        boolean bool1 = true;
        boolean bool2 = true;

        for (int i = 1; i <= size; i++) {
            cur = sc.nextInt();

            if (cur < previous && bool1) {
                previous = cur;
                continue;
            } else {
                bool1 = false;
            }

            if (cur > previous) {
                previous = cur;
                continue;
            } else {
                bool2 = false;
            }
            previous = cur;
        }
        if (bool1 || bool2) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }

    }
}
