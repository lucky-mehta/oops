//wap to print 1,2,3,4,5(break),7,8,9,10
public class Break
 {
public static void main(String[] args) {
    int n;
    for(n=1;n<=10;n++)
    {
        if(n==5)
        {
            break;
        }
        System.out.println("NUMBER IS:"+n);
    }
}    
}
