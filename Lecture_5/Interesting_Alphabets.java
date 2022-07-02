/*
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE
*/

import java.util.Scanner;
public class Interesting_Alphabets {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int j;
        char printit;
        while(i<=n){
            j=1;
            printit=(char)(n+64-i+1);
            while(j<=i){
                System.out.print(printit++);
                j++;
            }
            System.out.println();
            i++;
        }
		
	}

}
