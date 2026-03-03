// interfaceK(PARENTS CLASS) interfaceL (PARENTS CLASS) class M (CHILD CLASS)
interface XYZ1{
    int roll =01;
    void printa();
}
interface XYZ2
{
    void printb();
}
class XYZ3 implements XYZ1,XYZ2
{
    public void printa()
    {
        System.out.println("ROLL NO IS:"+roll);
    }
    public void printb()
    {
        System.out.println("METHOD OF N INTERFACE");
    }
}
public class interface1 {

    public static void main(String[] args) {
        XYZ3 obj=new XYZ3();
        obj.printa();
        obj.printb();
    }
}