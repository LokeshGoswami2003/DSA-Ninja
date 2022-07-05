/*
Sample Input : 5

Sample Output 1:
  *
 ***
*****
 ***
  *

*/

import java.util.Scanner;

public class Diamond_of_stars {
    
    
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        int j;
        int gap=n/2;
        int star=1;
        while(i<=n){
            j=1;
            while(j<=gap){
                System.out.print(" ");
                j++;
            }
            j=1;
            while(j<=star){
                System.out.print("*");
                j++;
            }
            if(i<=n/2){
                gap--;
                star+=2;
            }
            else{
                gap++;
                star-=2;
            }
            System.out.println();
            i++;
        }        
    }
}