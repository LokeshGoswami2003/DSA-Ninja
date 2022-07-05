/*
Sample Input : 5
Sample Output:

13579
35791
57913
79135
91357

*/

import java.util.Scanner;
public class Odd_Square {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int j;
        int p1=-1;
        int temp=p1;
        
        
		while(i<=n){
		j=1;
		p1=temp+2;
		temp=p1;
		while(j<=n-i+1){
		System.out.print(p1);
		p1+=2;
		j++;
		}
		j=1;
            int k=1;
            while(j<=i-1){
                System.out.print(k);
                k+=2;
                j++;
            }
            System.out.println();
            i++;
        }
	}
}
