/*Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.
Note : For this question, you can assume that 0 raised to the power of 0 is 1


Input format :
Two integers x and n (separated by space)

Output Format :
x^n (i.e. x raise to the power n)*/

import java.util.Scanner;
public class Find_power_of_a_number {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        if(n==0){
            System.out.print("1");
            return;
        }
        if(n==1){
            System.out.print(x);
            return;
        }
        int i=2;
        int number=x;
        while(i<=n){
        	number*=x;
            i++;
        }
        System.out.print(number);        
    }
}