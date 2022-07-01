/*Write a program to print multiplication table of n

Input Format :
A single integer, n

Output Format :
First 10 multiples*/


import java.util.Scanner;
public class Multiplication_Table {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(n*i);
            i++;
        }

	}
}