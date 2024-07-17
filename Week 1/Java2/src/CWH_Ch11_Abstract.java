 abstract class parent2{
    parent2(){
        System.out.println("This is base2 constructor.");
    }

    public void sayHello(){
         System.out.println("Hello");
     }

     abstract public void greet();
     abstract public void greet2();
 }

 class child2 extends parent2{
     @Override
     public void greet() {
         System.out.println("Good Morning");
     }
     @Override
     public void greet2() {
         System.out.println("Good Afternoon");
     }
 }

 abstract class child3 extends parent2{
     public void ch(){
         System.out.println("Helo ji");
     }
 }

public class CWH_Ch11_Abstract {
    public static void main(String[] args) {
        //parent2 p = new parent2() ; -->error
        child2 c = new child2();
        //child3 c3 = new child3() ;   -->error

    }
}
