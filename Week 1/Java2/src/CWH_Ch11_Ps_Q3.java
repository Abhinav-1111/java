// Q4. Create a class Telephone with ring(), lift() and disconnect() methods as abstract methods. Create another class
// smartTelephone and demonstrate polymorphism.

abstract class telephone{
    abstract public void ring();
    abstract public void lift();
    abstract public void disconnect();
}

class smartTelephone extends telephone{
    public void ring(){
        System.out.println("The phone is ringing...");
    }
    public void lift(){
        System.out.println("The phone is lifting...");
    }
    public void disconnect(){
        System.out.println("The phone is disconnected...");
    }
}

public class CWH_Ch11_Ps_Q3 {
    public static void main(String[] args) {
        telephone ts = new smartTelephone();
        ts.disconnect();
        ts.ring();
        ts.lift();
    }
}
