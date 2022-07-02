/* 
Pattern for N = 4
1
21
321
4321
*/

import java.util.Scanner;
public class Reverse_Number_Pattern {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int j;
        int pointer;
        while(i<=n){
            j=1;
            pointer=i;
            while(j<=i){
                System.out.print(pointer--);
                j++;
            }
            System.out.println();
            i++;
        }
		
	}

}
