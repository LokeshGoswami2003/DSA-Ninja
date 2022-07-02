/*Pattern for N=4 
4444
4444
4444
4444

Pattern for N=6
666666
666666
666666
666666
666666
666666 */

import java.util.Scanner;
public class Square_Pattern {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int j;
        while(i<=n){
            j=1;
            while(j<=n){
                System.out.print(n);
                j++;
            }
            System.out.println();
            i++;
        }
		
	}

}
