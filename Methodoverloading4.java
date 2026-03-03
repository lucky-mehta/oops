//WAP TO FIND SQUARE OF THE ANY NUMBER AND ADDING OF TWO NUMBER with taking input.

import java.util.Scanner;

class Over2
{
    int a,b;
    void calc(int x,float y)               //method name same(no of argument)
    {
    
    System.out.println("Addition is:"+(a+b));
    }
    void calc( float x,int y)          //method name same(no of argument different)
    {
    
        System.out.println("Multiplicatin is:"+(a*b));
    }
}
public class Methodoverloading4{

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER");
        float num1=obj.nextInt();
        System.out.println("ENTER THE SECOND NUMBER");
        float num2=obj.nextInt();
        Over2 t =new Over2();
        t.calc(num1 ,num2);
        t.calc(num1, num2);
    }
}


