// 1+1/2+1/3+1/4+............1/10.
public class Sumofseries1 {
    public static void main(String[] args) {
        float i=1,s=0;
        while (i<=10)
         { 
            s=s+(1/i);
            i=i+1;
        }
        System.out.println("Sum is:"+s);
    }
}
