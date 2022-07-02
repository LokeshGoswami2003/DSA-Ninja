/*

Pattern for N = 4
*
**
***
****         

*/

import java.util.Scanner;
public class Triangular_Star_Pattern {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int j;
        while(i<=n){
            j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
		
	}

}
