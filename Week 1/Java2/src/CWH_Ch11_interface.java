interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface hornBlow{
    int a = 45;
    void hornBlowBMW();
    void hornBlowDUCATI();
}

class AvonCycle implements Bicycle, hornBlow{
    void blowhorn(){
        System.out.println("Pee Pee");
    }

    public void applyBrake(int decrement){
        System.out.println("Speed decrease");
    }
    public void speedUp(int increment){
        System.out.println("Speed increase");
    }

    public void hornBlowBMW(){
        System.out.println("BMW Pee Pee Pee");
    }
    public void hornBlowDUCATI(){
        System.out.println("DECATI pow pow pow");
    }
}

public class CWH_Ch11_interface {
    public static void main(String[] args) {
        AvonCycle cycleAbhi = new AvonCycle();
        cycleAbhi.applyBrake(1);
//        System.out.println(cycleAbhi.a);

        cycleAbhi.hornBlowBMW();
        cycleAbhi.hornBlowDUCATI();
    }
}
