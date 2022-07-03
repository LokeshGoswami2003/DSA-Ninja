/*
Pattern for N = 4
      1
    1 2
  1 2 3
1 2 3 4
 */

import java.util.Scanner;

public class Mirror_Image_Number_Pattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n - i) { // For printing Spaces
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (j <= i) { // For printing numbers
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }

    }

}
