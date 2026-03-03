//WAP TO PRINT SUM OF TWO NUMBER USING CLASS AND OBJECT WITH TAKING INPUT.
import java.util.Scanner;
class Test{
    int a,b;
    void getData(int x,int y)
    {
        a=x;
        b=y;
    }
    void sum()
    {
        int c=a+b;
        System.out.println("Addition is:"+c);
    }
}
public class Classobject2 {

    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER");
        int num1=obj.nextInt();
        System.out.println("ENTER THE SECOND NUMBER");
        int num2=obj.nextInt();
        Test t=new Test();
        t.getData(num1, num2);
        t.sum();
    }
}
