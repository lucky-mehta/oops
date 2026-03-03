
//WAP TO PRINT SUM OF DIGIT OF THE NUMBER.
import java.util.Scanner;

public class Sumofdigit {
    public static void main(String[] args) {
        int n, i, s = 0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the any number");
        n = obj.nextInt();
        while (n != 0) {
            i = n % 10;
            s = s + i;
            n = n / 10;
        }
        System.out.println("Sum of digit is:" + s);
    }
}
