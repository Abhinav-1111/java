class circle{
    int radius;

    circle(int r){
        this.radius = r;
    }

    public double Area(){
        return Math.PI*radius*radius;
    }
}

class Cylinder1 extends circle{

    int height;
    Cylinder1(int r, int h){
        super(r);
        this.height = h;
    }

    public double volume(){
        return Math.PI*radius*radius*height;
    }
}

public class CWH_Ch10_Ps_Q1 {
    public static void main(String[] args) {
        circle c = new circle(5);
        System.out.println("Area = " + c.Area());

        Cylinder1 cl = new Cylinder1(5,6);
        System.out.println("Volume of cylinder = " + cl.volume());

    }
}
