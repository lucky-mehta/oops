//WAP TO PRINT SUM OF TWO NUMBER USING CLASS AND OBJECT.
 class Test
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
 public class Classobject1{
 public static void main(String[] args) {
    Test obj=new Test();
    obj.getData(10, 15);
    obj.sum();
 }
    
 }

