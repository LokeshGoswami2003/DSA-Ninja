/*
   F(n) = F(n-1) + F(n-2), 
    Where, F(1) = F(2) = 1

    Sample Input:6
    Sample Output:8

    [ 1, 1, 2, 3, 5, 8]
*/

import java.util.Scanner;
public class Nth_Fibonacci_Number  {


	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        
        if(n==1 || n==2){
            System.out.print("1");
            return;
        }
        
        int fibox=1;
        int fiboy=1;
        int fibon=0;
        
        for(int i=1;i<=(n-2);i++){
            fibon=fibox+fiboy;
            fibox=fiboy;
            fiboy=fibon;
            
        }
        
		System.out.print(fibon);
		
	}

}
