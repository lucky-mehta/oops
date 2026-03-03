//WAP TO PRINT AREA AND PARAMETER OF A RECTANGLE USING CLASS AND OBJECT WITHOUT TAKING INPUT.
class B
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
    void perimerte()
    {
        int P=2*(l+b);
        System.out.println("PERIMETER OF RECTANGLE IS:"+P);
    }
}
public class Classobject6 {

    public static void main(String[] args) {
        B t=new B();
        t.getData(10 , 20);
        t.area();
        t.perimerte();
    }
}