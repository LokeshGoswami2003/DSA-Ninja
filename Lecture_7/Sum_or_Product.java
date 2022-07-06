/*
Write a program that asks the user for a number N and a choice C. And then give them the possibility to choose between computing the sum and computing the product of all integers in the range 1 to N (both inclusive).
If C is equal to -
 1, then print the sum
 2, then print the product
 Any other number, then print '-1' (without the quotes)
*/

import java.util.Scanner;
public class Sum_or_Product {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int choice=sc.nextInt();
        int sum=0;
        int product=1;
        if(choice!=1 && choice!=2){
            System.out.print("-1");
            return;
        }
        
        for(int i=1;i<=n;i++){
            if(choice==1){
                sum+=i;
            }
                product*=i;
        }
        
        if(choice==1)
            System.out.print(sum);
        if(choice==2)
            System.out.print(product);

	}
}
