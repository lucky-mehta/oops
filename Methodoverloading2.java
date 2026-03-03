//WAP TO FIND SQUARE OF THE ANY NUMBER AND ADDING OF TWO NUMBER with taking input.

import java.util.Scanner;

class Over
{
    int a,b;
    void calc(int x)               //method name same(no of argument)
    {
        a=x;
    System.out.println("SQUARE IS :"+a);
    }
    void calc( int x,int y)          //method name same(no of argument different)
    {
        a=x;
        b=y;
        System.out.println("ADDITION IS:"+(a+b));
    }
}
public class Methodoverloading2{

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER");
        int num1=obj.nextInt();
        System.out.println("ENTER THE SECOND NUMBER");
        int num2=obj.nextInt();
        Over t =new Over();
        t.calc(num1);
        t.calc(num1, num2);
    }
}

