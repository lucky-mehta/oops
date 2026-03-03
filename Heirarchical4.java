//WAP TO PRINT AREA AND PERIMETER OF RECTANGLE USING HEIRARCHICAL INHERITANCE WITH TAKING INPUT.
class ABC1
{
    int l,b;
    void getData(int x,int y)
{
    l=x;
    b=y;
}    void disp()
    {
        System.out.println("LENGTH OF RECTANGLE IS:"+l);
        System.out.println("BREATH OF RECTANGLE IS:"+b);
    }
}
class ABC2 extends ABC1{
    void area()
    {
        int A=l*b;
System.out.println("AREA OF RECTANGLE IS:"+A);
    }
}
class ABC3 extends ABC1{
    void perimeter(){
        int P=2*(l+b);
        System.out.println("PERIMETER OF RECTANGLE IS:"+P);
    }
}
public class Heirarchical4 {

    public static void main(String[] args) {
        ABC2 t1=new ABC2();
        t1.getData(10, 5);
        t1.disp();
        t1.area();
        ABC3 t2 =new ABC3();
        t2.getData(20, 25);        //same data bhi le skte h or different data bhi dono condition me output aayega
        t2.perimeter();
    }
}
