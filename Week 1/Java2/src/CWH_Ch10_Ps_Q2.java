class rectangle{
    int length;
    int breadth;
    int height;

    rectangle(int l, int b, int h){
        this.length = l;
        this.breadth = b;
        this.height = h;
    }

    public double Volume(){
        return length*breadth*height;
    }
}

class cuboid extends rectangle{
    cuboid(int l, int b, int h){
        super(l,b,h);
    }

    public double volume(){
        return length*breadth*height;
    }
}

public class CWH_Ch10_Ps_Q2 {
    public static void main(String[] args) {
        rectangle rh = new rectangle(5,5,5);
        System.out.println("Volume of rectangle = " + rh.Volume());

        cuboid cb = new cuboid(6,6,6);
        System.out.println("Volume of cuboid = " + cb.volume());

    }
}
