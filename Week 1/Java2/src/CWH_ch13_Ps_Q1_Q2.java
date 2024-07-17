class goodMorning extends Thread{
    public void run(){
        while (true){
            System.out.println("Good Morning !");
        }
    }
}
class welcome extends Thread{
    public void run(){
//        while (true){
//            try {
//                Thread.sleep(200);
//            }catch (Exception e){
//                System.out.println(e);
//            }
//
//            System.out.println("Welcome !");
//        }
    }
}

public class CWH_ch13_Ps_Q1_Q2 {
    public static void main(String[] args) {
        goodMorning g1 = new goodMorning();
        welcome w1 = new welcome();

        g1.setPriority(6);
        w1.setPriority(9);

        System.out.println(g1.getPriority());
        System.out.println(w1.getPriority());
        System.out.println(w1.getState());

//        g1.start();
        w1.start();
        System.out.println(w1.getState());
        System.out.println(Thread.currentThread().getState());


    }
}
