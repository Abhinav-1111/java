class phone{
    public void morning(){
        System.out.println("Good Morning!");
    }

    public void on(){
        System.out.println("Phone is On...");
    }
}

class smartPhone extends phone{
    void greet(){
        System.out.println("Good Morning");
    }
    public void on(){
        System.out.println("smartPHone is On...");
    }
}

public class CWH_Ch10_dynamic_method_dispatch {
    public static void main(String[] args) {

        phone oppo = new smartPhone();
        oppo.on();

    }
}
