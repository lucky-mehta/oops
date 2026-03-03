//wap to enter salary or staff if salary is greater than 10000than bonus is 10% otherwise 5%.Find updated salary.
import java.util.Scanner;
public class Salary2 {

    public static void main(String[] args) {
        int sal,b;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter salary of staff");
        sal=obj.nextInt();
        if (sal>=10000)
         {
            b=(sal*10)/100;
            sal=sal+b;
        }
        else
        {
            b=(sal*5)/100;
            sal=sal+b;
        }
        System.out.println("updated salary is:"+sal);
    }
}

