//WAP TO PRINT SUM AND MUL OF TWO NUMBER WITH TAKING INPUT.
import java.util.Scanner;
class XYZ1
{
    int a,b;
    void getData(int x,int y){

    
 a=x;
 b=y;}
void disp(){
    System.out.println("FIRST NUMBER IS:"+a);
    System.out.println("SECOND NUMBER IS:"+b);
}
}
class XYZ2 extends XYZ1{
    void add(){
        System.out.println("Addition is:"+(a+b));
    }
}
class XYZ3 extends  XYZ1
{
    void mul(){
        System.out.println("Multiplication is:"+(a*b));
    }
}
public  class Heirarchical2 {

    public static void main(String[] args) {
 Scanner obj=new Scanner(System.in);
            System.out.println("ENTER THE FIRST NUMBER");
            int num1=obj.nextInt();
            System.out.println("ENTER THE SECOND NUMBER");
            int num2=obj.nextInt();
        XYZ2 obj1=new XYZ2();
        obj1.getData(num1, num2);
        obj1.disp();
        obj1.add();
        XYZ3 obj2=new XYZ3();        //obj2.disp(); ye bhi likh skte h program me
       obj2.getData(num1,num2);
        obj2.mul();

    }
}

