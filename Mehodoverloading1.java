//WAP TO FIND SQUARE OF THE ANY NUMBER AND ADDING OF TWO NUMBER without taking input.
class Over
{
    int a,b;
    void calc(int x)
    {
        a=x;
    System.out.println("SQUARE IS :"+a);
    }
    void calc( int x,int y)
    {
        a=x;
        b=y;
        System.out.println("ADDITION IS:"+(a+b));
    }
}
public class Mehodoverloading1 {

    public static void main(String[] args) {
        Over obj =new Over();
        obj.calc(10);
        obj.calc(10, 5);
    }
}
