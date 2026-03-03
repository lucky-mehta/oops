//WAP TO PRINT AREA AND PARAMETER OF RECTANGLE WITH TAKING INPUT.

import java.util.Scanner;

class Tst1
{
    int l,b;
    void getData(int x,int y)
    {
        l=x;
        b=y;
    }
    void area()
    {
       int A=l*b;
        System.out.println("Area of rectangle is:"+A);
    }
}
class Tst2 extends Tst1{
    void perimeter()
    {
     int P=2*(l+b);
        System.out.println("Perimeter of rectangle is:"+P);
    }
}
public class Singleinheritance3 {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF THE RECTANGLE");
        int num1=obj.nextInt();
        System.out.println("ENTER THE BREATH OF THE RETANGLE");
        int num2=obj.nextInt();
        Tst2 t=new Tst2();
        t.getData(num1, num2);
        t.area();
        t.perimeter();

    }
}