/*
Sample Input :
1100
Sample Output :
12
*/

import java.util.Scanner;
import java.lang.Math;

public class Binary_to_decimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 0;
        while (n > 0) {
            sum = sum + (n % 10) * (int) (Math.pow(2.0, i));
            i++;
            n /= 10;
        }
        System.out.print(sum);

    }
}
