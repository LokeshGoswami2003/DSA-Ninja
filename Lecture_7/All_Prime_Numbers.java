/* 

Sample Input : 9


Sample Output:

2
3
5
7


*/

import java.util.Scanner;
public class All_Prime_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int j;
        for(int i=1;i<=n;i++){
            for( j=2;j<i;j++){
                if(i%j==0)
                    break;
            }
            if(j==i)
                System.out.println(j);
        }

		
	}
}
