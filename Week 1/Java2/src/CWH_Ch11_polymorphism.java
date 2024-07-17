interface  myCamera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning.");
    }
    default void record4kVideo(){
        greet();
        System.out.println("Recording in 4k...");
    }

}
interface myWifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class myCellPhone2{
    void  callNumber(int phonenumber){
        System.out.println("Calling..."+phonenumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}

class mySmartPhone2 extends myCellPhone2 implements myCamera2, myWifi2{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Recording video");
    }
    //    public void record4kVideo(){
//        System.out.println("Taking snap and Recording video in 4k");
//    }
    public String[] getNetworks(){
        System.out.println("Betting list of networks");
        String[] networkList = {"Vodafone", "jio", "Airtel"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to"+ network);
    }

}

public class CWH_Ch11_polymorphism {
    public static void main(String[] args) {
        myCamera2 cam1 = new mySmartPhone2();
        cam1.record4kVideo();
        cam1.takeSnap();

        // cam1.callNumber(); ---> not allowed

        mySmartPhone2 oppo = new mySmartPhone2();
        oppo.connectToNetwork(" jio");
        oppo.pickCall();
        oppo.callNumber(123);
    }
}
