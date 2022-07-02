/* 
Pattern for N = 4
1
22
333
4444
*/

import java.util.Scanner;
public class Triangle_Number_Pattern {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int j;
        while(i<=n){
            j=1;
            while(j<=i){
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
		
	}

}
