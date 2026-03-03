// WAP TO PRINT 1,2,3,4,5(CONTINUE),6,7,8,9,10
public class Continue {
    public static void main(String[] args) {
        int n;
        for(n=1;n<=10;n++)
        {
            if (n==5)
     {
                continue;
            }
            System.out.println("NUMBER IS:"+n);
        }
    }
}
