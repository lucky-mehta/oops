//WAP TO PRINT ROLL OF ANY STUDENT USING SWITCH STATEMENT.
import java.util.Scanner;
public class Rollno {
  public static void main(String[] args) {
    int Rollnumber;
    Scanner obj=new Scanner(System.in);
    System.out.println("enter roll number of student");
    Rollnumber=obj.nextInt();
    switch (Rollnumber) {
        case 1:
            System.out.println("LUCKY");
            break;
            case 2:
            System.out.println("GOPI");
            break;
            case 3:
            System.out.println("APARNA");
            break;
            case 4:
            System.out.println("ANJALI");
            break;
            case 5:
            System.out.println("SUPRIYA");
            break;
        default:
            System.out.println("not valid roll number");
            break;
    }
  }  
}
