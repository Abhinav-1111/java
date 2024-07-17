class MyThread1 extends Thread{
    public void run(){
        int i=0;
        while (i<50000){
            System.out.println("Thread1 is for cooking.");
            System.out.println("I am happy.");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        int i=0;
        while (i<50000){
            System.out.println("Thread2 is for coding.");
            System.out.println("I am sad.");
            i++;
        }
    }
}

public class CWH_ch13_threads {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();

    }
}
