class MyThreadRunnable1 implements Runnable{
    public void run(){
        int i = 0;
        while (i<50000){
            System.out.println("I am a thread1 not threat1.");
            i++;
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    
    public void run(){
        int i = 0;
        while (i<50000){
            System.out.println("I am a thread2 not threat2.");
            i++;
        }
    }
}

public class CWH_ch13_runnable {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}
