/*Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -
    totalSalary = basic + hra + da + allow – pf
    where :
    hra   = 20% of basic
    da    = 50% of basic
    allow = 1700 if grade = ‘A’
    allow = 1500 if grade = ‘B’
    allow = 1300 if grade = ‘C' or any other character
    pf    = 11% of basic.*/
    import java.util.Scanner;
    public class Total_Salary {
        
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int basic_salary=sc.nextInt();
            char grade=sc.next().charAt(0);
            double hra=basic_salary*20.0/100;
            double da=basic_salary*50.0/100;
            double pf=basic_salary*11.0/100;
            int allow;
            if(grade=='A')
                allow=1700;
            else if(grade=='B')
                allow=1500;
            else
                allow=1300;
            double total_salary=basic_salary+hra+da+allow-pf;
            
            System.out.print(Math.round(total_salary));
            
            
    
        }
    }
    