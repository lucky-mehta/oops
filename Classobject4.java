//WAP TO PRINT SUM,MUL,SUB OF TWO NUMBER USING CLASS AND OBJECT WITHOUT TAKING INPUT.
class A{
    int a,b;
    void getData(int x,int y)
    {
        a=x;
        b=y;
    }
    void sum()
    {
        int c=a+b;
        System.out.println("Addition is:"+c);
    }
    void mul()
    {
        int d=a*b;
        System.out.println("Multiplication is:"+d);
    }
    void sub()
    {
        int e=a-b;
        System.out.println("Subtraction is:"+e);
    }
}
public class Classobject4 {

    public static void main(String[] args) {
        A t=new A();
        t.getData(100,10);
        t.sum();
        t.mul();
        t.sub();
    }
}

