/*
Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
*/

import java.util.Scanner;
public class Terms_of_AP{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
     	int i=1;
        while(i<=n){
            if((3*i+2)%4!=0){
                System.out.print(3*i+2 + " ");
                i++;
                continue;
            }
            i++;
            n++;
        }
       

	}
}
