class cellPhone{
    public void ringing(){
        System.out.println("Phone is ringing...");
    }

    public void vibrating(){
        System.out.println("Phone is vibrating...");
    }
}

public class CWH_Ch8_Ps_Q2 {
    public static void main(String[] args) {
        cellPhone onePlus = new cellPhone();

        onePlus.ringing();
        onePlus.vibrating();
    }
}
