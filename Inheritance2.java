import java.util.Scanner;
class Student
{
    int m1,m2;
    void getData(int x,int y)
    {
        m1=x;
        m2=y;
    }
void disp()
{
}
}
interface Sports
{
    int SP=10;
    void SPmarks();
    }

    class Result extends Student implements Sports
    {
        void disp()
        {
            System.out.println("FIRST MARKS IS:"+m1);
            System.out.println("SECOND MARKS IS:"+m2);
        }
        public void SPmarks()
        {
            System.out.println("SPORTS MARKS IS:"+SP);
        }
        void totalmarks()
        {
            int total;
            total=SP+m1+m2;
            System.out.println("TOTAL MARKS IS:"+total);
        }
    }
    public class Inheritance2 {
    
        public static void main(String[] args) {
            Scanner obj=new Scanner(System.in);
            System.out.println("ENTER THE FIRST MARKS");
            int num1=obj.nextInt();
            System.out.println("ENTER THE SECOND MARKS");
            int num2=obj.nextInt();
            Result t=new Result();
            t.getData(num1, num2);
            t.disp();
            t.SPmarks();
            t.totalmarks();
        }
    }