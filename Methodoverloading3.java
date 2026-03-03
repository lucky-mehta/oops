//WAP TO PRINT THE CUBE,ADDITION AND MULTIPLICATION USING METHODOVERLOADING
 import java.util.Scanner;
 class over1
 {
    int a,b,c;
    void calc(int x)               //number of argument
    {
        a=x;
        System.out.println("CUBE IS:"+(a*a*a));
    }
    void calc(int x,int y)            //number of argument
    {
        a=x;
        b=y;
        System.out.println("ADDITION IS:"+(a+b));
    }
    void calc(int x,int y,int z)       //number of argument
    {
        a=x;
        b=y;
        c=z;
        System.out.println("MULTIPLICATION IS:"+(a*b*c));
    }
 }
    public class Methodoverloading3 {
    
        public static void main(String[] args) {
            Scanner obj=new Scanner(System.in);
            System.out.println("ENTER THE FIRST NUMBER");
            int num1=obj.nextInt();
            System.out.println("ENTER THE SECOND NUMBER");
            int num2=obj.nextInt();
            System.out.println("ENTER THE THIRD NUMBER");
            int num3=obj.nextInt();
            over1 t=new over1();
            t.calc(num1);
            t.calc(num1,num2);
            t.calc(num1,num2,num3);
        }
    }
