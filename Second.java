import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        int a,b,c;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter first number is:");
        a=obj.nextInt();
        System.out.println("enter second number is:");
        b=obj.nextInt();
        c=a+b;
        System.out.println("sum is:"+c);
    }
}
