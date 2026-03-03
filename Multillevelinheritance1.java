//WAP TO DISPALAY MARKS , ROLLNO, AND TOTAL MARKS WITHOUT TAKING INPUT USING MULTILEVEL INHERITANCE.
class Student{
    int roll;
    void getroll(int x)
    {
        roll=x;
    }
    void printroll(){
        System.out.println("Roll no is :"+roll);
    }
}
class test extends Student{
    int m1,m2;
    void getmarks(int x,int y)
{
    m1=x;
    m2=y;
}
void printmarks()
{
    System.out.println("Marks of 1st subject:"+m1);
    System.out.println("Marks of 2nd subject is:"+m2);
}
}
class Result extends test{
    int total;
    void display(){
        total=m1+m2;
        System.out.println("Total marks is:"+total);
    }
}
public class Multillevelinheritance1 {

    public static void main(String[] args) {
        Result obj=new Result();
        obj.getroll(10);
        obj.getmarks(99, 55);
        obj.printroll();
        obj.printmarks();
        obj.display();
    }
}