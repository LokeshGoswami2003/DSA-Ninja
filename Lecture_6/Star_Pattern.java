/*
Pattern for N = 4

    *
   *** 
  *****
 *******

*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n - i) { // for spaces
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (j <= i) { // for stars for left side
                System.out.print("*");
                j++;
            }
            j = 1;
            while (j <= i - 1) { // for stars for right side
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;

        }

    }

}
