//WAP TO PRINT SUM,MUL AND SUB OF TWO NUMBER USING MULTIPLE CLASS.
import java.util.Scanner;
class M{
int a,b;
void getData(int x,int y)
{
    a=x;
    b=y;
}
void sum()
{
    System.out.println("Addition is:"+(a+b));
}
}
class N{
    int a,b;
    void getData(int x, int y)
    {
        a=x;
        b=y;
    }
    void mul()
    {
        System.out.println("Multiplication is:"+(a*b));
    }
}
class O{
    int a,b;
    void getData(int x,int y){
        a=x;
        b=y;
    }
    void sub(){
        System.out.println("Subtraction is:"+(a-b));
    }
}
public class Multipleclass5 {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1=obj.nextInt();
        System.out.println("enter the second number");
        int num2=obj.nextInt();
        M t1 =new M();
        t1.getData(num1, num2);
        t1.sum();
        N t2 = new N();
        t2.getData(num1, num2);
        t2.mul();
        O t3 = new O();
        t3.getData(num1, num2);
        t3.sub();
    }
}