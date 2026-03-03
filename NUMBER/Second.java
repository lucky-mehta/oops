//WAP TO PRINT 1 TO 100 ODD NUMBER.

public class Second 
{
    public static void main(String[] args) {
        int i=1;
        System.out.println(" 1 to 100 odd number is:");
        while(i<=100)
        {
            if (i%2==0) {
                System.out.println("even no is:"+i);}
            else{
            System.out.println(" odd Number is:"+i);}
            i=i+1;
        }
    }
}

