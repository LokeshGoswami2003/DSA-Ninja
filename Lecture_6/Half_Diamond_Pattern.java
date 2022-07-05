/*
Sample Input : 3

Sample Output :

*
*1*
*121*
*12321*
*121*
*1*
*

*/

import java.util.Scanner;

public class Half_Diamond_Pattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j, i = 1;
        int columns = 1;
        if (n == 0) {
            System.out.println("*");
            System.out.print("*");
            return;
        }

        while (i <= (2 * n) + 1) {
            j = 1;
            int value = 1;

            while (j <= columns) {

                if (j == columns) {
                    System.out.print("*");
                    break;
                }

                if (j == 1) {
                    System.out.print("*");
                }

                if (j >= 2 && j <= (columns - 1)) {
                    System.out.print(value);
                    if (j <= columns / 2)
                        value++;
                    else
                        value--;
                }

                j++;

            }

            if (i <= n) // n=5 total lines are 11 2n+1 so 5 pe bhi increase hoga for 6th big line
                columns += 2;
            else
                columns -= 2;
            System.out.println();
            i++;

        }

    }
}