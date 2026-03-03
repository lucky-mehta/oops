//WAP IN JAVA TO CHECK THE NUMBER IS ARMSTRONG OR NOT.
import java.util.Scanner;
public class Armstrongno {
    public static void main(String[] args) {
        int i,n,s=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE ANY NUMBER");
        n=obj.nextInt();
        int temp=n;
        while (n>0)
         {
            i=n%10;
            s=s+(i*i*i);
            n=n/10;
        }
        if (s==temp) {
          System.out.println("NUMBER IS ARMSTRONG NUMBER");  
        }
        else{
            System.out.println("NUMBER IS NOT ARMSTRONG NUMBER");
        }

    }
}
