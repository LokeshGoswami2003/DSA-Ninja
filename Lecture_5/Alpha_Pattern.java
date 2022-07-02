/*
Pattern for N = 3
A
BB
CCC
*/

import java.util.Scanner;
public class Alpha_Pattern {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=65;
        int j;
        while(i<=64+n){
            j=65;
            while(j<=i){
                System.out.print((char)i);
                j++;
            }
            System.out.println();
            i++;
        }
		
	}

}
