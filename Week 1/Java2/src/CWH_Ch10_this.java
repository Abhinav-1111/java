class ekClass{
    int a;

    public int getX(){
        return a;
    }
    ekClass(int x){
        this.a = x;
    }
}

class doClass extends ekClass{

    doClass(int y) {
        super(y);
        System.out.println("This is constructor " + y);
    }
}

public class CWH_Ch10_this {
    public static void main(String[] args) {
        ekClass ek = new ekClass(4);
        doClass d = new doClass(5);
        System.out.println(ek.getX());

    }
}
