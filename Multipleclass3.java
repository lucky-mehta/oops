//WAP TO PRINT AREA AND PARAMETER OF A RECTANGLE USING MULTIPLECLASS  WITHOUT TAKING INPUT.
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
int c,d;
    void getData(int u,int v)
    {
        c=u;
        d=v;
    }
    void perimter()
    {
        int P=2*(c+d);
        System.out.println("PERIMETER OF RECTANGLE IS:"+P);
    }
    }
public class Multipleclass3 {

    public static void main(String[] args) {
        Test1 t1=new Test1();
        t1.getData(10, 5);
        t1.area();
        Test2 t2 = new Test2();
        t2.getData(15,4);
        t2.perimter();
    }
}
