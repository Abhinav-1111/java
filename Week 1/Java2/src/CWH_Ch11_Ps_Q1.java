// Q1. create an abstract class Pen with methods write() and refill() as abstract methods
// Q2. Use the pen class from Q1 to create a concrete class fountain pen with additional method changeNib().

abstract class pen{
    abstract public void write();
    abstract public void refill();
}

class fountainPen extends pen{
    public void write(){
        System.out.println("This is pen");
    }
    public void refill(){
        System.out.println("pen is refilled.");
    }

    public void changeNib(){
        System.out.println("changing the nib");
    }
}

public class CWH_Ch11_Ps_Q1 {
    public static void main(String[] args) {
        fountainPen p = new fountainPen();
        p.write();
        p.refill();
        p.changeNib();

    }
}
