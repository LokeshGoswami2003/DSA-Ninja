/* Write a program to input a name(as a single character) and marks of three tests as m1, m2, and m3 of a student considering all the three marks have been given in integer format.
Now, you need to calculate the average of the given marks and print it along with the name as mentioned in the output format section.
All the test marks are in integers and hence calculate the average in integer as well. That is, you need to print the integer part of the average only and neglect the decimal part. */


/*Input format :
Line 1 : Name(Single character)
Line 2 : Marks scored in the 3 tests separated by single space. 

Output format :
First line of output prints the name of the student.
Second line of the output prints the average mark.*/

import java.util.Scanner;

public class Average_Marks  {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char name=str.charAt(0);
        int m1,m2,m3;
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        int avg=(m1+m2+m3)/3;      // Storing Average in avg
        System.out.println(name);
        System.out.println(avg);
        sc.close();               // close the Scanner
	}

}
