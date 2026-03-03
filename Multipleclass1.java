//WAP TO PRINT AREA AND PARAMETER OF A RECTANGLE USING MULTIPLECLASS  WITH TAKING INPUT.
import java.util.Scanner;
class Test1
{
    int l,b;
    void getData(int x,int y)
    {
        l=x;
        b=y;
    }
    void area()
    {
        int A=(l*b);
        System.out.println("AREA OF RECTANGLE IS:"+A);
    }
}
    class Test2
    {
int l,b;
    void getData(int x,int y)
    {
        l=x;
        b=y;
    }
    void perimter()
    {
        int P=2*(l+b);
        System.out.println("PERIMETER OF RECTANGLE IS:"+P);
    }
    }
public class Multipleclass1 {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF THE RECTANGLE");
        int r=obj.nextInt();
        System.out.println("ENTER THE BREATH OF THE RECTANGLE");
        int s=obj.nextInt();
        Test1 t1=new Test1();
        t1.getData(r, s);
        t1.area();
        Test2 t2 = new Test2();
        t2.getData(r,s);
        t2.perimter();
    }
}