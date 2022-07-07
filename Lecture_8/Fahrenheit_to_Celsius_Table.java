/*
Sample Input:
0 
100 
20

Sample Output:
0   -17
20  -6
40  4
60  15
80  26
100 37

*/

import java.util.Scanner;

public class Fahrenheit_to_Celsius_Table{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int end = s.nextInt();
		int step = s.nextInt();
        Solution sc=new Solution();
		sc.printFahrenheitTable(start, end, step);
	}
}

class Solution {

	void printFahrenheitTable(int start, int end, int step) {
        
	 while (start <= end) {
            System.out.println(start + " " + (((start - 32) * 5) / 9));  
            // celcius=( ((f-32)*5)/9 )
            start += step;
        }
        
	}

    
}