class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        System.out.println("Hi");
    }
}

public class CWH_ch13_thread_constructor {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Abhinav");
        MyThr t2 = new MyThr("rishav");

        t1.start();
        t2.start();

        System.out.println("The id of thread t1 is : " + t1.getId());
        System.out.println("The name of thread t1 is : " + t1.getName());

        System.out.println("The id of thread t2 is : " + t2.getId());
        System.out.println("The name of thread t2 is : " + t2.getName());
    }
}
