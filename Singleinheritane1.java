//WAP TO ENTER TWO NUMBER AND FIND THEIR SUM AND MULTIPLICATION WITH TAKING INPUT.

import java.util.Scanner;

class P{
    int a,b;
    void getData(int x,int y){
        a=x;
        b=y;
    }
void sum()
{
   int c=a+b;
   System.out.println("Addition is:"+c); 
}
}
class Q extends P{
    void mul()
    {
        int d=a*b;
        System.out.println("Multiplication is:"+d);
    }
}
public class Singleinheritane1 {
public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    System.out.println("ENTER THE FIRST NUMBER");
    int num1=obj.nextInt();
    System.out.println("ENTER THE SECOND NUMBER");
    int num2=obj.nextInt();
    Q t=new Q();
    t.getData(num1, num2);
    t.sum();
    t.mul();
}
}
