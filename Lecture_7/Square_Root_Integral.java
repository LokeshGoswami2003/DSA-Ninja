/*
Sample Input :
10
Sample Output :
3
*/

import java.util.Scanner;

public class Square_Root_Integral {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while ((i * i) <= n) {
            i++;
        }
        if ((i * i) > n)
            i--;
        System.out.print(i);

    }
}
