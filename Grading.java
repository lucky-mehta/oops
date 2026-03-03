//WAP TO GRADING SYSTE (IF MARKS IS GREATE THEN 85,THEN GRADE A IF MARKS IS GREATER THEN 75 THEN GRADE B AND MARKS IS GREATER THAN 65 THEN OTHERWISE GRADE D)
import java.util.Scanner;
public class Grading {
    public static void main(String[] args) {
        int marks;
        char Grade;
        Scanner obj=new Scanner(System.in);
        System.out.println(" enter the marks:");
        marks=obj.nextInt();
        if (marks>=85) 
        {
            Grade='A';
        }
        else if (marks>=75)
         {
            Grade='B';
        }
        else if (marks>=65) 
        {
            Grade='C';
        }
        else
        {
            Grade='D';
        }
        System.out.println("Grade is :"+Grade);
    }
    
}
