//WAP TO PRINT THE AREA AND PARAMETER OF RECTANGLE USING CONSTRUCTOR(PARAMETRIESED CONSTRUCTOR)
class One{
    int l,b;

 One( int x,int y)
  {
    l=x;
    b=y;
    }
    void area()
    {
        int A=l*b;
        System.out.println("Area of rectangle is:"+A);
    }
    void Perimeter()
    {
        int P =2*(l+b);
        System.out.println("Perimeter of rectangle is:"+P);
    }
}
public class Constructor2 {

    public static void main(String[] args) {
        One obj = new One(10, 5);
        obj.area();
        obj.Perimeter();
    }
}
