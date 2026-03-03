//WAP TO ENTER TWO NUMBER AND FIND THEIR SUM AND MULTIPLICATION WITHOUT TAKING INPUT.
class P
{
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
}
class Q extends P{
    void mul()
    {
        int d=a*b;
        System.out.println("Multiplication is:"+d);
    }
}
public  class Singleinheritance2 {

    public static void main(String[] args) {
        Q t = new Q();
        t.getData(10, 5);
        t.sum();
        t.mul();
    }
}

