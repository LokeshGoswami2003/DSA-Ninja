/*
Pattern for N = 4
A
BC
CDE
DEFG
*/

import java.util.Scanner;
public class Character_Pattern {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int j;
        char pointer;
        while(i<=n){
            j=1;
            pointer=(char)(i+64);
            while(j<=i){
                System.out.print(pointer);
                j++;
                pointer++;
            }
            System.out.println();
            i++;
        }
		
	}

}
