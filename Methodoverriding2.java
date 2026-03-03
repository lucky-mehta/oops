//WAP TO PRINT SUM AND SUB OF TWO NUMBER WITHOUT TAKING INPUT USING METHODOVERRIDING.
import java.util.Scanner;
class PQR
{
    int a,b;
    void getData(int x, int y)
    {
        a=x;
        b=y;
    }
    void calc()
    {
        System.out.println("Sub is:"+(a-b));
    }
}
class XYZ extends PQR
{
    void calc()
    {
        System.out.println("Sub is:"+(a-b));
        System.out.println("Addition is:"+(a+b));
    }
}
public class Methodoverriding2 {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=obj.nextInt();
        System.out.println("Enter the second number");
        int num2=obj.nextInt();
        XYZ t=new XYZ();
        t.getData(num1, num2);
        t.calc();
    }
}
