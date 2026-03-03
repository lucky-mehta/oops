//WAP TO ENTER SALRY OF STAFF. IF SALARY IS GREATER THAN 1000 , THEN BONUS IS 10%.FIND UPDATE SALARY.
import java.util.Scanner; 
public class Salary1 {
    public static void main(String[] args) {
        int sal,b;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the salary of staff");
        sal=obj.nextInt();
        if(sal>=10000)
        {
            b=(sal*10)/100;
            sal=sal+b;
        }
        System.out.println("Updated salary is:"+sal);
    }
}
