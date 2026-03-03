//WAP TO USING SWITCH STATEMENT TO DISPLAY DAY OF A WEEK BY JUST PRESSING KEY 1 TO 7.
import java.util.Scanner;
public class Week {
    public static void main(String[] args) {
        int day;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a day");
        day=obj.nextInt();
        switch (day) {
            case 1:
                System.out.println("SUNDAY");
                break;
                case 2:
                System.out.println("MONDAY");
                break;
                case 3:
                System.out.println("TUESDAY");
                break;
                case 4:
                System.out.println("WEDNESDAY");
                break;
                case 5:
            System.out.println("THURSDAY");
            break;
            case 6:
            System.out.println("FRIDAY");
            break;
            case 7:
            System.out.println("SATURDAY");
            break;
            default:
                System.out.println("not a day");
                break;
        }
    }
}
