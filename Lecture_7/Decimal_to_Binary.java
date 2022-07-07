/*
Sample Input :
12
Sample Output :
1100
*/

import java.util.Scanner;

public class Decimal_to_Binary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.print("0");
            return;
        }
        long bi = 1;
        int length = 0;
        while (n > 0) {
            bi = (bi * 10) + (n % 2);
            n /= 2;
            length++;
        }

        while (length > 0) {
            System.out.print(bi % 10);
            bi /= 10;
            length--;
        }

    }
}
