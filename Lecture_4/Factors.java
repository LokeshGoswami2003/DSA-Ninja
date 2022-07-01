/*Write a program to print all the factors of a number other than 1 and the number itself
Input Format :
A single integer, n
Output Format :
All the factors of n excluding 1 and the number itself*/

import java.util.Scanner;
public class Factors {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int i=2;
        while(i<number){
            if(number%i==0)
                System.out.print(i+" ");
            i++;
        }
    }
}