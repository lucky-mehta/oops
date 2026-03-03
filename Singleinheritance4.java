//WAP TO PRINT AREA AND PARAMETER OF RECTANGLE WITHOUT TAKING INPUT.

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
public class Singleinheritance4 {

    public static void main(String[] args) {
        Tst2 t=new Tst2();
        t.getData(10, 5);
        t.area();
        t.perimeter();

    }
}
