/*
Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.
*/

import java.util.Scanner;
public class Reverse_of_a_number {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int reverse=0;
        while(n>0){      
            reverse=(reverse*10)+(n%10);
            n/=10;
        }
        System.out.print(reverse);
	}
}
