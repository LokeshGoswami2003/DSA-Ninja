/*Write a program that takes a character as input and prints either 1, 0 or -1 according to the following rules.
1, if the character is an uppercase alphabet (A - Z)
0, if the character is a lowercase alphabet (a - z)
-1, if the character is not an alphabet*/

import java.util.Scanner;
public class Find_Character_Case {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        int a=ch;
        if(a>=65 && a<=90)                 // check character with its ascii value
            System.out.print("1");
        else if(a>=97 && a<=122)
            System.out.print("0");
        else
            System.out.print("-1");
    }
}
