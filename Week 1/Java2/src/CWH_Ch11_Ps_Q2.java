// Q3. Create a class Monkey with jump() and bite() methods Create a class human which inherits monkey with this class
// and implement basicAnimal interface with eat() and sleep() methods.

class monkey{
    void jump(){
        System.out.println("Monkey is jumping");
    }
    void bite(){
        System.out.println("Monkey is biten a kid ");
    }
}
interface basicAnimal{
    void eat();
    void sleep();
}
class human extends monkey implements basicAnimal{
    public void eat(){
        System.out.println("Monkey is eating");
    }
    public void sleep(){
        System.out.println("Monkey is sleeping");
    }
}

public class CWH_Ch11_Ps_Q2 {
    public static void main(String[] args) {
        human hu = new human();

        hu.eat();
        hu.sleep();

        monkey mn = new human();
        mn.bite();
        mn.jump();
//        mn.eat();  --> error

    }
}
