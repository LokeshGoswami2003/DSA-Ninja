/*
Pattern for N = 4
4444
333
22
1
*/

import java.util.Scanner;
public class Inverted_Number_Pattern {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n-i+1){
                System.out.print(n-i+1);
                j++;
            }
            System.out.println();
            i++;
            
        }

		
	}

}
