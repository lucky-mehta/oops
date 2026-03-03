//WAP TO PRINT SUM AND MUL OF TWO NUMBER WITHOUT TAKING INPUT.
class X
{
int a=10;
int b=20;
void disp(){
    System.out.println("FIRST NUMBER IS:"+a);
    System.out.println("SECOND NUMBER IS:"+b);
}
}
class Y extends X{
    void add(){
        System.out.println("Addition is:"+(a+b));
    }
}
class Z extends  X
{
    void mul(){
        System.out.println("Multiplication is:"+(a*b));
    }
}
public  class Heirarchical1 {

    public static void main(String[] args) {
        Z obj1=new Z();
        obj1.disp();
        obj1.mul();
        Y obj2=new Y();        //obj2.disp(); ye bhi likh skte h program me
        obj2.add();

    }
}
