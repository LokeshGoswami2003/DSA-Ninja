/*
For N = 5
*****
 *****
  *****
   *****
    *****
*/


import java.util.Scanner;
public class Parallelogram_Pattern {


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
        	int j=1;
            while(j<=i-1){                  // For printing Spaces
            	System.out.print(" ");
                j++;
            }
            j=1;
            while(j<=n){                    // For printing numbers
            	System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

		
	}

}
