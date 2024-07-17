// Q6
// Q7

interface tvRemote{
    void tvremote();
}

interface smartTvRemote extends tvRemote{
    void tv();
}

class tv implements smartTvRemote{
    public void tvremote(){
        System.out.println("Tv remote is not working");
    }
    public void tv(){
        System.out.println("Tv remote is working");
    }
}

public class CWH_Ch11_Ps_Q4 {
    public static void main(String[] args) {
        tv t = new tv();
        t.tvremote();
        t.tv();
    }
}
