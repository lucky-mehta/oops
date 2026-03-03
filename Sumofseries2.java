// 1+1/2+1/3+1/4+.............+1/n.
import java.util.Scanner;
public class Sumofseries2 {
    public static void main(String[] args) {
        float i=1,s=0,n;
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE LIMIT OF SERIES");
        n=obj.nextFloat();
        while (i<=n) {
            s=s+(1/i);
            i=i+1;
        }
        System.out.println("SUM OF SERIES IS:"+s);
    }
}
