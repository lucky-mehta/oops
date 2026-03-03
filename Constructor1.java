//WAP TO PRINT THE DEFAULT VALUE.(DEFAULT CONSTRUCTOR)
class Apple{
    int a,b;
    Apple()
    {
        a=5;
        b=10;
    }
void disp(){
    System.out.println("VALUE OF A IS:"+a);
    System.out.println("VALUE OF B IS:"+b);
}
} 
public class Constructor1 {

    public static void main(String[] args) {
        Apple obj =new Apple();
        obj.disp();
    }
}