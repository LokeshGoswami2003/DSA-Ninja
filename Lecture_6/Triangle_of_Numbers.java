/*
Pattern for N = 4
   1
  232
 34543
4567654
*/

import java.util.Scanner;
public class Triangle_of_Numbers {


	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n-i){
                System.out.print(" ");
                j++;
            }
            j=1;
            int pointer=i;
            while(j<=i){
                System.out.print(pointer++);
                j++;
            }
            j=1;
            pointer--;
            while(j<=i-1){
                System.out.print(--pointer);
                j++;
            }
            System.out.println();
            i++;
            
        }
		
	}

}
