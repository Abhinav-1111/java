interface  myCamera{
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
interface myWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class myCellPhone{
    void  callNumber(int phonenumber){
        System.out.println("Calling..."+phonenumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}

class mySmartPhone extends myCellPhone implements myCamera, myWifi{
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

public class CWH_Ch11_interface1 {
    public static void main(String[] args) {
        mySmartPhone ms = new mySmartPhone();
        ms.record4kVideo();
        String[] ar = ms.getNetworks();
        for (String item: ar) {
            System.out.println(item);
        }
    }
}
