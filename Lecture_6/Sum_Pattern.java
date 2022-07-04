/*
Input Format : 5
1=1
1+2=3
1+2+3=6
1+2+3+4=10
1+2+3+4+5=15
*/

import java.util.Scanner;
public class Sum_Pattern {
 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n){
            int j=1;
            sum+=i;
            while(j<=i){
                if(j==i){
                    System.out.print(j);
                    break;
                }
                System.out.print(j+"+");
                j++;
            }
            System.out.print("="+sum);
            System.out.println();
            i++;
            
        }

		
	}

}
