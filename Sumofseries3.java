//1/2+3/4+5/6+7/8+................+n/n+1.
import java.util.Scanner;
public class Sumofseries3 {
    public static void main(String[] args) {
        float i=1,s=0,n;
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE LIMIT OF SERIES");
        n=obj.nextFloat();
        while (i<=n) {
            s=s+((2*i-1)/(2*i));
            i=i+1;
        }
        System.out.println("SUM OF SERIES IS:"+s);
    }
}

