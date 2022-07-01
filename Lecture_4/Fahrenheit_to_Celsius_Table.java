/*Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.

Input Format :
3 integers - S, E and W respectively
Output Format :
Fahrenheit to Celsius conversion table. One line for every Fahrenheit and corresponding Celsius value. The Fahrenheit value and its corresponding Celsius value should be separate by single space.*/

import java.util.Scanner;

public class Fahrenheit_to_Celsius_Table {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int stepsize = sc.nextInt();
        while (start <= end) {
            System.out.println(start + " " + (((start - 32) * 5) / 9));  // celcius=( ((f-32)*5)/9 )
            start += stepsize;
        }

    }

}
