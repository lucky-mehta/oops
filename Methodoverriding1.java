//EXAMPLE FIRST OF METHOD-OVERRIDING PROGRAM
class Super {
    int x = 10;

    void disp() {
        System.out.println("Super :" + x);
    }
}

class Sub extends Super {
    int y = 20;

    void disp() {
        System.out.println("Super :" + x);
        System.out.println("Sub :" + y);
    }
}

public class Methodoverriding1 {

    public static void main(String[] args) {
        Sub obj = new Sub();
        obj.disp();
    }
}