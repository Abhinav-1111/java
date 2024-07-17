class Base{
     int x;

    public int getX() {
        System.out.println("I am in Base class.");
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived extends Base{
    int y;

    public int getY() {
        System.out.println("I am in derived class.");
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class CWH_Ch10_inheritance {
    public static void main(String[] args) {
        Base bs = new Base();
        bs.setX(4);
        System.out.println("Base = " + bs.getX());

        Derived dr = new Derived();
        dr.setY(45);
        System.out.println("Derived = " + dr.getY());

    }
}
