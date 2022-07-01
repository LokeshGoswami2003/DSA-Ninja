/*Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.
Digits mean numbers, not the places! That is, if the given integer is "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5.

Input format :
integer N

Output format :
Sum_of_Even_Digits Sum_of_Odd_Digits
(Print first even sum and then odd sum separated by space)*/

import java.util.Scanner;

public class Sum_Of_Even_And_Odd {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int sum_even=0;
        int sum_odd=0;
        while(number!=0){
            int rem=number%10;
            if(rem%2==0)
                sum_even+=rem;
            else
                sum_odd+=rem;
            number/=10;
        }
        System.out.println(sum_even+" "+sum_odd);

	}
}
